/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.BusinessDao;
import com.gouhai.baoshan.dao.business.BusinessFormDao;
import com.gouhai.baoshan.dao.business.BusinessRemindDao;
import com.gouhai.baoshan.dao.business.BusinessTypeDao;
import com.gouhai.baoshan.dao.user.RoleDao;
import com.gouhai.baoshan.dao.user.UserRoleDao;
import com.gouhai.baoshan.entity.business.Business;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.BusinessRemind;
import com.gouhai.baoshan.entity.business.BusinessType;
import com.gouhai.baoshan.entity.business.Remind;
import com.gouhai.baoshan.entity.user.Role;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.entity.user.UserRole;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.CollectionUtils;
import com.gouhai.baoshan.utils.DateTimeUtil;
import com.gouhai.baoshan.utils.StringUtil;

/**
 * 
 * 
 * @author 肖得明
 * 
 */
@Service
public class BusinessTypeService {

	@Autowired
	private RoleDao roleDao;
	
	@Autowired
	private UserRoleDao userRoleDao;
	
	@Autowired
	private BusinessTypeDao businessTypeDao;

	@Autowired
	private BusinessFormDao businessFormDao;
	
	@Autowired
	private BusinessRemindDao businessRemindDao;
	
	public void insert(BusinessType business) {
		businessTypeDao.insert(business);
	}

	public void update(BusinessType business) {
		businessTypeDao.update(business);
	}

	public void delete(String id) {
		businessRemindDao.delete(id);
	}

	public BusinessType findOne(String id) {
		return businessTypeDao.findOne(id);
	}
	
	public List<BusinessType> findByparid(String id) {
		String hql="from BusinessType where parid='"+id+"'";
		return businessTypeDao.findList(hql,1,100);
	}
	public List<BusinessType> getAllList() {
		String hql="from BusinessType";
		return businessTypeDao.findAll(hql);
	}
	
	
	/**
	 * 
	 * @param code
	 * @return
	 */
	public BusinessType findOneByCode(String code) {
		return businessTypeDao.findOne("from BusinessType where id=?", code);
	}
		
/*	public List<Business> getBusinessList(int pageNumber,String code) {

		String hql="from BusinessType";
		if (!code.equals("null")&&!code.equals("1")) {
			hql += " where name Like '%" + code + "%'";
		}
		return businessRemindDao.findList(hql, pageNumber, PageableController.PAGE_SIZE);
	}
	*/
	public long getBusinessCount(String code) {
		String hql="from BusinessType";
		if (!code.equals("null")&&!code.equals("1")) {
			hql += " where name Like '%" + code + "%'";
		}
		return businessRemindDao.findCount(hql);
	}
	


	
	
	

	
}
