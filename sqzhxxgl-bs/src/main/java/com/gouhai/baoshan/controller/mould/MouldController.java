package com.gouhai.baoshan.controller.mould;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.Zip;
import org.apache.tools.ant.types.FileSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.Business;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.mould.Mould;
import com.gouhai.baoshan.entity.mould.Mould_Gather;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.service.business.BusinessFormService;
import com.gouhai.baoshan.service.business.ExportService;
import com.gouhai.baoshan.service.mould.MouldService;
import com.gouhai.baoshan.service.user.UserService;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.ClientDocUtil;
import com.gouhai.baoshan.utils.DateTimeUtil;
import com.gouhai.baoshan.utils.UploadFile;
import com.gouhai.baoshan.utils.Utils;

/**
 * 
 * @author 徐舟
 * 
 *         2014-9-30
 */
@Controller
@RequestMapping(value = "/mould")
public class MouldController extends PageableController {
	@Autowired
	private MouldService mouldService;
	@Autowired
	private BusinessFormService businessFormService; // 添加表单
	@Autowired
	protected ExportService exportService;// 公用导出方法
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/list/", method = RequestMethod.GET)
	public String toIndex() {

		return "redirect:/mould/list/1";
	}

	@RequestMapping(value = "/list/{current}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current) {
		model.addAllAttributes(pageResult(mouldService.getObjList(current),
				mouldService.getObjCount(), current));
		return "/mould/index";
	}

	// 模板导出
	@RequestMapping(value = "/mblist/", method = RequestMethod.GET)
	public String MbtoIndex() {

		return "redirect:/mould/mblist/1";
	}

	// 模板导出
	@RequestMapping(value = "/mblist/{current}", method = RequestMethod.GET)
	public String Mbindex(Model model, @PathVariable() int current) {
		model.addAllAttributes(pageResult(mouldService.getObjList(current),
				mouldService.getObjCount(), current));
		return "/mould/mbselect";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String toAdd() {
		return "/mould/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Mould news, String code) {
		mouldService.insert(news, code);
		return "redirect:/mould/list/1";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable String id) {
		mouldService.delete(id);
		return "redirect:/mould/list/1";
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id) {
		Mould mould = mouldService.findOne(id);
		List<Mould_Gather> list = mouldService.getGathers(mould);
		String code = "";
		for (int i = 0; i < list.size(); i++) {
			code += list.get(i).getBusiness().getId() + "%";
		}
		model.addAttribute("mould_gather", code);
		model.addAttribute("mould", mould);
		return "/mould/update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Mould news1, String code) {
		Mould findNews = mouldService.findOne(news1.getId());
		if (findNews != null) {
			findNews.setDepartment(news1.getDepartment());
			findNews.setMould_name(news1.getMould_name());
			mouldService.update(findNews, code);
		}
		return "redirect:/mould/list/1";
	}

	// 选择模板
	@RequestMapping(value = "/select/{current}", method = RequestMethod.GET)
	public String select(Model model, @PathVariable() int current) {
		model.addAllAttributes(pageResult(mouldService.getObjList(current),
				mouldService.getObjCount(), current));
		return "/mould/mbselect";
	}
	
	@RequestMapping(value = "/down", method = RequestMethod.POST)
	public void downdoc(Model model, HttpSession session,HttpServletResponse response,HttpServletRequest request, 
			@RequestParam String mouldid, @RequestParam String startdate, 
			@RequestParam String enddate){
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
		List<BaseEntity> list = exportService.getObjList(businessForm, code,null);
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

	public String ysZip(String zipName, String filepath) {
		Project pj = new Project();
		Zip zip = new Zip();
		zip.setProject(pj);
		// zip.setBasedir(new File("C:/"+zipName+".zip"));
		zip.setZipfile(new File("C:/" + zipName + ".zip"));
		FileSet fileSet = new FileSet();
		fileSet.setProject(pj);
		File file = new File(filepath);
		File[] subFiles = file.listFiles();
		if (subFiles != null) {
			for (int i = 0; i < subFiles.length; i++) {
				try {
					subFiles[i] = new File(new String(subFiles[i].getName()
							.getBytes("iso-8859-1"), "GBK"));
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			fileSet.setDir(file);// 需要打包的路径
			// fileSet.setIncludes("*.doc");// 文件过滤 只 包含所有.doc文件
			zip.setEncoding("GBK");
			zip.addFileset(fileSet);
			zip.execute();
			return "成功";
		}
		return "失败";
	}
}
