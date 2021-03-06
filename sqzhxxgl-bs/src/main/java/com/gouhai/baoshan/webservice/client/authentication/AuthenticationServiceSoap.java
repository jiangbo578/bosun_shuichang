package com.gouhai.baoshan.webservice.client.authentication;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-09-24T09:43:17.829+08:00
 * Generated source version: 3.0.1
 * 
 */
@WebService(targetNamespace = "http://wsaf.wicresoft.com/", name = "AuthenticationServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface AuthenticationServiceSoap {

    /**
     * 楠岃瘉鐢ㄦ埛鍚嶅笎鍙凤紝閫氳繃鍒欒繑鍥炵敤鎴稩D锛屾湭閫氳繃鍒欒繑鍥濭uid.Empty('00000000-0000-0000-0000-000000000000')
     */
    @WebResult(name = "CheckUserPasswordResult", targetNamespace = "http://wsaf.wicresoft.com/")
    @RequestWrapper(localName = "CheckUserPassword", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.authentication.CheckUserPassword")
    @WebMethod(operationName = "CheckUserPassword", action = "http://wsaf.wicresoft.com/CheckUserPassword")
    @ResponseWrapper(localName = "CheckUserPasswordResponse", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.authentication.CheckUserPasswordResponse")
    public java.lang.String checkUserPassword(
        @WebParam(name = "UserName", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String userName,
        @WebParam(name = "Password", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String password
    );

    /**
     * 瀵筓serID杩涜瑙ｅ瘑鎿嶄綔 
     */
    @WebResult(name = "DecryptUserIDResult", targetNamespace = "http://wsaf.wicresoft.com/")
    @RequestWrapper(localName = "DecryptUserID", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.authentication.DecryptUserID")
    @WebMethod(operationName = "DecryptUserID", action = "http://wsaf.wicresoft.com/DecryptUserID")
    @ResponseWrapper(localName = "DecryptUserIDResponse", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.authentication.DecryptUserIDResponse")
    public java.lang.String decryptUserID(
        @WebParam(name = "EncryptUserID", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String encryptUserID,
        @WebParam(name = "ApplicationID", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String applicationID
    );
}
