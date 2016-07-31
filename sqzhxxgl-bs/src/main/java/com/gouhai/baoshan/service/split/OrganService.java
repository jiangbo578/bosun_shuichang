package com.gouhai.baoshan.service.split;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.split.OrganDao;
import com.gouhai.baoshan.entity.user.Organization;

@Service
public class OrganService
{
	@Autowired
	private OrganDao organDao;
	
	public List<Organization> getTownFunctions(String parent_id)
	{
		return organDao.getTownFunctions(parent_id);
	}
	
	public String getRoleCode(String userid)
	{
		return organDao.getRoleCode(userid);
	}
	
	public Organization getOrg(String pid)
	{
		return organDao.getOrg(pid);
	}
}
