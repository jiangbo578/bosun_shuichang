package com.gouhai.baoshan.controller.split;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
import com.gouhai.baoshan.utils.DateTimeUtil;

@Controller
@RequestMapping(value = "/copy")
public class CopyObjectController
{
	@Autowired
	private CopyObjectService copyService;
	@Autowired 
	private OrganService orgService;
	@Autowired
	private LinkManService linkService;
	@Autowired
	private PlanService planService;
	/**
	 * 镇已处理完结
	 * @return
	 */
	@RequestMapping(value = "/ready",method = RequestMethod.GET)
	public String townIndex()
	{
		return "/split/town/ready";
	}
	/**
	 * 查询某部门接收到的转发
	 * @param myId
	 * @return
	 */
	@RequestMapping(value = "/myCopy/{myId}")
	public @ResponseBody List<CopyObject> getMyCopy(@PathVariable String myId)
	{
		return copyService.getCopyObject(myId);
	}
	/**
	 * 镇职能部门转发至区职能部门
	 * @param copy
	 * @return
	 */
	@RequestMapping(value ="/updateCopy",method = RequestMethod.POST )
	public @ResponseBody CopyObject updateCopy(@RequestBody CopyObject copy)
	{
		String[] str = copy.getMyId().split("@");
		CopyObject fromObj = copyService.getSingleCopy(copy.getCopyType());
		fromObj.setTempData("copy");
		copyService.updateCopyObject(fromObj);
		
		for(int i=1;i<str.length;i++)
		{
			CopyObject copyObj = new CopyObject();
			copyObj.setFromId(copy.getFromId());
			copyObj.setCopyType(copy.getCopyType());
			copyObj.setFromName(copy.getFromName());
			copyObj.setSplitId(copy.getSplitId());
			copyObj.setReplyContent(copy.getReplyContent());
			Organization org = orgService.getOrg(copyObj.getFromId());
			Organization toOrg = orgService.getOrg(str[i]);
			copyObj.setFromName(copyObj.getFromName()+"-"+org.getName());
			copyObj.setMyName(toOrg.getParent().getName()+"-"+toOrg.getName());;
			copyObj.setMyId(str[i]);
			copyObj.setCopyDate(DateFormat.getDateInstance().format(new Date()));
			copyObj.setNum(copy.getNum());
			/**
			 * 更新流程
			 */
			Plan plan = planService.getPlan(copyObj.getSplitId());
			plan.setPlan(plan.getPlan()+copyObj.getFromName()+"&nbsp;&nbsp;将联系单转发至&nbsp;&nbsp;"+copyObj.getMyName()+";("+DateTimeUtil.getDateToString(new Date(), DateTimeUtil.PATTERN_LONG)+")<br>");
			planService.updatePlan(plan);
			
			copyService.insertCopyObject(copyObj);;
		}
		return new CopyObject();
	}
	/**
	 * 回复操作
	 * @param copy
	 * @param pid
	 * @param copyId
	 * @return
	 */
	@RequestMapping(value = "/insertReply/{pid}/{copyId}",method = RequestMethod.POST)
	public @ResponseBody CopyObject insertReply(@RequestBody CopyObject copy ,@PathVariable String pid,@PathVariable String copyId)
	{
		/**
		 * 镇职能部门接收的转发
		 */
		if("linkman".equals(copyId))
		{
			CopyObject co = copyService.getSingleCopy(pid);
			co.setReplyContent(copy.getReplyContent());
			co.setReplyDate(DateFormat.getDateInstance().format(new Date()));
			LinkMan link = linkService.getByTwo(co.getFromId(), co.getSplitId());
			if("wait".equals(link.getReplyContent()))
			{
				link.setReplyContent("<b>"+co.getMyName()+":</b>"+co.getReplyContent()+"<br>");
			}
			else
			{
				link.setReplyContent(link.getReplyContent()+"<b>"+co.getMyName()+":</b>"+co.getReplyContent()+"<br>");
			}
			/**
			 * 更新流程
			 */
			Plan plan = planService.getPlan(co.getSplitId());
			plan.setPlan(plan.getPlan()+co.getMyName()+"&nbsp;&nbsp;回复了&nbsp;&nbsp;"+co.getFromName()+";("+DateTimeUtil.getDateToString(new Date(), DateTimeUtil.PATTERN_LONG)+")<br>");
			planService.updatePlan(plan);
			
			linkService.updateLinkMan(link);
			copyService.updateCopyObject(co);
		}
		/**
		 * 区职能部门接收的转发
		 */
		else
		{
			CopyObject co = copyService.getSingleCopy(pid);
			String splitId = co.getSplitId();
			String myId = co.getFromId();
			String myName = co.getMyName();
			co.setReplyContent(copy.getReplyContent());
			co.setReplyDate(DateFormat.getDateInstance().format(new Date()));
			CopyObject cop = copyService.getByTwo(myId, splitId);
			cop.setReplyDate(DateFormat.getDateInstance().format(new Date()));
			String id = copyService.getByTwo(co.getFromId(), co.getSplitId()).getFromId();
			LinkMan link = linkService.getByTwo(id, co.getSplitId());
			if("copy".equals(cop.getTempData()))
			{
				cop.setReplyContent("<b>"+myName+":</b>"+co.getReplyContent()+"<br>");
			}
			else
			{
				cop.setReplyContent(cop.getTempData()+"<b>"+myName+":</b>"+co.getReplyContent()+"<br>");
			}
			if("wait".equals(link.getReplyContent()))
			{
				link.setReplyContent("<b>"+co.getMyName()+":</b>"+co.getReplyContent()+"<br>");
			}
			else
			{
				link.setReplyContent(link.getReplyContent()+"<b>"+co.getMyName()+":</b>"+co.getReplyContent()+"<br>");
			}
			Plan plan = planService.getPlan(link.getSplitId());
			plan.setPlan(plan.getPlan()+myName+"&nbsp;&nbsp;回复了&nbsp;&nbsp;"+link.getMyName()+"-社管办 ;"+(DateTimeUtil.getDateToString(new Date(), DateTimeUtil.PATTERN_LONG))+"<br>");
			planService.updatePlan(plan);
			
			linkService.updateLinkMan(link);
			copyService.updateCopyObject(cop);
			copyService.updateCopyObject(co);
		}
		return copy;
	}
}
