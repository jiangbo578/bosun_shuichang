package com.gouhai.baoshan.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class UploadFile {
	
	//取文件名
	public static String getFileName(String str){
		String fileName="";
		if(str.indexOf(".")>-1){
			fileName = str.substring(0,str.lastIndexOf("."));
		}
		return fileName;
	}
	public static List<String> getList(String localRoot) throws Exception {
		 List<String> list =new ArrayList<String>();
		 File[] fs = new File(localRoot).listFiles();
		  if ((fs == null) || (fs.length <= 0)) {
		   //System.out.println("空文件夹");
		   return null;
		  }
		  for (File f : fs) {
		   if (f.isFile()) 
			   if(getFileType(f.getName()).equals("doc")){
				//  System.out.println("文件:"+ f.getName());
				  list.add(localRoot+"\\"+f.getName());   
			   }
			   
		
		   }
		  return list;
		  }
	//取文件类型
	public static String getFileType(String fileName) {
	    String[] split = fileName.split("\\.");
	    String extendFile = split[(split.length - 1)].toLowerCase();
	    return extendFile;
	}
	
	/**
	 * 保存上传文件
	 * @param upload File 上传的临时文件
	 * @param uploadName String 上传的临时文件名称
	 * @return 相对路径+物理文件名
	 */
	public static String saveFile(File upload,String uploadName,String saveFileUrl) {
		String saveFileName="";
		String xdPath = "";	//相对路径
		if (upload != null){
			saveFileUrl = (saveFileUrl==null?Utils.getBundelPath("upload", "uploadPath"):saveFileUrl);
			//取出保存后的文件名
			saveFileName = Utils.generID()+uploadName.substring(uploadName.lastIndexOf("."));
			//最终保存的物理路径，按照年月为目录创建
			xdPath = Utils.FormatDate(new Date(), "yyyyMM");
			saveFileUrl = saveFileUrl + "\\" + xdPath;
			File savefile = new File(new File(saveFileUrl),saveFileName);
			if (!savefile.getParentFile().exists())
				savefile.getParentFile().mkdirs();
			try {
				FileUtils.copyFile(upload, savefile);
			} catch (IOException e) {
				e.printStackTrace();
			}
//			System.out.println("物理路径：" + saveFileUrl + "\\" + saveFileName);
//			System.out.println("相对路径："+xdPath + "\\" + saveFileName);
		/*	boolean success = CompressPic.compressImg(saveFileUrl + "\\" + saveFileName, saveFileUrl + "\\" + saveFileName+"________."+getFileType(saveFileName));
			if(success){
				saveFileName = saveFileName+"________."+getFileType(saveFileName);
			}*/
		}
		//System.err.println(xdPath + "\\" + saveFileName);
		return xdPath + "\\" + saveFileName;
	}
	
}
