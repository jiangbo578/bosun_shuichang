/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.log;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.log.UserLoginLogDao;
import com.gouhai.baoshan.entity.log.UserLoginLog;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.StringUtil;

/**
 * 
 * 
 * @author sun]
 *
 */
@Service
public class UserLoginLogService{
	
	private UserLoginLogDao userLoginLogDao;
	
    @Resource(name = "userLoginLogDao")
    public void setUserLoginLogDao(UserLoginLogDao userLoginLogDao)
	{
		this.userLoginLogDao = userLoginLogDao;
	}

	public UserLoginLogDao getUserLoginLogDao()
	{
		return userLoginLogDao;
	}

	
    public List<UserLoginLog> getBeanList( int pageNumber,String name) {
    	String hql="from UserLoginLog ";
    	if(StringUtil.isNotEmpty(name)){
    		hql+="where username like '%"+name+"%'";
    	}
    	hql+=" order by insertDate desc";
		return  userLoginLogDao.findList(hql, pageNumber, PageableController.PAGE_SIZE);
	}
	
	
	public long getBeanCount(String name) {
		String hql="from UserLoginLog ";
    	if(StringUtil.isNotEmpty(name)){
    		hql+="where username like '%"+name+"%'";
    	}
		return userLoginLogDao.findCount(hql);
	}
	public void insert(UserLoginLog allowance) {
		userLoginLogDao.insert(allowance);
	}

}
