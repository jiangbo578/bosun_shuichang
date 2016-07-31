package com.gouhai.baoshan.controller;
/**
 * @author sun 2014-09-19
 * 单点登录
 */
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.entity.log.UserLoginLog;
import com.gouhai.baoshan.entity.user.Role;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.service.log.UserLoginLogService;
import com.gouhai.baoshan.service.user.UserService;
import com.gouhai.baoshan.utils.CollectionUtils;
import com.gouhai.baoshan.utils.IpUtil;
import com.gouhai.baoshan.utils.XmlUtil;
import com.gouhai.baoshan.webservice.client.authentication.AuthenticationService;
import com.gouhai.baoshan.webservice.client.authentication.AuthenticationServiceSoap;
import com.gouhai.baoshan.webservice.client.organization.OrganizationService;
import com.gouhai.baoshan.webservice.client.organization.OrganizationServiceSoap;

@Controller
@RequestMapping(value = "/service")
public class WebserviceController
{
	private static final Logger logger = Logger.getLogger(WebserviceController.class);
	private static final String applicationID = "0d4872c7-90d4-40ed-94ab-5102c8c1fcfc";//应用ID
	private static final URL wsdlURL = AuthenticationService.WSDL_LOCATION;
	private static final QName SERVICE_NAME = new QName("http://wsaf.wicresoft.com/DecryptUserID/", "AuthenticationService");
	private static final QName ORGANZATION_SERVICE_NAME = new QName("http://wsaf.wicresoft.com/", "AuthenticationService");
	@Autowired
	private UserService userService;
	@Autowired
	private UserLoginLogService userLoginLogService;
	
	@RequestMapping(value = "/auto", method = RequestMethod.GET)
	public String auto(Model model, HttpSession session, HttpServletRequest request) {
		return "/account/auto";
	}
	// 登录验证
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String login(Model model, HttpSession session, HttpServletRequest request) {
		
		/**
		 * 测试cookie
		 */
		//1. 请求 获取cookie中的UserID
		Cookie cookie = getCookieByName(request,"User");
		String encryptUserID = "";//获取到加密的用户ID
		if(cookie==null){ //测试
			encryptUserID =request.getParameter("User");
			//	encryptUserID ="mwS4aeVxva0jM39q7ICjCPIXLjni7NBjZ8BlJS3hcs+gZwOiRxx8YV1GzJgyRqkUVHhbKTki75Frury849mxQog2tVpjR6eSzjHhdyEPFkvp14SPUY9nt+1AK+73bRUVL3TDqQQjVkJ9l+lV9hV0imiXypdzbjLNuSxuSdbWQFaFsgmehYAOYqDqqozPPiYQHDlYuqjudD93p4uRRugVTXYpXQv0G8VovP+8LAbs4sXTXRXoqQtOIrWTWkH3/tWuRGqnOCCUJOt4xsns65+fwG0WC74mL2w4B5q0+kqQMipqwH5cldS6mkYU857rUAUPR+uFEKyLICosF7HLQ5kialpVGrCiE3YBOzzJiFtlDv0xQuZ71sNVrMhJGuJA8ViGQR6kwAq8G51HdIdP6IE6vW5xyB6XB1Rst8XTE4DQOBJNKdCKAZStnEOPMu8uMobOVgpz6SAcHD19pnYKqMufb3ayoVP6Dd6SRQkuaKOO/b9/pJJLOJHQJL7ZhzUuB9/3C1uAqmwT/1Ogu5axwnT6OubdT0hFym8RYLmWhOx2EtutEfNTY6ZZX5w7in3fyb3rbHUiD0+jm9whfDaYAyLAbVJwSkhePGB1IH3c/SpVSZDqOSSFS8W3v3r/kRdJXnNSMKBMTpOCs9inytT4wCk943vv1d9K5ZECEZggDgFuOITNveeUgRqGk/YyeXDzXVnH";
			//System.out.println("......从参数获取....."+encryptUserID);
		}else{
			encryptUserID=cookie.getValue();
			//System.out.println("......从Cookie获取....."+encryptUserID);
		}
	

		if(encryptUserID !=null && !encryptUserID.equals(""))
		{
			
			 String url = "http://sso.jiading.gov.cn/Framework.WebService.Latest/AuthenticationService.asmx?wsdl"; // 在浏览器中打开url，可以找到
			// private String soapAction="http://WebXml.com.cn/getCountryCityByIp"
			 String namespace = "http://wsaf.wicresoft.com/";// targetNamespace
			 String actionURI = "DecryptUserID"; // Action路径
			 String op = "DecryptUserID"; // 要调用的方法名
			 Service service = new Service();
				try {
					String uuid = "0d4872c7-90d4-40ed-94ab-5102c8c1fcfc";
					Call call = (Call) service.createCall();
					call.setTargetEndpointAddress(new java.net.URL(url));
					call.setUseSOAPAction(true);
					// action uri
					call.setSOAPActionURI(namespace + actionURI);
				
					// 设置要调用哪个方法
					call.setOperationName(new QName(namespace, op));
					// 设置参数名称，具体参照从浏览器中看到的
					call.addParameter(new QName(namespace, "EncryptUserID"),
						XMLType.XSD_STRING, ParameterMode.IN); // 要返回的数据类型
		             	call.addParameter(new QName(namespace, "ApplicationID"),       
						XMLType.XSD_STRING, ParameterMode.IN); // 要返回的数据类型    
		             	call.setReturnType( XMLType.XSD_STRING); // 入参：对应theIpAddress
					Object[] params = new Object[] { encryptUserID,uuid }; // 调用方法并传递参数
					encryptUserID = (String) call.invoke(params);//
					
					
					
					
					System.out.println(encryptUserID);
					//getUserId(userid);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				//===============================================解密
				url = "http://sso.jiading.gov.cn/Framework.WebService.Latest/OrganizationService.asmx?wsdl"; // 在浏览器中打开url，可以找到
				namespace = "http://wsaf.wicresoft.com/";// targetNamespace
				actionURI = "GetUserInfoByID"; // Action路径
				op = "GetUserInfoByID"; // 要调用的方法名
		
				
				 service = new Service();
				try {
					String para = "<value type='System.Guid'>"+encryptUserID+"</value>";//appilcation ID 
					Call call = (Call) service.createCall();
					call.setTargetEndpointAddress(new java.net.URL(url));
					call.setUseSOAPAction(true);
					// action uri
					call.setSOAPActionURI(namespace + actionURI);
					  
					// 设置要调用哪个方法
					call.setOperationName(new QName(namespace, op));
					// 设置参数名称，具体参照从浏览器中看到的
					call.addParameter(new QName(namespace, "userID"),
						XMLType.XSD_STRING, ParameterMode.IN); // 要返回的数据类型
		             
		             	call.setReturnType( XMLType.XSD_STRING); // 入参：对应theIpAddress
					Object[] params = new Object[] {para}; // 调用方法并传递参数
					String userinfo = (String) call.invoke(params);//
					encryptUserID =readStringName(userinfo);//解析出来
					//getUserId(userid);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				
				
			//========================================================================================解密结束	
		
		//	encryptUserID="55911122-7931-4bd3-ba0e-122b5f0785ae";
			if(null!=encryptUserID)
			{
				
			
					User user = (User) userService.getServiceUser(encryptUserID);//decryptUserID
					System.out.println("......获取到加密的用户....."+encryptUserID);
					if (null == user) {
						System.out.println("用户没有查询到啊");
						return "/account/login"; 
					}else{
						session.setAttribute("userId", user.getId());// 保存用户ID session
						session.setAttribute("userRealName", user.getRealName());// 保存用户名称 session
						session.setAttribute("userName", user.getUsername());
						session.setAttribute("pass", user.getPassword());
						System.out.println("开始登陆");
						return "/account/autologin";
					}
		}else{
			 logger.info("......用户没有登录.....");
			 return "/account/login";
		}
	
	}
		return "/account/login";
	}

	
	public UserService getUserService() {
		return userService;
	}
	public  String readStringName(String xmls) {
		Document doc = null;
		String temp="";
		try {
			doc = DocumentHelper.parseText(xmls);
		} catch (DocumentException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} 
	       Element rootElt = doc.getRootElement(); 
	       Element e = (Element) rootElt.elements().get(0); //获取节点
	 	    List list1 =e.elements();//获取下面所有节点

	    for (int i = 0, size = list1.size(); i < size; i++) { 
	    	  Element e1 = (Element) list1.get(i);  
	    	  if(e1.attributeValue("name").equals("Name")){//如果是名字
	    		  temp = e1.getText();
	    	  }
	    	  
	    }
	    return temp;
}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}



	public UserLoginLogService getUserLoginLogService() {
		return userLoginLogService;
	}



	public void setUserLoginLogService(UserLoginLogService userLoginLogService) {
		this.userLoginLogService = userLoginLogService;
	}



	/**
	 * 读取cookie 2014-09-19 sun 
	 * @param request
	 * @param name
	 * @return
	 */
	public  Cookie getCookieByName(HttpServletRequest request,String name){
		 Cookie[] cookies = request.getCookies();
		 if(null!=cookies){
		        for(Cookie cookie : cookies){
		            	if(cookie.getName()!=null && cookie.getName().equals(name))
		            	{
		            		return cookie;
		            	}
		           }
		    }
		
		 return null;
	}
	/**
	 * 用户拥有的角色id字符串, 多个角色id用','分隔.
	 * 
	 * @param roles
	 * @return
	 */
	private String getRoleIds(List<Role> roles) {
		return CollectionUtils.fetchPropertyToString(roles, "name", ",");
	}
	private String getRoleIdsByCode(List<Role> roles) {
		return CollectionUtils.fetchPropertyToString(roles, "code", ",");
	}
	public static void main(String[] args)
	{
		
		
		 SAXReader saxReader = new SAXReader();
         try
		{
			Document document = saxReader.read("src/main/resources/test.xml");
			
			List<Element> eles = document.getRootElement().element("properties").elements("property");
			
			for(Element e : eles)
			{
				if(e.attributeValue("name").equals("ID"))
				{
					System.out.println(e.getText());
					System.out.println(e.getText().equals(null));
					break;
				}
			}
			
		} catch (DocumentException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
