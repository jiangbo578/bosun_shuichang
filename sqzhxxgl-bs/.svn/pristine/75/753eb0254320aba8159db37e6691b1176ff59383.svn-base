/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.user.OrganizationDao;
import com.gouhai.baoshan.dao.user.UserDao;
import com.gouhai.baoshan.dao.user.UserRoleDao;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 *
 */
@Service
public class OrganizationService {

	@Autowired
	private OrganizationDao organizationDao;
@Autowired
private UserDao userDao;
@Autowired
private UserRoleDao userRoleDao;
	public void insert(Organization organization) {
		organization.setDeleted(false);
		organizationDao.insert(organization);
	}

	public void update(Organization organization) {
		organizationDao.update(organization);
	}

	public void delete(String id) {
		Organization organization = new Organization(id);
		organizationDao.batchExecute("update from Organization set deleted =? where parent=?", true, organization);
		organizationDao.batchExecute("update from Organization set deleted =? where id=?", true, id);
		//根据组织结构的ID找到该组织的用户
	List<User> list=	userDao.findAll("from User  where organization=?", organization);
	for (int i = 0; i < list.size(); i++) {
		userRoleDao.deleteUserRoleByUserid(list.get(i).getId());
		userDao.delete(list.get(i));
	}
	
	}

	public Organization findOne(String id) {
		return organizationDao.findOne(id);
	}
	
	public List<Organization> getOrganizationAllList() {
		return organizationDao.getOrganizationAllList();
	}
	/**
	 * 获取所有的下属职能部门
	 * @return
	 */
	public List<Organization> getOrganizationAll(Organization organization) {
		if(organization!=null){
		    return organizationDao.findAll("from Organization where deleted=? and level is null and id!='d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f2' and id!='d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1' and (parent=? or id=?)",false,organization,organization.getId());
		}else{
			return organizationDao.findAll("from Organization where deleted=? and level is null and id!='d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f2' and id!='d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1'",false);
		}
	}
	
	public List<Organization> getOrganizationList(int pageNumber) {
		return organizationDao.findList("from Organization where deleted=? and level=null and parent='d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1'", pageNumber, PageableController.PAGE_SIZE, false);
	}
	
	public long getOrganizationCount() {
		return organizationDao.findCount("from Organization where deleted=? and level=null and  parent='d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1'", false);
	}
	

	public List<Organization> getOrganizationList(Organization parent) {
		return organizationDao.findAll("from Organization where deleted=? and level=null and parent=?", false, parent);
	}
	//根据父类的ID 查询下面的职能部门
	public List<Organization> getOrganizationList(String parentid) {
		System.out.println("2222"+parentid);
		return organizationDao.findAll("from Organization where level=2 and parent='"+parentid+"'");
		
	}
	public List<Organization> getOrgbscList(Organization parent) {
		return organizationDao.findAll("from Organization where deleted=? and level=null and z and parent=?", false, parent);
	}
	public List<Organization> getOrganizationList(Organization parent, int pageNumber) {
		return organizationDao.findList("from Organization where deleted=? and level=null and parent=?", pageNumber, PageableController.PAGE_SIZE, false, parent);
	}
	
	public long getOrganizationCount(Organization parent) {
		return organizationDao.findCount("from Organization where deleted=? and level=null and parent=?", false, parent);
	}
	
	public long getOrgbscCount(Organization parent) {
		return organizationDao.findCount("from Organization  where deleted=? and level=2  and parent=?", false, parent);
	}
	public List<Organization> getOrganizationListOfQu() {
		return organizationDao.findAll("from Organization where deleted=? and level=2 and parent='d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1'", false);
	}
	//取办事处的集合数据
	public List<Organization> getOrgbscList(Organization parent, int pageNumber) {
	
		return organizationDao.findList("from Organization where deleted=? and level=2   and parent=?", pageNumber, PageableController.PAGE_SIZE, false, parent);
		//return organizationDao.findAll("from Organization where deleted=? and level=2 and parent=?", false, parent);
	}
	//查询全区所有的村委会
	public int getOrgCount(){
	return	(int) organizationDao.findCount("from Organization where flag in(0,1) ");
	}
	//查询全区所有的镇
	public List<Organization> getOrganizationsByflag(){
		return organizationDao.findAll("from Organization where flag=? and deleted=? ", 2,false);
	}
	
	/**
	 * //查询全区所有的村委会或者居委会
	 * @return
	 */
	public List<Organization> getOrganizations(){
		return	organizationDao.findAll("from Organization where flag in(0,1) and deleted=?",false);
	}
}
