
package com.gouhai.baoshan.webservice.client.application;

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
 *         &lt;element name="WriteLogResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "writeLogResult"
})
@XmlRootElement(name = "WriteLogResponse")
public class WriteLogResponse {

    @XmlElement(name = "WriteLogResult")
    protected boolean writeLogResult;

    /**
     * ��ȡwriteLogResult���Ե�ֵ��
     * 
     */
    public boolean isWriteLogResult() {
        return writeLogResult;
    }

    /**
     * ����writeLogResult���Ե�ֵ��
     * 
     */
    public void setWriteLogResult(boolean value) {
        this.writeLogResult = value;
    }

}
