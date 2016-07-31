package com.gouhai.baoshan.controller.business.ggfw.llgz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.llgz.Gllr;
import com.gouhai.baoshan.entity.person.Person;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.service.business.ggfw.llgz.GllrService;
import com.gouhai.baoshan.service.person.PersonService;

/**
 * 80岁以上高龄老人名册 Controller Entity:Gllr
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/gllr")
public class GllrController extends BusinessFormController {
	@Autowired
	private GllrService gllrService;
	@Autowired
	private PersonService personService;

	public GllrController() {
		super("gllr");
	}

	// 查询
	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/gllr/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(
				gllrService.getObjList(current, businessForm),
				gllrService.getObjCount(businessForm), current));
		return "/business/gllr/item/index";
	}

	// // 初始化转换日期
	// @InitBinder
	// public void initBinder(WebDataBinder binder) {
	// SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	// dateFormat.setLenient(false);
	// binder.registerCustomEditor(Date.class, "gjsj", new CustomDateEditor(
	// dateFormat, true));
	// }

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/gllr/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Gllr t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		gllrService.insert(t);
		return "redirect:/gllr/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("gllr", gllrService.findOne(id));
		return "/business/gllr/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Gllr t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Gllr g = gllrService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
		
			g.setName(t.getName());
			g.setSex(t.getSex());
			g.setBirthday(t.getBirthday());
			g.setUpdateDate(new Date());
			gllrService.update(g);
		}
		return "redirect:/gllr/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		Gllr g = gllrService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			gllrService.delete(id);
		}
		return "redirect:/gllr/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/gllr/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(
				gllrService.getObjList(current, businessForm),
				gllrService.getObjCount(businessForm), current));
		return "/business/gllr/check";
	}

	// 审核
	@RequestMapping(value = "/submitlr", method = RequestMethod.GET)
	@ResponseBody
	public String submitLr(String businessFormId) throws ParseException {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Subject currentUser = SecurityUtils.getSubject();
		Session shiroSession = currentUser.getSession();
		Organization or = (Organization) shiroSession.getAttribute("userOrgan");
		String date=getPassWeekTime();
		date+="-12-31";
		List<Person> list = personService.getPersonsByCode(or.getCode(),sf.parse(date));
		
		int tj=0;
		for (int i = 0; i < list.size(); i++) {
			Gllr gllr = new Gllr();
			Person person = list.get(i);
			//添加之前进行判断，添加过得就不添加了
			gllr.setBirthday(sf.format(person.getCSRQ()));
			if (person.getXBHZ().equals("男性")) {
				person.setXBHZ("男");
			} else {
				person.setXBHZ("女");
			}
	     	int f=	gllrService.getGllr(sf.format(person.getCSRQ()), person.getXM(), person.getXBHZ());
			if(f==0){
				gllr.setBusinessForm(new BusinessForm(businessFormId));
				gllr.setSex(person.getXBHZ());
				gllr.setName(person.getXM());
				gllrService.insert(gllr);
				tj+=1;
			}
		}
		return "添加成功!\n本次添加了"+tj+"条数据";
	}

	/**
	 * 获得80年前的日期
	 */
	public static String getPassWeekTime() {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy");
		Calendar cl = Calendar.getInstance();
		cl.setTime(new Date());
		cl.add(Calendar.DATE, -29200);
		Date date = cl.getTime();
		return sf.format(date);
	}
}
