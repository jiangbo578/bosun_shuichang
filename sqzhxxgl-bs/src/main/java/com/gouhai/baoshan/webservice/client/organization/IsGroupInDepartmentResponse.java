
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
 *         &lt;element name="IsGroupInDepartmentResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isGroupInDepartmentResult"
})
@XmlRootElement(name = "IsGroupInDepartmentResponse")
public class IsGroupInDepartmentResponse {

    @XmlElement(name = "IsGroupInDepartmentResult")
    protected boolean isGroupInDepartmentResult;

    /**
     * ��ȡisGroupInDepartmentResult���Ե�ֵ��
     * 
     */
    public boolean isIsGroupInDepartmentResult() {
        return isGroupInDepartmentResult;
    }

    /**
     * ����isGroupInDepartmentResult���Ե�ֵ��
     * 
     */
    public void setIsGroupInDepartmentResult(boolean value) {
        this.isGroupInDepartmentResult = value;
    }

}
