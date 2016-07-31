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
import com.gouhai.baoshan.entity.business.hyjl.rcgz.Zyzfw;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.service.business.hyjl.rcgz.ZyzfwService;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.ExportDocUtil;
import com.gouhai.baoshan.utils.SecurityUtil;

/**
 * 志愿者服务记录 Controller Entity:Zyzfw
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/zyzfw")
public class ZyzfwController extends PageableController {
	@Autowired
	private ZyzfwService zyzfwService;
	private User user;

	// 查询
	@RequestMapping(value = "/list/", method = RequestMethod.GET)
	public String toIndex() {
		if (!SecurityUtils.getSubject().isPermitted("zfqk:list")) {
			return "/error/unauthority";
		}
		return "redirect:/zyzfw/list/1";
	}

	@RequestMapping(value = "/list/{current}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current) {
		if (!SecurityUtils.getSubject().isPermitted("zyzfw:list")) {
			return "/error/unauthority";
		}
		user = SecurityUtil.getUser();
		model.addAllAttributes(pageResult(zyzfwService
				.getObjList(current, user), zyzfwService.getObjCount(user),
				current));
		return "/business/zyzfw/index";
	}

	// 增加
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String toAdd() {
		if (!SecurityUtils.getSubject().isPermitted("zyzfw:add")) {
			return "/error/unauthority";
		}
		return "/business/zyzfw/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Zyzfw t) {
		if (!SecurityUtils.getSubject().isPermitted("zyzfw:add")) {
			return "/error/unauthority";
		}
		user = SecurityUtil.getUser();
		t.setUser(user);
		zyzfwService.insert(t);
		return "redirect:/zyzfw/list/1";
	}

	// 删除
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("zyzfw:delete")) {
			return "/error/unauthority";
		}
		zyzfwService.delete(id);
		return "redirect:/zyzfw/list/1";
	}

	// 更新
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("zyzfw:update")) {
			return "/error/unauthority";
		}
		model.addAttribute("zyzfw", zyzfwService.findOne(id));
		return "/business/zyzfw/update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Zyzfw t) {
		if (!SecurityUtils.getSubject().isPermitted("zyzfw:update")) {
			return "/error/unauthority";
		}
		Zyzfw d = zyzfwService.findOne(t.getId());
		d.setRq(t.getRq());
		d.setZyzxm(t.getZyzxm());
		d.setFwrc(t.getFwrc());
		d.setNr(t.getNr());
		d.setQzmyd(t.getQzmyd());
		d.setBz(t.getBz());
		zyzfwService.update(d);
		return "redirect:/zyzfw/list/1";
	}

	private static final Log logger = LogFactory
			.getLog(BusinessFormController.class);

	@RequestMapping(value = "/item/export")
	public void export(HttpServletRequest request, HttpServletResponse response) {
		user = SecurityUtil.getUser();
		List<Zyzfw> xfqcwhs = zyzfwService.getObjList(user);
		Map<String, Object> dataMap = new HashMap<String, Object>();
		for (int i = 1, j = xfqcwhs.size(); i <= j; i++) {
			// 如果有HTML标签，替换成空格

			xfqcwhs.get(i - 1).setId(i + "");
		}

		dataMap.put("zyzfw", xfqcwhs);
		String fileName = "志愿者服务记录 ";

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

		new ExportDocUtil("zyzfw.ftl").setDataList(dataMap).exportDocument(
				response, fileName);
	}

}
