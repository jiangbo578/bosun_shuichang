
package com.gouhai.baoshan.webservice.client.organization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsUserByNameInDepartmentResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isUserByNameInDepartmentResult"
})
@XmlRootElement(name = "IsUserByNameInDepartmentResponse")
public class IsUserByNameInDepartmentResponse {

    @XmlElement(name = "IsUserByNameInDepartmentResult")
    protected boolean isUserByNameInDepartmentResult;

    /**
     * ��ȡisUserByNameInDepartmentResult���Ե�ֵ��
     * 
     */
    public boolean isIsUserByNameInDepartmentResult() {
        return isUserByNameInDepartmentResult;
    }

    /**
     * ����isUserByNameInDepartmentResult���Ե�ֵ��
     * 
     */
    public void setIsUserByNameInDepartmentResult(boolean value) {
        this.isUserByNameInDepartmentResult = value;
    }

}
