
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
 *         &lt;element name="GetRoleInfoListByGroupResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getRoleInfoListByGroupResult"
})
@XmlRootElement(name = "GetRoleInfoListByGroupResponse")
public class GetRoleInfoListByGroupResponse {

    @XmlElement(name = "GetRoleInfoListByGroupResult")
    protected String getRoleInfoListByGroupResult;

    /**
     * ��ȡgetRoleInfoListByGroupResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetRoleInfoListByGroupResult() {
        return getRoleInfoListByGroupResult;
    }

    /**
     * ����getRoleInfoListByGroupResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetRoleInfoListByGroupResult(String value) {
        this.getRoleInfoListByGroupResult = value;
    }

}
