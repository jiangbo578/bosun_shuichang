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
import com.gouhai.baoshan.entity.business.hyjl.hyhd.Hdjl;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.service.business.hyjl.hyhd.HdjlService;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.ExportDocUtil;
import com.gouhai.baoshan.utils.SecurityUtil;

/**
 * 活动记录 Controller Entity:Hdjl
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/hdjl")
public class HdjlController extends PageableController {
	@Autowired
	private HdjlService hdjlService;
	private User user;

	// 查询
	@RequestMapping(value = "/list/", method = RequestMethod.GET)
	public String toIndex() {
		if (!SecurityUtils.getSubject().isPermitted("hdjl:list")) {
			return "/error/unauthority";
		}
		return "redirect:/hdjl/list/1";
	}

	@RequestMapping(value = "/list/{current}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current) {
		if (!SecurityUtils.getSubject().isPermitted("hdjl:list")) {
			return "/error/unauthority";
		}
		user = SecurityUtil.getUser();
		model.addAllAttributes(pageResult(
				hdjlService.getObjList(current, user),
				hdjlService.getObjCount(user), current));
		return "/business/hdjl/index";
	}

	// 增加
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String toAdd() {
		if (!SecurityUtils.getSubject().isPermitted("hdjl:add")) {
			return "/error/unauthority";
		}
		return "/business/hdjl/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Hdjl t) {
		if (!SecurityUtils.getSubject().isPermitted("hdjl:add")) {
			return "/error/unauthority";
		}
		user = SecurityUtil.getUser();
		t.setUser(user);
		hdjlService.insert(t);
		return "redirect:/hdjl/list/1";
	}

	// 删除
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("hdjl:delete")) {
			return "/error/unauthority";
		}
		hdjlService.delete(id);
		return "redirect:/hdjl/list/1";
	}

	// 更新
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("hdjl:update")) {
			return "/error/unauthority";
		}
		model.addAttribute("hdjl", hdjlService.findOne(id));
		return "/business/hdjl/update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Hdjl t) {
		if (!SecurityUtils.getSubject().isPermitted("hdjl:update")) {
			return "/error/unauthority";
		}
		Hdjl d = hdjlService.findOne(t.getId());
		d.setType(t.getType());
		d.setNr(t.getNr());
		d.setJlr(t.getJlr());
		d.setSj(t.getSj());
		d.setAddress(t.getAddress());
		d.setFzr(t.getFzr());
		d.setCjdx(t.getCjdx());
		d.setCjrs(t.getCjrs());
		d.setUpdateDate(new Date());
		hdjlService.update(d);

		return "redirect:/hdjl/list/1";
	}

	// 查看详情
	@RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
	public String detail(Model model, @PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("hdjl:detail")) {
			return "/error/unauthority";
		}
		model.addAttribute("hdjl", hdjlService.findOne(id));
		return "/business/hdjl/detail";
	}

	private static final Log logger = LogFactory
			.getLog(BusinessFormController.class);

	@RequestMapping(value = "/item/export")
	public void export(HttpServletRequest request, HttpServletResponse response) {
		user = SecurityUtil.getUser();
		List<Hdjl> xfqcwhs = hdjlService.getObjList(user);
		Map<String, Object> dataMap = new HashMap<String, Object>();
		for (int i = 1, j = xfqcwhs.size(); i <= j; i++) {
			// 如果有HTML标签，替换成空格

			xfqcwhs.get(i - 1).setId(i + "");
		}

		dataMap.put("hdjl", xfqcwhs);
		String fileName = "活动记录";

		String userAgent = request.getHeader("USER-AGENT");
		try {
			if (StringUtils.contains(userAgent, "MSIE")) {// IE浏览器
				fileName = URLEncoder.encode(fileName, "UTF-8");
			} else if (StringUtils.contains(userAgent, "Mozilla")) {// google,火狐浏览器
				fileName = new String(fileName.getBytes(), "ISO8859-1");
			} else {
				fileName = URLEncoder.encode(fileName, "UTF8");// 其他浏览器
			}

		} catch (UnsupportedEncodingException e) {
			logger.error("不支持的编码：", e);
		}

		new ExportDocUtil("hdjl.ftl").setDataList(dataMap).exportDocument(
				response, fileName);
	}
}
