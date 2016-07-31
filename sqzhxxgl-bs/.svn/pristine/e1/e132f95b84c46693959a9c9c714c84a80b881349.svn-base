package com.gouhai.baoshan.controller.mould;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.gouhai.baoshan.entity.mould.Demo;
import com.gouhai.baoshan.service.mould.DemoService;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.DownloadFile;

@Controller
@RequestMapping(value = "/demo")
public class DemoController extends PageableController {
	@Autowired
	private DemoService demoService;
	private String path = "C:\\filesFolderUpload\\file\\";

	@RequestMapping(value = "/list/{current}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current) {
		model.addAllAttributes(pageResult(demoService.getObjList(current),
				demoService.getObjCount(), current));
		return "/demo/index";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String toAdd() {
		return "/demo/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(
			@RequestParam(value = "yz", required = false) MultipartFile[] yz,
			HttpServletRequest request, Demo demo) {
		String str[] = DownloadFile.SavaFile(yz, request, path);
		demo.setPath(str[0]);
		demoService.insert(demo);
		return "redirect:/demo/list/1";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable String id) {
		Demo demo = demoService.findOne(id);
		deleteFile(path + demo.getPath());
		demoService.delete(demo);
		return "redirect:/demo/list/1";
	}

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
}
