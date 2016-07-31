
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
 *         &lt;element name="GetUserInfoByIDResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getUserInfoByIDResult"
})
@XmlRootElement(name = "GetUserInfoByIDResponse")
public class GetUserInfoByIDResponse {

    @XmlElement(name = "GetUserInfoByIDResult")
    protected String getUserInfoByIDResult;

    /**
     * 获取getUserInfoByIDResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetUserInfoByIDResult() {
        return getUserInfoByIDResult;
    }

    /**
     * 设置getUserInfoByIDResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetUserInfoByIDResult(String value) {
        this.getUserInfoByIDResult = value;
    }

}
