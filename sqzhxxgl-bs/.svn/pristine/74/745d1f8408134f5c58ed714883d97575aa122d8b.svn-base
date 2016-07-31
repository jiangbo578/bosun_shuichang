/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.dao.user;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.gouhai.baoshan.dao.BaseDao;
import com.gouhai.baoshan.entity.user.UserRole;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Repository
public class UserRoleDao extends BaseDao<UserRole, String> {
	public void deleteUserRoleByUserid(String userid) {
		String sql = "delete from UserRole where user_id=?";
		Query query = this.getCurrentSession().createQuery(sql);
		query.setParameter(0, userid);
		query.executeUpdate();
	}
}
