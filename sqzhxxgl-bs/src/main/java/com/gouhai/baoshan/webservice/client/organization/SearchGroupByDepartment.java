
package com.gouhai.baoshan.webservice.client.organization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="departmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conditionXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recursive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "departmentID",
    "conditionXml",
    "recursive"
})
@XmlRootElement(name = "SearchGroupByDepartment")
public class SearchGroupByDepartment {

    protected String departmentID;
    protected String conditionXml;
    protected boolean recursive;

    /**
     * ��ȡdepartmentID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentID() {
        return departmentID;
    }

    /**
     * ����departmentID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentID(String value) {
        this.departmentID = value;
    }

    /**
     * ��ȡconditionXml���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionXml() {
        return conditionXml;
    }

    /**
     * ����conditionXml���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionXml(String value) {
        this.conditionXml = value;
    }

    /**
     * ��ȡrecursive���Ե�ֵ��
     * 
     */
    public boolean isRecursive() {
        return recursive;
    }

    /**
     * ����recursive���Ե�ֵ��
     * 
     */
    public void setRecursive(boolean value) {
        this.recursive = value;
    }

}
