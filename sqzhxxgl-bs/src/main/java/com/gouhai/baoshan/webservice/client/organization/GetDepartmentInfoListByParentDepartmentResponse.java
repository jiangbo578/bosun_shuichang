
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
 *         &lt;element name="GetDepartmentInfoListByParentDepartmentResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDepartmentInfoListByParentDepartmentResult"
})
@XmlRootElement(name = "GetDepartmentInfoListByParentDepartmentResponse")
public class GetDepartmentInfoListByParentDepartmentResponse {

    @XmlElement(name = "GetDepartmentInfoListByParentDepartmentResult")
    protected String getDepartmentInfoListByParentDepartmentResult;

    /**
     * ��ȡgetDepartmentInfoListByParentDepartmentResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDepartmentInfoListByParentDepartmentResult() {
        return getDepartmentInfoListByParentDepartmentResult;
    }

    /**
     * ����getDepartmentInfoListByParentDepartmentResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDepartmentInfoListByParentDepartmentResult(String value) {
        this.getDepartmentInfoListByParentDepartmentResult = value;
    }

}