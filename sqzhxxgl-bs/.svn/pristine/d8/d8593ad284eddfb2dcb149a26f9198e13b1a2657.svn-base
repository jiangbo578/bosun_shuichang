/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.dao.user;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gouhai.baoshan.dao.BaseDao;
import com.gouhai.baoshan.entity.user.Organization;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Repository
public class OrganizationDao extends BaseDao<Organization, String> {
	
	public List<Organization> getOrganizationAllList() {
		return findAll("from Organization where deleted=? and level=null and parent='d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1'", false);
	}
}
