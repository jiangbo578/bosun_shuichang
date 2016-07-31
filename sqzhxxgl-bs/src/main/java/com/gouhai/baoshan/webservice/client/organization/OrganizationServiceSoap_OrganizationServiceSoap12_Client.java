
package com.gouhai.baoshan.webservice.client.organization;

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
 * 2014-09-24T09:57:07.684+08:00
 * Generated source version: 3.0.1
 * 
 */
public final class OrganizationServiceSoap_OrganizationServiceSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://wsaf.wicresoft.com/", "OrganizationService");

    private OrganizationServiceSoap_OrganizationServiceSoap12_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = OrganizationService.WSDL_LOCATION;
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
      
        OrganizationService ss = new OrganizationService(wsdlURL, SERVICE_NAME);
        OrganizationServiceSoap port = ss.getOrganizationServiceSoap12();  
        
        {
        System.out.println("Invoking isUserByIDInGroup...");
        java.lang.String _isUserByIDInGroup_userID = "";
        java.lang.String _isUserByIDInGroup_groupID = "";
        boolean _isUserByIDInGroup__return = port.isUserByIDInGroup(_isUserByIDInGroup_userID, _isUserByIDInGroup_groupID);
        System.out.println("isUserByIDInGroup.result=" + _isUserByIDInGroup__return);


        }
        {
        System.out.println("Invoking getRoleUserByIDPath...");
        java.lang.String _getRoleUserByIDPath_roleID = "";
        java.lang.String _getRoleUserByIDPath_userID = "";
        java.lang.String _getRoleUserByIDPath__return = port.getRoleUserByIDPath(_getRoleUserByIDPath_roleID, _getRoleUserByIDPath_userID);
        System.out.println("getRoleUserByIDPath.result=" + _getRoleUserByIDPath__return);


        }
        {
        System.out.println("Invoking getDepartmentInfoListByParentDepartment...");
        java.lang.String _getDepartmentInfoListByParentDepartment_parentDepartmentID = "";
        boolean _getDepartmentInfoListByParentDepartment_recursive = false;
        java.lang.String _getDepartmentInfoListByParentDepartment__return = port.getDepartmentInfoListByParentDepartment(_getDepartmentInfoListByParentDepartment_parentDepartmentID, _getDepartmentInfoListByParentDepartment_recursive);
        System.out.println("getDepartmentInfoListByParentDepartment.result=" + _getDepartmentInfoListByParentDepartment__return);


        }
        {
        System.out.println("Invoking searchDepartment...");
        java.lang.String _searchDepartment_conditionXml = "";
        java.lang.String _searchDepartment__return = port.searchDepartment(_searchDepartment_conditionXml);
        System.out.println("searchDepartment.result=" + _searchDepartment__return);


        }
        {
        System.out.println("Invoking searchUser...");
        java.lang.String _searchUser_conditionXml = "";
        java.lang.String _searchUser__return = port.searchUser(_searchUser_conditionXml);
        System.out.println("searchUser.result=" + _searchUser__return);


        }
        {
        System.out.println("Invoking isDepartmentInDepartment...");
        java.lang.String _isDepartmentInDepartment_offspringDepartmentID = "";
        java.lang.String _isDepartmentInDepartment_ancestorDepartmentID = "";
        boolean _isDepartmentInDepartment_recursive = false;
        boolean _isDepartmentInDepartment__return = port.isDepartmentInDepartment(_isDepartmentInDepartment_offspringDepartmentID, _isDepartmentInDepartment_ancestorDepartmentID, _isDepartmentInDepartment_recursive);
        System.out.println("isDepartmentInDepartment.result=" + _isDepartmentInDepartment__return);


        }
        {
        System.out.println("Invoking searchRole...");
        java.lang.String _searchRole_conditionXml = "";
        java.lang.String _searchRole__return = port.searchRole(_searchRole_conditionXml);
        System.out.println("searchRole.result=" + _searchRole__return);


        }
        {
        System.out.println("Invoking isUserByNameInRole...");
        java.lang.String _isUserByNameInRole_userName = "";
        java.lang.String _isUserByNameInRole_roleID = "";
        boolean _isUserByNameInRole__return = port.isUserByNameInRole(_isUserByNameInRole_userName, _isUserByNameInRole_roleID);
        System.out.println("isUserByNameInRole.result=" + _isUserByNameInRole__return);


        }
        {
        System.out.println("Invoking getUserInfoListByRole...");
        java.lang.String _getUserInfoListByRole_roleID = "";
        boolean _getUserInfoListByRole_recursive = false;
        java.lang.String _getUserInfoListByRole__return = port.getUserInfoListByRole(_getUserInfoListByRole_roleID, _getUserInfoListByRole_recursive);
        System.out.println("getUserInfoListByRole.result=" + _getUserInfoListByRole__return);


        }
        {
        System.out.println("Invoking getDepartmentDepartmentPath...");
        java.lang.String _getDepartmentDepartmentPath_ancestorDepartmentID = "";
        java.lang.String _getDepartmentDepartmentPath_offspringDepartmentID = "";
        java.lang.String _getDepartmentDepartmentPath__return = port.getDepartmentDepartmentPath(_getDepartmentDepartmentPath_ancestorDepartmentID, _getDepartmentDepartmentPath_offspringDepartmentID);
        System.out.println("getDepartmentDepartmentPath.result=" + _getDepartmentDepartmentPath__return);


        }
        {
        System.out.println("Invoking getUserInfoList...");
        java.lang.String _getUserInfoList__return = port.getUserInfoList();
        System.out.println("getUserInfoList.result=" + _getUserInfoList__return);


        }
        {
        System.out.println("Invoking getGroupInfoList...");
        java.lang.String _getGroupInfoList__return = port.getGroupInfoList();
        System.out.println("getGroupInfoList.result=" + _getGroupInfoList__return);


        }
        {
        System.out.println("Invoking searchUserByDepartment...");
        java.lang.String _searchUserByDepartment_departmentID = "";
        java.lang.String _searchUserByDepartment_conditionXml = "";
        boolean _searchUserByDepartment_recursive = false;
        java.lang.String _searchUserByDepartment__return = port.searchUserByDepartment(_searchUserByDepartment_departmentID, _searchUserByDepartment_conditionXml, _searchUserByDepartment_recursive);
        System.out.println("searchUserByDepartment.result=" + _searchUserByDepartment__return);


        }
        {
        System.out.println("Invoking getUserInfoListByDepartment...");
        java.lang.String _getUserInfoListByDepartment_parentDepartmentID = "";
        boolean _getUserInfoListByDepartment_recursive = false;
        java.lang.String _getUserInfoListByDepartment__return = port.getUserInfoListByDepartment(_getUserInfoListByDepartment_parentDepartmentID, _getUserInfoListByDepartment_recursive);
        System.out.println("getUserInfoListByDepartment.result=" + _getUserInfoListByDepartment__return);


        }
        {
        System.out.println("Invoking getRoleInfoListByUserID...");
        java.lang.String _getRoleInfoListByUserID_userID = "";
        java.lang.String _getRoleInfoListByUserID__return = port.getRoleInfoListByUserID(_getRoleInfoListByUserID_userID);
        System.out.println("getRoleInfoListByUserID.result=" + _getRoleInfoListByUserID__return);


        }
        {
        System.out.println("Invoking getUserInfoByName...");
        java.lang.String _getUserInfoByName_userName = "";
        java.lang.String _getUserInfoByName__return = port.getUserInfoByName(_getUserInfoByName_userName);
        System.out.println("getUserInfoByName.result=" + _getUserInfoByName__return);


        }
        {
        System.out.println("Invoking getRoleInfoListByUserName...");
        java.lang.String _getRoleInfoListByUserName_userName = "";
        java.lang.String _getRoleInfoListByUserName__return = port.getRoleInfoListByUserName(_getRoleInfoListByUserName_userName);
        System.out.println("getRoleInfoListByUserName.result=" + _getRoleInfoListByUserName__return);


        }
        {
        System.out.println("Invoking getRoleInfoListByGroup...");
        java.lang.String _getRoleInfoListByGroup_groupID = "";
        java.lang.String _getRoleInfoListByGroup__return = port.getRoleInfoListByGroup(_getRoleInfoListByGroup_groupID);
        System.out.println("getRoleInfoListByGroup.result=" + _getRoleInfoListByGroup__return);


        }
        {
        System.out.println("Invoking getRoleInfoList...");
        java.lang.String _getRoleInfoList__return = port.getRoleInfoList();
        System.out.println("getRoleInfoList.result=" + _getRoleInfoList__return);


        }
        {
        System.out.println("Invoking getRoleInfo...");
        java.lang.String _getRoleInfo_roleID = "";
        java.lang.String _getRoleInfo__return = port.getRoleInfo(_getRoleInfo_roleID);
        System.out.println("getRoleInfo.result=" + _getRoleInfo__return);


        }
        {
        System.out.println("Invoking isUserByIDInDepartment...");
        java.lang.String _isUserByIDInDepartment_userID = "";
        java.lang.String _isUserByIDInDepartment_departmentID = "";
        boolean _isUserByIDInDepartment__return = port.isUserByIDInDepartment(_isUserByIDInDepartment_userID, _isUserByIDInDepartment_departmentID);
        System.out.println("isUserByIDInDepartment.result=" + _isUserByIDInDepartment__return);


        }
        {
        System.out.println("Invoking getUserInfoByID...");
        java.lang.String _getUserInfoByID_userID = "";
        java.lang.String _getUserInfoByID__return = port.getUserInfoByID(_getUserInfoByID_userID);
        System.out.println("getUserInfoByID.result=" + _getUserInfoByID__return);


        }
        {
        System.out.println("Invoking searchDepartmentByParentDepartment...");
        java.lang.String _searchDepartmentByParentDepartment_parentDepartmentID = "";
        java.lang.String _searchDepartmentByParentDepartment_conditionXml = "";
        boolean _searchDepartmentByParentDepartment_recursive = false;
        java.lang.String _searchDepartmentByParentDepartment__return = port.searchDepartmentByParentDepartment(_searchDepartmentByParentDepartment_parentDepartmentID, _searchDepartmentByParentDepartment_conditionXml, _searchDepartmentByParentDepartment_recursive);
        System.out.println("searchDepartmentByParentDepartment.result=" + _searchDepartmentByParentDepartment__return);


        }
        {
        System.out.println("Invoking getDepartmentInfoList...");
        java.lang.String _getDepartmentInfoList__return = port.getDepartmentInfoList();
        System.out.println("getDepartmentInfoList.result=" + _getDepartmentInfoList__return);


        }
        {
        System.out.println("Invoking isUserByNameInDepartment...");
        java.lang.String _isUserByNameInDepartment_userName = "";
        java.lang.String _isUserByNameInDepartment_departmentID = "";
        boolean _isUserByNameInDepartment__return = port.isUserByNameInDepartment(_isUserByNameInDepartment_userName, _isUserByNameInDepartment_departmentID);
        System.out.println("isUserByNameInDepartment.result=" + _isUserByNameInDepartment__return);


        }
        {
        System.out.println("Invoking getGroupInfoListByDepartment...");
        java.lang.String _getGroupInfoListByDepartment_departmentID = "";
        boolean _getGroupInfoListByDepartment_recursive = false;
        java.lang.String _getGroupInfoListByDepartment__return = port.getGroupInfoListByDepartment(_getGroupInfoListByDepartment_departmentID, _getGroupInfoListByDepartment_recursive);
        System.out.println("getGroupInfoListByDepartment.result=" + _getGroupInfoListByDepartment__return);


        }
        {
        System.out.println("Invoking getDepartmentInfo...");
        java.lang.String _getDepartmentInfo_departmentID = "";
        java.lang.String _getDepartmentInfo__return = port.getDepartmentInfo(_getDepartmentInfo_departmentID);
        System.out.println("getDepartmentInfo.result=" + _getDepartmentInfo__return);


        }
        {
        System.out.println("Invoking getDepartmentUserByIDPath...");
        java.lang.String _getDepartmentUserByIDPath_departmentID = "";
        java.lang.String _getDepartmentUserByIDPath_userName = "";
        java.lang.String _getDepartmentUserByIDPath__return = port.getDepartmentUserByIDPath(_getDepartmentUserByIDPath_departmentID, _getDepartmentUserByIDPath_userName);
        System.out.println("getDepartmentUserByIDPath.result=" + _getDepartmentUserByIDPath__return);


        }
        {
        System.out.println("Invoking isUserByIDInRole...");
        java.lang.String _isUserByIDInRole_userID = "";
        java.lang.String _isUserByIDInRole_roleID = "";
        boolean _isUserByIDInRole__return = port.isUserByIDInRole(_isUserByIDInRole_userID, _isUserByIDInRole_roleID);
        System.out.println("isUserByIDInRole.result=" + _isUserByIDInRole__return);


        }
        {
        System.out.println("Invoking isGroupInDepartment...");
        java.lang.String _isGroupInDepartment_groupID = "";
        java.lang.String _isGroupInDepartment_departmentID = "";
        boolean _isGroupInDepartment__return = port.isGroupInDepartment(_isGroupInDepartment_groupID, _isGroupInDepartment_departmentID);
        System.out.println("isGroupInDepartment.result=" + _isGroupInDepartment__return);


        }
        {
        System.out.println("Invoking isUserByNameInGroup...");
        java.lang.String _isUserByNameInGroup_userName = "";
        java.lang.String _isUserByNameInGroup_groupID = "";
        boolean _isUserByNameInGroup__return = port.isUserByNameInGroup(_isUserByNameInGroup_userName, _isUserByNameInGroup_groupID);
        System.out.println("isUserByNameInGroup.result=" + _isUserByNameInGroup__return);


        }
        {
        System.out.println("Invoking getUserInfoListByGroup...");
        java.lang.String _getUserInfoListByGroup_groupID = "";
        java.lang.String _getUserInfoListByGroup__return = port.getUserInfoListByGroup(_getUserInfoListByGroup_groupID);
        System.out.println("getUserInfoListByGroup.result=" + _getUserInfoListByGroup__return);


        }
        {
        System.out.println("Invoking getDepartmentUserByNamePath...");
        java.lang.String _getDepartmentUserByNamePath_departmentID = "";
        java.lang.String _getDepartmentUserByNamePath_userID = "";
        java.lang.String _getDepartmentUserByNamePath__return = port.getDepartmentUserByNamePath(_getDepartmentUserByNamePath_departmentID, _getDepartmentUserByNamePath_userID);
        System.out.println("getDepartmentUserByNamePath.result=" + _getDepartmentUserByNamePath__return);


        }
        {
        System.out.println("Invoking getRoleUserByNamePath...");
        java.lang.String _getRoleUserByNamePath_roleID = "";
        java.lang.String _getRoleUserByNamePath_userName = "";
        java.lang.String _getRoleUserByNamePath__return = port.getRoleUserByNamePath(_getRoleUserByNamePath_roleID, _getRoleUserByNamePath_userName);
        System.out.println("getRoleUserByNamePath.result=" + _getRoleUserByNamePath__return);


        }
        {
        System.out.println("Invoking searchRoleByApplication...");
        java.lang.String _searchRoleByApplication_applicationID = "";
        java.lang.String _searchRoleByApplication_conditionXml = "";
        java.lang.String _searchRoleByApplication__return = port.searchRoleByApplication(_searchRoleByApplication_applicationID, _searchRoleByApplication_conditionXml);
        System.out.println("searchRoleByApplication.result=" + _searchRoleByApplication__return);


        }
        {
        System.out.println("Invoking isGroupInRole...");
        java.lang.String _isGroupInRole_groupID = "";
        java.lang.String _isGroupInRole_roleID = "";
        boolean _isGroupInRole__return = port.isGroupInRole(_isGroupInRole_groupID, _isGroupInRole_roleID);
        System.out.println("isGroupInRole.result=" + _isGroupInRole__return);


        }
        {
        System.out.println("Invoking getRoleInfoListByApplication...");
        java.lang.String _getRoleInfoListByApplication_applicationID = "";
        java.lang.String _getRoleInfoListByApplication__return = port.getRoleInfoListByApplication(_getRoleInfoListByApplication_applicationID);
        System.out.println("getRoleInfoListByApplication.result=" + _getRoleInfoListByApplication__return);


        }
        {
        System.out.println("Invoking getGroupInfo...");
        java.lang.String _getGroupInfo_groupID = "";
        java.lang.String _getGroupInfo__return = port.getGroupInfo(_getGroupInfo_groupID);
        System.out.println("getGroupInfo.result=" + _getGroupInfo__return);


        }
        {
        System.out.println("Invoking searchGroupByDepartment...");
        java.lang.String _searchGroupByDepartment_departmentID = "";
        java.lang.String _searchGroupByDepartment_conditionXml = "";
        boolean _searchGroupByDepartment_recursive = false;
        java.lang.String _searchGroupByDepartment__return = port.searchGroupByDepartment(_searchGroupByDepartment_departmentID, _searchGroupByDepartment_conditionXml, _searchGroupByDepartment_recursive);
        System.out.println("searchGroupByDepartment.result=" + _searchGroupByDepartment__return);


        }
        {
        System.out.println("Invoking searchGroup...");
        java.lang.String _searchGroup_conditionXml = "";
        java.lang.String _searchGroup__return = port.searchGroup(_searchGroup_conditionXml);
        System.out.println("searchGroup.result=" + _searchGroup__return);


        }

        System.exit(0);
    }

}
