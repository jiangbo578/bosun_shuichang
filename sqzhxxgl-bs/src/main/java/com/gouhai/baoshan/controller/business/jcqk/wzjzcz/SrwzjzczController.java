package com.gouhai.baoshan.controller.business.jcqk.wzjzcz;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.wzjzcz.Srwzjzcz;
import com.gouhai.baoshan.service.business.jcqk.wzjzcz.SrwzjzczService;
import com.gouhai.baoshan.utils.DownloadFile;

/**
 * 居民村民代表 Controller Entity:Srwzjzcz
 * 
 * @author MedivhQ
 * 
 */
@Controller
@RequestMapping(value = "/srwzjzcz")
public class SrwzjzczController extends BusinessFormController {

	@Autowired
	private SrwzjzczService srwzjzczService;
	private String path = "C:\\filesFolderUpload\\file\\";

	public SrwzjzczController() {
		super("srwzjzcz");
	}

	public void setSrwzjzczService(SrwzjzczService srwzjzczService) {
		this.srwzjzczService = srwzjzczService;
	}

	// 初始化时间
	@InitBinder
	// Srwzjzcz
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, "slsj", new CustomDateEditor(
				dateFormat, true));
		dateFormat.setLenient(false);

	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/srwzjzcz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(
				srwzjzczService.getLzzList(current, businessForm),
				srwzjzczService.getLzzCount(businessForm), current));
		return "/business/srwzjzcz/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/srwzjzcz/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(
			@RequestParam(value = "zzqfile", required = false) MultipartFile[] zzqfile,
			HttpServletRequest request, String businessFormId, Srwzjzcz srwzjzcz) {
		String str[] = DownloadFile.SavaFile(zzqfile, request, path);
		srwzjzcz.setBusinessForm(new BusinessForm(businessFormId));
		srwzjzcz.setZzqimg(str[0]);
		srwzjzcz.setZzhimg(str[1]);
		srwzjzczService.insert(srwzjzcz);
		updateBusinessForm(businessFormId);
		return "redirect:/srwzjzcz/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		srwzjzczService.delete(id);
		return "redirect:/srwzjzcz/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("srwzjzcz", srwzjzczService.findOne(id));
		return "/business/srwzjzcz/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(
			@RequestParam(value = "zzqfile", required = false) MultipartFile[] zzqfile,
			HttpServletRequest request, Srwzjzcz srwzjzcz, String businessFormId) {
		updateBusinessForm(businessFormId);

		String str[] = DownloadFile.SavaFile(zzqfile, request, path);
		Srwzjzcz d = srwzjzczService.findOne(srwzjzcz.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setBz(srwzjzcz.getBz());
			d.setCzdw(srwzjzcz.getCzdw());
			d.setCzqk(srwzjzcz.getCzqk());
			d.setLy(srwzjzcz.getLy());
			d.setSlsj(srwzjzcz.getSlsj());
			d.setWzbw(srwzjzcz.getWzbw());
			d.setWzdz(srwzjzcz.getWzdz());
			d.setWzmj(srwzjzcz.getWzmj());
			d.setWzqk(srwzjzcz.getWzqk());
			if (str[0] != null) {
				d.setZzqimg(str[0]);
			}
			if (str[1] != null) {
				d.setZzhimg(str[1]);
			}
			srwzjzczService.update(d);
		}

		return "redirect:/srwzjzcz/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/srwzjzcz/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(
				srwzjzczService.getLzzList(current, businessForm),
				srwzjzczService.getLzzCount(businessForm), current));
		return "/business/srwzjzcz/check";
	}
}