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
import com.gouhai.baoshan.entity.business.hyjl.rcgz.Zxjd;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.service.business.hyjl.rcgz.ZxjdService;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.ExportDocUtil;
import com.gouhai.baoshan.utils.SecurityUtil;

/**
 * 咨询接待记录 Controller Entity:Zxjd
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/zxjd")
public class ZxjdController extends PageableController {
	@Autowired
	private ZxjdService zxjdService;

	private User user;

	// 查询
	@RequestMapping(value = "/list/", method = RequestMethod.GET)
	public String toIndex() {
		if (!SecurityUtils.getSubject().isPermitted("zfqk:list")) {
			return "/error/unauthority";
		}
		return "redirect:/zxjd/list/1";
	}

	@RequestMapping(value = "/list/{current}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current) {
		if (!SecurityUtils.getSubject().isPermitted("zxjd:list")) {
			return "/error/unauthority";
		}
		user = SecurityUtil.getUser();

		model.addAllAttributes(pageResult(
				zxjdService.getObjList(current, user), zxjdService
						.getObjCount(user), current));
		return "/business/zxjd/index";
	}

	// 增加
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String toAdd() {
		if (!SecurityUtils.getSubject().isPermitted("zxjd:add")) {
			return "/error/unauthority";
		}
		return "/business/zxjd/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Zxjd t) {
		if (!SecurityUtils.getSubject().isPermitted("zxjd:add")) {
			return "/error/unauthority";
		}
		user = SecurityUtil.getUser();
		t.setUser(user);
		zxjdService.insert(t);
		return "redirect:/zxjd/list/1";
	}

	// 删除
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("zxjd:delete")) {
			return "/error/unauthority";
		}
		zxjdService.delete(id);
		return "redirect:/zxjd/list/1";
	}

	// 更新
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("zxjd:update")) {
			return "/error/unauthority";
		}
		model.addAttribute("zxjd", zxjdService.findOne(id));
		return "/business/zxjd/update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Zxjd t) {
		if (!SecurityUtils.getSubject().isPermitted("zxjd:update")) {
			return "/error/unauthority";
		}
		Zxjd d = zxjdService.findOne(t.getId());
		d.setRq(t.getRq());
		d.setSex(t.getSex());
		d.setName(t.getName());
		d.setAge(t.getAge());
		d.setAddress(t.getAddress());
		d.setPhone(t.getPhone());
		d.setType(t.getType());
		d.setNr(t.getNr());
		d.setNrqk(t.getNrqk());
		d.setJdr(t.getJdr());

		d.setCljg(t.getCljg());
		zxjdService.update(d);
		return "redirect:/zxjd/list/1";
	}

	// 查看详情
	@RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
	public String detail(Model model, @PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("zxjd:detail")) {
			return "/error/unauthority";
		}
		model.addAttribute("zxjd", zxjdService.findOne(id));
		return "/business/zxjd/detail";
	}

	private static final Log logger = LogFactory
			.getLog(BusinessFormController.class);

	@RequestMapping(value = "/item/export")
	public void export(HttpServletRequest request, HttpServletResponse response) {
		user = SecurityUtil.getUser();
		List<Zxjd> xfqcwhs = zxjdService.getObjList(user);
		Map<String, Object> dataMap = new HashMap<String, Object>();
		for (int i = 1, j = xfqcwhs.size(); i <= j; i++) {

			xfqcwhs.get(i - 1).setId(i + "");
		}

		dataMap.put("zxjd", xfqcwhs);
		String fileName = "咨询接待记录";

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

		new ExportDocUtil("zxjd.ftl").setDataList(dataMap).exportDocument(
				response, fileName);
	}
}
