package com.gouhai.baoshan.controller.quzhen;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.tools.ant.types.CommandlineJava.SysProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.Business;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.BusinessType;
import com.gouhai.baoshan.entity.business.jcqk.wzjzcz.Srwzjzcz;
import com.gouhai.baoshan.entity.business.shgl.cjjyqk.Ffbxdbt;
import com.gouhai.baoshan.entity.business.shgl.cjjyqk.Ffxympbt;
import com.gouhai.baoshan.entity.business.shgl.cjjyqk.Wzwzjyh;
import com.gouhai.baoshan.entity.business.shgl.cjjyqk.head.Ffbxd;
import com.gouhai.baoshan.entity.business.shgl.cjjyqk.head.Ffxymp;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.Bgfyzcbt;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.Srhwqk;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.Tzwpbt;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.Wptzbt;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.head.Bgfyzc;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.head.Tzwp;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.head.Wptz;
import com.gouhai.baoshan.entity.mould.Mould;
import com.gouhai.baoshan.entity.mould.Mould_Gather;
import com.gouhai.baoshan.entity.user.Authority;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.entity.user.Role;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.service.business.BusinessFormService;
import com.gouhai.baoshan.service.business.BusinessService;
import com.gouhai.baoshan.service.business.BusinessTypeService;
import com.gouhai.baoshan.service.business.ExportService;
import com.gouhai.baoshan.service.business.jcqk.wzjzcz.SrwzjzczService;
import com.gouhai.baoshan.service.business.shgl.cjjyqk.FfbxdService;
import com.gouhai.baoshan.service.business.shgl.cjjyqk.FfxympService;
import com.gouhai.baoshan.service.business.shgl.cjjyqk.WzwzjyhService;
import com.gouhai.baoshan.service.business.shgl.cjjyqk.head.FfbxdbtService;
import com.gouhai.baoshan.service.business.shgl.cjjyqk.head.FfxympbtService;
import com.gouhai.baoshan.service.business.shgl.nchjzl.BgfyzcService;
import com.gouhai.baoshan.service.business.shgl.nchjzl.SrhwqkService;
import com.gouhai.baoshan.service.business.shgl.nchjzl.TzwpService;
import com.gouhai.baoshan.service.business.shgl.nchjzl.WptzService;
import com.gouhai.baoshan.service.business.shgl.nchjzl.head.BgfyzcbtService;
import com.gouhai.baoshan.service.business.shgl.nchjzl.head.TzwpbtService;
import com.gouhai.baoshan.service.business.shgl.nchjzl.head.WptzbtService;
import com.gouhai.baoshan.service.mould.MouldService;
import com.gouhai.baoshan.service.user.AuthorityService;
import com.gouhai.baoshan.service.user.OrganizationService;
import com.gouhai.baoshan.service.user.UserService;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.ClientDocUtil;
import com.gouhai.baoshan.utils.DateTimeUtil;
import com.gouhai.baoshan.utils.UploadFile;
import com.gouhai.baoshan.utils.Utils;
import com.gouhai.baoshan.utils.entiy.Tnode;

@Controller
@RequestMapping(value = "/quzhen")
public class TaizhangQueryController extends PageableController {
	private final static Logger log = Logger
			.getLogger(TaizhangQueryController.class);
	@Autowired
	private BusinessService businessService;
	@Autowired
	private BusinessFormService businessFormService;
	@Autowired
	private OrganizationService organizationService;
	@Autowired
	private BusinessTypeService businessTypeService;
	@Autowired
	private UserService userService;
	@Autowired
	protected ExportService exportService;// 公用导出方法

	@RequestMapping(value = "/taizhangquery", method = RequestMethod.GET)
	public String index(Model model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		return "/quzhen/taizhangquery";
	}

	/**
	 * 根据镇，村居 表单 查询该村局下的所有表单 填报情况，（时间条件可以加上去，根据时间查询）
	 * 
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/taizhang/list", method = RequestMethod.POST)
	@ResponseBody
	public List<BusinessForm> executeQuery(Model model,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<BusinessForm> list = new ArrayList<BusinessForm>();// 返回的表单集合
		List<Organization> organizationList = new ArrayList<Organization>();// 存储村居
		String zzId = request.getParameter("zzId");
		String formCode = request.getParameter("formCode");
		String type = request.getParameter("type");
		if (!StringUtils.isBlank(zzId) && !StringUtils.isBlank(formCode)) {
			Business business = businessService.findOneByCode(formCode);// 台帐表单code
			if (type.equals("1")) {
				// 街镇
				Organization parent = organizationService.findOne(zzId);
				organizationList = organizationService
						.getOrganizationList(parent);
			} else if (type.equals("2")) {
				// 村居
				organizationList.add(organizationService.findOne(zzId));
			}

			if (null != organizationList && organizationList.size() > 0) {
				// 根据村居获取任意一个user,根据user查取对应台帐表单，存储在list
				for (Organization oz : organizationList) {
					List<User> user = userService.getAllUserByOrganization(oz);

					if (null != user) {
						list.addAll(businessFormService.getAllBusinessForm(
								user, business));
					}
				}
			}
		}
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setProcessInstanceId(formCode);
		}
		return list;
	}

	/**
	 * 区镇的台帐查询
	 * 
	 * @return
	 * @throws Exception
	 */
	@Autowired
	private AuthorityService authorityService;

	@RequestMapping(value = "/taizhang", method = RequestMethod.GET)
	public String taizhang(Model model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		// 最高区域ID
		// 根据登陆用户的角色来查询能查看的业务表单
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		Role role = (Role) session.getAttribute("role");
		List<Authority> la = authorityService.getAuthorityListByID(role);
		List<Business> buslist = businessService.getBusinessesBycode(la);
		List<BusinessType> typelist = businessTypeService.getAllList();// 查询全部的业务类型表
		// System.err.println(typelist.size()+"wz");
		List<BusinessType> alist = new ArrayList<BusinessType>();
		if (buslist != null && typelist != null) {
			for (int i = 0; i < typelist.size(); i++) {
				for (int j = 0; j < buslist.size(); j++) {
					if (typelist.get(i).getId()
							.equals(buslist.get(j).getParid())) {
						alist.add(typelist.get(i));
						break;
					}
				}

			}
		}
		typelist = alist;
		PrintWriter out = response.getWriter();
		response.setContentType("application/json;charset=GBK");
		List<Tnode> list = new ArrayList<Tnode>();

		// 初始化台账

		// 初始化子目录int i=0;i<typelist.size();i++
		Map<String, String> maptype = new HashMap<String, String>(); // 创建一个 MAP
		String temp = "";
		for (BusinessType t : typelist) {
			maptype.put(t.getId(), t.getParid());// 保存进去方便后面遍历
			Tnode t1 = new Tnode();
			t1.setId(Integer.parseInt(t.getParid()) + 1 + t.getId());
			// System.out.println(t.getName()+":"+t.getParid()+1+t.getId());

			if (temp.indexOf(t.getParid().toString()) == -1) {
				temp = temp + t.getParid().trim() + ",";
			}

			t1.setName(t.getName());
			t1.setpId(Integer.parseInt(t.getParid()) + 1 + "");
			t1.setOpen(false);
			list.add(t1);
		}
		String arename[] = "台账,基础信息,社会管理,公共服务,党群工作,会议活动".split(",");
		String sp[] = temp.split(",");
		for (int i = 0; i < sp.length; i++) {
			Tnode t1 = new Tnode();
			if (i == 0) {
				t1.setId("1");
				t1.setName(arename[0]);
				t1.setpId("0");
				t1.setOpen(true);
				list.add(t1);
				t1 = new Tnode();
				t1.setId(1 + Integer.parseInt(sp[i]) + "");
				t1.setName(arename[Integer.parseInt(sp[i])]);
				t1.setpId("1");
				t1.setOpen(false);
			} else {
				t1.setId(1 + Integer.parseInt(sp[i]) + "");
				t1.setName(arename[Integer.parseInt(sp[i])]);
				t1.setpId("1");
				t1.setOpen(false);
			}
			list.add(t1);
		}

		// 初始化表
		for (int i = 0; i < buslist.size(); i++) {
			Business b = buslist.get(i);
			Tnode t1 = new Tnode();
			// System.out.println("父ID"+b.getParid());
			if (b.getParid() != null) {
			//	System.out.println(b.getParid()+":"+b.getParid()+"||"+maptype.get(b.getParid()));
				if(maptype.get(b.getParid())!=null){
				t1.setId(Integer.parseInt(maptype.get(b.getParid())) + 1+ b.getParid() + i);
				t1.setCode(b.getCode());
				// System.out.println(Integer.parseInt(maptype.get(b.getParid()))+1);
				// t1.setId(Integer.parseInt(maptype.get(b.getParid())+1)+b.getParid()+i+1+"");
				t1.setpId(Integer.parseInt(Integer.parseInt(maptype.get(b
						.getParid())) + 1 + b.getParid())
						+ "");
				t1.setName(b.getName());
				t1.setOpen(false);
				list.add(t1);
				}
				
			} else {
				t1.setpId("1");
				t1.setId(1 + i + "");
			}

		}

		JSONArray json = JSONArray.fromObject(list);
		out.print(json.toString());
		// System.out.println(json.toString());
		out.flush();
		out.close();
		return null;
	}

	/**
	 * 区镇所属居村委
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/organization", method = RequestMethod.GET)
	public String organization(Model model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		// 获取登录用户的组织结构
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		Organization organization = (Organization) session
				.getAttribute("userOrgan");
		// System.out.println(organization.getName());
		PrintWriter out = response.getWriter();
		response.setContentType("application/json;charset=GBK");
		List<Tnode> list = new ArrayList<Tnode>();
		Tnode t1 = new Tnode();
		t1.setId("1");
		t1.setName("上海市嘉定区");
		t1.setpId("0");
		t1.setOpen(true);
		list.add(t1);
		List<Organization> org = null;
		if (organization.getId().equals("d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1")) {
			org = organizationService.getOrganizationAll(null);
		} else {
			org = organizationService.getOrganizationAll(organization);
		}
		for (Organization o : org) {
			t1 = new Tnode();

			if (o.getParent() != null) {
				if (o.getParent().getId()
						.equals("d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1")) {
					t1.setId(o.getId());
					t1.setName(o.getName());
					t1.setpId("1");
					t1.setOpen(false);
					list.add(t1);

				} else {
					t1.setId(o.getId());
					t1.setName(o.getName());
					t1.setpId(o.getParent().getId());
					t1.setpName(o.getParent().getName());
					t1.setOpen(false);
					list.add(t1);

				}
			}

		}

		JSONArray json = JSONArray.fromObject(list);
		out.print(json.toString());
		// System.out.println(json.toString());
		out.flush();
		out.close();

		return null;

	}

	private final static String[] mm = { "01", "02", "03", "04", "05", "06",
			"07", "08", "09", "10", "11", "12" };
	@Autowired
	private WzwzjyhService wzwzjyhService;

	// 查询
	@RequestMapping(value = "/findline", method = RequestMethod.GET)
	public String toIndex(Model model) {
		// 如果登陆的是村居的话就查询自己的
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		Organization organization = (Organization) session
				.getAttribute("userOrgan");
		String date = DateTimeUtil.getDateToString(new Date(), "yyyy");
		Business business = businessService.findOneByCode("wzwzjyh");// 获取到业务表
		Map<String, Integer> barMap = null;
		barMap = new HashMap<String, Integer>();
		for (String m : mm) {
			barMap.put(m, 0);// 初始化数据
		}
		List<BusinessForm> businessFs = null;
		try {
			if (null != business) {
				if (organization.getFlag() != null
						&& organization.getFlag() == 2) {
					businessFs = businessFormService.getBusinessFormsByORGid(
							organization.getId(), date, "wzwzjyh");

				} else if (organization.getId().equals(
						"d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1")) {
					businessFs = businessFormService.getBusinessFormsByORGid(
							date, "wzwzjyh");

				} else {
					// 根据居委会查询ganshi
					businessFs = businessFormService.getBusinessFormsByUsert(
							organization.getId(), date, "wzwzjyh");

				}
				if (null != businessFs && businessFs.size() > 0) {
					// Wzwzjyh wzwzjyh = null;
					for (BusinessForm bf : businessFs) {
						// 获取唯一的peoplesummary对象
						List<Wzwzjyh> wzwzjyhs = wzwzjyhService.getAll(bf);// 根据每一个业务填报周期
						String da = DateTimeUtil.getDateToString(
								bf.getInsertDate(), "MM");
						if (null != wzwzjyhs && wzwzjyhs.size() > 0) {
							int syrkzs = wzwzjyhs.size();
							// System.out.println(da+":"+syrkzs);
							int sum = barMap.get(da);
							syrkzs += sum;
							barMap.put(da, syrkzs);
						}
					}
				}
			}
		} catch (Exception e) {
			log.error("error index", e);
		}
		model.addAttribute("map", barMap);
		model.addAttribute("max", mapGetMax(barMap) + 50);
		model.addAttribute("date", date);
		return "/quzhen/line";
	}

	// 非法建筑
	@Autowired
	private SrwzjzczService srwzjzczService;

	@RequestMapping(value = "/wfjz", method = RequestMethod.GET)
	public String wfjz(Model model) {
	//	businessService.deletecode();
		// 如果登陆的是村居的话就查询自己的
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		Organization organization = (Organization) session
				.getAttribute("userOrgan");
		String date = DateTimeUtil.getDateToString(new Date(), "yyyy");
		Business business = businessService.findOneByCode("srwzjzcz");// 获取到业务表
		Map<String, Double> barMap = null;
		barMap = new HashMap<String, Double>();
		for (String m : mm) {
			barMap.put(m, 0.0);// 初始化数据
		}
		List<BusinessForm> businessFs = null;
		try {
			if (null != business) {
				if (organization.getFlag() != null
						&& organization.getFlag() == 2) {
					businessFs = businessFormService.getBusinessFormsByORGid(
							organization.getId(), date, "srwzjzcz");
				} else if (organization.getId().equals(
						"d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1")) {
					businessFs = businessFormService.getBusinessFormsByORGid(
							date, "srwzjzcz");
				} else {
					// 根据居委会查询ganshi
					businessFs = businessFormService.getBusinessFormsByUsert(
							organization.getId(), date, "srwzjzcz");
				}
				if (null != businessFs && businessFs.size() > 0) {
					for (BusinessForm bf : businessFs) {
						List<Srwzjzcz> srwzjzcz = srwzjzczService.getAll(bf);// 根据每一个业务填报周期
						String da = DateTimeUtil.getDateToString(
								bf.getInsertDate(), "MM");
						if (null != srwzjzcz && srwzjzcz.size() > 0) {
							double count = 0;
							for (int i = 0; i < srwzjzcz.size(); i++) {
								count += Double.parseDouble(srwzjzcz.get(i)
										.getWzmj());

							}
							barMap.put(da, count);
						}
					}
				}
			}
		} catch (Exception e) {
			log.error("error index", e);
		}
		model.addAttribute("map", barMap);
		model.addAttribute("date", date);
		return "/quzhen/wfjz";
	}

	// 群组
	@RequestMapping(value = "/qz", method = RequestMethod.GET)
	public String qz(Model model) {
		// businessService.deletecode();
		return "/quzhen/qz";
	}

	@Autowired
	private BgfyzcbtService bgfyzcbtService;;
	@Autowired
	private BgfyzcService bgfyzcService;

	// 不规范生猪养殖户数
	@RequestMapping(value = "/cjhj", method = RequestMethod.GET)
	public String cjhj(Model model) {
		// 如果登陆的是村居的话就查询自己的
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		Organization organization = (Organization) session
				.getAttribute("userOrgan");
		String date = DateTimeUtil.getDateToString(new Date(), "yyyy");
		Business business = businessService.findOneByCode("bgfyzc");// 获取到业务表
		Map<String, Integer> barMap = null;
		barMap = new HashMap<String, Integer>();
		for (String m : mm) {
			barMap.put(m, 0);// 初始化数据
		}
		List<BusinessForm> businessFs = null;
		try {
			if (null != business) {
				if (organization.getFlag() != null
						&& organization.getFlag() == 2) {
					businessFs = businessFormService.getBusinessFormsByORGid(
							organization.getId(), date, "bgfyzc");
				} else if (organization.getId().equals(
						"d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1")) {
					businessFs = businessFormService.getBusinessFormsByORGid(
							date, "bgfyzc");
				} else {
					// 根据居委会查询ganshi
					businessFs = businessFormService.getBusinessFormsByUsert(
							organization.getId(), date, "bgfyzc");
				}
				if (null != businessFs && businessFs.size() > 0) {
					// Wzwzjyh wzwzjyh = null;
					for (BusinessForm bf : businessFs) {
						// 获取唯一的peoplesummary对象
						List<Bgfyzc> wzwzjyhs = bgfyzcbtService.getAll(bf);// 根据每一个业务填报周期
						String da = DateTimeUtil.getDateToString(
								bf.getInsertDate(), "MM");
						if (null != wzwzjyhs && wzwzjyhs.size() > 0) {
							for (int i = 0; i < wzwzjyhs.size(); i++) {
								List<Bgfyzcbt> bgfyzcs = bgfyzcService
										.getAll(wzwzjyhs.get(i));
								int syrkzs = bgfyzcs.size();
								// System.out.println(da+":"+syrkzs);
								int sum = barMap.get(da);
								syrkzs += sum;
								barMap.put(da, syrkzs);
							}

						}
					}
				}
			}
		} catch (Exception e) {
			log.error("error index", e);
		}
		model.addAttribute("max", mapGetMax(barMap) + 50);
		model.addAttribute("map", barMap);
		model.addAttribute("date", date);
		return "/quzhen/cjhj";
	}

	@Autowired
	private WptzService wptzService;
	@Autowired
	private WptzbtService wptzbtService;

	// 田间窝棚面积
	@RequestMapping(value = "/tjwp", method = RequestMethod.GET)
	public String tjwp(Model model) {
		// 如果登陆的是村居的话就查询自己的
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		Organization organization = (Organization) session
				.getAttribute("userOrgan");
		String date = DateTimeUtil.getDateToString(new Date(), "yyyy");
		Business business = businessService.findOneByCode("wptz");// 获取到业务表
		Map<String, Double> barMap = null;
		barMap = new HashMap<String, Double>();
		for (String m : mm) {
			barMap.put(m, 0.0);// 初始化数据
		}
		List<BusinessForm> businessFs = null;
		try {
			if (null != business) {
				if (organization.getFlag() != null
						&& organization.getFlag() == 2) {
					businessFs = businessFormService.getBusinessFormsByORGid(
							organization.getId(), date, "wptz");
				} else if (organization.getId().equals(
						"d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1")) {
					businessFs = businessFormService.getBusinessFormsByORGid(
							date, "wptz");
				} else {
					// 根据居委会查询ganshi
					businessFs = businessFormService.getBusinessFormsByUsert(
							organization.getId(), date, "wptz");
				}
				if (null != businessFs && businessFs.size() > 0) {
					// Wzwzjyh wzwzjyh = null;
					for (BusinessForm bf : businessFs) {
						// 获取唯一的peoplesummary对象
						List<Wptz> wzwzjyhs = wptzbtService.getAll(bf);// 根据每一个业务填报周期
						String da = DateTimeUtil.getDateToString(
								bf.getInsertDate(), "MM");
						if (null != wzwzjyhs && wzwzjyhs.size() > 0) {
							for (int i = 0; i < wzwzjyhs.size(); i++) {
								List<Wptzbt> bgfyzcs = wptzService
										.getAll(wzwzjyhs.get(i));
								for (int j = 0; j < bgfyzcs.size(); j++) {
									double syrkzs = bgfyzcs.get(i).getMj();
									double sum = barMap.get(da);
									syrkzs += sum;
									barMap.put(da, syrkzs);
								}

							}

						}
					}
				}
			}
		} catch (Exception e) {
			log.error("error index", e);
		}
		model.addAttribute("map", barMap);
		model.addAttribute("type", "田间窝棚");
		model.addAttribute("date", date);
		return "/quzhen/tjwp";
	}

	@Autowired
	private TzwpbtService tzwpbtService;
	@Autowired
	private TzwpService tzwpService;

	// 经济林窝棚
	@RequestMapping(value = "/jjlwp", method = RequestMethod.GET)
	public String jjlwp(Model model) {
		// 如果登陆的是村居的话就查询自己的
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		Organization organization = (Organization) session
				.getAttribute("userOrgan");
		String date = DateTimeUtil.getDateToString(new Date(), "yyyy");
		Business business = businessService.findOneByCode("tzwp");// 获取到业务表
		Map<String, Double> barMap = null;
		barMap = new HashMap<String, Double>();
		for (String m : mm) {
			barMap.put(m, 0.0);// 初始化数据
		}
		List<BusinessForm> businessFs = null;
		try {
			if (null != business) {
				if (organization.getFlag() != null
						&& organization.getFlag() == 2) {
					businessFs = businessFormService.getBusinessFormsByORGid(
							organization.getId(), date, "tzwp");
				} else if (organization.getId().equals(
						"d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1")) {
					businessFs = businessFormService.getBusinessFormsByORGid(
							date, "tzwp");
				} else {
					// 根据居委会查询ganshi
					businessFs = businessFormService.getBusinessFormsByUsert(
							organization.getId(), date, "tzwp");
				}
				if (null != businessFs && businessFs.size() > 0) {
					// Wzwzjyh wzwzjyh = null;
					for (BusinessForm bf : businessFs) {
						// 获取唯一的peoplesummary对象
						List<Tzwp> wzwzjyhs = tzwpbtService.getAll(bf);// 根据每一个业务填报周期
						String da = DateTimeUtil.getDateToString(
								bf.getInsertDate(), "MM");
						if (null != wzwzjyhs && wzwzjyhs.size() > 0) {
							for (int i = 0; i < wzwzjyhs.size(); i++) {
								List<Tzwpbt> bgfyzcs = tzwpService
										.getAll(wzwzjyhs.get(i));
								for (int j = 0; j < bgfyzcs.size(); j++) {
									double syrkzs = bgfyzcs.get(i).getMj();
									double sum = barMap.get(da);
									syrkzs += sum;
									barMap.put(da, syrkzs);
								}

							}

						}
					}
				}
			}
		} catch (Exception e) {
			log.error("error index", e);
		}
		model.addAttribute("type", "经济林窝棚");
		model.addAttribute("map", barMap);
		model.addAttribute("date", date);
		return "/quzhen/tjwp";
	}

	@Autowired
	private SrhwqkService srhwqkService;

	// 市容环卫
	@RequestMapping(value = "/srhw", method = RequestMethod.GET)
	public String srhw(Model model) {
		// 如果登陆的是村居的话就查询自己的
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		Organization organization = (Organization) session
				.getAttribute("userOrgan");
		String date = DateTimeUtil.getDateToString(new Date(), "yyyy");
		Business business = businessService.findOneByCode("Srhwqk");// 获取到业务表

		Map<String, Integer> barMap = null;
		barMap = new HashMap<String, Integer>();
		Map<String, Integer> gcMap = new HashMap<String, Integer>();
		Map<String, Integer> stMap = new HashMap<String, Integer>();
		Map<String, Integer> ztMap = new HashMap<String, Integer>();
		Map<String, Integer> slMap = new HashMap<String, Integer>();
		for (String m : mm) {
			// 初始化数据
			barMap.put(m, 0);
			gcMap.put(m, 0);
			stMap.put(m, 0);
			ztMap.put(m, 0);
			slMap.put(m, 0);
		}
		List<BusinessForm> businessFs = null;
		try {
			if (null != business) {
				if (organization.getFlag() != null
						&& organization.getFlag() == 2) {
					businessFs = businessFormService.getBusinessFormsByORGid(
							organization.getId(), date, "Srhwqk");

				} else if (organization.getId().equals(
						"d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1")) {
					businessFs = businessFormService.getBusinessFormsByORGid(
							date, "Srhwqk");

				} else {
					// 根据居委会查询ganshi
					businessFs = businessFormService.getBusinessFormsByUsert(
							organization.getId(), date, "Srhwqk");

				}
				if (null != businessFs && businessFs.size() > 0) {
					// Wzwzjyh wzwzjyh = null;
					for (BusinessForm bf : businessFs) {
						// 获取唯一的peoplesummary对象
						List<Srhwqk> wzwzjyhs = srhwqkService.getAll(bf);// 根据每一个业务填报周期
						String da = DateTimeUtil.getDateToString(
								bf.getInsertDate(), "MM");
						if (null != wzwzjyhs && wzwzjyhs.size() > 0) {
							for (int i = 0; i < wzwzjyhs.size(); i++) {
								int nc = Integer.parseInt(wzwzjyhs.get(i)
										.getNczzsl());
								int sum = barMap.get(da);
								nc += sum;
								barMap.put(da, nc);
								// 乱设摊
								int st = Integer.parseInt(wzwzjyhs.get(i)
										.getLstzzsl());
								int stsum = stMap.get(da);
								st += stsum;
								stMap.put(da, st);
								// 渣土卸点
								int zt = Integer.parseInt(wzwzjyhs.get(i)
										.getSstzzss());
								int ztsum = ztMap.get(da);
								zt += ztsum;
								ztMap.put(da, zt);
								// 散乱小广告
								int sl = Integer.parseInt(wzwzjyhs.get(i)
										.getSltzzsl());
								int slsum = slMap.get(da);
								sl += slsum;
								slMap.put(da, sl);
							}

						}
					}
				}
			}
		} catch (Exception e) {
			log.error("error index", e);
		}
		int[] max = new int[4];
		max[0] = mapGetMax(barMap);
		max[1] = mapGetMax(stMap);
		max[2] = mapGetMax(ztMap);
		max[3] = mapGetMax(slMap);
		model.addAttribute("map", barMap);
		model.addAttribute("stmap", stMap);
		model.addAttribute("ztmap", ztMap);
		model.addAttribute("slmap", slMap);
		model.addAttribute("max", getMax(max)+50);
		model.addAttribute("date", date);
		return "/quzhen/srhw";
	}
@Autowired
private FfxympbtService ffxympbtService;
@Autowired
private FfxympService ffxympService;
	//非法行医
	@RequestMapping(value = "/ffxy", method = RequestMethod.GET)
	public String ffxy(Model model) {
		// 如果登陆的是村居的话就查询自己的
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		Organization organization = (Organization) session
				.getAttribute("userOrgan");
		String date = DateTimeUtil.getDateToString(new Date(), "yyyy");
		Business business = businessService.findOneByCode("ffxymp");// 获取到业务表
		Map<String, Double> barMap = null;
		barMap = new HashMap<String, Double>();
		for (String m : mm) {
			barMap.put(m, 0.0);// 初始化数据
		}
		List<BusinessForm> businessFs = null;
		try {
			if (null != business) {
				if (organization.getFlag() != null
						&& organization.getFlag() == 2) {
					businessFs = businessFormService.getBusinessFormsByORGid(
							organization.getId(), date, "ffxymp");
				} else if (organization.getId().equals(
						"d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1")) {
					businessFs = businessFormService.getBusinessFormsByORGid(
							date, "ffxymp");
				} else {
					// 根据居委会查询ganshi
					businessFs = businessFormService.getBusinessFormsByUsert(
							organization.getId(), date, "ffxymp");
				}
				if (null != businessFs && businessFs.size() > 0) {
					// Wzwzjyh wzwzjyh = null;
					for (BusinessForm bf : businessFs) {
						// 获取唯一的peoplesummary对象
						List<Ffxymp> wzwzjyhs = ffxympbtService.getAll(bf);// 根据每一个业务填报周期
						String da = DateTimeUtil.getDateToString(
								bf.getInsertDate(), "MM");
						if (null != wzwzjyhs && wzwzjyhs.size() > 0) {
							for (int i = 0; i < wzwzjyhs.size(); i++) {
								List<Ffxympbt> bgfyzcs = ffxympService.getAll(wzwzjyhs.get(i));							
									double syrkzs = bgfyzcs.size();
									double sum = barMap.get(da);
									syrkzs += sum;
									barMap.put(da, syrkzs);							

							}

						}
					}
				}
			}
		} catch (Exception e) {
			log.error("error index", e);
		}
		model.addAttribute("map", barMap);
		model.addAttribute("date", date);
		return "/quzhen/ffxy";
	}
	@Autowired
	private FfbxdbtService ffbxdbtService;
	@Autowired
	private FfbxdService ffbxdService;
	//非法办学
	@RequestMapping(value = "/ffbx", method = RequestMethod.GET)
	public String ffbx(Model model) {
		// 如果登陆的是村居的话就查询自己的
				Subject currentUser = SecurityUtils.getSubject();
				Session session = currentUser.getSession();
				Organization organization = (Organization) session
						.getAttribute("userOrgan");
				String date = DateTimeUtil.getDateToString(new Date(), "yyyy");
				Business business = businessService.findOneByCode("Ffbxd");// 获取到业务表
				Map<String, Double> barMap = null;
				barMap = new HashMap<String, Double>();
				for (String m : mm) {
					barMap.put(m, 0.0);// 初始化数据
				}
				List<BusinessForm> businessFs = null;
				try {
					if (null != business) {
						if (organization.getFlag() != null
								&& organization.getFlag() == 2) {
							businessFs = businessFormService.getBusinessFormsByORGid(
									organization.getId(), date, "Ffbxd");
						} else if (organization.getId().equals(
								"d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1")) {
							businessFs = businessFormService.getBusinessFormsByORGid(
									date, "Ffbxd");
						} else {
							// 根据居委会查询ganshi
							businessFs = businessFormService.getBusinessFormsByUsert(
									organization.getId(), date, "Ffbxd");
						}
						if (null != businessFs && businessFs.size() > 0) {
							// Wzwzjyh wzwzjyh = null;
							for (BusinessForm bf : businessFs) {
								// 获取唯一的peoplesummary对象
								List<Ffbxd> wzwzjyhs = ffbxdbtService.getAll(bf);// 根据每一个业务填报周期
								String da = DateTimeUtil.getDateToString(
										bf.getInsertDate(), "MM");
								if (null != wzwzjyhs && wzwzjyhs.size() > 0) {
									for (int i = 0; i < wzwzjyhs.size(); i++) {
										List<Ffbxdbt> bgfyzcs = ffbxdService.getAll(wzwzjyhs.get(i));							
											double syrkzs = bgfyzcs.size();
											double sum = barMap.get(da);
											syrkzs += sum;
											barMap.put(da, syrkzs);	
									}

								}
							}
						}
					}
				} catch (Exception e) {
					log.error("error index", e);
				}
				model.addAttribute("map", barMap);
				model.addAttribute("date", date);
   return "/quzhen/ffbx";		
	}
	@Autowired
	private MouldService mouldService;

	// 选择模板
	@RequestMapping(value = "/select/{current}", method = RequestMethod.GET)
	public String select(Model model, @PathVariable() int current) {
		model.addAllAttributes(pageResult(mouldService.getObjList(current),
				mouldService.getObjCount(), current));
		return "/quzhen/mbselect";
	}

	@RequestMapping(value = "/down", method = RequestMethod.POST)
	public void downdoc(Model model, HttpSession session,
			HttpServletResponse response, HttpServletRequest request,
			@RequestParam String mouldid, @RequestParam String startdate,
			@RequestParam String enddate, @RequestParam String orgid) {
		// String codesplit[]=code.split(","); //分割业务代码
		String path = Utils.getBundelPath("upload", "uploadPath"); // 配置里面的路径
		String uuid = Utils.generID();
		ServletContext application = session.getServletContext();
		String serverRealPath = application
				.getRealPath("/WEB-INF/classes/doc/template/");
		// 开始查询 指定他的事件
		// System.out.println("开始进来" +uuid);
		// 根据组织结构的ID查询下面的用户
		User u = userService.getUserGanshiByid(orgid);
		// 开始查询===========================================================================
		List<BusinessForm> bform = businessFormService.getBusinessFormList(u,
				startdate, enddate);
		// String tset[]="dfszsyqk,kndyqk,pydzbgz,ndzzshgk,rdsqr".split(",");
		// //添加测试数据
		Mould md = mouldService.findOne(mouldid);// 妯℃澘
		List<Mould_Gather> mlist = mouldService.getGathers(md);
		for (int i = 0; i < bform.size(); i++) { // 涓存椂娴嬭瘯 bform.size()
			BusinessForm b = bform.get(i);
			// 鍒ゆ柇 鏈夋病瑕佸鍑鸿繖涓〃鐨勬暟鎹�
			for (int j = 0; j < mlist.size(); j++) {
				Mould_Gather mg = mlist.get(j);
				Business bs = b.getBusiness();// 鑾峰彇涓氬姟
				if (bs.getCode().equals(mg.getBusiness().getCode())) {

					// 杩樿鍒ゆ柇 ftl 鏂囦欢鏄惁瀛樺湪
					File file = new File(serverRealPath + "\\"
							+ b.getBusiness().getCode().toLowerCase() + ".ftl");
					if (file.exists() == true) {
						b.getBusiness().setCode(b.getBusiness().getCode());
						Map<String, Object> dataMap = constructDataMap(b, b
								.getBusiness().getCode(), null);// 缁勮word鎵�渶瑕佺殑map鏁版嵁
						// 鍒ゆ柇鏁版嵁鏄惁涓虹┖
						if (dataMap != null) {
							// 濡傛灉绫诲瀷涓�灏辨槸word锛屽弽涔嬪氨鏄〃鏍�
							exportdoc(bs.getCode(), dataMap, b.getName(), uuid);// 瀵煎嚭word
						}
					}

				}
			}

		}
		// 所有文件导出完毕
		// 下面开始拼接======================================================================

		try {
			File file = new File(path + "\\downdoc\\");
			// 判断文件夹是否存在,如果不存在则创建文件夹
			if (!file.exists()) {
				file.mkdir();
			}

			ClientDocUtil.uniteDoc(
					UploadFile.getList(path + "\\downdoc\\temp\\" + uuid), path
							+ "\\downdoc\\" + uuid + ".doc");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// 输出完成=======================================================================================
		File file = new File(path + "\\downdoc\\temp\\" + uuid);
		File[] files = file.listFiles();
		if (files != null) {
			for (int i = 0; i < files.length; i++) {
				// System.out.println("路径"+files[i].getAbsolutePath());
				deleteFile(files[i].getAbsolutePath());
			}
		}
		file.delete();
		// 删除文件
		response.reset();
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/octet-stream; charset=UTF-8");
		response.setHeader(
				"Content-Disposition",
				"attachment; filename="
						+ DateTimeUtil.getDateToString(new Date(),
								DateTimeUtil.PATTERN_SHORT) + ".doc");
		OutputStream stream = null;
		try {

			file = new File(path + "\\downdoc\\" + uuid + ".doc");
			FileInputStream inputStream = null;
			if (file.exists() == false) {
				stream = response.getOutputStream();
				stream.write("没有数据".getBytes());
				stream.flush();
				stream.close();
			} else {
				inputStream = new FileInputStream(file);
				byte[] data = new byte[(int) file.length()];
				inputStream.read(data);
				inputStream.close();
				stream = response.getOutputStream();
				stream.write(data);
				stream.flush();
				stream.close();
			}

		} catch (IOException e) {

			e.printStackTrace();
		} finally {

		}

	}

	/**
	 * 导出word文档
	 * 
	 * @author sun 2014-08-20
	 * @param ftlOfSuffixName
	 *            (flt模版文件的前缀名称：如：a.flt文件的a)
	 * @param dataMap
	 * @param response
	 * @param fileName
	 * @throws IOException
	 */
	protected void exportdoc(String ftlOfSuffixName,
			Map<String, Object> dataMap, String name, String uid) {
		// 这里拼接的就是每个实体类对应的FTL文件
		try {
			new ClientDocUtil(ftlOfSuffixName.toLowerCase() + ".ftl", 0)
					.setDataList(dataMap).exportDocument(name, uid, 0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 用于导出word所需要的数据
	 * 
	 * @param businessForm
	 *            (业务表单)，entityName（要查询的Entity 字符串）,dataMap(封装的数据)
	 * @author sun 2014-08-20
	 * @return
	 */
	protected Map<String, Object> constructDataMap(BusinessForm businessForm,
			String entityName, Map<String, Object> dataMap) {
		if (null == dataMap)
			dataMap = new HashMap<String, Object>();

		// moduleName 就是子类继承父类super传过来过来的编码，把首字母转换为大写就是实体类名
		String y = ((String) entityName.subSequence(0, 1)).toUpperCase();
		String s = (String) entityName.subSequence(1, entityName.length());
		String code = y + s;
		// 这里的泛型用的是所有类的父类。
		List<BaseEntity> list = exportService.getObjList(businessForm, code,
				null);
		for (int i = 1, j = list.size(); i <= j; i++) {
			list.get(i - 1).setId(i + "");
			// System.out.println(list.get(i).getId());
		}
		if (list.size() == 0) {
			return null;
			/*
			 * dataMap.put(entityName.toLowerCase(), list);
			 * dataMap.put("businessForm", businessForm);
			 */
		} else {
			dataMap.put(entityName.toLowerCase(), list);
			dataMap.put("businessForm", businessForm);
		}

		return dataMap;
	}

	// 删除文件
	/**
	 * 删除单个文件
	 * 
	 * @param sPath
	 *            被删除文件的文件名
	 * @return 单个文件删除成功返回true，否则返回false
	 */
	public boolean deleteFile(String sPath) {

		boolean flag = false;
		File file = new File(sPath);
		// 路径为文件且不为空则进行删除
		if (file.isFile() && file.exists()) {
			file.delete();
			flag = true;
		}
		return flag;
	}

	/**
	 * 获取manp集合里面的最大值
	 * 
	 * @param map
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public int mapGetMax(Map map) {
		List list = new ArrayList();
		Iterator iter = map.entrySet().iterator(); // 获得map的Iterator
		while (iter.hasNext()) {
			Entry entry = (Entry) iter.next();
			list.add(entry.getValue());
		}
		return Collections.max(list);
	}

	/**
	 * 获取数组最大的值
	 * 
	 * @param arr
	 * @return
	 */
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > max)
				max = arr[x];
		}
		return max;
	}

}
