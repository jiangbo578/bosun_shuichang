package com.gouhai.baoshan.controller.publics;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


import com.gouhai.baoshan.entity.publics.News;
import com.gouhai.baoshan.entity.publics.Upfiles;



import com.gouhai.baoshan.service.publics.FileService;
import com.gouhai.baoshan.service.publics.NewsService;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.UploadFile;
import com.gouhai.baoshan.utils.Utils;

/**
 * shan
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value = "/file")
public class FileController extends PageableController {
	@Autowired
	private NewsService newsService;
	
	@Autowired
	private FileService fileService;
	@RequestMapping(value = "/list/", method = RequestMethod.GET)
	public String toIndex() {
	/*	if(!SecurityUtils.getSubject().isPermitted("news:list")){
			return "/error/unauthority";
		}*/
	
		return "redirect:/bdedit";
	}
	
	@RequestMapping(value = "/upload")  
    public String upload(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request,HttpServletResponse response, ModelMap model) throws IOException {  
  
        //System.out.println("开始");  
		PrintWriter out = response.getWriter();
		//获取服务器配置上传的路径
        String path = com.gouhai.baoshan.utils.Utils.getBundelPath("upload", "uploadPath"); 
        
        //原始的文件名
        String fileName = file.getOriginalFilename();  
        //处理一下文件名
        fileName = Utils.generID()+fileName.substring(fileName.lastIndexOf("."));
        //
        String xdPath = Utils.FormatDate(new Date(), "yyyyMM");
    	path = path + "\\" + xdPath;
        
    	Upfiles  bean= new Upfiles();
    	bean.setFileName(xdPath+"\\"+fileName);
    	bean.setFileType(UploadFile.getFileType(fileName));
		bean.setFilePath(path);
		bean.setApplyId(Utils.generID());
		bean.setShareDate(Utils.FormatDate(new Date(), "yyyy-MM-dd"));
		fileService.insert(bean);//保存文件
	
//      String fileName = new Date().getTime()+".jpg";  
        //System.out.println("上传的文件"+xdPath+fileName);
        //开始保存文件
        File targetFile = new File(path, fileName);  
        if(!targetFile.exists()){  
            targetFile.mkdirs();  
        }  
  
        //保存  
        try {  
            file.transferTo(targetFile);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
     
    	String json = "{'url':'" + "/file/down/" + bean.getApplyId()
		+ "','fileType':'" + bean.getFileType()
		+ "','state':'SUCCESS','original':'" +  bean.getFileType()
		+ "','title':''}";
//System.out.println(json);
    	out.print(json);
    		out.flush();
        return null;  
    }  
	
	@RequestMapping(value = "/down/{id}", method = RequestMethod.GET)
	public String  down(@PathVariable String id, HttpServletRequest request,HttpServletResponse response) throws IOException {
	
		
		Upfiles   fileup =  fileService.findByAppid(id);
		String path = Utils.getBundelPath("upload", "uploadPath") + "\\" + fileup.getFileName();
		

        File file = new File(path);

        //判断文件是否存在如果不存在就返回默认图标
      
        
        FileInputStream inputStream = new FileInputStream(file);
        byte[] data = new byte[(int)file.length()];
        int length = inputStream.read(data);
        inputStream.close();

        response.setContentType("image/png");

        OutputStream stream = response.getOutputStream();
        stream.write(data);
        stream.flush();
        stream.close();
		return null;


		
		
		/*System.err.println();
		Upfiles   fileup =  fileService.findByAppid(id);
		InputStream input = null;
		try {
			//取服务器物理路径
			String path = Utils.getBundelPath("upload", "uploadPath") + "\\" + fileup.getFileName();
			//this.downLoadName = new String (fileup.getFileName().getBytes("gbk"),"ISO8859-1") + "." +fileup.getFileType();
			System.out.println(path);
			input = new FileInputStream(path);
		} catch (Exception e) {
			e.getStackTrace();
		}
	
		System.out.println(input);
		return input;*/
	}
	
	
	@RequestMapping(value = "/upfile", method = RequestMethod.GET)
	public String index(HttpServletResponse response,File upfile,String upfileContentType,String upfileFileName,Model model) throws IOException {
	
		System.out.println("================================"+upfileFileName);
		PrintWriter out = response.getWriter();
		
		String json = "err";
		if (upfile != null) {
			String filePath = com.gouhai.baoshan.utils.UploadFile.saveFile(upfile, upfileFileName,com.gouhai.baoshan.utils.Utils.getBundelPath("upload", "uploadPath"));
			// 保存文件信息
			Upfiles  bean= new Upfiles();
	
			bean.setFileName(com.gouhai.baoshan.utils.UploadFile.getFileName(upfileFileName));
			//bean.setFileType(com.gouhai.baoshan.utils.UploadFssile.getFileType(upfileFileName));
			//bean.setFilePath(filePath);
			//bean.setUserId(user.getId());
			//bean.setUserName(user.getUserName());
			//bean.setShareDate(Utils.FormatDate(new Date(), "yyyy-MM-dd"));
			fileService.insert(bean);
	/*		json = "{'url':'" + "/file/fileDownload.do?id=" + bean.getId()
					+ "','fileType':'" + this.upfileFileName
					+ "','state':'SUCCESS','original':'" + this.upfileFileName
					+ "','title':''}";*/
		}
		out.print(json);
		out.flush();
		return null;
	}
	@RequestMapping(value="/add",method= RequestMethod.GET)
	public String toAdd(){
		if(!SecurityUtils.getSubject().isPermitted("news:list")){
			return "/error/unauthority";
		}
		return "/publics/news/add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(News news) {
		if(!SecurityUtils.getSubject().isPermitted("news:list")){
			return "/error/unauthority";
		}
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		news.setAdddate(df.format(new Date()));
		newsService.insert(news);
		return "redirect:/news/list/1";
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable String id){
		if(!SecurityUtils.getSubject().isPermitted("news:list")){
			return "/error/unauthority";
		}
		newsService.delete(id);
		return "redirect:/news/list/1";
	}
	
	
	@RequestMapping(value="/update/{id}",method= RequestMethod.GET)
	public String toUpdate(Model model,@PathVariable String id){
		if(!SecurityUtils.getSubject().isPermitted("news:list")){
			return "/error/unauthority";
		}
		model.addAttribute("news",newsService.findOne(id));
		return "/publics/news/update";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(News news1) {
		if(!SecurityUtils.getSubject().isPermitted("news:list")){
			return "/error/unauthority";
		}
		News findNews = newsService.findOne(news1.getId());
		if (findNews != null) {
			findNews.setTexts(news1.getTexts());
			findNews.setTitles(news1.getTitles());
			newsService.update(findNews);
		}
		return "redirect:/news/list/1";
	}
	
	@RequestMapping(value="/detail/{id}",method= RequestMethod.GET)
	public String detail(Model model,@PathVariable String id){
	
		model.addAttribute("news",newsService.findOne(id));
		return "/publics/news/detail";
	}
	
	
	@RequestMapping(value="/listpage/{current}",method= RequestMethod.GET)
	public String list(Model model, @PathVariable() int current){
		model.addAllAttributes(pageResult(newsService.getNewsList(current),newsService.getNewsCount(), current));
		return "/publics/news/listpage";
	}

}
