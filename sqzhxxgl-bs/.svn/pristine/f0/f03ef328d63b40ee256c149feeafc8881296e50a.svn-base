package com.gouhai.baoshan.controller.split;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gouhai.baoshan.entity.spilt.CopyObject;
import com.gouhai.baoshan.entity.spilt.LinkMan;
import com.gouhai.baoshan.entity.spilt.Plan;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.service.split.CopyObjectService;
import com.gouhai.baoshan.service.split.LinkManService;
import com.gouhai.baoshan.service.split.OrganService;
import com.gouhai.baoshan.service.split.PlanService;
import com.gouhai.baoshan.spring.PageableController;

@Controller
@RequestMapping(value = "/linkman")
public class LinkManController extends PageableController
{
	@Autowired
	private LinkManService linkService;
	@Autowired
	private CopyObjectService copyService;
	@Autowired
	private OrganService orgService;
	@Autowired
	private PlanService planService;
	
	@RequestMapping(value = "/get/{orgId}/{current}",method = RequestMethod.GET)
	public String getWaitCopy(Model model, @PathVariable() int current ,@PathVariable String orgId)
	{ model.addAllAttributes(pageResult(linkService.getObjList(current, orgId),linkService.getObjCount(orgId), current));
		return "/split/linkman/index";
	}
	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String index()
	{
		return "/split/linkman/index";
	}
	/**
	 * 插入一条转发记录
	 * @param pid
	 * @param split_id
	 * @param copy
	 * @return
	 */
	@RequestMapping(value = "/insertCopy/{split_id}/{pid}")
	public @ResponseBody CopyObject insertCopy(@PathVariable String pid ,@PathVariable String split_id,@RequestBody CopyObject copy)
	{
		String [] str = copy.getMyId().split("@");
		
		for(int i = 1;i<str.length;i++)
		{
			CopyObject copyObj = new CopyObject();
			copyObj.setFromId(copy.getFromId());
			copyObj.setCopyType(copy.getCopyType());
			copyObj.setFromName(copy.getFromName());
			copyObj.setSplitId(copy.getSplitId());
			copyObj.setReplyContent(copy.getReplyContent());
			copyObj.setCopyType(copy.getCopyType());
			copyObj.setCopyDate(DateFormat.getDateInstance().format(new Date()));
			copyObj.setNum(copy.getNum());
			Organization org = orgService.getOrg(str[i]);
			copyObj.setMyName(org.getParent().getName()+"-"+org.getName());;
			copyObj.setMyId(str[i]);
			
			Plan plan = planService.getPlan(split_id);
			plan.setPlan(plan.getPlan()+copyObj.getFromName()+"&nbsp;&nbsp;将联系单转发至&nbsp;&nbsp;"+copyObj.getMyName()+";("+DateFormat.getDateInstance().format(new Date())+")<br>");
			planService.updatePlan(plan);
			
			copyService.insertCopyObject(copyObj);
		}
		
		LinkMan linkMan = linkService.getLink(pid);
		linkMan.setCopy(copy.getMyId());
		linkService.updateLinkMan(linkMan);
		return copy;
	}
	/**
	 * 社管办待回执
	 * @return
	 */
	@RequestMapping(value = "/wait",method = RequestMethod.GET)
	public String goWait()
	{
		return "/split/linkman/wait";
	}
	@RequestMapping(value = "/ready",method = RequestMethod.GET)
	public String ready()
	{
		return "/split/linkman/ready";
	}
	
}
