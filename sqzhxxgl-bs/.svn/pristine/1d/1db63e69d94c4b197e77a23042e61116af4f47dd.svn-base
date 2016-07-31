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
import com.gouhai.baoshan.entity.business.hyjl.rcgz.Zfqk;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.service.business.hyjl.rcgz.ZfqkService;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.ExportDocUtil;
import com.gouhai.baoshan.utils.SecurityUtil;

/**
 * 走访情况记录 Controller entity:Zfqk
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/zfqk")
public class ZfqkController extends PageableController {
	@Autowired
	private ZfqkService zfqkService;

	private User user;

	// 查询
	@RequestMapping(value = "/list/", method = RequestMethod.GET)
	public String toIndex() {
		if (!SecurityUtils.getSubject().isPermitted("zfqk:list")) {
			return "/error/unauthority";
		}
		return "redirect:/zfqk/list/1";
	}

	@RequestMapping(value = "/list/{current}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current) {
		if (!SecurityUtils.getSubject().isPermitted("zfqk:list")) {
			return "/error/unauthority";
		}
		user = SecurityUtil.getUser();
		model.addAllAttributes(pageResult(
				zfqkService.getObjList(current, user), zfqkService
						.getObjCount(user), current));
		return "/business/zfqk/index";
	}

	// 增加
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String toAdd() {
		if (!SecurityUtils.getSubject().isPermitted("zfqk:add")) {
			return "/error/unauthority";
		}
		return "/business/zfqk/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Zfqk t) {
		if (!SecurityUtils.getSubject().isPermitted("zfqk:add")) {
			return "/error/unauthority";
		}
		user = SecurityUtil.getUser();
		t.setUser(user);
		zfqkService.insert(t);
		return "redirect:/zfqk/list/1";
	}

	// 删除
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("zfqk:delete")) {
			return "/error/unauthority";
		}
		zfqkService.delete(id);
		return "redirect:/zfqk/list/1";
	}

	// 更新
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("zfqk:update")) {
			return "/error/unauthority";
		}
		model.addAttribute("zfqk", zfqkService.findOne(id));
		return "/business/zfqk/update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Zfqk t) {
		if (!SecurityUtils.getSubject().isPermitted("zfqk:update")) {
			return "/error/unauthority";
		}
		Zfqk d = zfqkService.findOne(t.getId());
		d.setXh(t.getXh());
		d.setSj(t.getSj());
		d.setBfzdh(t.getBfzdh());
		d.setBfzxm(t.getBfzxm());
		d.setBfzlx(t.getBfzlx());
		d.setBfzdz(t.getBfzdz());
		d.setJtjbqk(t.getJtjbqk());
		d.setZfz(t.getZfz());
		d.setXq(t.getXq());
		d.setDc(t.getDc());
		d.setCljg(t.getCljg());
		zfqkService.update(d);
		return "redirect:/zfqk/list/1";
	}

	// 查看详情
	@RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
	public String detail(Model model, @PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("zfqk:detail")) {
			return "/error/unauthority";
		}
		model.addAttribute("zfqk", zfqkService.findOne(id));
		return "/business/zfqk/detail";
	}

	private static final Log logger = LogFactory
			.getLog(BusinessFormController.class);

	@RequestMapping(value = "/item/export")
	public void export(HttpServletRequest request, HttpServletResponse response) {
		user = SecurityUtil.getUser();
		List<Zfqk> xfqcwhs = zfqkService.getObjList(user);
		Map<String, Object> dataMap = new HashMap<String, Object>();
		for (int i = 1, j = xfqcwhs.size(); i <= j; i++) {

			xfqcwhs.get(i - 1).setId(i + "");
		}

		dataMap.put("zfqk", xfqcwhs);
		String fileName = "走访情况";

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

		new ExportDocUtil("zfqk.ftl").setDataList(dataMap).exportDocument(
				response, fileName);
	}
}
