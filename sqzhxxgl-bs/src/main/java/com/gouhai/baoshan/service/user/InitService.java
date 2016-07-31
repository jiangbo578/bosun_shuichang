/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.ServletContextResource;

import com.gouhai.baoshan.dao.user.AuthorityDao;
import com.gouhai.baoshan.dao.user.RoleAuthorityDao;
import com.gouhai.baoshan.dao.user.RoleDao;
import com.gouhai.baoshan.dao.user.UserDao;
import com.gouhai.baoshan.dao.user.UserRoleDao;
import com.gouhai.baoshan.entity.user.Authority;
import com.gouhai.baoshan.entity.user.Role;
import com.gouhai.baoshan.entity.user.RoleAuthority;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.entity.user.UserRole;
import com.gouhai.baoshan.utils.jaxb.CollectionWrapper;
import com.gouhai.baoshan.utils.jaxb.Jaxb2Converter;
import com.gouhai.baoshan.utils.jaxb.XmlAuthority;
import com.gouhai.baoshan.utils.jaxb.XmlRole;
import com.gouhai.baoshan.utils.jaxb.XmlUser;

/**
 * 初始化系统
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Service
public class InitService {

	@Autowired
	ServletContext servletContext;
	@Autowired
	private UserDao userDao;
	@Autowired
	private RoleDao roleDao;
	@Autowired
	private AuthorityDao authorityDao;
	@Autowired
	private RoleAuthorityDao roleAuthorityDao;
	@Autowired
	private UserRoleDao userRoleDao;

	public String initAll() {
		// 删除所有角色权限
		roleAuthorityDao.batchExecute("delete from RoleAuthority");
		// 删除所有用户角色
		userRoleDao.batchExecute("delete from UserRole");
		// 删除所有权限
		authorityDao.batchExecute("delete from Authority");
		// 删除所有角色
		roleDao.batchExecute("delete from Role");
		// 删除所有用户
		//userDao.batchExecute("delete from User");

		// 初始化
		return initAuthority();
	}

	private String initAuthority() {
		Jaxb2Converter jaxb2 = new Jaxb2Converter();
		Resource resource = new ServletContextResource(servletContext, "/WEB-INF/classes/init.xml");
		CollectionWrapper temp = null;
		try {
			javax.xml.transform.Source xmlSource = new javax.xml.transform.stream.StreamSource(
					resource.getInputStream());
			HttpHeaders headers = new HttpHeaders();
			temp = (CollectionWrapper) jaxb2.readFromSource(CollectionWrapper.class, headers, xmlSource);

			// Init Authority
			for (XmlAuthority o : temp.getAuthority()) {
				Authority authority = new Authority();
				authority.setName(o.getName());
				authority.setCode(o.getCode());
				authority.setDescription(o.getDescription());
				authority.setPath(o.getPath());
				authorityDao.insert(authority);
			}
			
			// Init role
			for (XmlRole o : temp.getRole()) {
				Role role = new Role();
				role.setName(o.getName());
				role.setCode(o.getCode());
				role.setDescription(o.getDescription());
				role.setDeleted(false);
				roleDao.insert(role);

				//给admin role 添加权限
				if (o.getCode().equals("admin")) {
					List<Authority> authoritys = authorityDao.findAll();
					for (Authority authority : authoritys) {
						RoleAuthority roleAuthority = new RoleAuthority();
						roleAuthority.setAuthority(authority);
						roleAuthority.setRole(role);
						roleAuthorityDao.insert(roleAuthority);
					}
				}
			}
			
			// Init user
			for (XmlUser o : temp.getUser()) {
				User user = new User();
				user.setUsername(o.getUsername());
				user.setRealName(o.getRealName());
				user.setPassword(o.getPassword());
				user.setDeleted(false);
				userDao.insert(user);
				
				Role role = roleDao.findOne("from Role where code=?", "admin");
				if(role != null){
					UserRole userRole = new UserRole();
					userRole.setUser(user);
					userRole.setRole(role);
					userRoleDao.insert(userRole);
				}
			}
			
			//初始化完删除文件
			resource.getFile().delete();
		} catch (IOException e1) {
			return "初始化文件不存在";
		}

		return "初始化成功，文件已删除";
	}
}
