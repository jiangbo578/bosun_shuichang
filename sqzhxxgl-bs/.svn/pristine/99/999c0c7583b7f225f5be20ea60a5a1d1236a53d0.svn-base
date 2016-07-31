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
import com.gouhai.baoshan.entity.business.hyjl.rcgz.Xftj;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.service.business.hyjl.rcgz.XftjService;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.ExportDocUtil;
import com.gouhai.baoshan.utils.SecurityUtil;

/**
 * 信访调解记录 Controller Entity:Xftj
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/xftj")
public class XftjController extends PageableController {
	@Autowired
	private XftjService xftjService;

	private User user;

	// 查询
	@RequestMapping(value = "/list/", method = RequestMethod.GET)
	public String toIndex() {
		if (!SecurityUtils.getSubject().isPermitted("zfqk:list")) {
			return "/error/unauthority";
		}
		return "redirect:/xftj/list/1";
	}

	@RequestMapping(value = "/list/{current}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current) {
		if (!SecurityUtils.getSubject().isPermitted("xftj:list")) {
			return "/error/unauthority";
		}
		user = SecurityUtil.getUser();
		model.addAllAttributes(pageResult(
				xftjService.getObjList(current, user), xftjService
						.getObjCount(user), current));
		return "/business/xftj/index";
	}

	// 增加
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String toAdd() {
		if (!SecurityUtils.getSubject().isPermitted("xftj:add")) {
			return "/error/unauthority";
		}
		return "/business/xftj/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Xftj t) {
		if (!SecurityUtils.getSubject().isPermitted("xftj:add")) {
			return "/error/unauthority";
		}
		user = SecurityUtil.getUser();
		t.setUser(user);
		xftjService.insert(t);
		return "redirect:/xftj/list/1";
	}

	// 删除
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("xftj:delete")) {
			return "/error/unauthority";
		}
		xftjService.delete(id);
		return "redirect:/xftj/list/1";
	}

	// 更新
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("xftj:update")) {
			return "/error/unauthority";
		}
		model.addAttribute("xftj", xftjService.findOne(id));
		return "/business/xftj/update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Xftj t) {
		if (!SecurityUtils.getSubject().isPermitted("xftj:update")) {
			return "/error/unauthority";
		}
		Xftj d = xftjService.findOne(t.getId());
		d.setXh(t.getXh());
		d.setJflb(t.getJflb());
		d.setSlsj(t.getSlsj());
		d.setTjry(t.getTjry());
		d.setYwtjxy(t.getYwtjxy());
		d.setDsrgk(t.getDsrgk());
		d.setJfgk(t.getJfgk());
		d.setTcjg(t.getTcjg());
		d.setGzfkqk(t.getGzfkqk());
		d.setXh(t.getXh());
		xftjService.update(d);
		return "redirect:/xftj/list/1";
	}

	// 查看详情
	@RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
	public String detail(Model model, @PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("xftj:detail")) {
			return "/error/unauthority";
		}
		model.addAttribute("xftj", xftjService.findOne(id));
		return "/business/xftj/detail";
	}

	private static final Log logger = LogFactory
			.getLog(BusinessFormController.class);

	@RequestMapping(value = "/item/export")
	public void export(HttpServletRequest request, HttpServletResponse response) {
		user = SecurityUtil.getUser();
		List<Xftj> xfqcwhs = xftjService.getObjList(user);
		Map<String, Object> dataMap = new HashMap<String, Object>();
		for (int i = 1, j = xfqcwhs.size(); i <= j; i++) {

			xfqcwhs.get(i - 1).setId(i + "");
		}

		dataMap.put("xftj", xfqcwhs);
		String fileName = "信访调解记录";

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

		new ExportDocUtil("xftj.ftl").setDataList(dataMap).exportDocument(
				response, fileName);
	}
}
