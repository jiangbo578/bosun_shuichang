package com.gouhai.baoshan.controller.split;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.service.split.OrganService;

@Controller
@RequestMapping("/organ")
public class OrganController
{
	public static final String AREA_ORGID = "d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1";
	@Autowired
	private OrganService organService;
	
	@RequestMapping(value = "/org/{parent_id}")
	public @ResponseBody List<Organization> getOrganization( @PathVariable String parent_id)
	{
		List<Organization> list = new ArrayList<Organization>();
		List<Organization> l = organService.getTownFunctions(parent_id);
		List<Organization> li = organService.getTownFunctions(AREA_ORGID);
		for(Organization org:l)
		{
			list.add(org);
		}
		for(Organization o :li)
		{
			list.add(o);
		}
		return list;
	}
}
