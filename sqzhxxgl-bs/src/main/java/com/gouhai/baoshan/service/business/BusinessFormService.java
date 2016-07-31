/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.IdentityService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.apache.commons.lang.ObjectUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.BusinessFormDao;
import com.gouhai.baoshan.entity.business.Business;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.service.user.UserService;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.Utils;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Service
public class BusinessFormService {

	@Autowired
	protected UserService userService;
	@Autowired
	private BusinessFormDao businessFormDao;
	@Autowired
	private IdentityService identityService;
	@Autowired
	private RuntimeService runtimeService;
	@Autowired
	protected TaskService taskService;

	private String processDefinitionKey = "baoshanBusiness";
	
	public List<BusinessForm> getBusinessFormList(User user, Business business, int pageNumber) {
		if(business==null){
			return null;
		}
		//System.out.println("sql"+"from BusinessForm where business="+business.getId()+" and user="+user.getId()+" order by insertDate");
		return businessFormDao.findList("from BusinessForm where business=? and user=? order by insertDate", pageNumber, PageableController.PAGE_SIZE, business, user);
	}
	public List<BusinessForm> getAllBusinessForm(List<User> user, Business business) {
		List<BusinessForm> list= new ArrayList<BusinessForm>();
		if(business==null){
			return null;
		}
		
		for(User u : user)
		{
			List<BusinessForm> form = businessFormDao.findAll("from BusinessForm where business=? and user=? order by insertDate", business, u);
			if(form!=null)
			{
				list.addAll(form);
			}
		}
		
		return list;
	}
	/**
	 * 查询
	 * @param userid
	 * @param sdate
	 * @param edate
	 * @return
	 */
	public List<BusinessForm> getBusinessFormList(User user,String sdate,String edate) {
		Date s=null;
		Date e=null;
		try {
		  s=Utils.parseFormatted(sdate, "yyyy-MM-dd");
		  e=Utils.parseFormatted(edate, "yyyy-MM-dd");
			
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		List<BusinessForm>  list =businessFormDao.findAll("from BusinessForm where user=? and insertDate BETWEEN ? and ? order by insertDate", user,s,e);
		
		//List<BusinessForm>  list =businessFormDao.findAll("from BusinessForm where user=? order by insertDate", user);
		//System.out.println("sql"+"from BusinessForm where business="+business.getId()+" and user="+user.getId()+" order by insertDate");
		//System.out.println(list.size());
		return list;
	}
	/**
	 * 重载方法，按模板导出
	 * @param sdate
	 * @param edate
	 * @return
	 */
	public List<BusinessForm> getBusinessFormList(String sdate,String edate) {
		Date s=null;
		Date e=null;
		try {
		  s=Utils.parseFormatted(sdate, "yyyy-MM-dd");
		  e=Utils.parseFormatted(edate, "yyyy-MM-dd");			
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		List<BusinessForm>  list =businessFormDao.findAll("from BusinessForm where insertDate BETWEEN ? and ? order by insertDate",s,e);
		return list;
	}
	
	public long getBusinessFormCount(User user, Business business) {
		return businessFormDao.findCount("from BusinessForm where business=? and user=?", business, user);
	}
	
	public void insert(BusinessForm businessForm) {
		businessFormDao.insert(businessForm);
	}
	
	public void update(BusinessForm businessForm) {
		businessFormDao.update(businessForm);
	}

	public void delete(BusinessForm businessForm) {
		//把第一个字母转换为大写
		String code=businessForm.getBusiness().getCode();
		String i= ((String) code.subSequence(0,1)).toUpperCase();
		String s = (String) code.subSequence(1, code.length());
		code=i+s;
	//	System.err.println("编码"+code);
		businessFormDao.batchExecute("delete from " + code + " where businessForm=?", businessForm);
		businessFormDao.delete(businessForm);
        if (businessForm.getProcessInstanceId() == null) {
			return;
		}
		//中止流程
		Task task = taskService.createTaskQuery().processInstanceId(businessForm.getProcessInstanceId()).singleResult();
		if (task != null) {
			//添加批注
			taskService.addComment(task.getId(), businessForm.getProcessInstanceId(), "干事删除流程");
			//完成任务
			taskService.complete(task.getId());
		}
	}
	
	public BusinessForm findOne(String id) {
		return businessFormDao.findOne(id);
	}
	
	public BusinessForm findOne(String id, User user) {
		//System.err.println("from BusinessForm where id="+id+" and user="+user+"");
		return businessFormDao.findOne("from BusinessForm where id=? and user=?", id, user);
	}
	
	public boolean hasFormItem(User user, Business business, Date beforeRemindDate, Date afterRemindDate) {
		return businessFormDao.findCount("from BusinessForm where business=? and user=? and insertDate >=?", business, user, beforeRemindDate) > 0;
	}

	public List<BusinessForm> getBusinessFormListByProcessInstanceId(String processInstanceId) {
		return businessFormDao.findAll("from BusinessForm where processInstanceId=? order by insertDate", processInstanceId);
	}

	public void mergeCheck(BusinessForm businessForm, int type){
		Task task = taskService.createTaskQuery().processInstanceId(businessForm.getProcessInstanceId()).singleResult();
		//添加批注
		taskService.addComment(task.getId(), businessForm.getProcessInstanceId(), businessForm.getRemark());
		//完成任务
		taskService.complete(task.getId());
		
		if (type == 1) {
			businessForm.setProcessStatus("审核通过");
		}else if (type == 2) {
			businessForm.setProcessStatus("驳回");
		}
		businessFormDao.update(businessForm);
	}
	
	public void mergeCheck(BusinessForm businessForm){
		//有审核
		Business business = businessForm.getBusiness();
		
		if (!business.isAudit()) {
			return;
		}
		
		if (businessForm.getProcessStatus() == null || !businessForm.getProcessStatus().equals("书记审核")) {
			Map<String, Object> variables = new HashMap<String, Object>(); 

			Subject currentUser = SecurityUtils.getSubject();
			Session session = currentUser.getSession();
			String userId = (String) session.getAttribute("userId");
			
			User user = userService.getShujiUser(new User(userId));
			if (user == null) {
				return;
			}
			
	        variables.put("shujiId", user.getId()); 
	        
			String businessKey = businessForm.getId().toString();
			// 用来设置启动流程的人员ID，引擎会自动把用户ID保存到activiti:initiator中
			identityService.setAuthenticatedUserId(ObjectUtils.toString(businessForm.getUser().getId()));
			ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(processDefinitionKey, businessKey, variables);
			String processInstanceId = processInstance.getId();
			businessForm.setProcessInstanceId(processInstanceId);
			businessForm.setProcessStatus(taskService.createTaskQuery().processInstanceId(processInstanceId).singleResult().getName());
			businessForm.setRemark("");
			businessForm.setSubmitdate(new Date());
			//System.out.println("ID"+businessForm.getUser().getId());
			businessFormDao.update(businessForm);
		}
	}
	/*
	 * 根据每年填报周期及特定业务获取
	 */
	public List<BusinessForm> getBusinessFormByYear(String matchYear,String orgid)
	{
		String sql="SELECT * FROM bs_business_form WHERE bs_business_form.USER_ID in(SELECT pid FROM bs_user " +
				"    WHERE bs_user.ORGANIZATION_ID in(SELECT pid FROM bs_organization WHERE pid='"+orgid+"')) " +
				"    AND business_id=(SELECT pid FROM bs_business WHERE code='peoplesummary') and insert_date LIKE '%"+matchYear+"%'";
		//System.out.println(sql);
		Query query = businessFormDao.getCurrentSession().createSQLQuery(sql).addEntity(BusinessForm.class);
		return query.list();
	}
	//根据组织结构和年份查询
	public List<BusinessForm> getBusinessFormsByUsert(String orgid,String year,String code){
		String sql="SELECT * FROM bs_business_form WHERE BUSINESS_ID=( SELECT pid FROM bs_business WHERE CODE='"+code+"') " +
				    "AND USER_ID in(SELECT PID FROM bs_user WHERE organization_id='"+orgid+"') AND  INSERT_DATE LIKE '%"+year+"%'";
		//System.out.println(sql);
		Query query = businessFormDao.getCurrentSession().createSQLQuery(sql.toString()).addEntity(BusinessForm.class);
		return query.list();
	}
	//根据镇的ID查询下面所有组织结构填写的表单
	public List<BusinessForm> getBusinessFormsByORGid(String orgid,String year,String code){
		String sql="SELECT * FROM bs_business_form WHERE user_id in(SELECT PID FROM bs_user  " +
				"WHERE organization_id in(SELECT pid FROM bs_organization AS b WHERE b.PARENT_ID='"+orgid+"')) " +
				"AND business_Id =(SELECT pid FROM bs_business WHERE CODE='"+code+"') AND  INSERT_DATE LIKE '%"+year+"%'";
	System.out.println(sql);
	Query query = businessFormDao.getCurrentSession().createSQLQuery(sql.toString()).addEntity(BusinessForm.class);
	return query.list();
	}
//查询全区的表单
	public List<BusinessForm> getBusinessFormsByORGid(String year,String code){
		String sql="SELECT * FROM bs_business_form WHERE  " +
				"business_Id =(SELECT pid FROM bs_business WHERE CODE='"+code+"') AND  INSERT_DATE LIKE '%"+year+"%'";
	System.out.println(sql);
	Query query = businessFormDao.getCurrentSession().createSQLQuery(sql.toString()).addEntity(BusinessForm.class);
	return query.list();
	}
}
