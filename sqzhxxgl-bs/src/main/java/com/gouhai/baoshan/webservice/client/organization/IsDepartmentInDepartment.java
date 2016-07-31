
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
 *         &lt;element name="offspringDepartmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ancestorDepartmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "offspringDepartmentID",
    "ancestorDepartmentID",
    "recursive"
})
@XmlRootElement(name = "IsDepartmentInDepartment")
public class IsDepartmentInDepartment {

    protected String offspringDepartmentID;
    protected String ancestorDepartmentID;
    protected boolean recursive;

    /**
     * ��ȡoffspringDepartmentID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffspringDepartmentID() {
        return offspringDepartmentID;
    }

    /**
     * ����offspringDepartmentID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffspringDepartmentID(String value) {
        this.offspringDepartmentID = value;
    }

    /**
     * ��ȡancestorDepartmentID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncestorDepartmentID() {
        return ancestorDepartmentID;
    }

    /**
     * ����ancestorDepartmentID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncestorDepartmentID(String value) {
        this.ancestorDepartmentID = value;
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
