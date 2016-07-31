/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.BusinessDao;
import com.gouhai.baoshan.dao.business.BusinessFormDao;
import com.gouhai.baoshan.dao.business.BusinessRemindDao;
import com.gouhai.baoshan.dao.user.RoleDao;
import com.gouhai.baoshan.dao.user.UserDao;
import com.gouhai.baoshan.dao.user.UserRoleDao;
import com.gouhai.baoshan.entity.business.Business;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.BusinessRemind;
import com.gouhai.baoshan.entity.business.Remind;
import com.gouhai.baoshan.entity.user.Authority;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.DateTimeUtil;
import com.gouhai.baoshan.utils.SecurityUtil;
import com.gouhai.baoshan.utils.StringUtil;
import com.gouhai.baoshan.utils.Utils;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Service
public class BusinessService {

	@Autowired
	private RoleDao roleDao;
	
	@Autowired
	private UserRoleDao userRoleDao;
	
	@Autowired
	private BusinessDao businessDao;

	@Autowired
	private BusinessFormDao businessFormDao;
	
	@Autowired
	private BusinessRemindDao businessRemindDao;
	
	public void insert(Business business) {
		businessDao.insert(business);
	}

	public void update(Business business) {
		businessDao.update(business);
	}

	public void delete(String id) {
		businessDao.delete(id);
	}

	public Business findOne(String id) {
		return businessDao.findOne(id);
	}

	public Business findOneByCode(String code) {
		return businessDao.findOne("from Business where code=?", code);
	}
		
	public List<Business> getBusinessList(int pageNumber,String code) {

		String hql="from Business";
		if (code!=null&&!code.equals("null")&&!code.equals("1")&&!code.equals("")) {
			hql += " where name Like '%" + code + "%'";
		}
		return businessDao.findList(hql, pageNumber, PageableController.PAGE_SIZE);
	}
	public List<Business> getAllList() {

		String hql="from Business";
		
		return businessDao.findAll(hql);
	}
	/**
	 * 这个方法是用来删除业务表单里面的脏数据
	 */
	public void deletecode(){
		String hql="from Business";
		List<Business> b=businessDao.findAll(hql);
		String sql="DELETE FROM bs_business_form WHERE PID in(SELECT  b.pid FROM  (SELECT * FROM bs_business_form WHERE" +
				"  business_Id =(SELECT pid FROM bs_business WHERE CODE=?) " +
				"AND  INSERT_DATE LIKE '%2014%') as b  LEFT JOIN bs_user as a ON b.USER_ID=a.PID WHERE a.USERNAME is NULL)";
		System.out.println(sql);
		Query query=businessDao.getCurrentSession().createSQLQuery(sql);
		for (Business business : b) {
			System.out.println("DELETE FROM bs_business_form WHERE PID in(SELECT  b.pid FROM  (SELECT * FROM bs_business_form WHERE  business_Id =(SELECT pid FROM bs_business WHERE CODE='"+business.getCode()+"') AND  INSERT_DATE LIKE '%2014%') as b  LEFT JOIN bs_user as a ON b.USER_ID=a.PID WHERE a.USERNAME is NULL);");
			query.setParameter(0, business.getCode());
			query.executeUpdate();
		}
	}
	/**
	 * 根据 父类查询他的 列表业务
	 * @param parid
	 * @return
	 */
	public List<Business> getBusinessByParid(String parid) {

		String hql="from Business where parid='"+parid+"'";
		
		return businessDao.findList(hql, 1, 100);
	}
	public long getBusinessCount(String code) {
		String hql="from Business";
		if (code!=null&&!code.equals("null")&&!code.equals("1")&&!code.equals("")) {
			hql += " where name Like '%" + code + "%'";
		}
		return businessDao.findCount(hql);
	}
	
	public Date findBeforeRemindDate(Business business){
		BusinessRemind businessRemind = businessRemindDao.findTopOne(
				"from BusinessRemind where business=? and remindDate <=? order by remindDate desc", 
				business, DateTimeUtil.getStringToDate(DateTimeUtil.getDateToString(new Date(), DateTimeUtil.PATTERN_MM月dd日), DateTimeUtil.PATTERN_MM月dd日));
		if (businessRemind != null) {
			return businessRemind.getRemindDate();
		}else{
			return DateTimeUtil.getStringToDate("01月01日", DateTimeUtil.PATTERN_MM月dd日);
		}
	}
	
	public Date findAfterRemindDate(Business business){
		BusinessRemind businessRemind = businessRemindDao.findTopOne(
				"from BusinessRemind where business=? and remindDate >=? order by remindDate", 
				business, DateTimeUtil.getStringToDate(DateTimeUtil.getDateToString(new Date(), DateTimeUtil.PATTERN_MM月dd日), DateTimeUtil.PATTERN_MM月dd日));
		if (businessRemind != null) {
			return businessRemind.getRemindDate();
		}else{
			return null;
		}
	}
	
	public List<Remind> findRemindBusinessList(){
		List<Business> businesses = businessDao.findAll("from Business where remind=?", true);
		List<Remind> reminds = new ArrayList<Remind>();
		User user=SecurityUtil.getUser();
		for (Business business : businesses) {
			Date beforeRemindDate = DateTimeUtil.getYMDDate(findBeforeRemindDate(business));
			 
			Date nowDate = DateTimeUtil.getStringToDate(DateTimeUtil.getDateToString(new Date(), DateTimeUtil.PATTERN_MM月dd日), DateTimeUtil.PATTERN_MM月dd日);
			BusinessRemind afterRemind = businessRemindDao.findTopOne(
					"from BusinessRemind where business=? and remindDate >=? order by remindDate", 
					business, nowDate);
			if (afterRemind != null && afterRemind.getRemindDate() != null) {
				if(beforeRemindDate.getTime() == DateTimeUtil.getYMDDate(beforeRemindDate).getTime())
				{
					beforeRemindDate = afterRemind.getGreenStart();
				}
				//没有添加数据时
				if(businessFormDao.findCount("from BusinessForm where business=? and user=? and insertDate >=?",
					business,user,
					DateTimeUtil.getYMDDate(beforeRemindDate)) == 0){
					
					//如果在绿灯提醒前,不需要提醒
					if (afterRemind.getGreenStart().compareTo(nowDate) > 0) {
						continue;
					}
					
					Remind remind = new Remind();
					remind.setName(business.getName());
					remind.setUrl(business.getLowerCode());
					
					if (afterRemind.getGreenStart().compareTo(nowDate)<=0 && afterRemind.getYellowStart().compareTo(nowDate)>0) {
						remind.setType(1);
					}else if (afterRemind.getYellowStart().compareTo(nowDate) <= 0 && afterRemind.getRedStart().compareTo(nowDate) > 0) {
						remind.setType(2);
					}else if (afterRemind.getRedStart().compareTo(nowDate) <= 0 && afterRemind.getRemindDate().compareTo(nowDate) >= 0) {
						remind.setType(3);
					}
					
					reminds.add(remind);
				}
			}
			
		}
		return reminds;
	}
	@Autowired
	private UserDao userDao;
	public List<User> getUserByRole() {
	List<User> users = new ArrayList<User>();
		String sql="SELECT * FROM bs_user WHERE  PID in(SELECT user_id FROM bs_user_role  WHERE role_id in(SELECT pid  FROM bs_role WHERE code='ganshi'))";
		users=(List<User>) userDao.getCurrentSession().createSQLQuery(sql).addEntity(User.class).list();
		System.out.println("cdd"+users.size());
		return users;
	}

	public void createBusinessBySys(){
		List<Business> businesses = businessDao.findAll("from Business where remind=?", true);
		List<User> users = getUserByRole();

		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		String year = String.valueOf(cal.get(Calendar.YEAR));
		int month = cal.get(Calendar.MONTH) + 1;
		String months = String.valueOf(month);
		if (month < 10) {
			months = "0" + month;
		}
		
		int day = cal.get(Calendar.DATE);
		String days = String.valueOf(day);
		if (day < 10) {
			days = "0" + day;
		}
		
		for (Business business : businesses) {
			Date beforeRemindDate = DateTimeUtil.getYMDDate(findBeforeRemindDate(business));
			 
			Date nowDate = DateTimeUtil.getStringToDate(DateTimeUtil.getDateToString(new Date(), DateTimeUtil.PATTERN_MM月dd日), DateTimeUtil.PATTERN_MM月dd日);
			BusinessRemind afterRemind = businessRemindDao.findTopOne(
					"from BusinessRemind where business=? and remindDate >=? order by remindDate", 
					business, nowDate);
			if (afterRemind != null && afterRemind.getRemindDate() != null) {
				//没有添加数据时
			//	Date afterRemindDate = DateTimeUtil.getYMDDate(afterRemind.getRemindDate());

				for (User user : users) {
					
					if(businessFormDao.findCount("from BusinessForm where business=? and user=? and insertDate >=?",business,user,DateTimeUtil.getYMDDate(beforeRemindDate))== 0){
						String name = business.getName();
						String format = business.getFormat();
						if (!StringUtil.isEmpty(format)) {
							name = business.getFormat().replace("{yyyy}", year).replace("{mm}", months).replace("{dd}", days);
						}
						BusinessForm businessForm = new BusinessForm();
						businessForm.setName(name);
						businessForm.setBusiness(business);
						businessForm.setSysCreate(true);
						businessForm.setUser(user);
						businessFormDao.insert(businessForm);
					}
				}
				
			}
			
		}
	}
	// 根据编码更新时间
		public void updateDateByCode(String code) {
			String sql = "update Business set update_date=? where code=?";
		
				try {
					businessDao.batchExecute(sql, Utils.getDateNows(), code);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	//根据权限的编码查询业务表
		public List<Business> getBusinessesBycode(List<Authority> list){
			Business business=null;
			List<Business> businesses=new ArrayList<Business>();
			String[] code=null;
			String hql="from Business where code=?";
			for (Authority authority : list) {	
				code=authority.getCode().split(":");
				business=businessDao.findOne(hql, code[0]);
				if(business!=null){
				businesses.add(business);
				}
			}
			return businesses;
		}
		
}
