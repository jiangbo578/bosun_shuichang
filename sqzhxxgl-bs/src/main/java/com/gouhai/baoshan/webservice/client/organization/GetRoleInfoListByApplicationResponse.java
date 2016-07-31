
package com.gouhai.baoshan.webservice.client.organization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetRoleInfoListByApplicationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getRoleInfoListByApplicationResult"
})
@XmlRootElement(name = "GetRoleInfoListByApplicationResponse")
public class GetRoleInfoListByApplicationResponse {

    @XmlElement(name = "GetRoleInfoListByApplicationResult")
    protected String getRoleInfoListByApplicationResult;

    /**
     * 获取getRoleInfoListByApplicationResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetRoleInfoListByApplicationResult() {
        return getRoleInfoListByApplicationResult;
    }

    /**
     * 设置getRoleInfoListByApplicationResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetRoleInfoListByApplicationResult(String value) {
        this.getRoleInfoListByApplicationResult = value;
    }

}
