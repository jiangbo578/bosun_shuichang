package com.gouhai.baoshan.webservice.client.organization;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * 统一平台用户管理服务
 *
 * This class was generated by Apache CXF 3.0.1
 * 2014-09-24T09:57:07.713+08:00
 * Generated source version: 3.0.1
 * 
 */
@WebServiceClient(name = "OrganizationService", 
                  wsdlLocation = "http://sso.jiading.gov.cn/Framework.WebService.Latest/OrganizationService.asmx",
                  targetNamespace = "http://wsaf.wicresoft.com/") 
public class OrganizationService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://wsaf.wicresoft.com/", "OrganizationService");
    public final static QName OrganizationServiceSoap = new QName("http://wsaf.wicresoft.com/", "OrganizationServiceSoap");
    public final static QName OrganizationServiceSoap12 = new QName("http://wsaf.wicresoft.com/", "OrganizationServiceSoap12");
    static {
        URL url = null;
        try {
            url = new URL("http://sso.jiading.gov.cn/Framework.WebService.Latest/OrganizationService.asmx");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(OrganizationService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/c:/organization.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OrganizationService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OrganizationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrganizationService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns OrganizationServiceSoap
     */
    @WebEndpoint(name = "OrganizationServiceSoap")
    public OrganizationServiceSoap getOrganizationServiceSoap() {
        return super.getPort(OrganizationServiceSoap, OrganizationServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrganizationServiceSoap
     */
//    @WebEndpoint(name = "OrganizationServiceSoap")
//    public OrganizationServiceSoap getOrganizationServiceSoap(WebServiceFeature... features) {
//        return super.getPort(OrganizationServiceSoap, OrganizationServiceSoap.class, features);
//    }
    /**
     *
     * @return
     *     returns OrganizationServiceSoap
     */
    @WebEndpoint(name = "OrganizationServiceSoap12")
    public OrganizationServiceSoap getOrganizationServiceSoap12() {
        return super.getPort(OrganizationServiceSoap12, OrganizationServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrganizationServiceSoap
     */
//    @WebEndpoint(name = "OrganizationServiceSoap12")
//    public OrganizationServiceSoap getOrganizationServiceSoap12(WebServiceFeature... features) {
//        return super.getPort(OrganizationServiceSoap12, OrganizationServiceSoap.class, features);
//    }

}
