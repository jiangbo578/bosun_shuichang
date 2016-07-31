package com.gouhai.baoshan.controller.business.hyjl.rcgz;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.hyjl.rcgz.Glzl;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.service.business.hyjl.rcgz.GlzlService;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.ExportDocUtil;
import com.gouhai.baoshan.utils.SecurityUtil;

/**
 * 各类资料发放记录 Controller Entity:Glzl
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/glzl")
public class GlzlController extends PageableController {
	@Autowired
	private GlzlService glzlService;
	private User user;

	// // 初始化时间
	// @InitBinder
	// // zrsj
	// public void initBinder(WebDataBinder binder) {
	// SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	// dateFormat.setLenient(false);
	// binder.registerCustomEditor(Date.class, "zcrq", new CustomDateEditor(
	// dateFormat, true));
	//
	// }

	// 查询
	@RequestMapping(value = "/list/", method = RequestMethod.GET)
	public String toIndex() {
		if (!SecurityUtils.getSubject().isPermitted("zfqk:list")) {
			return "/error/unauthority";
		}
		return "redirect:/glzl/list/1";
	}

	@RequestMapping(value = "/list/{current}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current) {
		if (!SecurityUtils.getSubject().isPermitted("glzl:list")) {
			return "/error/unauthority";
		}
		user = SecurityUtil.getUser();
		model.addAllAttributes(pageResult(
				glzlService.getObjList(current, user), glzlService
						.getObjCount(user), current));
		return "/business/glzl/index";
	}

	// 增加
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String toAdd() {
		if (!SecurityUtils.getSubject().isPermitted("glzl:add")) {
			return "/error/unauthority";
		}
		return "/business/glzl/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Glzl t) {
		if (!SecurityUtils.getSubject().isPermitted("glzl:add")) {
			return "/error/unauthority";
		}
		user = SecurityUtil.getUser();
		t.setUser(user);
		glzlService.insert(t);
		return "redirect:/glzl/list/1";
	}

	// 删除
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("glzl:delete")) {
			return "/error/unauthority";
		}
		glzlService.delete(id);
		return "redirect:/glzl/list/1";
	}

	// 更新
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("glzl:update")) {
			return "/error/unauthority";
		}
		model.addAttribute("glzl", glzlService.findOne(id));
		return "/business/glzl/update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Glzl t) {
		if (!SecurityUtils.getSubject().isPermitted("glzl:update")) {
			return "/error/unauthority";
		}
		Glzl d = glzlService.findOne(t.getId());
		d.setDw(t.getDw());
		d.setNr(t.getNr());
		d.setQs(t.getQs());
		d.setSl(t.getSl());
		glzlService.update(d);
		return "redirect:/glzl/list/1";
	}

	// 查看详情
	@RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
	public String detail(Model model, @PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("glzl:detail")) {
			return "/error/unauthority";
		}
		model.addAttribute("glzl", glzlService.findOne(id));
		return "/business/glzl/detail";
	}

	private static final Log logger = LogFactory
			.getLog(BusinessFormController.class);

	@RequestMapping(value = "/item/export")
	public void export(HttpServletRequest request, HttpServletResponse response) {
		user = SecurityUtil.getUser();
		List<Glzl> xfqcwhs = glzlService.getObjList(user);
		Map<String, Object> dataMap = new HashMap<String, Object>();
		for (int i = 1, j = xfqcwhs.size(); i <= j; i++) {
			// 如果有HTML标签，替换成空格

			xfqcwhs.get(i - 1).setId(i + "");
		}

		dataMap.put("glzl", xfqcwhs);
		String fileName = "各类资料发放记录";

		String userAgent = request.getHeader("USER-AGENT");
		try {
			if (StringUtils.contains(userAgent, "MSIE")) {// IE浏览器
				fileName = URLEncoder.encode(fileName, "UTF-8");
			} else if (StringUtils.contains(userAgent, "Mozilla")) {// google,火狐浏览器
				fileName = new String(fileName.getBytes(), "ISO8859-1");
			} else {
				fileName = URLEncoder.encode(fileName, "UTF8");// 其他浏览器
			}
			// fileName = URLEncoder.encode(fileName.substring(0,
			// fileName.indexOf("(")),
			// "UTF-8")+fileName.substring(fileName.indexOf("("));
		} catch (UnsupportedEncodingException e) {
			logger.error("不支持的编码：", e);
		}

		new ExportDocUtil("glzl.ftl").setDataList(dataMap).exportDocument(
				response, fileName);
	}

}
