/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.user;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.user.AuthorityDao;
import com.gouhai.baoshan.entity.user.Authority;
import com.gouhai.baoshan.entity.user.Role;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Service
public class AuthorityService {

	@Autowired
	private AuthorityDao authorityDao;

	public void insert(Authority authority) {
		authorityDao.insert(authority);
	}

	public void update(Authority authority) {
		authorityDao.update(authority);
	}

	public void delete(String id) {
		Authority authority = new Authority(id);
		authorityDao.batchExecute(
				"delete from RoleAuthority where authority=?", authority);
		authorityDao.delete(authority);
	}

	public Authority findOne(String id) {
		return authorityDao.findOne(id);
	}

	

	public List<Authority> getAuthorityList(int pageNumber, String code) throws UnsupportedEncodingException {
		//code = new String(code.getBytes("ISO-8859-1"), "UTF-8");
		//System.out.println(code.equals("null"));
		String  hql = "from Authority";
		if (!code.equals("null")&&!code.equals("1")) {
			hql += " where name Like '%" + code + "%'";
		}
		return authorityDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE);
	}

	public long getAuthorityCount(String code) throws UnsupportedEncodingException {
		//code = new String(code.getBytes("ISO-8859-1"), "UTF-8");
		String hql = "from Authority";
		if (!code.equals("null")&&!code.equals("1")) {
			hql += " where name Like '%" + code + "%'";
		}
		return authorityDao.findCount(hql);
	}
//根据角色的ID查询权限
	public List<Authority> getAuthorityListByID(Role role){
		String hql="SELECT * FROM bs_authority where   pid in(SELECT AUTHORITY_ID FROM bs_role_authority WHERE role_id=?) and `CODE` LIKE '%:list'";
		System.out.println(hql);
		Query query=authorityDao.getCurrentSession().createSQLQuery(hql).addEntity(Authority.class);
		query.setParameter(0, role.getId());
		List<Authority> list=query.list();
		return list;
	}
}
