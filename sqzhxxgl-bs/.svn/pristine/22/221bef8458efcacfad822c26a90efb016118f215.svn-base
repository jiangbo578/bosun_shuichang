/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.publics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.service.business.BusinessFormService;
import com.gouhai.baoshan.service.business.ExportService;
import com.gouhai.baoshan.service.user.UserService;
import com.gouhai.baoshan.utils.ClientDocUtil;
import com.gouhai.baoshan.utils.DateTimeUtil;
import com.gouhai.baoshan.utils.UploadFile;
import com.gouhai.baoshan.utils.Utils;

@Controller
@RequestMapping(value = "/world")
public class WorldController  {
	@Autowired
	private BusinessFormService businessFormService; //添加表单
	@Autowired
	protected ExportService exportService;//公用导出方法
	@Autowired
	private UserService userService;
	private String hylb;
	public WorldController() {

	}
	
	
	@RequestMapping(value = "/test")
	public void test(Model model, HttpSession session,HttpServletResponse response,HttpServletRequest request){
		ServletContext  application  = session.getServletContext();    
		String serverRealPath = application.getRealPath("/WEB-INF/classes/doc/template/") ;
		System.out.println("服务器的路径:"+serverRealPath);
	}
	//导出Excel
	@RequestMapping(value = "/down", method = RequestMethod.POST)
	public void downdoc(Model model, HttpSession session,HttpServletResponse response,HttpServletRequest request, 
			@RequestParam String code, @RequestParam String startdate, 
			@RequestParam String enddate,@RequestParam String hylb){
		this.hylb=hylb;
	  //第一步获取他的  用户ID   
		System.out.println(hylb);
		//System.out.println("开始进来" );
		// startdate="2014-01-01";  //测试的时候 日期写死
		 //enddate="2014-11-28";//测试的时候 日期写死
		 System.out.println(code);
		 System.out.println(startdate);
		// String codesplit[]=code.split(","); //分割业务代码
		String path =Utils.getBundelPath("upload", "uploadPath");  //配置里面的路径
		String uuid =Utils.generID();
		String userId = request.getSession().getAttribute("userId").toString();
		ServletContext  application  = session.getServletContext();    
		String serverRealPath = application.getRealPath("/WEB-INF/classes/doc/template/") ;
	//开始查询  指定他的事件
	//System.out.println("开始进来" +uuid);

	User u =userService.findOne(userId);
	//开始查询===========================================================================
	List<BusinessForm> bform =businessFormService.getBusinessFormList(u, startdate, enddate);
	//String tset[]="dfszsyqk,kndyqk,pydzbgz,ndzzshgk,rdsqr".split(",");  //添加测试数据
	for(int i=0;i< bform.size() ;i++){  //临时测试 bform.size()  
		BusinessForm b =bform.get(i);
		//System.out.println(b.getName());
		//判断 有没要导出这个表的数据
		if(code.indexOf(b.getBusiness().getCode())!=-1){
			//还要判断 ftl  文件是否存在
			File file = new File(serverRealPath+"\\"+
					b.getBusiness().getCode().toLowerCase()+".ftl");
			if(file.exists()==true){
				//如果文件存在
			//	System.err.println("导出一盒");
				//System.out.println("服务器的路径:"+serverRealPath);
				b.getBusiness().setCode(b.getBusiness().getCode());
		    	Map<String,Object> dataMap = constructDataMap(b,b.getBusiness().getCode(),null);//组装word所需要的map数据
			   // System.out.println(dataMap.size());
			  if(dataMap!=null){
		    	exportdoc(b.getBusiness().getCode(),dataMap,b.getId(),uuid);//导出word
			  }
			}else{
				
				//System.err.println("文件不存在"+serverRealPath+"\\"+
					//	b.getBusiness().getCode().toLowerCase()+".ftl");
			}
		
		}else{
			
			//System.out.println("没有导出这个业务");
		}
		
	}
	 //所有文件导出完毕  下面开始拼接======================================================================
	
	try {
		  File file = new File(path+"\\downdoc\\");
		  //判断文件夹是否存在,如果不存在则创建文件夹
		  if (!file.exists()) {
		   file.mkdir();
		  }
		  
		ClientDocUtil.uniteDoc(UploadFile.getList(path+"\\downdoc\\temp\\"+uuid), path+"\\downdoc\\"+uuid+".doc");
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	//输出完成=======================================================================================
	File  file = new File(path+"\\downdoc\\temp\\"+uuid);
	File[]  files=file.listFiles();
	if(files!=null){
	for(int i=0;i<files.length;i++){
		//System.out.println("路径"+files[i].getAbsolutePath());
		deleteFile(files[i].getAbsolutePath());
	}
	}
  file.delete();
	 //删除文件
	response.reset();
	
	response.setCharacterEncoding("UTF-8");  

	response.setContentType("application/octet-stream; charset=UTF-8");
	response.setHeader("Content-Disposition", "attachment; filename="+
				DateTimeUtil.getDateToString(new Date(),DateTimeUtil.PATTERN_SHORT)+ ".doc");
	OutputStream stream= null;
		try {
			
			 file = new File( path+"\\downdoc\\"+uuid+".doc");
			 FileInputStream inputStream=null;
			if(file.exists()==false){
				   stream = response.getOutputStream();
			        stream.write("没有数据".getBytes());
			        stream.flush();
			        stream.close();
			}else{
				inputStream = new FileInputStream(file);
		        byte[] data = new byte[(int)file.length()];
		        inputStream.read(data);
		        inputStream.close();
		        stream = response.getOutputStream();
		        stream.write(data);
		        stream.flush();
		        stream.close();
			}
			
		    	
		        
		     
		} catch (IOException e) {
		
			e.printStackTrace();
		}finally{
	
		}

	}
	/**
	 * 导出word文档
	 * @author sun 2014-08-20
	 * @param ftlOfSuffixName(flt模版文件的前缀名称：如：a.flt文件的a)
	 * @param dataMap
	 * @param response
	 * @param fileName
	 * @throws IOException 
	 */
	protected void exportdoc(String ftlOfSuffixName,Map<String,Object> dataMap,String name,String uid )
	{
		//这里拼接的就是每个实体类对应的FTL文件
		try {
			new ClientDocUtil(ftlOfSuffixName.toLowerCase()+".ftl",0).setDataList(dataMap).exportDocument(name,uid,0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 用于导出word所需要的数据
	 * @param businessForm(业务表单)，entityName（要查询的Entity 字符串）,dataMap(封装的数据)
	 * @author sun 2014-08-20
	 * @return
	 */
	protected Map<String,Object> constructDataMap(BusinessForm businessForm,String entityName,Map<String,Object> dataMap){
		if(null == dataMap)
			dataMap = new HashMap<String,Object>();
		
		// moduleName 就是子类继承父类super传过来过来的编码，把首字母转换为大写就是实体类名
		String y= ((String) entityName.subSequence(0,1)).toUpperCase();
		String s = (String) entityName.subSequence(1, entityName.length());
	    String	code=y+s;
		//这里的泛型用的是所有类的父类。
		List<BaseEntity> list = exportService.getObjList(businessForm, code,hylb);
		for(int i = 1,j = list.size();i <= j;i++){
			list.get(i-1).setId(i+"");
			//System.out.println(list.get(i).getId());
		}
		if(list.size()==0){
			return  null;
	    /*	dataMap.put(entityName.toLowerCase(), list);
	    	dataMap.put("businessForm", businessForm);*/
		}else{
			dataMap.put(entityName.toLowerCase(), list);
	    	dataMap.put("businessForm", businessForm);
		}
	
		return dataMap;
	}
	//删除文件
    /**
     * 删除单个文件
     * @param   sPath    被删除文件的文件名
     * @return 单个文件删除成功返回true，否则返回false
     */
    public boolean deleteFile(String sPath) {
    	
     boolean   flag = false;
     File   file = new File(sPath);
        // 路径为文件且不为空则进行删除
        if (file.isFile() && file.exists()) {
            file.delete();
            flag = true;
        }
        return flag;
    }
}
