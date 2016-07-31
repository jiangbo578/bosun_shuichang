/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.entity.business.Business;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.gk.Peoplesummary;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.service.business.BusinessFormService;
import com.gouhai.baoshan.service.business.BusinessService;
import com.gouhai.baoshan.service.business.jcqk.gk.PeoplesummaryService;
import com.gouhai.baoshan.service.publics.NewsService;
import com.gouhai.baoshan.utils.DateTimeUtil;

/**
 * 
 * 
 * @author sun 2014-09-02
 * 
 */
@Controller
public class SummaryController {

	@Autowired
	protected BusinessFormService businessFormService;
	@Autowired
	protected NewsService newsService;

	@Autowired
	protected PeoplesummaryService peoplesummaryService;
	@Autowired
	protected BusinessService businessService;
	@Autowired
	private HttpServletRequest request;

	private final static String[] mm = { "01", "02", "03", "04", "05", "06",
			"07", "08", "09", "10", "11", "12" };

	private static final Log log = LogFactory.getLog(SummaryController.class);

	// centent

	@RequestMapping(value = "/summary", method = RequestMethod.GET)
	public String toCentent(Model model) {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		String userId = (String) session.getAttribute("userId");
		Organization organization = (Organization) session
				.getAttribute("userOrgan");

		String selectDate = request.getParameter("summaryDate");

		String type = request.getParameter("type");
		if (null == selectDate || "".equals(selectDate)) {
			selectDate = DateTimeUtil.getDateToString(new Date(), "yyyy");// 为空则默认当前时间年份
		}
		log.info("------- selected date --------:" + selectDate);
		model.addAttribute("selectDate", selectDate);

		/**
		 * 处理统计表图数据
		 */
		Peoplesummary peoplesummary = peoplesummaryService.findOneSqlByDesc(
				organization, selectDate);
		if (null == peoplesummary)
			peoplesummary = new Peoplesummary();
		model.addAttribute("peoplesummary", peoplesummary);
		model.addAttribute("type", type);
		/**
		 * 柱状图
		 */
		Business business = businessService.findOneByCode("peoplesummary");// 获取到业务表
		Map<String, Integer> barMap = null;
		barMap = new HashMap<String, Integer>();
		for (String m : mm) {
			barMap.put(m, 0);// 初始化数据
		}
		try {
			if (null != business) {
				List<BusinessForm> businessFs =	businessFormService.getBusinessFormByYear(selectDate,organization.getId());// 查询当前填报周期的业务表
				if (null != businessFs && businessFs.size() > 0) {

					Peoplesummary summary = null;
					for (BusinessForm bf : businessFs) {
						// 获取唯一的peoplesummary对象
						List<Peoplesummary> summarys = peoplesummaryService
								.getAll(bf, organization);// 根据每一个业务填报周期 ,所在村居
															// 查找条目记录
						String da = DateTimeUtil.getDateToString(
								bf.getInsertDate(), "MM");
						if (null != summarys && summarys.size() > 0) {
							summary = summarys.get(0);
							if (null == type || "".equals(type)) {
								type = "Syrkzs";
							}

							// System.out.println("-----------------------:"+type);
							Method method = summary.getClass().getMethod(
									"get" + type);
							// System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~:"+method.invoke(summary));//1
							String str = String.valueOf(method.invoke(summary));
							// System.out.println("-----------------------:"+str);
							int syrkzs = Integer.valueOf(str);
							barMap.put(da, syrkzs);
						}
					}
				}
			}
		} catch (Exception e) {
			log.error("error index", e);
		}
		model.addAttribute("map", barMap);
		return "/summary";
	}
}
