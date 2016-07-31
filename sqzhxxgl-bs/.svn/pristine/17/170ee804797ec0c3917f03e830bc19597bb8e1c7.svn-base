package com.gouhai.baoshan.entity.business.dqgz.fd;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;
/**
 * 退休妇女和生活困难妇女参加妇科病及乳腺病筛查登记表
 * @author sun 2014-08-18
 * 
 */
@Entity
@Table(name = "bs_business_womanbscdj")
public class Womanbscdj extends BaseEntity{

	/**
	 * 姓名	性别	民族	出生年月 家庭住址	电话	
	 */
	@Column(name = "XM")
	private String xm; // 姓名
	@Column(name = "XB")
	private String xb; // 性别
	@Column(name = "CSNY")
	@Temporal(TemporalType.DATE)
	private Date csny; // 出生年月
	
	@Column(name = "AGE")
	private int age; // 年龄
	
	@Column(name = "IDCARD")
	private String idcard; // 身份证
	
	@Column(name = "MZ")
	private String mz; // 民族
	@Column(name = "WHCD")
	private String whcd; // 文化程度
	@Column(name = "DJSJ")
	@Temporal(TemporalType.DATE)
	private Date djsj; // 登记时间
	
	@Column(name = "TYPE")
	private String type; // 类别

	@Column(name = "SCSJ")
	@Temporal(TemporalType.DATE)
	private Date scsj; // 筛查时间
	@Column(name = "_scjg")
	private String scjg; //筛查机构
	
	@Column(name = "_isSc")
	private String isSc; //是否参加筛查
	
	@Column(name = "_isAnothorCheck")
	private String isAnothorCheck; //是否需要进一步检查
	
	@Column(name = "_isCheckCancer")
	private String isCheckCancer; //是否检出恶性肿瘤
	
	@Column(name = "JTZZ")
	private String jtzz; // 家庭住址
	@Column(name = "HJDZ")
	private String hjdz; // 户籍地址
	@Column(name = "PHONE")
	private String phone; // 联系电话
	@Column(name = "TAG",length=512)
	private String tag; // 备注
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;
	
	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getXb() {
		return xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	public Date getCsny() {
		return csny;
	}

	public void setCsny(Date csny) {
		this.csny = csny;
	}

	public String getJtzz() {
		return jtzz;
	}

	public void setJtzz(String jtzz) {
		this.jtzz = jtzz;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public String getHjdz() {
		return hjdz;
	}

	public void setHjdz(String hjdz) {
		this.hjdz = hjdz;
	}


	public String getWhcd()
	{
		return whcd;
	}

	public void setWhcd(String whcd)
	{
		this.whcd = whcd;
	}

	public String getMz()
	{
		return mz;
	}

	public void setMz(String mz)
	{
		this.mz = mz;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	public String getTag()
	{
		return tag;
	}

	public void setTag(String tag)
	{
		this.tag = tag;
	}

	public String getIdcard()
	{
		return idcard;
	}

	public void setIdcard(String idcard)
	{
		this.idcard = idcard;
	}

	public Date getDjsj()
	{
		return djsj;
	}

	public void setDjsj(Date djsj)
	{
		this.djsj = djsj;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public Date getScsj()
	{
		return scsj;
	}

	public void setScsj(Date scsj)
	{
		this.scsj = scsj;
	}

	public String getScjg()
	{
		return scjg;
	}

	public void setScjg(String scjg)
	{
		this.scjg = scjg;
	}

	public String getIsSc()
	{
		return isSc;
	}

	public void setIsSc(String isSc)
	{
		this.isSc = isSc;
	}

	public String getIsAnothorCheck()
	{
		return isAnothorCheck;
	}

	public void setIsAnothorCheck(String isAnothorCheck)
	{
		this.isAnothorCheck = isAnothorCheck;
	}

	public String getIsCheckCancer()
	{
		return isCheckCancer;
	}

	public void setIsCheckCancer(String isCheckCancer)
	{
		this.isCheckCancer = isCheckCancer;
	}
	
}
