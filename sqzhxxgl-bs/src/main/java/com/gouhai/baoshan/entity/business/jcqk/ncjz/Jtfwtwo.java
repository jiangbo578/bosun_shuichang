package com.gouhai.baoshan.entity.business.jcqk.ncjz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;
/**
 * 集体房屋、土地经营（出租）情况台帐（表二）
 * 
 * @author MedivhQ
 * 
 */
@Entity
@Table(name = "bs_business_jtfwtwo")
public class Jtfwtwo extends BaseEntity
{
	@Column(name = "htdw")//合同单位（个人）
	private String htdw;
	@Column(name = "htbh")//合同编号
	private String htbh;
	@Column(name = "nrzy")//内容摘要
	private String nrzy;
	@Column(name = "sfztb")//是否招投标
	private String sfztb;
	@Column(name = "skze")//收款总额
	private String skze;
	@Column(name = "htqxq")//合同期限
	private String htqxq;
	@Column(name = "htqxz")//合同期限
	private String htqxz;
	@Column(name = "htlxqk")//合同履行情况
	private String htlxqk;
	@Column(name = "zzrq")//终止日期
	private String zzrq;
	@Column(name = "bz")//备注
	private String bz;
	@Column(name = "yskrq")//应收款日期
	private String yskrq;
	@Column(name = "yskje")//应收款金额
	private String yskje;
	@Column(name = "skrq")//收款日期
	private String skrq;
	@Column(name = "sjhm")//收据号码
	private String sjhm;
	@Column(name = "skje")//收款金额
	private String skje;
	@Column(name = "bqwsje")//本期未收金额
	private String bqwsje;
	@Column(name = "ljwsje")//累计未收金额
	private String ljwsje;
	@Column(name = "pzh")//凭证号
	private String pzh;
	@Column(name = "djr")//登记人
	private String djr;
	@Column(name = "rq")//日期
	private String rq;
	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;
	
	
	
	public BusinessForm getBusinessForm()
	{
		return businessForm;
	}
	public void setBusinessForm(BusinessForm businessForm)
	{
		this.businessForm = businessForm;
	}
	public String getHtdw()
	{
		return htdw;
	}
	public void setHtdw(String htdw)
	{
		this.htdw = htdw;
	}
	public String getHtbh()
	{
		return htbh;
	}
	public void setHtbh(String htbh)
	{
		this.htbh = htbh;
	}
	public String getNrzy()
	{
		return nrzy;
	}
	public void setNrzy(String nrzy)
	{
		this.nrzy = nrzy;
	}
	public String getSfztb()
	{
		return sfztb;
	}
	public void setSfztb(String sfztb)
	{
		this.sfztb = sfztb;
	}
	public String getSkze()
	{
		return skze;
	}
	public void setSkze(String skze)
	{
		this.skze = skze;
	}
	
	public String getHtqxq()
	{
		return htqxq;
	}
	public void setHtqxq(String htqxq)
	{
		this.htqxq = htqxq;
	}
	public String getHtqxz()
	{
		return htqxz;
	}
	public void setHtqxz(String htqxz)
	{
		this.htqxz = htqxz;
	}
	public String getHtlxqk()
	{
		return htlxqk;
	}
	public void setHtlxqk(String htlxqk)
	{
		this.htlxqk = htlxqk;
	}
	public String getZzrq()
	{
		return zzrq;
	}
	public void setZzrq(String zzrq)
	{
		this.zzrq = zzrq;
	}
	public String getBz()
	{
		return bz;
	}
	public void setBz(String bz)
	{
		this.bz = bz;
	}
	public String getYskrq()
	{
		return yskrq;
	}
	public void setYskrq(String yskrq)
	{
		this.yskrq = yskrq;
	}
	public String getYskje()
	{
		return yskje;
	}
	public void setYskje(String yskje)
	{
		this.yskje = yskje;
	}
	public String getSkrq()
	{
		return skrq;
	}
	public void setSkrq(String skrq)
	{
		this.skrq = skrq;
	}
	public String getSjhm()
	{
		return sjhm;
	}
	public void setSjhm(String sjhm)
	{
		this.sjhm = sjhm;
	}
	public String getSkje()
	{
		return skje;
	}
	public void setSkje(String skje)
	{
		this.skje = skje;
	}
	public String getBqwsje()
	{
		return bqwsje;
	}
	public void setBqwsje(String bqwsje)
	{
		this.bqwsje = bqwsje;
	}
	public String getLjwsje()
	{
		return ljwsje;
	}
	public void setLjwsje(String ljwsje)
	{
		this.ljwsje = ljwsje;
	}
	public String getPzh()
	{
		return pzh;
	}
	public void setPzh(String pzh)
	{
		this.pzh = pzh;
	}
	public String getDjr()
	{
		return djr;
	}
	public void setDjr(String djr)
	{
		this.djr = djr;
	}
	public String getRq()
	{
		return rq;
	}
	public void setRq(String rq)
	{
		this.rq = rq;
	}
	
	
	
}
