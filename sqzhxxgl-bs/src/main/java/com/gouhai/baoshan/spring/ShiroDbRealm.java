package com.gouhai.baoshan.spring;

import java.util.Iterator;
import java.util.List;

import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gouhai.baoshan.entity.user.Authority;
import com.gouhai.baoshan.entity.user.Role;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.service.user.RoleService;
import com.gouhai.baoshan.service.user.UserService;

/**
 * 权限验证
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Component("shiroDbRealm")
public class ShiroDbRealm extends AuthorizingRealm {

	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;

	/**
	 * 验证当前Subject（可理解为当前用户）所拥有的权限，且给其授权。
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String name = getName();
		Iterator<?> iterator = principals.fromRealm(name).iterator();
		/*String userName = null;
		if (iterator.hasNext()) {
			userName = (String) iterator.next();
		}*/
		CommonVariableModel model = null;
		if (iterator.hasNext()) {
			model = (CommonVariableModel) iterator.next();
		}
		
		User user = userService.checkUser(model.getUsername());
		if (user == null) {
			return null;
		}

		List<Role> roles = userService.getRoleByUser(user);

		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		for (Role role : roles) {
			info.addRole(role.getCode());

			List<Authority> authoritys = roleService.getAuthorityByRole(role);
			for (Authority authority : authoritys) {
				info.addStringPermission(authority.getCode());
			}
		}

		return info;
	}

	/**
	 * 认证回调函数,登录时调用.
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken)
			throws AuthenticationException {
		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		String username = token.getUsername();
		String password = String.valueOf(token.getPassword());
		if (username == null) {
			throw new AccountException("用户名不能为空");
		}

		User user = userService.checkUserForLogin(username, password);
		if (user == null) {
			throw new UnknownAccountException("用户不存在");
		}

		CommonVariableModel model = new CommonVariableModel();
		model.setUsername(user.getUsername());
		model.setRealName(user.getRealName());
		return new SimpleAuthenticationInfo(model, user.getPassword(), getName());
		//return new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), getName());
	}
}
