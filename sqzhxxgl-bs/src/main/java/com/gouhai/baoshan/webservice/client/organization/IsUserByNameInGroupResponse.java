
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
 *         &lt;element name="IsUserByNameInGroupResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isUserByNameInGroupResult"
})
@XmlRootElement(name = "IsUserByNameInGroupResponse")
public class IsUserByNameInGroupResponse {

    @XmlElement(name = "IsUserByNameInGroupResult")
    protected boolean isUserByNameInGroupResult;

    /**
     * ��ȡisUserByNameInGroupResult���Ե�ֵ��
     * 
     */
    public boolean isIsUserByNameInGroupResult() {
        return isUserByNameInGroupResult;
    }

    /**
     * ����isUserByNameInGroupResult���Ե�ֵ��
     * 
     */
    public void setIsUserByNameInGroupResult(boolean value) {
        this.isUserByNameInGroupResult = value;
    }

}
