package com.gouhai.baoshan.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 * 文件下载
 * 
 * @author 徐舟
 * 
 *         2014-9-18
 */
@Controller
public class DownloadFile {
	@RequestMapping("/download/{fileName}")
	public ModelAndView download(@PathVariable("fileName") String fileName,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		fileName = fileName.replace("|", ".");
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		String path = "C:\\filesFolderUpload\\file\\";
		String downLoadPath = path + fileName;
		try {
			long fileLength = new File(downLoadPath).length();
			response.setContentType("application/x-msdownload;");
			response.setHeader("Content-Disposition", "attachment; filename=" + java.net.URLEncoder.encode(fileName, "UTF-8"));  
			response.setHeader("Content-Length", String.valueOf(fileLength));
			bis = new BufferedInputStream(new FileInputStream(downLoadPath));
			bos = new BufferedOutputStream(response.getOutputStream());
			byte[] buff = new byte[2048];
			int bytesRead;
			while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
				bos.write(buff, 0, bytesRead);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bis != null)
				bis.close();
			if (bos != null)
				bos.close();
		}
		return null;
	}

	public static String[] SavaFile(MultipartFile[] zzqfile,HttpServletRequest request,String path) {
		String fileName = null;
		String str[] = new String[2];
		
		for (int i = 0; i < zzqfile.length; i++) {
			fileName = zzqfile[i].getOriginalFilename();
			if (fileName != null && !fileName.equals("")) {
			//	fileName = Pringying.converterToFirstSpell(fileName);
				File targetFile = new File(path, fileName);
				str[i] = fileName;
				if (!targetFile.exists()) {
					targetFile.mkdirs();
				}
				try {
					zzqfile[i].transferTo(targetFile);
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return str;
	}
}
