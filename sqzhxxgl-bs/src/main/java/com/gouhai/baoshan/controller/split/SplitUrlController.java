package com.gouhai.baoshan.controller.split;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

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
import com.gouhai.baoshan.entity.spilt.Split;
import com.gouhai.baoshan.entity.spilt.TempJson;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.service.split.CopyObjectService;
import com.gouhai.baoshan.service.split.LinkManService;
import com.gouhai.baoshan.service.split.OrganService;
import com.gouhai.baoshan.service.split.PlanService;
import com.gouhai.baoshan.service.split.SplitService;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.DateTimeUtil;

@Controller
@RequestMapping("/split")
public class SplitUrlController extends PageableController
{
	@Autowired
	private OrganService organService;
	@Autowired
	private SplitService splitService;
	@Autowired
	private LinkManService linkManService;
	@Autowired
	private CopyObjectService copyService;
	@Autowired
	private PlanService planService;
	
	/**
	 * 添加联系单
	 * @return
	 */
	@RequestMapping(value = "/officer/add",method = RequestMethod.GET)
	public String officerAdd()
	{
		return "/split/officer/add";
	}
	/**
	 * 干事主页 未处理联系单
	 * @return
	 */
	@RequestMapping(value = "/officer/index",method = RequestMethod.GET)
	public String index()
	{
		return "/split/officer/index";
	}
	/**
	 * 大主页
	 * @return
	 */
	@RequestMapping(value = "/main",method = RequestMethod.GET)
	public String main()
	{
		return "/split/main";
	}
	/**
	 * 不同权限联系单首页跳转
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/show", method = RequestMethod.GET)  
	public String show(HttpSession session)
	{
		String userid = (String) session.getAttribute("userId");
		String code = organService.getRoleCode(userid);
		Organization organization=(Organization) session.getAttribute("userOrgan");
		if("ganshi".equals(code))
	 	{
	 		return "redirect:/split/getSplit/"+organization.getId()+"/1";
	 	}
	 	if("zznbm".equals(code))
	 	{
	 		return "/split/town/index";
	 	}
	 	if("qznbm".equals(code))
	 	{
	 		return "/split/area/index";
	 	}
	 	if("lxd".equals(code))
	 	{
	 		return "redirect:/linkman/get/"+organization.getId()+"/1";
	 	}
	 	return "redirect:/";
	}
	/**
	 * 错误页面
	 * @return
	 */
	@RequestMapping(value = "/error",method = RequestMethod.GET)
	public String error()
	{
		return "/split/error";
	}
	/**
	 * 获取某街镇联系单序号
	 * @param objid
	 * @return
	 */
	@RequestMapping(value = "/getNum/{objid}" ,method = RequestMethod.GET)
	public @ResponseBody TempJson getListNum(@PathVariable String objid)
	{
		TempJson json = new TempJson();
		json.setValue(String.valueOf(splitService.getSplitByStreetId(objid).size()+1));
		
		return json;
	}
	/**
	 * 新增一条联系单
	 * @param split
	 * @return
	 */
	@RequestMapping(value = "/insetSplit",method = RequestMethod.POST)
	public @ResponseBody Split insertSplit(@RequestBody Split split)
	{
		/**
		 * 居委干事增加联系单信息
		 */
		String num = split.getNum()+String.valueOf(splitService.getSplitByStreetId(split.getStreetId()).size()+1);
		split.setNum(num);
		String splitId = splitService.insertSplit(split);
		/**
		 * 社管办增加信息
		 */
		LinkMan linkMan = new LinkMan();
		linkMan.setFromId(split.getCommitteeId());
		linkMan.setFromName(split.getCommittee());
		linkMan.setMyId(split.getStreetId());
		linkMan.setMyName(split.getStreet());
		linkMan.setSplitId(splitId);
		linkMan.setCopy("wait");
		linkMan.setReceiptId("wait");
		linkMan.setSendDate(split.getRealDate());
		linkMan.setReceiptDate("wait");
		linkMan.setReplyContent("wait");
		linkMan.setNum(num);
		
		linkManService.insertLinkMan(linkMan);
		/**
		 * 创建联系单流程
		 */
		Plan plan = new Plan();
		plan.setId(splitId);
		plan.setPlan("<font color=green>流程开始;</font><br>"+split.getCommittee()+"&nbsp;&nbsp;发送联系单至&nbsp;&nbsp;"+split.getStreet()+"-社管办;&nbsp;&nbsp;("+DateTimeUtil.getDateToString(new Date(), DateTimeUtil.PATTERN_LONG)+")<br>");
		planService.insertPlan(plan);
		
		return split;
	}
	/**
	 * 根据居委id获取联系单
	 * @param committeeId
	 * @return
	 */
	@RequestMapping(value = "/getSplit/{committeeId}/{current}",method = RequestMethod.GET)
	public  String getUnSplit( Model model, @PathVariable() int current ,@PathVariable String committeeId)
	{   model.addAllAttributes(pageResult(splitService.getObjList(current, committeeId),splitService.getObjCount(committeeId), current));
		return "/split/officer/list";
	}
	/**
	 * 查看联系单详情
	 * @param pid
	 * @param model
	 * @param url
	 * @return
	 */
	@RequestMapping(value = "/officer/info/{pid}/{url}",method = RequestMethod.GET)
	public String info(@PathVariable String pid,Model model,@PathVariable String url)
	{
		String[] str = url.split("_");
		StringBuffer buffer = new StringBuffer(); 
		for(String string:str)
		{
			buffer.append("/");
			buffer.append(string);
		}
		model.addAttribute("url",buffer.toString());
		model.addAttribute("split",splitService.getByPid(pid));
		return "/split/info";
	}
	@RequestMapping(value = "/getBy/{pid}",method = RequestMethod.GET)
	public @ResponseBody Split getSplit(@PathVariable String pid)
	{
		return splitService.getByPid(pid);
	}
	/**
	 * 进入回复页面
	 * @param model
	 * @param url
	 * @param copyId
	 * @param pid
	 * @param backUrl
	 * @return
	 */
	@RequestMapping(value = "/reply/{pid}/{copyId}/{backUrl}/{url}")
	public String reply(Model model,@PathVariable String url,@PathVariable String copyId,@PathVariable String pid,@PathVariable String backUrl )
	{
		String[] str = url.split("_");
		StringBuffer buffer = new StringBuffer(); 
		for(String string:str)
		{
			buffer.append("/");
			buffer.append(string);
		}
		String[] back = backUrl.split("_");
		StringBuffer buf = new StringBuffer(); 
		for(String string:back)
		{
			buf.append("/");
			buf.append(string);
		}
		model.addAttribute("url",buffer.toString());
		model.addAttribute("back",buf.toString());
		model.addAttribute("copyId",copyId);
		model.addAttribute("pid",pid);
		return "/split/reply";
	}
	/**
	 * 区职能部门已回复
	 * @return
	 */
	@RequestMapping(value = "/area/ready",method = RequestMethod.GET)
	public String areaReady()
	{
		return "/split/area/ready";
	}
	/**
	 * 查看我回复出去的信息
	 * @param pid
	 * @param model
	 * @param url
	 * @return
	 */
	@RequestMapping(value = "/myreply/{pid}/{url}",method = RequestMethod.GET)
	public String myreply(@PathVariable String pid,Model model,@PathVariable String url)
	{
		String[] str = url.split("_");
		StringBuffer buffer = new StringBuffer(); 
		for(String string:str)
		{
			buffer.append("/");
			buffer.append(string);
		}
		model.addAttribute("url",buffer.toString());
		model.addAttribute("pid",pid);
		CopyObject c = copyService.getSingleCopy(pid);
		model.addAttribute("htmlInfo",c.getReplyContent());
		return "/split/myreply";
	}
	@RequestMapping(value = "/tempreply/{pid}/{url}",method = RequestMethod.GET)
	public String tempreply(@PathVariable String pid,@PathVariable String url,Model model)
	{
		String[] str = url.split("_");
		StringBuffer buffer = new StringBuffer(); 
		for(String string:str)
		{
			buffer.append("/");
			buffer.append(string);
		}
		model.addAttribute("url",buffer.toString());
		model.addAttribute("pid",pid);
		CopyObject c = copyService.getSingleCopy(pid);
		model.addAttribute("htmlInfo",c.getTempData());
		return "/split/tempreply";
	}
	/**
	 * 镇职能部门处理完结
	 * @return
	 */
	@RequestMapping(value = "/townready",method = RequestMethod.GET)
	public String townready()
	{
		return "/split/town/ready";
	}
	/**
	 * 社管办查看上级回复信息
	 * @param pid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/linkreply/{pid}",method = RequestMethod.GET)
	public String linkreply(@PathVariable String pid,Model model)
	{
		LinkMan link = linkManService.getLink(pid);
		model.addAttribute("reply",link.getReplyContent());
		return "/split/linkreply";
	}
	/**
	 * 社管办进行回执
	 * @param pid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/receipt/{pid}",method = RequestMethod.GET)
	public String receipt(@PathVariable String pid,Model model)
	{
		LinkMan link = linkManService.getLink(pid);
		Split split = splitService.getByPid(link.getSplitId());
		model.addAttribute("split",split);
		model.addAttribute("link",link);
		return "/split/receipt";
	}
	@RequestMapping(value = "/look/{pid}",method = RequestMethod.GET)
	public String look(@PathVariable String pid)
	{
		Split split = splitService.getByPid(pid);
		LinkMan link = linkManService.getByTwo(split.getStreetId(), pid);
		return "redirect:/split/receiptInfo/"+pid+"/"+link.getPid()+"/split_ready";
	}
	@RequestMapping(value = "/receiptInfo/{pid}/{lpid}/{url}",method = RequestMethod.GET)
	public String receiptInfo(@PathVariable String pid,Model model,@PathVariable String lpid,@PathVariable String url)
	{
		String [] str = url.split("_");
		StringBuffer buffer = new StringBuffer();
		for(String string:str)
		{
			buffer.append("/");
			buffer.append(string);
		}
		model.addAttribute("url",buffer.toString());
		LinkMan link = linkManService.getLink(lpid);
		Split split = splitService.getByPid(pid);
		model.addAttribute("split",split);
		model.addAttribute("link",link);
		return "/split/receiptInfo";
	}
	/**
	 * 插入回执单
	 * @param pid
	 * @param lpid
	 * @param split
	 * @return
	 */
	@RequestMapping(value = "/insertReceipt/{pid}/{lpid}",method = RequestMethod.POST)
	public @ResponseBody Split insertReceipt(@PathVariable String pid ,@PathVariable String lpid,@RequestBody Split split)
	{
		Split s = splitService.getByPid(pid);
		s.setReceipt(split.getReceipt());
		s.setReceiptDate(split.getReceiptDate());
		LinkMan link = linkManService.getLink(lpid);
		link.setReceiptId(split.getReceipt());
		link.setReceiptDate(split.getReceiptDate());
		linkManService.updateLinkMan(link);
		splitService.updateSplit(s);
		/**
		 * 更新回执状态
		 */
		Plan plan = planService.getPlan(pid);
		plan.setPlan(plan.getPlan()+s.getStreet()+"社管办&nbsp;&nbsp;回执了&nbsp;&nbsp;"+s.getCommittee()+";("+DateTimeUtil.getDateToString(new Date(), DateTimeUtil.PATTERN_LONG)+")<br><font color=red >流程结束;</font><br>");
		planService.updatePlan(plan);
		
		return split;
	}
	@RequestMapping(value = "/ready",method = RequestMethod.GET)
	public String officerReady()
	{
		return "/split/officer/ready";
	}
	/**
	 * 跳转查看流程
	 * @param url
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/plan/{id}/{url}",method = RequestMethod.GET)
	public String plan(@PathVariable String url ,@PathVariable String id,Model model)
	{
		String [] str = url.split("_");
		StringBuffer buffer = new StringBuffer();
		for(String s:str)
		{
			buffer.append("/");
			buffer.append(s);
		}
		model.addAttribute("url",buffer.toString());
		model.addAttribute("plantext",planService.getPlan(id));
		
		return "/split/plan";
	}
	/**
	 * 联系单列表
	 * @return
	 */
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public String list()
	{
		return "/split/officer/list";
	}
	/**
	 * 社管办查看详情
	 * @return
	 */
	@RequestMapping(value = "/linkman/info/{pid}/{url}")
	public String linkmanInfo(Model model,@PathVariable String url,@PathVariable String pid)
	{
		String[] str = url.split("_");
		StringBuffer buffer = new StringBuffer(); 
		for(String string:str)
		{
			buffer.append("/");
			buffer.append(string);
		}
		Split split = splitService.getByPid(pid);
		LinkMan link = linkManService.getByTwo(split.getStreetId(), pid);
		model.addAttribute("url",buffer.toString());
		model.addAttribute("split",splitService.getByPid(pid));
		model.addAttribute("objid",link.getPid());
		
		return "/split/linkman/info";
	}
	/**
	 * 镇职能部门
	 * @return
	 */
	@RequestMapping(value = "/town/info/{pid}/{url}")
	public String townInfo(Model model,@PathVariable String url,@PathVariable String pid,HttpSession session)
	{
		String orgPid = (String) session.getAttribute("znbm");
		String[] str = url.split("_");
		StringBuffer buffer = new StringBuffer(); 
		for(String string:str)
		{
			buffer.append("/");
			buffer.append(string);
		}
		Split split = splitService.getByPid(pid);
		CopyObject copy = copyService.getByTwo(orgPid, split.getPid());
		model.addAttribute("url",buffer.toString());
		model.addAttribute("split",splitService.getByPid(pid));
		model.addAttribute("pid",copy.getPid());
		model.addAttribute("objid",copy.getPid());
		
		return "/split/town/info";
	}
}