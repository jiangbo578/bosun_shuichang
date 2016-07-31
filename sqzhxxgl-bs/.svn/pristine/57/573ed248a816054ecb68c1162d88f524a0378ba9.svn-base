package com.gouhai.baoshan.service.business.jcqk.rymd;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.rymd.MemberDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Yzwyh;
import com.gouhai.baoshan.spring.PageableController;
/**
 * 业主委员会业务层 
 * @author xuzhou
 *
 */
@Service
public class MemberService {
   @Autowired 
   private MemberDao memberDao;
   //增
   public void insert(Yzwyh member){
	   memberDao.insert(member);
   }
   //刪除
   public void delete(String id){
	   memberDao.delete(id);
   }
   //修改
   public void update(Yzwyh member, String businessFormId){
	    Yzwyh findmember = findOne(member.getId());
		if (findmember.getBusinessForm().getId().equals(businessFormId)) {
			findmember.setName(member.getName());
			findmember.setSex(member.getSex());
			findmember.setRole(member.getRole());
			findmember.setBirthday(member.getBirthday());
			findmember.setDegree(member.getDegree());
			findmember.setStatus(member.getStatus());
			findmember.setAddress(member.getAddress());
			findmember.setPhone(member.getPhone());
			findmember.setContext(member.getContext());
			findmember.setUpdateDate(new Date());
	        memberDao.update(findmember);
		}
   }
   //分页查找
   public List<Yzwyh> getMemberList(BusinessForm businessForm,int pageNumber){
	   return memberDao.findList("from Yzwyh where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE,businessForm);
   }
   //获取总数
   public long getMemberCount(BusinessForm businessForm){
	   return memberDao.findCount("from Yzwyh where businessForm=?",businessForm);
   }
	public Yzwyh findOne(String id) {
		return memberDao.findOne(id);
	}

}
