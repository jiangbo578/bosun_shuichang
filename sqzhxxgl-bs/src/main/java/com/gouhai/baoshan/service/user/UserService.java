/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.IdentityService;
import org.hibernate.SQLQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.user.OrganizationDao;
import com.gouhai.baoshan.dao.user.RoleDao;
import com.gouhai.baoshan.dao.user.UserDao;
import com.gouhai.baoshan.dao.user.UserRoleDao;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.entity.user.Role;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.entity.user.UserRole;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.CollectionUtils;
import com.gouhai.baoshan.utils.StringUtil;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	@Autowired
	private RoleDao roleDao;
	@Autowired
	private UserRoleDao userRoleDao;
	@Autowired
	private IdentityService identityService;
	@Autowired
	private OrganizationDao organizationDao;

	private void saveActiviti(User user) {
		if (user != null) {
			String userId = user.getId();
			org.activiti.engine.identity.User activitiUser = identityService
					.createUserQuery().userId(userId).singleResult();
			// 是新增用户
			if (activitiUser == null) {
				activitiUser = identityService.newUser(userId);
				identityService.saveUser(activitiUser);
			}
		}
	}

	private void deleteActiviti(User user) {
		if (user != null) {
			identityService.deleteUser(user.getId());
		}
	}

	public void insert(User user, String[] roleIds) {
		user.setDeleted(false);
		userDao.insert(user);

		if (roleIds != null) {
			for (String roleId : roleIds) {
				UserRole userRole = new UserRole();
				userRole.setRole(new Role(roleId));
				userRole.setUser(user);
				userRoleDao.insert(userRole);
			}
		}

		// 同步到Activiti
		saveActiviti(user);
	}

	public void loginUpdate(User user) {
		userDao.update(user);
	}

	public void update(User user, String[] roleIds) {
		User findUser = userDao.findOne(user.getId());
		if (findUser != null && !findUser.isDeleted()) {
			findUser.setUsername(user.getUsername());
			findUser.setZnbmid(user.getZnbmid());
			findUser.setServiceUserId(user.getServiceUserId());
			findUser.setRealName(user.getRealName());
			findUser.setOrganization(user.getOrganization());
			findUser.setUpdateDate(new Date());
			userDao.update(findUser);

			userRoleDao.batchExecute("delete from UserRole where user=?",
					findUser);

			if (roleIds != null) {
				for (String roleId : roleIds) {
					UserRole userRole = new UserRole();
					userRole.setRole(new Role(roleId));
					userRole.setUser(user);
					userRoleDao.insert(userRole);
				}
			}
		}

	}

	public void update(User user) {
		User findUser = userDao.findOne(user.getId());
		if (findUser != null && !findUser.isDeleted()) {
			findUser.setPassword(user.getPassword());
			userDao.update(findUser);
		}

	}

	public void delete(String id) {
		User user = findOne(id);
		if (user != null && !user.getUsername().equals("admin")) {

			// userRoleDao.deleteUserRoleByUserid(user.getId());
			// userDao.delete(user);
			user.setDeleted(true);
			userDao.update(user);
			// 同步到Activiti
			deleteActiviti(user);
		}
	}

	public User findOne(String id) {
		return userDao.findOne(id);
	}

	public List<User> getUserList(int pageNumber, String name) {
		String hql = "from User where username != 'admin' ";
		if(StringUtil.isNotEmpty(name)){
			hql+=" and username like '"+name+"%'";
		}
		return userDao.findList(hql, pageNumber, PageableController.PAGE_SIZE);
	}

	public long getUserCount(String name) {
		String hql = "from User where username != 'admin' ";
		if(StringUtil.isNotEmpty(name)){
			hql+=" and username like '"+name+"%'";
		}
		return userDao.findCount(hql);
	}

	public Map<String, String> getFirstOrganizationForMap() {
		Map<String, String> map = new LinkedHashMap<String, String>();
		List<Organization> organizations = new ArrayList<Organization>();
		organizations = organizationDao.getOrganizationAllList();
		if (!CollectionUtils.isEmpty(organizations)) {
			for (Organization Organization : organizations) {
				map.put(Organization.getId(), Organization.getName());
			}
		}
		return map;
	}

	public Map<String, String> getAllRoleForMap() {
		Map<String, String> map = new LinkedHashMap<String, String>();
		List<Role> roles = new ArrayList<Role>();
		roles = roleDao.findAll("from Role where deleted=? order by name",
				false);
		if (!CollectionUtils.isEmpty(roles)) {
			for (Role role : roles) {
				map.put(role.getId(), role.getName());
			}
		}
		return map;
	}

	public List<Role> getAllRoleForlist() {

		List<Role> roles = new ArrayList<Role>();
		roles = roleDao.findAll("from Role where deleted=? order by parid",
				false);

		return roles;
	}

	public List<Role> getRoleByUser(User user) {
		List<Role> roles = new ArrayList<Role>();
		List<UserRole> userRoles = userRoleDao.findAll(
				"from UserRole where user=?", user);
		if (!CollectionUtils.isEmpty(userRoles)) {
			for (UserRole userRole : userRoles) {
				roles.add(userRole.getRole());
			}
		}
		return roles;
	}

	public User checkUserForLogin(String username, String password) {
		return userDao.findOne(
				"from User where username=? and password=? and deleted=?",
				username, password, false);
	}

	public User checkUser(String username) {
		return userDao.findOne("from User where username=? and deleted=?",
				username, false);
	}

	public boolean checkUserForAdd(String username) {
		return checkUser(username) != null;
	}

	public boolean checkUserForUpdate(String username, String id) {
		return userDao.findOne(
				"from User where username=? and id !=? and deleted=?",
				username, id, false) != null;
	}

	public User getShujiUser(User ganshiUser) {
		User user = userDao.findOne(ganshiUser.getId());

		if (user == null || user.getOrganization() == null) {
			return null;
		}

		return userDao
				.findOne(
						"from User u where organization=? and id!=? and u.deleted=false",
						user.getOrganization(), ganshiUser.getId());
	}

	/**
	 * 根据所在村居获取User
	 * 
	 * @param
	 * @return
	 */
	public List<User> getAllUserByOrganization(Organization organization) {
		if (organization == null) {
			return null;
		}

		return userDao.findAll(
				"from User u where organization=?  and u.deleted=false",
				organization);
	}

	/**
	 * 获取远程webservice用户
	 * 
	 * @param serviceId
	 * @return
	 */
	public User getServiceUser(String serviceId) {
		if (null == serviceId) {
			return null;
		}
		return userDao.findOne("from User u where  u.username=? and u.deleted=?", serviceId,false);
	}

	// 根据组织结构的ID查询下面的干事
	public User getUserGanshiByid(String orgid) {
		String sql = "SELECT * FROM bs_user WHERE  PID in(SELECT user_id FROM bs_user_role  WHERE role_id in(SELECT pid  FROM bs_role WHERE code='ganshi')) AND ORGANIZATION_ID=?";
		SQLQuery query = (SQLQuery) userDao.getCurrentSession()
				.createSQLQuery(sql).addEntity(User.class);
		query.setParameter(0, orgid);
		return (User) query.uniqueResult();
	}
}
