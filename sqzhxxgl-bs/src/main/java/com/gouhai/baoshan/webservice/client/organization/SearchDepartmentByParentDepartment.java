
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
 *         &lt;element name="parentDepartmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "parentDepartmentID",
    "conditionXml",
    "recursive"
})
@XmlRootElement(name = "SearchDepartmentByParentDepartment")
public class SearchDepartmentByParentDepartment {

    protected String parentDepartmentID;
    protected String conditionXml;
    protected boolean recursive;

    /**
     * 获取parentDepartmentID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentDepartmentID() {
        return parentDepartmentID;
    }

    /**
     * 设置parentDepartmentID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentDepartmentID(String value) {
        this.parentDepartmentID = value;
    }

    /**
     * 获取conditionXml属性的值。
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
     * 设置conditionXml属性的值。
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
