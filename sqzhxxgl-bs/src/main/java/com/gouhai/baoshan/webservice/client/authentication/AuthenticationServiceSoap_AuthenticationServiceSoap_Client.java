
package com.gouhai.baoshan.webservice.client.authentication;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-09-24T09:43:17.661+08:00
 * Generated source version: 3.0.1
 * 
 */
public final class AuthenticationServiceSoap_AuthenticationServiceSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://wsaf.wicresoft.com/", "AuthenticationService");

    private AuthenticationServiceSoap_AuthenticationServiceSoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = AuthenticationService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        AuthenticationService ss = new AuthenticationService(wsdlURL, SERVICE_NAME);
        AuthenticationServiceSoap port = ss.getAuthenticationServiceSoap();  
        
        {
        System.out.println("Invoking checkUserPassword...");
        java.lang.String _checkUserPassword_userName = "";
        java.lang.String _checkUserPassword_password = "";
        java.lang.String _checkUserPassword__return = port.checkUserPassword(_checkUserPassword_userName, _checkUserPassword_password);
        System.out.println("checkUserPassword.result=" + _checkUserPassword__return);


        }
        {
        System.out.println("Invoking decryptUserID...");
        java.lang.String _decryptUserID_encryptUserID = "";
        java.lang.String _decryptUserID_applicationID = "";
        java.lang.String _decryptUserID__return = port.decryptUserID(_decryptUserID_encryptUserID, _decryptUserID_applicationID);
        System.out.println("decryptUserID.result=" + _decryptUserID__return);


        }

        System.exit(0);
    }

}
