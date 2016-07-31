/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.user.AuthorityDao;
import com.gouhai.baoshan.dao.user.RoleAuthorityDao;
import com.gouhai.baoshan.dao.user.RoleDao;
import com.gouhai.baoshan.entity.user.Authority;
import com.gouhai.baoshan.entity.user.Role;
import com.gouhai.baoshan.entity.user.RoleAuthority;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.CollectionUtils;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Service
public class RoleService {

	@Autowired
	private RoleDao roleDao;
	@Autowired
	private AuthorityDao authorityDao;
	@Autowired
	private RoleAuthorityDao roleAuthorityDao;

	public void insert(Role role, String[] authorityIds) {
		role.setDeleted(false);
		roleDao.insert(role);

		if (authorityIds != null) {
			for (String authorityId : authorityIds) {
				RoleAuthority roleAuthority = new RoleAuthority();
				roleAuthority.setAuthority(new Authority(authorityId));
				roleAuthority.setRole(role);
				roleAuthorityDao.insert(roleAuthority);
			}
		}
	}

	public void update(Role role, String[] authorityIds) {
		Role findRole = roleDao.findOne(role.getId());
		if (findRole != null && !findRole.isDeleted()) {
			findRole.setName(role.getName());
			findRole.setDescription(role.getDescription());
			findRole.setUpdateDate(new Date());
			roleDao.update(findRole);
			
			roleAuthorityDao.batchExecute("delete from RoleAuthority where role=?", findRole);
			
			if (authorityIds != null) {
				for (String authorityId : authorityIds) {
					RoleAuthority roleAuthority = new RoleAuthority();
					roleAuthority.setAuthority(new Authority(authorityId));
					roleAuthority.setRole(role);
					roleAuthorityDao.insert(roleAuthority);
				}
			}
		}

	}

	public void delete(String id) {
		Role role = findOne(id);
		if (role != null) {
			role.setDeleted(true);
			roleDao.update(role);
		}
	}

	public Role findOne(String id) {
		return roleDao.findOne(id);
	}

	public List<Role> getRoleList(int pageNumber) {
		return roleDao.findList("from Role where deleted=?", pageNumber, PageableController.PAGE_SIZE, false);
	}

	public long getRoleCount() {
		return roleDao.findCount("from Role where deleted=?", false);
	}

	public Map<String, String> getAllAuthorityForMap() {
		Map<String, String> map = new LinkedHashMap<String, String>();
		List<Authority> authoritys = new ArrayList<Authority>();
		authoritys = authorityDao.findAll("from Authority order by name");
		if (!CollectionUtils.isEmpty(authoritys)) {
			for (Authority authority : authoritys) {
				map.put(authority.getId(), authority.getName());
			}
		}
		return map;
	}

	public List<Authority> getAuthorityByRole(Role role) {
		List<Authority> authoritys = new ArrayList<Authority>();
		List<RoleAuthority> roleAuthoritys = roleAuthorityDao.findAll("from RoleAuthority where role=?", role);
		if (!CollectionUtils.isEmpty(roleAuthoritys)) {
			for (RoleAuthority roleAuthority : roleAuthoritys) {
				authoritys.add(roleAuthority.getAuthority());
			}
		}
		return authoritys;
	}
}
