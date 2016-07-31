package com.gouhai.baoshan.controller.business.hyjl.hyhd;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;
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
import com.gouhai.baoshan.entity.business.hyjl.hyhd.Xcjl;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.service.business.hyjl.hyhd.XcjlService;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.ExportDocUtil;
import com.gouhai.baoshan.utils.SecurityUtil;

/**
 * 宣传记录 Controller Entity:Xcjl
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/xcjl")
public class XcjlController extends PageableController {
	@Autowired
	private XcjlService xcjlService;
	private User user;

	// 查询
	@RequestMapping(value = "/list/", method = RequestMethod.GET)
	public String toIndex() {
		if (!SecurityUtils.getSubject().isPermitted("hdjl:list")) {
			return "/error/unauthority";
		}
		return "redirect:/xcjl/list/1";
	}

	@RequestMapping(value = "/list/{current}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current) {
		if (!SecurityUtils.getSubject().isPermitted("xcjl:list")) {
			return "/error/unauthority";
		}
		user = SecurityUtil.getUser();
		model.addAllAttributes(pageResult(xcjlService.getObjList(current,user),
				xcjlService.getObjCount(user), current));
		return "/business/xcjl/index";
	}

	// 增加
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String toAdd() {
		if (!SecurityUtils.getSubject().isPermitted("xcjl:add")) {
			return "/error/unauthority";
		}
		return "/business/xcjl/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Xcjl t) {
		if (!SecurityUtils.getSubject().isPermitted("Xcjl:add")) {
			return "/error/unauthority";
		}
		user = SecurityUtil.getUser();
		t.setUser(user);
		xcjlService.insert(t);
		return "redirect:/xcjl/list/1";
	}

	// 删除
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("Xcjl:delete")) {
			return "/error/unauthority";
		}
		xcjlService.delete(id);
		return "redirect:/xcjl/list/1";
	}

	// 更新
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("Xcjl:update")) {
			return "/error/unauthority";
		}
		model.addAttribute("xcjl", xcjlService.findOne(id));
		return "/business/xcjl/update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Xcjl t) {
		if (!SecurityUtils.getSubject().isPermitted("Xcjl:update")) {
			return "/error/unauthority";
		}
		Xcjl d = xcjlService.findOne(t.getId());

		d.setNr(t.getNr());
		d.setJlr(t.getJlr());
		d.setSj(t.getSj());
		d.setAddress(t.getAddress());
		d.setXcry(t.getXcry());
		d.setXcxs(t.getXcxs());
		d.setXczt(t.getXczt());
		d.setUpdateDate(new Date());
		xcjlService.update(d);

		return "redirect:/xcjl/list/1";
	}

	// 查看详情
	@RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
	public String detail(Model model, @PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("xcjl:detail")) {
			return "/error/unauthority";
		}
		model.addAttribute("xcjl", xcjlService.findOne(id));
		return "/business/xcjl/detail";
	}

	private static final Log logger = LogFactory
			.getLog(BusinessFormController.class);

	@RequestMapping(value = "/item/export")
	public void export(HttpServletRequest request, HttpServletResponse response) {
		// BusinessForm businessForm =
		// businessFormService.findOne(businessFormId);
		List<Xcjl> xfqcwhs = xcjlService.getObjList(user);
		Map<String, Object> dataMap = new HashMap<String, Object>();
		for (int i = 1, j = xfqcwhs.size(); i <= j; i++) {
			// 如果有HTML标签，替换成空格
			// xfqcwhs.get(i - 1).setNr(
			// xfqcwhs.get(i - 1).getNr().replaceAll("\\&[a-zA-Z]{0,9};",
			// ""));
			// System.out.println(xfqcwhs.get(i -
			// 1).getNr().replaceAll("\\&[a-zA-Z]{0,9};",
			// ""));
			xfqcwhs.get(i - 1).setId(i + "");
		}

		dataMap.put("xcjl", xfqcwhs);
		String fileName = "宣传记录";

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

		new ExportDocUtil("xcjl.ftl").setDataList(dataMap).exportDocument(
				response, fileName);
	}
}
