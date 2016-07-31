package com.gouhai.baoshan.controller.kpxt;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gouhai.baoshan.entity.assess.AssessBaseEntity;
import com.gouhai.baoshan.entity.assess.AssessTemplate;
import com.gouhai.baoshan.entity.assess.AssessTemplateInstance;
import com.gouhai.baoshan.entity.assess.Huizong;
import com.gouhai.baoshan.entity.assess.Rule;
import com.gouhai.baoshan.entity.assess.Score;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.service.assess.AssessBaseEntityService;
import com.gouhai.baoshan.service.assess.AssessTemplateInstanceService;
import com.gouhai.baoshan.service.assess.AssessTemplateService;
import com.gouhai.baoshan.service.assess.RuleService;
import com.gouhai.baoshan.service.assess.ScoreService;
import com.gouhai.baoshan.service.user.OrganizationService;
import com.gouhai.baoshan.utils.DateTimeUtil;
import com.gouhai.baoshan.utils.ExportDocUtil;
import com.gouhai.baoshan.utils.StringUtil;

/**
 * 600分考评系统
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/kpxt")
public class KpxtController {
	// private final static Logger log = Logger.getLogger(KpxtController.class);
	@Autowired
	private AssessBaseEntityService assessBaseEntityService;
	@Autowired
	private AssessTemplateInstanceService assessTemplateInstanceService; // 考核实例
	@Autowired
	private AssessTemplateService assessTemplateService;// 考核实例模版
	@Autowired
	private OrganizationService organizationService;
	@Autowired
	private RuleService ruleService;

	/**
	 * 主页
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(Model model) {
		if (!SecurityUtils.getSubject().isPermitted("kpxt" + ":list")) {
			return "/error/unauthority";
		}
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		Organization organization = (Organization) session
				.getAttribute("userOrgan");
		String selectDate = DateTimeUtil.getDateToString(new Date(), "yyyy");// 为空则默认当前时间年份
		List<AssessTemplateInstance> list = assessTemplateInstanceService
				.getBeanBreak(selectDate, organization, null, 0, 1);
		model.addAttribute("khlb", list);
		return "/kpxt/main";
	}

	/**
	 * 中间的页面
	 * 
	 * @return index.jsp
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model, HttpServletRequest request) {
		// 查询被驳回的考评
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		Organization organization = (Organization) session
				.getAttribute("userOrgan");
		// String selectDate = DateTimeUtil.getDateToString(new Date(),
		// "yyyy");// 为空则默认当前时间年份
		String selectDate = "2014";
		List<AssessTemplateInstance> list = assessTemplateInstanceService
				.getBeanBreak(selectDate, organization, null, 0, 1);
		List<AssessTemplateInstance> aslist = new ArrayList<AssessTemplateInstance>();
		if (list != null) {
			for (AssessTemplateInstance assessTemplateInstance : list) {
				AssessTemplateInstance as = assessTemplateInstanceService
						.getLbByID(assessTemplateInstance.getAssessTemplate()
								.getId());
				aslist.add(as);
			}
		}
		// 去除集合中重复的值
		for (int i = 0; i < aslist.size(); i++) {
			for (int j = aslist.size() - 1; j > i; j--) {
				if (aslist.get(i) == aslist.get(j)) {
					aslist.remove(j);
				}
			}
		}
		model.addAttribute("list", aslist);
		model.addAttribute("khlb", list);
		List<Huizong> score = null;
		String mark = request.getParameter("mark");
		if (mark == null) {
			mark = "1";
		}
		if (mark.equals("1")) {
			score = scoreService.getScore();
		} else if (mark.equals("2")) {
			score = scoreService.getScoreByCun();
		}
		model.addAttribute("score", score);
		model.addAttribute("mark", mark);
		return "/kpxt/index";
	}

	/**
	 * 填写600分考评
	 * 
	 * 根据当前居委 或 村委 获取出考核类型
	 * 
	 * 
	 * 
	 */
	@RequestMapping(value = "/item/add", method = RequestMethod.GET)
	public String toAdd(Model model, HttpServletRequest request) {
		// 获取登录用户的组织结构
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		Organization organization = (Organization) session
				.getAttribute("userOrgan");
		List<AssessTemplateInstance> list = null;
		List<AssessTemplateInstance> khxmlist = null;
		String selectDate = null;
		String assessId = request.getParameter("assessId");
		List<AssessBaseEntity> assess = assessBaseEntityService
				.getBeanListByFlag(organization.getFlag());// 用固定的居委标识测试 以后改成动态的
		if (null != assess && assess.size() > 0) {
			model.addAttribute("assess", assess);// 六大考核类型
			if (null == assessId || "".equals(assessId))
				assessId = assess.get(0).getId();// 选项卡默认选择第一项
			model.addAttribute("assessId", assessId);
			// 根据考核大类（assessId）选取相应的表单 并且对考核条目进行分组显示
			if (null == selectDate || "".equals(selectDate)) {
				selectDate = DateTimeUtil.getDateToString(new Date(), "yyyy");// 为空则默认当前时间年份
			}
			selectDate = "2014";
			list = assessTemplateInstanceService.getList(selectDate,
					organization, assessId);

			// 只能是村委或者居委才能复制模板
			if (organization.getFlag() == 0 || organization.getFlag() == 1) {
				// 从模版复制出一份实例
				if (null == list || list.size() == 0) {
					organization = organizationService.findOne(organization
							.getId());
					organization.setType(1);// 未提交
					organizationService.update(organization);
					List<AssessTemplate> assessTemplates = assessTemplateService
							.getBeanList(assessId);
					assessTemplateInstanceService.insertCopy(assessTemplates,
							organization);
					khxmlist = assessTemplateInstanceService.getBeanListByZZ(
							selectDate, organization, assessId, null, 0, null,
							null);
					list = assessTemplateInstanceService.getBeanListByZZ(
							selectDate, organization, assessId, null, 1, null,
							null);
				}
			}
			khxmlist = assessTemplateInstanceService.getBeanListByZZ(
					selectDate, organization, assessId, null, 0, 0, null);
			list = assessTemplateInstanceService.getBeanListByZZ(selectDate,
					organization, assessId, null, 1, 0, null);
		}
		Integer flag = 1;
		if (list != null) {
			flag = list.get(0).getHold();
			if (list.get(0).getHold() == 1 || list.get(0).getHold() == 2
					|| list.get(0).getHold() == 3) {
				khxmlist = null;
				list = null;
				model.addAttribute("message", "此表单已经提交了");
			}
		}

		// 若考核项目和考核类别都不为空，对记录分组
		if (list != null && khxmlist != null) {
			List<Object[]> zn = assessTemplateInstanceService
					.findgroupByZn(assessId);
			List<Organization> znNames = null;
			if (null != zn) {
				znNames = new ArrayList<Organization>();
				for (int i = 0; i < zn.size(); i++) {
					Object[] obj = zn.get(i);
					String idg = (String) obj[1];
					Organization organization1 = organizationService
							.findOne(idg);
					znNames.add(organization1);
				}
			}
			for (int i = 0; i < list.size(); i++) {
				List<Rule> rulelist = ruleService
						.getRulelistById(new AssessTemplate(list.get(i)
								.getMbid()));
				if (rulelist != null && rulelist.size() > 0) {
					Rule rule = rulelist.get(0);
					list.get(i).setDescription(rule.getContent());
				}
			}
			model.addAttribute("znNames", znNames);
		}
		model.addAttribute("flag", flag);
		model.addAttribute("list", list);
		model.addAttribute("khxmlist", khxmlist);
		return "/kpxt/item/index";
	}

	/**
	 * 查询已提交的600分考评
	 */
	@RequestMapping(value = "/item/submit", method = RequestMethod.GET)
	public String findSubmit(Model model, HttpServletRequest request) {
		// 获取登录用户的组织结构
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		Organization organization = (Organization) session
				.getAttribute("userOrgan");
		List<AssessTemplateInstance> list = null;
		List<AssessTemplateInstance> khxmlist = null;
		String selectDate = request.getParameter("selectDate");
		String assessId = request.getParameter("assessId");
		List<AssessBaseEntity> assess = assessBaseEntityService
				.getBeanListByFlag(organization.getFlag());// 用固定的居委标识测试 以后改成动态的
		if (null != assess && assess.size() > 0) {
			model.addAttribute("assess", assess);// 六大考核类型
			if (null == assessId || "".equals(assessId))
				assessId = assess.get(0).getId();// 选项卡默认选择第一项
			model.addAttribute("assessId", assessId);
			// 根据考核大类（assessId）选取相应的表单 并且对考核条目进行分组显示

			if (null == selectDate || "".equals(selectDate)) {
				selectDate = DateTimeUtil.getDateToString(new Date(), "yyyy");// 为空则默认当前时间年份
			}
			// 查询考核项目
			khxmlist = assessTemplateInstanceService.getBeanSubmit(selectDate,
					organization, assessId, 0, 0);
			// 查询考核类别
			list = assessTemplateInstanceService.getBeanSubmit(selectDate,
					organization, assessId, 0, 1);
			List<AssessTemplateInstance> alist = new ArrayList<AssessTemplateInstance>();
			if (khxmlist != null && list != null) {
				for (int i = 0; i < khxmlist.size(); i++) {
					for (int j = 0; j < list.size(); j++) {
						if (khxmlist
								.get(i)
								.getMbid()
								.equals(list.get(j).getAssessTemplate().getId())) {
							alist.add(khxmlist.get(i));
							break;
						}
					}

				}
				khxmlist = alist;

			}
		}
		// 若考核项目和考核类别都不为空，对记录分组
		if (list != null && khxmlist != null) {
			List<Object[]> zn = assessTemplateInstanceService
					.findgroupByZn(assessId);
			List<Organization> znNames = null;
			if (null != zn) {
				znNames = new ArrayList<Organization>();
				for (int i = 0; i < zn.size(); i++) {
					Object[] obj = zn.get(i);
					String idg = (String) obj[1];
					Organization organization1 = organizationService
							.findOne(idg);
					for (int j = 0; j < khxmlist.size(); j++) {
						if (organization1.getId().equals(
								khxmlist.get(j).getZnbmId())) {
							znNames.add(organization1);
							break;
						}
					}

				}
			}
			model.addAttribute("znNames", znNames);
		}
		if (list != null) {
			Integer flag = list.get(0).getHold();
			model.addAttribute("flag", flag);
		}

		model.addAttribute("list", list);
		model.addAttribute("khxmlist", khxmlist);
		return "/kpxt/item/submit";
	}

	/**
	 * 查询被驳回的600分考评
	 */
	@RequestMapping(value = "/item/break", method = RequestMethod.GET)
	public String findBreakkp(Model model, HttpServletRequest request) {
		// 获取登录用户的组织结构
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		Organization organization = (Organization) session
				.getAttribute("userOrgan");
		List<AssessTemplateInstance> list = null;
		List<AssessTemplateInstance> khxmlist = null;
		String selectDate = null;
		String assessId = request.getParameter("assessId");
		List<AssessBaseEntity> assess = assessBaseEntityService
				.getBeanListByFlag(organization.getFlag());// 用固定的居委标识测试 以后改成动态的
		if (null != assess && assess.size() > 0) {
			model.addAttribute("assess", assess);// 六大考核类型
			if (null == assessId || "".equals(assessId))
				assessId = assess.get(0).getId();// 选项卡默认选择第一项
			model.addAttribute("assessId", assessId);
			// 根据考核大类（assessId）选取相应的表单 并且对考核条目进行分组显示

			if (null == selectDate || "".equals(selectDate)) {
				selectDate = DateTimeUtil.getDateToString(new Date(), "yyyy");// 为空则默认当前时间年份
			}
			// 查询考核项目
			khxmlist = assessTemplateInstanceService.getBeanBreak(selectDate,
					organization, assessId, null, 0);
			// 查询考核类别
			list = assessTemplateInstanceService.getBeanBreak(selectDate,
					organization, assessId, 0, 1);
			List<AssessTemplateInstance> alist = new ArrayList<AssessTemplateInstance>();
			if (khxmlist != null && list != null) {
				for (int i = 0; i < khxmlist.size(); i++) {
					for (int j = 0; j < list.size(); j++) {
						if (khxmlist
								.get(i)
								.getMbid()
								.equals(list.get(j).getAssessTemplate().getId())) {
							alist.add(khxmlist.get(i));
							break;
						}
					}

				}

			}
			khxmlist = alist;
		}

		// 若考核项目和考核类别都不为空，对记录分组
		if (list != null && khxmlist != null) {
			List<Object[]> zn = assessTemplateInstanceService
					.findgroupByZn(assessId);
			List<Organization> znNames = null;
			if (null != zn) {
				znNames = new ArrayList<Organization>();
				for (int i = 0; i < zn.size(); i++) {
					Object[] obj = zn.get(i);
					String idg = (String) obj[1];
					Organization organization1 = organizationService
							.findOne(idg);
					for (int j = 0; j < khxmlist.size(); j++) {
						if (organization1.getId().equals(
								khxmlist.get(j).getZnbmId())) {
							znNames.add(organization1);
							break;
						}
					}
				}
			}
			model.addAttribute("znNames", znNames);
		}
		if (list != null) {
			Integer flag = list.get(0).getHold();
			model.addAttribute("flag", flag);
		}

		model.addAttribute("list", list);
		model.addAttribute("khxmlist", khxmlist);
		return "/kpxt/item/break";
	}

	/**
	 * 查询通过的历史考评
	 */
	@RequestMapping(value = "/item/via", method = RequestMethod.GET)
	public String findvia(Model model, HttpServletRequest request) {
		// 获取登录用户的组织结构
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		Organization organization = (Organization) session
				.getAttribute("userOrgan");
		List<AssessTemplateInstance> list = null;
		List<AssessTemplateInstance> khxmlist = null;
		String selectDate = request.getParameter("selectDate");
		String assessId = request.getParameter("assessId");
		List<AssessBaseEntity> assess = assessBaseEntityService
				.getBeanListByFlag(organization.getFlag());// 用固定的居委标识测试 以后改成动态的
		if (null != assess && assess.size() > 0) {
			model.addAttribute("assess", assess);// 六大考核类型
			if (null == assessId || "".equals(assessId))
				assessId = assess.get(0).getId();// 选项卡默认选择第一项
			model.addAttribute("assessId", assessId);
			// 根据考核大类（assessId）选取相应的表单 并且对考核条目进行分组显示

			if (null == selectDate || "".equals(selectDate)) {
				selectDate = DateTimeUtil.getDateToString(new Date(), "yyyy");// 为空则默认当前时间年份
			}
			model.addAttribute("selectDate", selectDate);
			// 查询考核项目
			khxmlist = assessTemplateInstanceService.getBeanListByZZ(
					selectDate, organization, assessId, 3, 0, null, null);

			list = assessTemplateInstanceService.getBeanListByZZ(selectDate,
					organization, assessId, 3, 1, null, null);
			List<AssessTemplateInstance> alist = new ArrayList<AssessTemplateInstance>();
			if (khxmlist != null && list != null) {
				for (int i = 0; i < khxmlist.size(); i++) {
					for (int j = 0; j < list.size(); j++) {
						if (khxmlist
								.get(i)
								.getMbid()
								.equals(list.get(j).getAssessTemplate().getId())) {
							alist.add(khxmlist.get(i));
							break;
						}
					}

				}

			}
			khxmlist = alist;
		}

		// 若考核项目和考核类别都不为空，对记录分组
		if (list != null && khxmlist != null) {
			List<Object[]> zn = assessTemplateInstanceService
					.findgroupByZn(assessId);
			List<Organization> znNames = null;
			if (null != zn) {
				znNames = new ArrayList<Organization>();
				for (int i = 0; i < zn.size(); i++) {
					Object[] obj = zn.get(i);
					String idg = (String) obj[1];
					Organization organization1 = organizationService
							.findOne(idg);
					znNames.add(organization1);
				}
			}
			model.addAttribute("znNames", znNames);
		}
		model.addAttribute("list", list);
		model.addAttribute("khxmlist", khxmlist);
		return "/kpxt/item/via";
	}

	/**
	 * 更新考核条目信息（）
	 * 
	 * @return
	 */
	@RequestMapping(value = "/item/edit", method = RequestMethod.POST)
	@ResponseBody
	public String edit(Model model, HttpServletRequest request) {
		String id = request.getParameter("id");
		String count = request.getParameter("count");
		String oldCount = request.getParameter("oldCount");
		String jzCount = request.getParameter("jzCount");
		String zznb_check = request.getParameter("zznb_check");
		String projectScore = request.getParameter("projectScore");
		AssessTemplateInstance assessTemplateInstance = assessTemplateInstanceService
				.findOne(id);
		if (assessTemplateInstance != null) {
			if (oldCount != null) {
				assessTemplateInstance.setOldCount(oldCount);
			}
			if (count != null) {
				assessTemplateInstance.setJzCount(count);
				assessTemplateInstance.setCount(count);
			}
			if (jzCount != null) {
				assessTemplateInstance.setJzCount(jzCount);
				if (StringUtil.isEmpty(assessTemplateInstance.getCount())) {
					assessTemplateInstance.setCount(jzCount);
				}
			}

			if (zznb_check != null) {
				assessTemplateInstance.setZznb_check(zznb_check);

			}
			if (projectScore != null) {
				assessTemplateInstance.setProjectScore(projectScore);
			}
		}
		assessTemplateInstanceService.update(assessTemplateInstance);

		return null;
	}

	// 区级相关部门复审意见
	@RequestMapping(value = "/item/edityj", method = RequestMethod.POST)
	@ResponseBody
	public String editYj(Model model, HttpServletRequest request) {

		String id = request.getParameter("id");
		String checkScore = request.getParameter("checkScore");
		AssessTemplateInstance assessTemplateInstance = assessTemplateInstanceService
				.findOne(id);
		if (assessTemplateInstance != null) {
			assessTemplateInstance.setCheckScore(checkScore);
			assessTemplateInstanceService.update(assessTemplateInstance);
		}
		return null;
	}

	/**
	 * 各个职能部门查询填写的考评
	 * 
	 * @throws ParseException
	 */
	@RequestMapping(value = "/item/findkp", method = RequestMethod.GET)
	public String findkp(Model model, String id, HttpServletRequest request) {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		Organization org = (Organization) session.getAttribute("userOrgan");
		String znbmid = null;
		Integer hold = 1;
		// 如果是区的只能部门，查询HOLD为2的记录
		if (org.getId().equals("d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1")) {
			hold = 2;
			znbmid = (String) session.getAttribute("znbm");
		}
		Organization organization = organizationService.findOne(id);
		List<AssessTemplateInstance> list = null;
		List<AssessTemplateInstance> khxmlist = null;
		String selectDate = request.getParameter("selectDate");
		String assessId = request.getParameter("assessId");
		List<AssessBaseEntity> assess = assessBaseEntityService
				.getBeanListByFlag(organization.getFlag());// 用固定的居委标识测试 以后改成动态的
		if (null != assess && assess.size() > 0) {
			model.addAttribute("assess", assess);// 六大考核类型
			if (null == assessId || "".equals(assessId))
				assessId = assess.get(0).getId();// 选项卡默认选择第一项
			model.addAttribute("assessId", assessId);
			selectDate = "2014";
			// 查询考核项目
			khxmlist = assessTemplateInstanceService.getBeanListByZZ(
					selectDate, organization, assessId, null, 0, null, znbmid);
			list = assessTemplateInstanceService.getBeanListByZZ(selectDate,
					organization, assessId, hold, 1, null, znbmid);
			List<AssessTemplateInstance> alist = new ArrayList<AssessTemplateInstance>();
			if (khxmlist != null && list != null) {
				for (int i = 0; i < khxmlist.size(); i++) {
					for (int j = 0; j < list.size(); j++) {
						if (khxmlist
								.get(i)
								.getMbid()
								.equals(list.get(j).getAssessTemplate().getId())) {
							alist.add(khxmlist.get(i));
							break;
						}
					}

				}
				khxmlist = alist;
			}
		}
		// 若考核项目和考核类别都不为空，对记录分组
		if (list != null && khxmlist != null) {
			List<Object[]> zn = assessTemplateInstanceService
					.findgroupByZn(assessId);
			List<Organization> znNames = null;
			if (null != zn) {
				znNames = new ArrayList<Organization>();
				for (int i = 0; i < zn.size(); i++) {
					Object[] obj = zn.get(i);
					String idg = (String) obj[1];
					Organization organization1 = organizationService
							.findOne(idg);
					for (int j = 0; j < khxmlist.size(); j++) {
						if (organization1.getId().equals(
								khxmlist.get(j).getZnbmId())) {
							// System.out.println(organization1.getName());
							znNames.add(organization1);
							break;
						}
					}

				}
			}
			// System.out.println("长度"+znNames.size());
			model.addAttribute("znNames", znNames);
		}
		if (list != null && khxmlist != null && khxmlist.size() > 0) {
			Integer flag = list.get(0).getHold();
			model.addAttribute("flag", flag);
			for (int i = 0; i < list.size(); i++) {
				List<Rule> rulelist = ruleService
						.getRulelistById(new AssessTemplate(list.get(i)
								.getMbid()));
				if (rulelist != null && rulelist.size() > 0) {
					Rule rule = rulelist.get(0);
					list.get(i).setDescription(rule.getContent());
				}
			}
		}

		model.addAttribute("list", list);
		// 把居委会或者村委会的ID保存进去
		model.addAttribute("orgid", id);
		model.addAttribute("selectDate", selectDate);
		model.addAttribute("jwh", organizationService.findOne(id));
		model.addAttribute("khxmlist", khxmlist);
		model.addAttribute("oid", org.getId());
		return "/kpxt/item/findkp";
	}

	@RequestMapping(value = "/item/submit", method = RequestMethod.POST)
	@ResponseBody
	public String submit(@RequestParam String ids, @RequestParam String khxm) {
		String[] arrIds = null;
		String[] khxmID = null;
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		Organization organization = (Organization) session
				.getAttribute("userOrgan");
		organization = organizationService.findOne(organization.getId());
		organization.setType(2);
		organizationService.update(organization);
		AssessTemplateInstance assessTemplateInstance = null;
		if (!"".equals(ids)) {
			arrIds = ids.split(",");
			for (String id : arrIds) {
				assessTemplateInstance = assessTemplateInstanceService
						.findOne(id.trim());
				assessTemplateInstance.setHold(1);
				assessTemplateInstanceService.update(assessTemplateInstance);
			}
		}
		if (!khxm.equals("")) {
			khxmID = khxm.split(",");
			for (String id : khxmID) {
				assessTemplateInstance = assessTemplateInstanceService
						.findOne(id.trim());
				assessTemplateInstance.setHold(1);
				assessTemplateInstanceService.update(assessTemplateInstance);
			}
		}
		return null;
	}

	// 街镇提交到区里面
	@SuppressWarnings("unused")
	@RequestMapping(value = "/item/submitQu", method = RequestMethod.POST)
	@ResponseBody
	public String submitQU(@RequestParam String ids, @RequestParam String khxm,
			@RequestParam String status, @RequestParam String orgid) {
		// status 1打分 2提交审核
		String[] arrIds = null;
		String[] khxmID = null;
		String selectDate = null;
		AssessTemplateInstance assessTemplateInstance = null;
		if (!"".equals(ids)) {
			arrIds = ids.split(",");
			for (String id : arrIds) {
				assessTemplateInstance = assessTemplateInstanceService
						.findOne(id.trim());
				if (status.equals("2")) {
					assessTemplateInstance.setHold(2);
				}
				// 分数
				double score = 0.0;
				// 街镇的数据
				double jzcount = 0;
				// 根据考核类别的类型计算单项扣分
				// 取出规则
				List<Rule> rule = ruleService
						.getRulelistById(new AssessTemplate(
								assessTemplateInstance.getMbid()));
				String gz = assessTemplateInstance.getKhgz();// 规则
				String name = assessTemplateInstance.getType();
				System.out.println("规则" + gz);
				// 取出考核限制
				double khxz = assessTemplateInstance.getKfxz();
				// 取出街镇
				double tb = 0;
				System.out.println(assessTemplateInstance.getJzCount());
				String value = assessTemplateInstance.getJzCount();
				if (value != null && !value.equals("")) {
					if (!value.trim().equals("是") && !value.trim().equals("否")) {
						jzcount = Double.parseDouble(value);
						// 计算同比
						if (assessTemplateInstance.getOldCount() != null) {
							tb = (jzcount - Double
									.parseDouble(assessTemplateInstance
											.getOldCount()))
									/ Double.parseDouble(assessTemplateInstance
											.getOldCount());
						}
					}
				}
				// 获取去年的数据
				if (gz.equals("个数")) {
					if (rule != null && rule.size() > 0) {
						score = rule.get(0).getScore();
						score = jzcount * score;
						if (khxz > 0) {
							if (score > khxz) {
								score = khxz;
							}
						}
					}
				} else if (gz.trim().equals("同比")) {
					// 计算同比
					Rule findrule = null;
					String code = null;
					AssessTemplate aTemplate = new AssessTemplate(
							assessTemplateInstance.getMbid());// 主键
					tb = tb * 100;
					// 如果是算同比平均升幅的，负数就是下降了。正数就是上升了
					if (tb > 0) {
						// 同比上升了
						if (tb > assessTemplateInstance.getVag()) {
							code = "上升高于平均值";
							findrule = ruleService.getRulelistByCode(aTemplate,
									code);
							score = findrule.getScore();
						} else if (tb <= assessTemplateInstance.getVag()) {
							code = "上升低于平均值";
							findrule = ruleService.getRulelistByCode(aTemplate,
									code);
							score = findrule.getScore();
						}
					}
				} else if (gz.equals("同比下降率")) {
					// 计算同比下降率
					// 如果下降率低于全区水平
					if (tb < assessTemplateInstance.getVag()) {
						tb = tb * 100;
						double d = assessTemplateInstance.getVag() + tb;
						score = (d * 0.1);
					} else {
						score = 4;
					}
					if (score < 0) {
						score = 0;
					}
					if (assessTemplateInstance.getType().equals("现有无证无照经营总户数")
							|| assessTemplateInstance.getType().equals(
									"现有无证无照经营总户数（户）")) {

						if (jzcount == 0) {
							score = 0;
						}
						double oldCount = 0;
						if (assessTemplateInstance.getOldCount() == null
								|| assessTemplateInstance.getOldCount().equals(
										"")) {
							if (jzcount == oldCount && jzcount != 0
									&& oldCount != 0) {
								score = 4;
							}
						} else {
							if (jzcount == Double
									.parseDouble(assessTemplateInstance
											.getOldCount())
									&& jzcount != 0
									&& Double
											.parseDouble(assessTemplateInstance
													.getOldCount()) != 0) {
								score = 4;
							}
						}
					}

				} else if (gz.equals("蔬菜同比减少")) {
					if (rule != null) {
						tb = tb * 100;
						if (tb < 0) {
							tb = Math.abs(tb);
							if (tb < 10) {
								score = 5;
							} else if (tb < 20) {
								score = 2;
							}
						}
					}
				} else if (gz.equals("经济林同比减少")) {
					if (rule != null) {
						tb = tb * 100;
						if (tb < 0) {
							tb = Math.abs(tb);
							if (tb < 10) {
								score = 1;
							} else if (tb < 20) {
								score = 0.5;
							}
						}
					}

				} else if (gz.equals("同比每减少")) {
					if (rule != null) {
						if (tb > 0) {
							score = tb * rule.get(0).getScore();
							// 把负数分数转成正数
							BigInteger b = new BigInteger(score + "");
							b = b.abs();
							score = b.intValue();
							// 如果扣除的分数大于考核限制，就默认为最大扣分限制
							if (khxz > 0) {
								if (score > khxz) {
									score = khxz;
								}
							}
						}
					}
				} else if (gz.equals("超支")) {
					// 计算超支的分数
					for (int i = 0; i < rule.size(); i++) {
						if (jzcount >= rule.get(i).getAverage()) {
							score = rule.get(i).getScore();
						} else {
							score = 5;
						}
						if (jzcount == 0) {
							score = 0;
						}
					}
				} else if (gz.equals("是扣分")) {
					if (value.trim().equals("是")) {
						score = rule.get(0).getScore();
					}
				} else if (gz.equals("否扣分")) {
					if (value.trim().equals("否")) {
						score = rule.get(0).getScore();
					}

				} else if (gz.equals("同比增加")) {
					if (tb > 0) {
						score = tb * rule.get(0).getScore();
					}
				} else if (gz.equals("同比小于")) {
					for (int i = 0; i < rule.size(); i++) {
						if (tb > rule.get(i).getAverage()) {
							score = rule.get(i).getScore();
						}
					}
				} else if (gz.equals("下降率")) {
					if (tb < 0) {
						// 同比下降了
						tb = tb * 100;
						double d = assessTemplateInstance.getVag() + tb;
						assessTemplateInstance.setTypeKF("-" + (d * 0.1));
					} else {
						score = 4;
					}
				} else if (gz.equals("百分比大于")) {
					if (jzcount > 0) {
						for (int i = 0; i < rule.size(); i++) {
							if (jzcount > rule.get(i).getAverage()) {
								score = rule.get(i).getScore();
							}

						}
					}
				} else if (gz.equals("同比上升")) {
					// 上升了
					if (tb > 0) {
						score = 5;
					} else if (tb == 0) {
						score = 2;
					}
				} else if (gz.equals("准确率")) {
					// 准确率相比定义好的准确率，没减少百分之一扣多少

					double zql = rule.get(0).getAverage();
					// 如果填写的准确率大于规则的准确率，不扣分
					if (jzcount < zql) {
						score = rule.get(0).getScore();
						Double z = zql - jzcount;
						// z大于0说明是正数，也就说说准确率低于规则定义的
						if (z > 0) {
							score = z * score;
						}
						if (khxz > 0) {
							if (score > khxz) {
								score = khxz;
							}
						}
					}
				} else if (gz.equals("少于N次")) {
					// double c=(int) (rule.get(0).getAverage()-jzcount);
					// 大于0就说明少于多少次

					score = jzcount * rule.get(0).getScore();

					if (khxz > 0) {
						if (score > khxz) {
							score = khxz;
						}
					}
				} else if (gz.equals("百分比小于")) {
					for (int i = 0; i < rule.size(); i++) {
						if (jzcount < rule.get(i).getAverage()) {
							score = rule.get(i).getScore();
						}
					}
				} else if (gz.equals("未按规定拆除")) {
					if (Double
							.parseDouble(assessTemplateInstance.getOldCount()) != 0) {
						tb = jzcount
								/ Double.parseDouble(assessTemplateInstance
										.getOldCount());
					} else {
						tb = 0.0;
					}
					tb = 100 * tb;
					score = tb * rule.get(0).getScore();
					if (khxz > 0) {
						if (score > khxz) {
							score = khxz;
						}
					}

				} else if (gz.equals("整治")) {
					if (jzcount >= Double.parseDouble(assessTemplateInstance
							.getOldCount())) {
						score = rule.get(0).getScore();
					}
					if (jzcount == 0) {
						score = 0;
					}
				} else if (gz.equals("绝对值")) {
					Rule findrule = null;
					String code = null;
					AssessTemplate aTemplate = new AssessTemplate(
							assessTemplateInstance.getMbid());// 主键
					if (jzcount > Double.parseDouble(assessTemplateInstance
							.getOldCount())) {
						code = "上升高于平均值";
						findrule = ruleService.getRulelistByCode(aTemplate,
								code);
						score = findrule.getScore();
					} else if (jzcount == 0) {
						score = 0;
					} else if (jzcount == Double
							.parseDouble(assessTemplateInstance.getOldCount())) {
						code = "持平平均值 ";
						findrule = ruleService.getRulelistByCode(aTemplate,
								code);
						score = findrule.getScore();
					}
				} else if (gz.equals("无证土地")) {
					if (jzcount > 0) {
						score = 5;
						double mj = (float) (jzcount / 1000);
						mj = Math.floor(mj);
						score += mj * 2;
						if (khxz > 0) {
							if (score > khxz) {
								score = khxz;
							}
						}
					}
				} else if (gz.equals("支配")) {
					if (Double
							.parseDouble(assessTemplateInstance.getOldCount()) > 0) {
						tb = jzcount
								/ Double.parseDouble(assessTemplateInstance
										.getOldCount());
						tb = tb * 100;
						if (tb < 104 && tb > 102) {
							score = 1;
						} else if (tb < 102 && tb >= 100) {
							score = 2;
						} else if (tb <= 99) {
							double j = 100 - tb;
							score = 2;
							score += j;
						}
						if (score > 10) {
							score = 10;
						}
					}
					score = 0.0;

				} else if (gz.equals("比率")) {
					if (jzcount < rule.get(0).getAverage()) {
						score = rule.get(0).getScore();
					}
				}
				if (score > 0) {
					DecimalFormat df = new DecimalFormat("######0.00");
					System.out.println(df.format(score));
					assessTemplateInstance.setTypeKF("-" + df.format(score));
				} else {
					assessTemplateInstance.setTypeKF("" + score);
				}

				assessTemplateInstanceService.update(assessTemplateInstance);
			}
		}
		selectDate = "2014";
		if (!khxm.equals("")) {
			khxmID = khxm.split(",");
			Double project = 0.0;
			for (String id : khxmID) {
				assessTemplateInstance = assessTemplateInstanceService
						.findOne(id.trim());
				if (status.equals("2")) {
					assessTemplateInstance.setHold(2);
				}

				List<AssessTemplateInstance> khlblist = assessTemplateInstanceService
						.getKhlbScore(assessTemplateInstance.getMbid(), orgid,
								selectDate);
				project = Double.parseDouble(assessTemplateInstance
						.getAllScore());
				for (int i = 0; i < khlblist.size(); i++) {
					project = project
							+ Double.parseDouble(khlblist.get(i).getTypeKF());
				}
				if (project < 0) {
					project = 0.0;
				}
				assessTemplateInstance.setProjectScore(project + "");
				assessTemplateInstanceService.update(assessTemplateInstance);
			}
		}

		return null;
	}

	/**
	 * 驳回
	 */
	@RequestMapping(value = "/item/breakcj", method = RequestMethod.POST)
	@ResponseBody
	public String Breakcj(@RequestParam String khlb, @RequestParam String khxm,
			@RequestParam int status) {
		String[] arrIds = null;
		String[] khxmID = null;
		AssessTemplateInstance assessTemplateInstance = null;
		if (!"".equals(khlb)) {
			arrIds = khlb.split(",");
			for (String id : arrIds) {
				assessTemplateInstance = assessTemplateInstanceService
						.findOne(id.trim());
				assessTemplateInstance.setHold(status);
				assessTemplateInstance.setBreakCount(assessTemplateInstance
						.getBreakCount() + 1);
				assessTemplateInstanceService.update(assessTemplateInstance);

			}
		}
		if (!khxm.equals("")) {
			khxmID = khxm.split(",");
			for (String id : khxmID) {
				assessTemplateInstance = assessTemplateInstanceService
						.findOne(id.trim());
				assessTemplateInstance.setBreakCount(assessTemplateInstance
						.getBreakCount() + 1);
				// assessTemplateInstance.setHold(status);
				assessTemplateInstanceService.update(assessTemplateInstance);
			}
		}
		return null;
	}

	@Autowired
	private ScoreService scoreService;

	// 区级确认之后保存考评
	@RequestMapping(value = "/item/bckp", method = RequestMethod.POST)
	@ResponseBody
	public String bckp(@RequestParam String khlb, @RequestParam String khxm,
			@RequestParam String orgid, @RequestParam String assessId) {
		String[] arrIds = null;
		String[] khxmID = null;
		// System.out.println("111");
		Organization g = organizationService.findOne(orgid);
		g.setType(3);
		organizationService.update(g);
		AssessTemplateInstance assessTemplateInstance = null;
		if (!"".equals(khlb)) {
			arrIds = khlb.split(",");
			for (String id : arrIds) {
				assessTemplateInstance = assessTemplateInstanceService
						.findOne(id.trim());
				assessTemplateInstance.setHold(3);
				assessTemplateInstanceService.update(assessTemplateInstance);
			}
		}
		double f = 0.0;
		if (!khxm.equals("")) {
			khxmID = khxm.split(",");
			for (String id : khxmID) {
				assessTemplateInstance = assessTemplateInstanceService
						.findOne(id.trim());
				f += Double.parseDouble(assessTemplateInstance
						.getProjectScore());
				assessTemplateInstance.setHold(3);
				assessTemplateInstanceService.update(assessTemplateInstance);
			}
		}
		String Date = DateTimeUtil
				.getDateToString(new java.util.Date(), "yyyy");// 为空则默认当前时间年份
		Score score = scoreService.getScorelistById(new AssessBaseEntity(
				assessId), g, Date);
		// 如果分数为空就新增
		if (score == null) {
			score = new Score();
			score.setAssessBaseEntity(new AssessBaseEntity(assessId));
			score.setDate(Date);
			score.setOrganization(g);
			score.setScore(f);
			scoreService.insert(score);
		} else {
			score.setScore(score.getScore() + f);
			scoreService.update(score);
		}
		return null;
	}

	// 街镇和区查询历史记录
	@RequestMapping(value = "/item/findjl", method = RequestMethod.GET)
	public String via(Model model, HttpServletRequest request) {
		List<AssessTemplateInstance> list = null;
		List<AssessTemplateInstance> khxmlist = null;
		String selectDate = request.getParameter("selectDate");
		// System.out.println(selectDate);
		String assessId = request.getParameter("assessId");
		String orgid = request.getParameter("orgid");
		Organization org = organizationService.findOne(orgid);
		List<AssessBaseEntity> assess = assessBaseEntityService
				.getBeanListByFlag(org.getFlag());// 用固定的居委标识测试 以后改成动态的
		if (null != assess && assess.size() > 0) {
			model.addAttribute("assess", assess);// 六大考核类型
			if (null == assessId || "".equals(assessId))
				assessId = assess.get(0).getId();// 选项卡默认选择第一项
			model.addAttribute("assessId", assessId);
			// 根据考核大类（assessId）选取相应的表单 并且对考核条目进行分组显示
			if (null == selectDate || "".equals(selectDate)) {
				selectDate = DateTimeUtil.getDateToString(new Date(), "yyyy");// 为空则默认当前时间年份
			}
			model.addAttribute("selectDate", selectDate);
			// 查询考核项目
			selectDate = "2014";
			// 查询考核项目
			khxmlist = assessTemplateInstanceService.getListByLb(selectDate,
					org, assessId, 0);
			list = assessTemplateInstanceService.getListByLb(selectDate, org,
					assessId, 1);
			List<AssessTemplateInstance> alist = new ArrayList<AssessTemplateInstance>();
			if (khxmlist != null && list != null) {
				for (int i = 0; i < khxmlist.size(); i++) {
					for (int j = 0; j < list.size(); j++) {
						if (khxmlist
								.get(i)
								.getMbid()
								.equals(list.get(j).getAssessTemplate().getId())) {
							alist.add(khxmlist.get(i));
							break;
						}
					}

				}

			}
			khxmlist = alist;
		}

		// 若考核项目和考核类别都不为空，对记录分组
		if (list != null && khxmlist != null) {
			List<Object[]> zn = assessTemplateInstanceService
					.findgroupByZn(assessId);
			List<Organization> znNames = null;
			if (null != zn) {
				znNames = new ArrayList<Organization>();
				for (int i = 0; i < zn.size(); i++) {
					Object[] obj = zn.get(i);
					String idg = (String) obj[1];
					Organization organization = organizationService
							.findOne(idg);
					znNames.add(organization);
				}
			}
			for (int i = 0; i < list.size(); i++) {
				List<Rule> rulelist = ruleService
						.getRulelistById(new AssessTemplate(list.get(i)
								.getMbid()));
				if (rulelist != null && rulelist.size() > 0) {
					Rule rule = rulelist.get(0);
					list.get(i).setDescription(rule.getContent());
				}
			}
			model.addAttribute("znNames", znNames);
		}
		model.addAttribute("orgid", org.getId());
		model.addAttribute("list", list);
		model.addAttribute("khxmlist", khxmlist);
		return "/kpxt/item/jl";
	}

	// 获取考核规则
	@RequestMapping(value = "/item/findgz", method = RequestMethod.POST)
	@ResponseBody
	public String findgz(@RequestParam String id) {
		List<Rule> list = ruleService.getRulelistById(new AssessTemplate(id));
		if (list == null || list.isEmpty()) {
			return null;
		}
		Rule rule = ruleService.getRulelistById(new AssessTemplate(id)).get(0);
		if (rule != null) {
			return rule.getContent();
		}
		return null;
	}

	// 社建办和农委查看
	@RequestMapping(value = "/item/sjb", method = RequestMethod.GET)
	public String sjb(Model model, String id, HttpServletRequest request) {
		Organization organization = organizationService.findOne(id);
		List<AssessTemplateInstance> list = null;
		List<AssessTemplateInstance> khxmlist = null;
		String selectDate = request.getParameter("selectDate");
		String assessId = request.getParameter("assessId");
		List<AssessBaseEntity> assess = assessBaseEntityService
				.getBeanListByFlag(organization.getFlag());// 用固定的居委标识测试 以后改成动态的
		if (null != assess && assess.size() > 0) {
			model.addAttribute("assess", assess);// 六大考核类型
			if (null == assessId || "".equals(assessId))
				assessId = assess.get(0).getId();// 选项卡默认选择第一项
			model.addAttribute("assessId", assessId);
			if (null == selectDate || "".equals(selectDate)) {
				selectDate = DateTimeUtil.getDateToString(new Date(), "yyyy");// 为空则默认当前时间年份
			}
			// 查询考核项目
			selectDate = "2014";
			khxmlist = assessTemplateInstanceService.getListByLb(selectDate,
					organization, assessId, 0);
			list = assessTemplateInstanceService.getListByLb(selectDate,
					organization, assessId, 1);
			List<AssessTemplateInstance> alist = new ArrayList<AssessTemplateInstance>();
			if (khxmlist != null && list != null) {
				for (int i = 0; i < khxmlist.size(); i++) {
					for (int j = 0; j < list.size(); j++) {
						if (khxmlist
								.get(i)
								.getMbid()
								.equals(list.get(j).getAssessTemplate().getId())) {
							alist.add(khxmlist.get(i));
							break;
						}
					}

				}
				khxmlist = alist;
			}
		}
		// 若考核项目和考核类别都不为空，对记录分组
		if (list != null && khxmlist != null) {
			List<Object[]> zn = assessTemplateInstanceService
					.findgroupByZn(assessId);
			List<Organization> znNames = null;
			if (null != zn) {
				znNames = new ArrayList<Organization>();
				for (int i = 0; i < zn.size(); i++) {
					Object[] obj = zn.get(i);
					String idg = (String) obj[1];
					Organization organization1 = organizationService
							.findOne(idg);
					for (int j = 0; j < khxmlist.size(); j++) {
						if (organization1.getId().equals(
								khxmlist.get(j).getZnbmId())) {
							// System.out.println(organization1.getName());
							znNames.add(organization1);
							break;
						}
					}

				}
			}
			// System.out.println("长度"+znNames.size());
			model.addAttribute("znNames", znNames);
		}
		if (list != null && khxmlist != null && khxmlist.size() > 0) {
			Integer flag = list.get(0).getHold();
			model.addAttribute("flag", flag);
		}
		model.addAttribute("list", list);
		// 把居委会或者村委会的ID保存进去
		model.addAttribute("orgid", id);
		model.addAttribute("selectDate", selectDate);
		model.addAttribute("jwh", organizationService.findOne(id));
		model.addAttribute("khxmlist", khxmlist);
		return "/kpxt/item/sjb";
	}

	/**
	 * 导出表格
	 */
	@RequestMapping(value = "/item/export", method = RequestMethod.GET)
	public void export(Model model, HttpSession session,
			HttpServletResponse response, HttpServletRequest request) {
		String mark = request.getParameter("mark");
		List<Huizong> list = null;
		if (mark.equals("1")) {
			list = scoreService.getScore();
		} else {
			list = scoreService.getScoreByCun();
		}
		Map<String, Object> dataMap = new HashMap<String, Object>();
		for (int i = 1, j = list.size(); i <= j; i++) {
			list.get(i - 1).setId(i + "");
		}
		dataMap.put("pjhz", list);
		dataMap.put("count", list.size() + 2);
		dataMap.put("mark", mark);
		String fileName = "2014";
		fileName = handlerEncoding(request, fileName);
		if (fileName.contains("(")) {

			try {
				fileName = URLEncoder.encode(
						fileName.substring(0, fileName.indexOf("(")), "UTF-8")
						+ fileName.substring(fileName.indexOf("("));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		new ExportDocUtil("pjhz.ftl").setDataList(dataMap).exportDocumentEX(
				response, fileName);
	}

	protected String handlerEncoding(HttpServletRequest request, String fileName) {
		String userAgent = request.getHeader("USER-AGENT");
		try {
			if (StringUtils.contains(userAgent, "MSIE")) {// IE浏览器
				fileName = URLEncoder.encode(fileName, "UTF-8");
			} else if (StringUtils.contains(userAgent, "Mozilla")) {// google,火狐浏览器
				fileName = new String(fileName.getBytes(), "ISO-8859-1");
			} else {
				fileName = URLEncoder.encode(fileName, "UTF8");// 其他浏览器
			}
		} catch (UnsupportedEncodingException e) {
		}
		return fileName;
	}
}
