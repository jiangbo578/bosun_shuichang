
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
 *         &lt;element name="IsUserByIDInGroupResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isUserByIDInGroupResult"
})
@XmlRootElement(name = "IsUserByIDInGroupResponse")
public class IsUserByIDInGroupResponse {

    @XmlElement(name = "IsUserByIDInGroupResult")
    protected boolean isUserByIDInGroupResult;

    /**
     * ��ȡisUserByIDInGroupResult���Ե�ֵ��
     * 
     */
    public boolean isIsUserByIDInGroupResult() {
        return isUserByIDInGroupResult;
    }

    /**
     * ����isUserByIDInGroupResult���Ե�ֵ��
     * 
     */
    public void setIsUserByIDInGroupResult(boolean value) {
        this.isUserByIDInGroupResult = value;
    }

}
