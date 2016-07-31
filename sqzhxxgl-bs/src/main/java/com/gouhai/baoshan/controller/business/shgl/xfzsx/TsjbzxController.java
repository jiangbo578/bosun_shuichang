package com.gouhai.baoshan.controller.business.shgl.xfzsx;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.xfzsx.Tsjbzx;
import com.gouhai.baoshan.service.business.BusinessFormService;
import com.gouhai.baoshan.service.business.shgl.xfzsx.TsjbzxService;

/**
 * 投诉举报咨询台账目录  action
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value = "/tsjbzx")
public class TsjbzxController extends BusinessFormController {
	@Autowired
	private TsjbzxService tsjbzxService;
	@Autowired
	private BusinessFormService businessFormService; //添加表单
	
	
	public TsjbzxController()
	{
		super("tsjbzx");
	}

	// 初始化时间
	@InitBinder
	// cwhqk
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);

	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/tsjbzx/item/1/" + businessFormId;
	}
	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(tsjbzxService.getLzzList(current,
						businessForm), tsjbzxService.getLzzCount(businessForm),
						current));
		return "/business/tsjbzx/item/index";
	}
	
	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		
		return "/business/tsjbzx/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Tsjbzx tsjy, String businessFormId) {
		tsjy.setBusinessForm(new BusinessForm(businessFormId));
		tsjbzxService.insert(tsjy);
		return "redirect:/tsjbzx/item/1/" + businessFormId;

	}
	
	
	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("tsjbzx", tsjbzxService.findOne(id));
		return "/business/tsjbzx/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Tsjbzx  t, String businessFormId) {

		Tsjbzx g = tsjbzxService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setLx(t.getLx());
			g.setLy(t.getLy());
			g.setSy(t.getSy());
			g.setCljg(t.getCljg());
			g.setUpdateDate(new Date());
			tsjbzxService.update(g);
		}
		return "redirect:/tsjbzx/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		Tsjbzx g = tsjbzxService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			tsjbzxService.delete(id);
		}
		return "redirect:/tsjbzx/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("xfqcwh:check")){
			return "/error/unauthority";
		}
		return "redirect:/tsjbzx/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("xfqcwh:check")){
			return "/error/unauthority";
		}
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(tsjbzxService.getLzzList( current,businessForm),
				tsjbzxService.getLzzCount(businessForm), current));
		return "/business/tsjbzx/check";
	}
	/*//更新
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id){
		if(!SecurityUtils.getSubject().isPermitted("tsjbzx:update")){
			return "/error/unauthority";
		}
		model.addAttribute("tsjbzx", tsjbzxService.findOne(id));
		return "/business/tsjbzx/update";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Tsjbzx tsjy){
		if(!SecurityUtils.getSubject().isPermitted("tsjbzx:update")){
			return "/error/unauthority";
		}
		tsjy.setUpdateDate(new Date());
		tsjbzxService.update(tsjy);
		return "redirect:/tsjbzx/list/1";
	}
	

*/
}
