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
import com.gouhai.baoshan.entity.business.hyjl.rcgz.Sqzamp;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.service.business.hyjl.rcgz.SqzampService;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.ExportDocUtil;
import com.gouhai.baoshan.utils.SecurityUtil;

/**
 * 社区治安、安全排摸、矛盾纠纷排查记录 Controller Entity：Sqzamp
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/sqzamp")
public class SqzampController extends PageableController {
	@Autowired
	private SqzampService sqzampService;
	private User user;

	// 查询
	@RequestMapping(value = "/list/", method = RequestMethod.GET)
	public String toIndex() {
		if (!SecurityUtils.getSubject().isPermitted("zfqk:list")) {
			return "/error/unauthority";
		}
		return "redirect:/sqzamp/list/1";
	}

	@RequestMapping(value = "/list/{current}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current) {
		if (!SecurityUtils.getSubject().isPermitted("sqzamp:list")) {
			return "/error/unauthority";
		}
		user = SecurityUtil.getUser();

		model.addAllAttributes(pageResult(sqzampService.getObjList(current,
				user), sqzampService.getObjCount(user), current));
		return "/business/sqzamp/index";
	}

	// 增加
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String toAdd() {
		if (!SecurityUtils.getSubject().isPermitted("sqzamp:add")) {
			return "/error/unauthority";
		}
		return "/business/sqzamp/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Sqzamp t) {
		if (!SecurityUtils.getSubject().isPermitted("sqzamp:add")) {
			return "/error/unauthority";
		}
		user = SecurityUtil.getUser();
		t.setUser(user);
		sqzampService.insert(t);
		return "redirect:/sqzamp/list/1";
	}

	// 删除
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("sqzamp:delete")) {
			return "/error/unauthority";
		}
		sqzampService.delete(id);
		return "redirect:/sqzamp/list/1";
	}

	// 更新
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("sqzamp:update")) {
			return "/error/unauthority";
		}
		model.addAttribute("sqzamp", sqzampService.findOne(id));
		return "/business/sqzamp/update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Sqzamp t) {
		if (!SecurityUtils.getSubject().isPermitted("sqzamp:update")) {
			return "/error/unauthority";
		}
		Sqzamp d = sqzampService.findOne(t.getId());
		d.setSj(t.getSj());
		d.setCjry(t.getCjry());
		d.setDz(t.getDz());
		d.setFzr(t.getFzr());
		d.setZb(t.getZb());
		d.setMj(t.getMj());
		d.setTjy(t.getTjy());
		d.setWy(t.getWy());
		d.setXg(t.getXg());
		d.setQt(t.getQt());
		d.setNr(t.getNr());
		d.setCzwt(t.getCzwt());
		d.setZgcs(t.getZgcs());
		d.setBz(t.getBz());
		sqzampService.update(d);
		return "redirect:/sqzamp/list/1";
	}

	// 查看详情
	@RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
	public String detail(Model model, @PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("sqzamp:detail")) {
			return "/error/unauthority";
		}
		model.addAttribute("sqzamp", sqzampService.findOne(id));
		return "/business/sqzamp/detail";
	}

	private static final Log logger = LogFactory
			.getLog(BusinessFormController.class);

	@RequestMapping(value = "/item/export")
	public void export(HttpServletRequest request, HttpServletResponse response) {
		user = SecurityUtil.getUser();
		List<Sqzamp> xfqcwhs = sqzampService.getObjList(user);
		Map<String, Object> dataMap = new HashMap<String, Object>();
		for (int i = 1, j = xfqcwhs.size(); i <= j; i++) {

			xfqcwhs.get(i - 1).setId(i + "");
		}

		dataMap.put("sqzamp", xfqcwhs);
		String fileName = "社区治安、安全排摸、矛盾纠纷排查记录";

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

		new ExportDocUtil("sqzamp.ftl").setDataList(dataMap).exportDocument(
				response, fileName);
	}
}
