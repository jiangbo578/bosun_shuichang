/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.assess;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.entity.assess.AssessBaseEntity;
import com.gouhai.baoshan.entity.assess.AssessRemind;
import com.gouhai.baoshan.entity.assess.AssessTemplate;
import com.gouhai.baoshan.entity.assess.Rule;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.service.assess.AssessBaseEntityService;
import com.gouhai.baoshan.service.assess.AssessTemplateService;
import com.gouhai.baoshan.service.assess.RuleService;
import com.gouhai.baoshan.service.user.OrganizationService;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author sun 2014-09-04
 * 
 */
@Controller
@RequestMapping(value = "/assess")
public class AssessBaseEntityController extends PageableController {

	@Autowired
	private AssessBaseEntityService assessBaseEntityService;

	@Autowired
	private AssessTemplateService assessTemplateService;

	@Autowired
	private OrganizationService organizationService;
	@Autowired
	private RuleService ruleService;
	private final static String modelName = "assess";

	@RequestMapping(value = "/list/", method = RequestMethod.GET)
	public String toIndex() {
		if (!SecurityUtils.getSubject().isPermitted(modelName + ":list")) {
			return "/error/unauthority";
		}

		return "redirect:/assess/list/1";
	}

	@RequestMapping(value = "/list/{current}", method = RequestMethod.GET)
	public String index(HttpServletRequest request, Model model,
			@PathVariable() int current) {
		if (!SecurityUtils.getSubject().isPermitted(modelName + ":list")) {
			return "/error/unauthority";
		}
		model.addAllAttributes(pageResult(
				assessBaseEntityService.getBeanList(current),
				assessBaseEntityService.getBeanCount(), current));
		return "/user/assess/index";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String toAdd() {
		if (!SecurityUtils.getSubject().isPermitted(modelName + ":add")) {
			return "/error/unauthority";
		}
		return "/user/assess/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(AssessBaseEntity assessBaseEntity) {
		if (!SecurityUtils.getSubject().isPermitted(modelName + ":add")) {
			return "/error/unauthority";
		}
		if (assessBaseEntity.getIdentity() == 1) {
			assessBaseEntity.setIdentityName("居委");
		} else {
			assessBaseEntity.setIdentityName("村委");
		}

		assessBaseEntityService.insert(assessBaseEntity);
		return "redirect:/assess/list/1";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted(modelName + ":delete")) {
			return "/error/unauthority";
		}
		assessBaseEntityService.delete(id);
		return "redirect:/assess/list/1";
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted(modelName + ":update")) {
			return "/error/unauthority";
		}
		model.addAttribute("assess", assessBaseEntityService.findOne(id));
		return "/user/assess/update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(AssessBaseEntity assessBaseEntity) {
		if (!SecurityUtils.getSubject().isPermitted(modelName + ":update")) {
			return "/error/unauthority";
		}
		AssessBaseEntity findAssessBaseEntity = assessBaseEntityService
				.findOne(assessBaseEntity.getId());
		if (findAssessBaseEntity != null) {
			if (assessBaseEntity.getIdentity() == 1) {
				assessBaseEntity.setIdentityName("居委");
			} else {
				assessBaseEntity.setIdentityName("村委");
			}
			assessBaseEntity
					.setInsertDate(findAssessBaseEntity.getInsertDate());
			//System.out.println(assessBaseEntity.getDes());
			assessBaseEntity.setDes(assessBaseEntity.getDes());
			assessBaseEntity.setUpdateDate(new Date());
			assessBaseEntityService.update(assessBaseEntity);
		}
		return "redirect:/assess/list/1";
	}

	/**
	 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~考核项目~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	 * ~~~
	 */
	@RequestMapping(value = "/child/add/{assessId}", method = RequestMethod.GET)
	public String toChildAdd(Model model, @PathVariable String assessId) {
		if (!SecurityUtils.getSubject().isPermitted(modelName + ":add")) {
			return "/error/unauthority";
		}

		List<Organization> organizations = organizationService
				.getOrganizationListOfQu();
		model.addAttribute("organizations", organizations);
		AssessBaseEntity assess = assessBaseEntityService.findOne(assessId);
		model.addAttribute("assess", assess);
		return "/user/assess/child/add";
	}

	// 添加考核项目
	@RequestMapping(value = "/child/edit/{assessId}", method = RequestMethod.POST)
	public String toChildEdit(@PathVariable String assessId,
			AssessTemplate assessTemplate) {
		if (!SecurityUtils.getSubject().isPermitted(modelName + ":add")) {
			return "/error/unauthority";
		}
		AssessBaseEntity assessBaseEntity = assessBaseEntityService
				.findOne(assessId);
		assessTemplate.setAssessBaseEntity(assessBaseEntity);// 设置考核大类

		Organization o = organizationService
				.findOne(assessTemplate.getZnbmId());
		assessTemplate.setZn(o);// 设置职能部门
		// 设置二级级别,0代表考核项目
		assessTemplate.setLevel(0);

		assessTemplate.setProcessStatus(0);// 设置流程状态，开始为村居

		assessTemplateService.insert(assessTemplate);
		return "redirect:/assess/child/list/" + assessId + "/1";
	}

	// 更新考核项目
	@RequestMapping(value = "/child/update/{assessId}/{tempId}", method = RequestMethod.GET)
	public String toChildUpdate(Model model, @PathVariable String assessId,
			@PathVariable String tempId) {
		if (!SecurityUtils.getSubject().isPermitted(modelName + ":update")) {
			return "/error/unauthority";
		}
		List<Organization> organizations = organizationService
				.getOrganizationListOfQu();
		model.addAttribute("organizations", organizations);

		AssessBaseEntity assess = assessBaseEntityService.findOne(assessId);
		model.addAttribute("assess", assess);
		AssessTemplate assessTemplate = assessTemplateService.findOne(tempId);
		model.addAttribute("temp", assessTemplate);
		return "/user/assess/child/update";
	}

	// 更新考核条目
	@RequestMapping(value = "/child/update2/{assessId}", method = RequestMethod.POST)
	public String toChildUpdate2(Model model, @PathVariable String assessId,
			AssessTemplate assessTemplate) {
		if (!SecurityUtils.getSubject().isPermitted(modelName + ":update")) {
			return "/error/unauthority";
		}

		AssessTemplate findAssessTemplate = assessTemplateService
				.findOne(assessTemplate.getId());
		findAssessTemplate.setProject(assessTemplate.getProject());
		findAssessTemplate.setDescription(assessTemplate.getDescription());
		findAssessTemplate.setUpdateDate(new Date());
		findAssessTemplate.setAllScore(assessTemplate.getAllScore());
		findAssessTemplate.setZnbmId(assessTemplate.getZnbmId());
		findAssessTemplate.setZn(organizationService.findOne(assessTemplate
				.getZnbmId()));// 设置职能部门
		findAssessTemplate.setDes(assessTemplate.getDes());
		assessTemplateService.update(findAssessTemplate);
		return "redirect:/assess/child/list/" + assessId + "/1";
	}

	@RequestMapping(value = "/child/list/{assessId}/{current}", method = RequestMethod.GET)
	public String toChildList(HttpServletRequest request, Model model,
			@PathVariable String assessId, @PathVariable int current) {
		if (!SecurityUtils.getSubject().isPermitted(modelName + ":list")) {
			return "/error/unauthority";
		}

		AssessBaseEntity assess = assessBaseEntityService.findOne(assessId);
		model.addAttribute("assess", assess);
		model.addAllAttributes(pageResult(
				assessTemplateService.getBeanList(current, assess, 0),
				assessTemplateService.getBeanCount(assess, 0), current));
		return "/user/assess/child/index";
	}

	// 删除
	@RequestMapping(value = "/child/delete/{assessId}/{tempId}", method = RequestMethod.GET)
	public String deleteChild(@PathVariable String tempId,
			@PathVariable String assessId) {
		if (!SecurityUtils.getSubject().isPermitted(modelName + ":delete")) {
			return "/error/unauthority";
		}
		assessTemplateService.delete(tempId);
		return "redirect:/assess/child/list/" + assessId + "/1";
	}

	/**
	 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~考核类别~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	 */
	@RequestMapping(value = "/child/item/add/{assessId}/{tempId}", method = RequestMethod.GET)
	public String toChildItemAdd(Model model, @PathVariable String assessId,
			@PathVariable String tempId) {
		if (!SecurityUtils.getSubject().isPermitted(modelName + ":add")) {
			return "/error/unauthority";
		}

		AssessBaseEntity assess = assessBaseEntityService.findOne(assessId);
		model.addAttribute("assess", assess);

		AssessTemplate assessTemplate = assessTemplateService.findOne(tempId);
		model.addAttribute("template", assessTemplate);

		return "/user/assess/child/item/add";
	}

	// 添加考核类别
	@RequestMapping(value = "/child/item/edit/{assessId}/{tempId}", method = RequestMethod.POST)
	public String toChildItemEdit(@PathVariable String assessId,
			@PathVariable String tempId, AssessTemplate assessTemplate) {
		if (!SecurityUtils.getSubject().isPermitted(modelName + ":add")) {
			return "/error/unauthority";
		}
		AssessBaseEntity assessBaseEntity = assessBaseEntityService
				.findOne(assessId);
		assessTemplate.setAssessBaseEntity(assessBaseEntity);// 设置考核大类

		AssessTemplate template = assessTemplateService.findOne(tempId);
		// 设置三级级别,0代表考核项目
		assessTemplate.setLevel(1);
		assessTemplate.setProcessStatus(0);// 设置流程状态，开始为村居
		assessTemplate.setCode(generID());// 随机生成编码
		// 设置parent
		assessTemplate.setAssessTemplate(template);

		assessTemplateService.insert(assessTemplate);
		return "redirect:/assess/child/item/list/" + assessId + "/" + tempId
				+ "/1";
	}

	// 更新考核类别
	@RequestMapping(value = "/child/item/update/{assessId}/{proId}/{tempId}", method = RequestMethod.GET)
	public String toChildItemUpdate(Model model, @PathVariable String assessId,
			@PathVariable String proId, @PathVariable String tempId) {
		if (!SecurityUtils.getSubject().isPermitted(modelName + ":update")) {
			return "/error/unauthority";
		}

		AssessBaseEntity assess = assessBaseEntityService.findOne(assessId);
		model.addAttribute("assess", assess);
		AssessTemplate assessTemplate = assessTemplateService.findOne(tempId);
		model.addAttribute("template", assessTemplate);
		return "/user/assess/child/item/update";
	}

	// 更新考核条目
	@RequestMapping(value = "/child/item/update2/{assessId}/{dlId}", method = RequestMethod.POST)
	public String toChildItemUpdate2(Model model,
			@PathVariable String assessId, @PathVariable String dlId,
			AssessTemplate assessTemplate) {
		if (!SecurityUtils.getSubject().isPermitted(modelName + ":update")) {
			return "/error/unauthority";
		}

		AssessTemplate findAssessTemplate = assessTemplateService
				.findOne(assessTemplate.getId());

		findAssessTemplate.setType(assessTemplate.getType());
		findAssessTemplate.setDescription(assessTemplate.getDescription());
		findAssessTemplate.setUpdateDate(new Date());
		findAssessTemplate.setVag(assessTemplate.getVag());
		findAssessTemplate.setKhgz(assessTemplate.getKhgz());
		findAssessTemplate.setKfxz(assessTemplate.getKfxz());
		findAssessTemplate.setSfxy(assessTemplate.getSfxy());
		assessTemplateService.update(findAssessTemplate);
		return "redirect:/assess/child/item/list/" + assessId + "/" + dlId
				+ "/1";
	}

	/**
	 * 类别列表
	 * 
	 * @param request
	 * @param model
	 * @param assessId
	 * @param current
	 * @return
	 */
	@RequestMapping(value = "/child/item/list/{assessId}/{tempId}/{current}", method = RequestMethod.GET)
	public String toChildItemList(HttpServletRequest request, Model model,
			@PathVariable String tempId, @PathVariable String assessId,
			@PathVariable int current) {
		if (!SecurityUtils.getSubject().isPermitted(modelName + ":list")) {
			return "/error/unauthority";
		}

		AssessBaseEntity assess = assessBaseEntityService.findOne(assessId);
		model.addAttribute("assess", assess);
		// 二级
		AssessTemplate assessTemplate = assessTemplateService.findOne(tempId);
		model.addAttribute("template", assessTemplate);
		// 三级列表
		model.addAllAttributes(pageResult(assessTemplateService
				.getBeanListByTemplate(current, assessTemplate),
				assessTemplateService.getBeanCountByTemplate(assessTemplate),
				current));
		return "/user/assess/child/item/index";
	}

	// 删除
	@RequestMapping(value = "/child/item/delete/{assessId}/{dlId}/{tempId}", method = RequestMethod.GET)
	public String deleteChildItem(@PathVariable String tempId,
			@PathVariable String assessId, @PathVariable String dlId) {
		if (!SecurityUtils.getSubject().isPermitted(modelName + ":delete")) {
			return "/error/unauthority";
		}
		assessTemplateService.delete(tempId);
		return "redirect:/assess/child/item/list/" + assessId + "/" + dlId
				+ "/1";
	}

	// 获取考核规则
	@RequestMapping(value = "/rule/list/{current}/{tempId}", method = RequestMethod.GET)
	public String toRuleList(Model model, @PathVariable String tempId,
			@PathVariable int current) {
		AssessTemplate aTemplate = new AssessTemplate(tempId);
		model.addAllAttributes(pageResult(
				ruleService.getObjList(current, aTemplate),
				ruleService.getObjCount(aTemplate), current));
		return "/user/assess/rule/index";
	}

	// 增加考核规则
	// 增加
	@RequestMapping(value = "/rule/add/{tempId}", method = RequestMethod.GET)
	public String toRuleAdd(@PathVariable() String tempId) {
		return "/user/assess/rule/add";
	}

	@RequestMapping(value = "/rule/add", method = RequestMethod.POST)
	public String addRule(Rule rule, String tempId) {
		AssessTemplate aTemplate = new AssessTemplate(tempId);
		rule.setAssessTemplate(aTemplate);
		ruleService.insert(rule);
		return "redirect:/assess/rule/list/1/" + tempId;
	}

	// 删除考核规则
	@RequestMapping(value = "/rule/delete/{id}/{tempId}", method = RequestMethod.GET)
	public String deleteRule(@PathVariable String id,
			@PathVariable String tempId) {
		ruleService.delete(id);
		return "redirect:/assess/rule/list/1/" + tempId;
	}

	// 更新考核规则
	@RequestMapping(value = "/rule/update/{id}/{tempId}", method = RequestMethod.GET)
	public String toUpdateRule(Model model, @PathVariable String id,
			@PathVariable String tempId) {
		Rule rule = ruleService.findOne(id);
		model.addAttribute("rule", rule);
		return "/user/assess/rule/update";
	}

	@RequestMapping(value = "/rule/update", method = RequestMethod.POST)
	public String updateRule(Rule rule, String tempId) {
		Rule findrule = ruleService.findOne(rule.getId());
		findrule.setContent(rule.getContent());
		findrule.setScore(rule.getScore());
		findrule.setRemark(rule.getRemark());
		findrule.setAverage(rule.getAverage());
		ruleService.update(findrule);
		return "redirect:/assess/rule/list/1/" + tempId;
	}

	/** 生成UUID */
	public static String generID() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	// 增加考评提醒日

	@RequestMapping(value = "/remind/add", method = RequestMethod.GET)
	public String toAddremind() {
	
		return "/kpxt/remind/add";
	}
	@RequestMapping(value = "/remind/add", method = RequestMethod.POST)
	public String addremind(AssessRemind assessRemind) {
		assessRemind.setAssessTemplateInstance("600分考评");
		assessTemplateService.insertAssessRemind(assessRemind);
		return "redirect:/assess/remind/list";
	}

	// 查询考评提醒日
	@RequestMapping(value = "/remind/list", method = RequestMethod.GET)
	public String remindindex(HttpServletRequest request, Model model) {
		model.addAttribute("remind",assessTemplateService.findAssessRemind());
		return "/kpxt/remind/index";
	}
	// 删除考评提醒日
	@RequestMapping(value = "/remind/delete/{id}", method = RequestMethod.GET)
	public String deleteremind(@PathVariable String id) {
		assessTemplateService.deleteRemind(id);
		return "redirect:/assess/remind/list";
	}
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat timeFormat = new SimpleDateFormat("MM月dd日");
		timeFormat.setLenient(true);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(timeFormat, true));
	}
}
