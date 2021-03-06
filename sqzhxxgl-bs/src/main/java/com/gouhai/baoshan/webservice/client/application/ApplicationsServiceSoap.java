package com.gouhai.baoshan.webservice.client.application;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-09-24T09:55:17.212+08:00
 * Generated source version: 3.0.1
 * 
 */
@WebService(targetNamespace = "http://wsaf.wicresoft.com/", name = "ApplicationsServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface ApplicationsServiceSoap {

    /**
     * 应用获取日志
     */
    @WebResult(name = "GetLogsResult", targetNamespace = "http://wsaf.wicresoft.com/")
    @RequestWrapper(localName = "GetLogs", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.GetLogs")
    @WebMethod(operationName = "GetLogs", action = "http://wsaf.wicresoft.com/GetLogs")
    @ResponseWrapper(localName = "GetLogsResponse", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.GetLogsResponse")
    public java.lang.String getLogs(
        @WebParam(name = "applicationID", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String applicationID
    );

    /**
     * 获取服务详细信息
     */
    @WebResult(name = "GetServiceInfoResult", targetNamespace = "http://wsaf.wicresoft.com/")
    @RequestWrapper(localName = "GetServiceInfo", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.GetServiceInfo")
    @WebMethod(operationName = "GetServiceInfo", action = "http://wsaf.wicresoft.com/GetServiceInfo")
    @ResponseWrapper(localName = "GetServiceInfoResponse", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.GetServiceInfoResponse")
    public java.lang.String getServiceInfo(
        @WebParam(name = "serviceID", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String serviceID
    );

    /**
     * 获取某个应用所有服务的列表
     */
    @WebResult(name = "GetServiceInfoListByApplicationResult", targetNamespace = "http://wsaf.wicresoft.com/")
    @RequestWrapper(localName = "GetServiceInfoListByApplication", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.GetServiceInfoListByApplication")
    @WebMethod(operationName = "GetServiceInfoListByApplication", action = "http://wsaf.wicresoft.com/GetServiceInfoListByApplication")
    @ResponseWrapper(localName = "GetServiceInfoListByApplicationResponse", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.GetServiceInfoListByApplicationResponse")
    public java.lang.String getServiceInfoListByApplication(
        @WebParam(name = "applicationID", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String applicationID
    );

    /**
     * 获取某一产品在系统中注册的所有实例
     */
    @WebResult(name = "GetApplicationInfoListByProductIDResult", targetNamespace = "http://wsaf.wicresoft.com/")
    @RequestWrapper(localName = "GetApplicationInfoListByProductID", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.GetApplicationInfoListByProductID")
    @WebMethod(operationName = "GetApplicationInfoListByProductID", action = "http://wsaf.wicresoft.com/GetApplicationInfoListByProductID")
    @ResponseWrapper(localName = "GetApplicationInfoListByProductIDResponse", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.GetApplicationInfoListByProductIDResponse")
    public java.lang.String getApplicationInfoListByProductID(
        @WebParam(name = "productID", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String productID
    );

    /**
     * 发送一个预先注册的事件
     */
    @WebResult(name = "SendEventResult", targetNamespace = "http://wsaf.wicresoft.com/")
    @RequestWrapper(localName = "SendEvent", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.SendEvent")
    @WebMethod(operationName = "SendEvent", action = "http://wsaf.wicresoft.com/SendEvent")
    @ResponseWrapper(localName = "SendEventResponse", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.SendEventResponse")
    public java.lang.String sendEvent(
        @WebParam(name = "applicationID", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String applicationID,
        @WebParam(name = "eventDefinitionID", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String eventDefinitionID,
        @WebParam(name = "eventData", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String eventData
    );

    /**
     * 验证应用合法性
     */
    @WebResult(name = "CheckApplicationResult", targetNamespace = "http://wsaf.wicresoft.com/")
    @RequestWrapper(localName = "CheckApplication", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.CheckApplication")
    @WebMethod(operationName = "CheckApplication", action = "http://wsaf.wicresoft.com/CheckApplication")
    @ResponseWrapper(localName = "CheckApplicationResponse", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.CheckApplicationResponse")
    public boolean checkApplication(
        @WebParam(name = "applicationID", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String applicationID
    );

    /**
     * 获取一段时间内应用接收到的事件
     */
    @WebResult(name = "GetEventInfoListByApplicationResult", targetNamespace = "http://wsaf.wicresoft.com/")
    @RequestWrapper(localName = "GetEventInfoListByApplication", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.GetEventInfoListByApplication")
    @WebMethod(operationName = "GetEventInfoListByApplication", action = "http://wsaf.wicresoft.com/GetEventInfoListByApplication")
    @ResponseWrapper(localName = "GetEventInfoListByApplicationResponse", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.GetEventInfoListByApplicationResponse")
    public java.lang.String getEventInfoListByApplication(
        @WebParam(name = "applicationID", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String applicationID,
        @WebParam(name = "beginTime", targetNamespace = "http://wsaf.wicresoft.com/")
        javax.xml.datatype.XMLGregorianCalendar beginTime,
        @WebParam(name = "endTime", targetNamespace = "http://wsaf.wicresoft.com/")
        javax.xml.datatype.XMLGregorianCalendar endTime
    );

    /**
     * 应用写入日志
     */
    @WebResult(name = "WriteLogResult", targetNamespace = "http://wsaf.wicresoft.com/")
    @RequestWrapper(localName = "WriteLog", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.WriteLog")
    @WebMethod(operationName = "WriteLog", action = "http://wsaf.wicresoft.com/WriteLog")
    @ResponseWrapper(localName = "WriteLogResponse", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.WriteLogResponse")
    public boolean writeLog(
        @WebParam(name = "applicationID", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String applicationID,
        @WebParam(name = "createTime", targetNamespace = "http://wsaf.wicresoft.com/")
        javax.xml.datatype.XMLGregorianCalendar createTime,
        @WebParam(name = "eventData", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String eventData,
        @WebParam(name = "userID", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String userID,
        @WebParam(name = "userName", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String userName,
        @WebParam(name = "eventID", targetNamespace = "http://wsaf.wicresoft.com/")
        int eventID,
        @WebParam(name = "category", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String category,
        @WebParam(name = "type", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String type
    );

    /**
     * 获取应用配置项（如果没有特别配置，会再去公共配置项中查找）
     */
    @WebResult(name = "GetApplicationConfigByKeyResult", targetNamespace = "http://wsaf.wicresoft.com/")
    @RequestWrapper(localName = "GetApplicationConfigByKey", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.GetApplicationConfigByKey")
    @WebMethod(operationName = "GetApplicationConfigByKey", action = "http://wsaf.wicresoft.com/GetApplicationConfigByKey")
    @ResponseWrapper(localName = "GetApplicationConfigByKeyResponse", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.GetApplicationConfigByKeyResponse")
    public java.lang.String getApplicationConfigByKey(
        @WebParam(name = "applicationID", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String applicationID,
        @WebParam(name = "key", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String key
    );

    /**
     * 应用搜索日志
     */
    @WebResult(name = "SearchLogsResult", targetNamespace = "http://wsaf.wicresoft.com/")
    @RequestWrapper(localName = "SearchLogs", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.SearchLogs")
    @WebMethod(operationName = "SearchLogs", action = "http://wsaf.wicresoft.com/SearchLogs")
    @ResponseWrapper(localName = "SearchLogsResponse", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.SearchLogsResponse")
    public java.lang.String searchLogs(
        @WebParam(name = "applicationID", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String applicationID,
        @WebParam(name = "conditionXml", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String conditionXml
    );

    /**
     * 获取应用具体信息
     */
    @WebResult(name = "GetApplicationInfoResult", targetNamespace = "http://wsaf.wicresoft.com/")
    @RequestWrapper(localName = "GetApplicationInfo", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.GetApplicationInfo")
    @WebMethod(operationName = "GetApplicationInfo", action = "http://wsaf.wicresoft.com/GetApplicationInfo")
    @ResponseWrapper(localName = "GetApplicationInfoResponse", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.GetApplicationInfoResponse")
    public java.lang.String getApplicationInfo(
        @WebParam(name = "applicationID", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String applicationID
    );

    /**
     * 获取应用配置项（包括所有公共配置项，除非被应用自己的配置项覆盖）
     */
    @WebResult(name = "GetApplicationConfigResult", targetNamespace = "http://wsaf.wicresoft.com/")
    @RequestWrapper(localName = "GetApplicationConfig", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.GetApplicationConfig")
    @WebMethod(operationName = "GetApplicationConfig", action = "http://wsaf.wicresoft.com/GetApplicationConfig")
    @ResponseWrapper(localName = "GetApplicationConfigResponse", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.GetApplicationConfigResponse")
    public java.lang.String getApplicationConfig(
        @WebParam(name = "applicationID", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String applicationID
    );

    /**
     * 获取公共配置项
     */
    @WebResult(name = "GetPublicConfigResult", targetNamespace = "http://wsaf.wicresoft.com/")
    @RequestWrapper(localName = "GetPublicConfig", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.GetPublicConfig")
    @WebMethod(operationName = "GetPublicConfig", action = "http://wsaf.wicresoft.com/GetPublicConfig")
    @ResponseWrapper(localName = "GetPublicConfigResponse", targetNamespace = "http://wsaf.wicresoft.com/", className = "com.gouhai.baoshan.webservice.client.application.GetPublicConfigResponse")
    public java.lang.String getPublicConfig(
        @WebParam(name = "key", targetNamespace = "http://wsaf.wicresoft.com/")
        java.lang.String key
    );
}
