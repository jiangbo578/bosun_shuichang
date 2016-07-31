
package com.gouhai.baoshan.webservice.client.organization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
     * 获取offspringDepartmentID属性的值。
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
     * 设置offspringDepartmentID属性的值。
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
     * 获取ancestorDepartmentID属性的值。
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
     * 设置ancestorDepartmentID属性的值。
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
     * 获取recursive属性的值。
     * 
     */
    public boolean isRecursive() {
        return recursive;
    }

    /**
     * 设置recursive属性的值。
     * 
     */
    public void setRecursive(boolean value) {
        this.recursive = value;
    }

}
