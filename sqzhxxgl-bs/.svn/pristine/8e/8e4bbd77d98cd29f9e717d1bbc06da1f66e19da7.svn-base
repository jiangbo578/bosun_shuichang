
package com.gouhai.baoshan.controller.business.dqgz.zb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.shiro.SecurityUtils;
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
import com.gouhai.baoshan.entity.business.dqgz.zb.Zcdygkbt;
import com.gouhai.baoshan.entity.business.dqgz.zb.head.Zcdygk;
import com.gouhai.baoshan.service.business.dqgz.zb.ZcdygkService;
import com.gouhai.baoshan.service.business.dqgz.zb.head.ZcdygkbtService;
import com.gouhai.baoshan.utils.DownloadFile;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Controller
@RequestMapping(value = "/zcdygk")
public class ZcdygkController extends BusinessFormController {
	@Autowired
	private ZcdygkService zcdygkService;
	@Autowired
	private ZcdygkbtService service;

	public ZcdygkController() {
		super("Zcdygk");
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);

		binder.registerCustomEditor(Date.class, "csny", new CustomDateEditor(
				dateFormat, true));
	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/zcdygk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Zcdygk zcdygkmc = service.findOne(businessForm);
		if (zcdygkmc == null) {
			zcdygkmc = new Zcdygk();
			zcdygkmc.setZsdy("0");
			zcdygkmc.setBusinessForm(businessForm);
			service.insert(zcdygkmc);
		}
		model.addAttribute("zcdy", zcdygkmc);
		model.addAllAttributes(pageResult(
				zcdygkService.getZcdygkList(zcdygkmc, current),
				zcdygkService.getZcdygkCount(zcdygkmc), current));
		return "/business/zcdygk/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}/{zcdygkbtid}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId,
			@PathVariable() String zcdygkbtid) {
		return "/business/zcdygk/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Zcdygkbt zcdygk, String businessFormId, String zcdygkbtid) {
		zcdygk.setZcdygk(new Zcdygk(zcdygkbtid));
		zcdygkService.insert(zcdygk);
		updateBusinessForm(businessFormId);// 更新业务表
		return "redirect:/zcdygk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		 zcdygkService.delete(id);
		updateBusinessForm(businessFormId);// 更新业务表
		return "redirect:/zcdygk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/update/{id}/{businessFormId}/{zcdygkbtid}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId,
			@PathVariable() String zcdygkbtid) {
		model.addAttribute("zcdygk", zcdygkService.findOne(id));
		return "/business/zcdygk/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Zcdygkbt zcdygk, String businessFormId,
			String zcdygkbtid) {
		zcdygkService.update(zcdygk, zcdygkbtid);
		updateBusinessForm(businessFormId);// 更新业务表
		return "redirect:/zcdygk/item/1/" + businessFormId;
	}

	// 修改头部
	@RequestMapping(value = "/item/head/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdateHead(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("zcdy", service.findOne(id));
		return "/business/zcdygk/item/head/update";
	}

	@RequestMapping(value = "/item/head/update", method = RequestMethod.POST)
	public String updateHead(Zcdygk t, String businessFormId) {
		Zcdygk d = service.findOne(t.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			updateBusinessForm(businessFormId);// 更新业务表
			d.setJzsj(t.getJzsj());
			d.setDyzs(t.getDyzs());
			d.setZsdy(t.getZsdy());
			d.setYbdy(t.getYbdy());
			d.setTx(t.getTx());
			d.setZz(t.getZz());
			d.setNdy(t.getNdy());
			d.setNvdy(t.getNvdy());
			d.setEw(t.getEw());
			d.setWs(t.getWs());
			d.setWj(t.getWj());
			d.setLj(t.getLj());
			d.setBs(t.getBs());
			d.setBsys(t.getBsys());
			d.setCz(t.getCz());
			d.setGz(t.getGz());
			d.setDx(t.getDx());
			d.setKndy(t.getKndy());
			service.update(d);
		}

		return "redirect:/zcdygk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		if (!SecurityUtils.getSubject().isPermitted("zcdygk:check")) {
			return "/error/unauthority";
		}
		return "redirect:/zcdygk/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		if (!SecurityUtils.getSubject().isPermitted("zcdygk:check")) {
			return "/error/unauthority";
		}

		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Zcdygk zcdygkmc = service.findOne(businessForm);
		model.addAttribute("zcdy", zcdygkmc);
		model.addAllAttributes(pageResult(
				zcdygkService.getZcdygkList(zcdygkmc, current),
				zcdygkService.getZcdygkCount(zcdygkmc), current));
		return "/business/zcdygk/check";
	}

	/**
	 * 保存文件
	 * 
	 * @param t
	 * @param businessFormId
	 * @return
	 */
	@RequestMapping(value = "/item/savefile", method = RequestMethod.POST)
	public String saveFile(
			@RequestParam(value = "excel", required = false) MultipartFile[] excel,
			HttpServletRequest request, String businessFormId, String zcdyid) {
		String path = "C:\\filesFolderUpload\\excel\\";
		String str[] = DownloadFile.SavaFile(excel, request, path);
		// 取得上传文件的路径
		path += str[0];
		insertData(path, zcdygkService, zcdyid);
		return "redirect:/zcdygk/item/1/" + businessFormId;
	}

	public static void insertData(String path, ZcdygkService zcdygkService,
			String prid) {
		try {
			Zcdygkbt zcdygk = null;
			// 创建对Excel工作簿文件的引用­
			HSSFWorkbook wookbook = new HSSFWorkbook(new FileInputStream(path));
			// 在Excel文档中，第一张工作表的缺省索引是0
			// 其语句为：HSSFSheet sheet = workbook.getSheetAt(0);­
			// HSSFSheet sheet = wookbook.getSheet("Sheet1");
			HSSFSheet sheet = wookbook.getSheetAt(0);
			// 获取到Excel文件中的所有行数­
			int rows = sheet.getPhysicalNumberOfRows();
			// 遍历行
			for (int i = 0; i < rows; i++) {
				// 读取左上端单元格­
				HSSFRow row = sheet.getRow(i + 1);
				// 行不为空­
				System.out.println(row.getCell(0).toString().length());
				if (row.getCell(0).toString().length() == 0) {
					return;
				}
				if (row != null) {
					// 获取到Excel文件中的所有的列­
					int cells = row.getPhysicalNumberOfCells();
					String value = "";
					// 遍历列­
					for (int j = 0; j < cells; j++) {
						// 获取到列的值­
						HSSFCell cell = row.getCell(j);
						if (cell != null && !cell.equals("")) {
							switch (cell.getCellType()) {
							case HSSFCell.CELL_TYPE_FORMULA:
								break;
							case HSSFCell.CELL_TYPE_NUMERIC:
								value += cell.getNumericCellValue() + ",";
								break;
							case HSSFCell.CELL_TYPE_STRING:
								value += cell.getStringCellValue() + ",";
								break;
							default:
								value += "null" + ",";
								break;
							}
						}
					}
					if (value != null) {
						// 将数据插入到mysql数据库中­
						String[] val = value.split(",");
						// for (int k = 0; k < val.length; k++) {
						// // excel是以1990年为基数的，而java中的date是以1970年为基数的。所以要扣除差
						// 25569天
						// String date= val[2].substring(0, val[2].length() -
						// 2);
						// Date d = new Date((Long.valueOf(date.trim()) - 25569)
						// *
						// 24 * 3600 * 1000);
						// DateFormat formater = new
						// SimpleDateFormat("yyyy-MM-dd");
						// date = "'" + formater.format(d) + "'";
						// System.out.println(date);
						// }
						DateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
						zcdygk = new Zcdygkbt();
						zcdygk.setZcdygk(new Zcdygk(prid));
						zcdygk.setXm(val[0]);
						zcdygk.setXb(val[1]);
						String date = val[2].substring(0, val[2].length() - 2);
						Date d = new Date(
								(Long.valueOf(date.trim()) - 25569) * 24 * 3600 * 1000);
						zcdygk.setCsny(d);
						zcdygk.setIdcard(val[3]);
						zcdygk.setWhcd(val[4]);
						zcdygk.setJtzz(val[5]);
						date = val[6].substring(0, val[6].length() - 2);
						d = new Date(
								(Long.valueOf(date.trim()) - 25569) * 24 * 3600 * 1000);
						zcdygk.setRdny(formater.format(d));
						zcdygk.setPhone(val[7].toString());
						zcdygk.setBz(val[8]);
						zcdygkService.insert(zcdygk);
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			File file = new File(path);
			if (file.isFile()) {
				file.delete();
			}
		}
	}
}
