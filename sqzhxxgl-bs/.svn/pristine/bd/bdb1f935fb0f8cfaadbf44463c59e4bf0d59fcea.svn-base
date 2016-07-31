package com.gouhai.baoshan.entity.business.jcqk.ncjz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;
/**
 * 固定资产台帐
 * 
 * @author MedivhQ
 * 
 */
@Entity
@Table(name = "bs_business_gdzctz")
public class Gdzctz extends BaseEntity
{
	@Column(name = "zcbh")//资产编号
	private String zcbh;
	@Column(name = "zcmc")//资产名称
	private String zcmc;
	@Column(name = "synx")//使用年限
	private String synx;
	@Column(name = "zclb")//资产类别
	private String zclb;
	@Column(name = "kssyrq")//开始使用日期
	private String kssyrq;
	@Column(name = "zjfs")//增加方法
	private String zjfs;
	@Column(name = "syzt")//使用状态
	private String syzt;
	@Column(name = "zzjfs")//折旧方法
	private String zzjfs;
	@Column(name = "zjzq")//折旧周期
	private String zjzq;
	@Column(name = "yzjl")//月折旧率
	private String yzjl;
	@Column(name="yzje")//月折旧额
	private String yzje;
	@Column(name = "yz")//原值
	private String yz;
	@Column(name = "jczl")//净残值率
	private String jczl;
	@Column(name = "jcz")//净残值
	private String jcz;
	@Column(name = "ytzjyf")//已提折旧月份
	private String ytzjyf;
	@Column(name = "ljzj")//累计折旧
	private String ljzj;
	@Column(name = "jz")//净值
	private String jz;
	@Column(name = "jldw")//计量单位
	private String jldw;
	@Column(name = "sl")//数量
	private String sl;
	@Column(name = "dj")//单价
	private String dj;
	@Column(name = "ggxh")//规格型号
	private String ggxh;
	@Column(name = "zrbm")//责任部门
	private String zrbm;
	@Column(name = "zrr")//责任人
	private String zrr;
	@Column(name = "zjdykm")//折旧对应科目
	private String zjdykm;
	@Column(name = "ljzjkm")//累计折旧科目
	private String ljzjkm;
	@Column(name = "cfdd")//存放地点
	private String cfdd;
	@Column(name = "bz")//备注
	private String bz;
	@Column(name = "djr")//登记人
	private String djr;
	@Column(name = "rq")//日期
	private String rq;
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;
	
	
	
	public String getYzje() {
		return yzje;
	}
	public void setYzje(String yzje) {
		this.yzje = yzje;
	}
	public BusinessForm getBusinessForm()
	{
		return businessForm;
	}
	public void setBusinessForm(BusinessForm businessForm)
	{
		this.businessForm = businessForm;
	}
	public String getZcbh()
	{
		return zcbh;
	}
	public void setZcbh(String zcbh)
	{
		this.zcbh = zcbh;
	}
	public String getZcmc()
	{
		return zcmc;
	}
	public void setZcmc(String zcmc)
	{
		this.zcmc = zcmc;
	}
	public String getSynx()
	{
		return synx;
	}
	public void setSynx(String synx)
	{
		this.synx = synx;
	}
	public String getZclb()
	{
		return zclb;
	}
	public void setZclb(String zclb)
	{
		this.zclb = zclb;
	}
	public String getKssyrq()
	{
		return kssyrq;
	}
	public void setKssyrq(String kssyrq)
	{
		this.kssyrq = kssyrq;
	}
	public String getZjfs()
	{
		return zjfs;
	}
	public void setZjfs(String zjfs)
	{
		this.zjfs = zjfs;
	}
	public String getSyzt()
	{
		return syzt;
	}
	public void setSyzt(String syzt)
	{
		this.syzt = syzt;
	}
	public String getZzjfs()
	{
		return zzjfs;
	}
	public void setZzjfs(String zzjfs)
	{
		this.zzjfs = zzjfs;
	}
	public String getZjzq()
	{
		return zjzq;
	}
	public void setZjzq(String zjzq)
	{
		this.zjzq = zjzq;
	}
	public String getYzjl()
	{
		return yzjl;
	}
	public void setYzjl(String yzjl)
	{
		this.yzjl = yzjl;
	}
	public String getYz()
	{
		return yz;
	}
	public void setYz(String yz)
	{
		this.yz = yz;
	}
	public String getJczl()
	{
		return jczl;
	}
	public void setJczl(String jczl)
	{
		this.jczl = jczl;
	}
	public String getJcz()
	{
		return jcz;
	}
	public void setJcz(String jcz)
	{
		this.jcz = jcz;
	}
	public String getYtzjyf()
	{
		return ytzjyf;
	}
	public void setYtzjyf(String ytzjyf)
	{
		this.ytzjyf = ytzjyf;
	}
	public String getLjzj()
	{
		return ljzj;
	}
	public void setLjzj(String ljzj)
	{
		this.ljzj = ljzj;
	}
	public String getJz()
	{
		return jz;
	}
	public void setJz(String jz)
	{
		this.jz = jz;
	}
	public String getJldw()
	{
		return jldw;
	}
	public void setJldw(String jldw)
	{
		this.jldw = jldw;
	}
	public String getSl()
	{
		return sl;
	}
	public void setSl(String sl)
	{
		this.sl = sl;
	}
	public String getDj()
	{
		return dj;
	}
	public void setDj(String dj)
	{
		this.dj = dj;
	}
	public String getGgxh()
	{
		return ggxh;
	}
	public void setGgxh(String ggxh)
	{
		this.ggxh = ggxh;
	}
	public String getZrbm()
	{
		return zrbm;
	}
	public void setZrbm(String zrbm)
	{
		this.zrbm = zrbm;
	}
	public String getZrr()
	{
		return zrr;
	}
	public void setZrr(String zrr)
	{
		this.zrr = zrr;
	}
	public String getZjdykm()
	{
		return zjdykm;
	}
	public void setZjdykm(String zjdykm)
	{
		this.zjdykm = zjdykm;
	}
	public String getLjzjkm()
	{
		return ljzjkm;
	}
	public void setLjzjkm(String ljzjkm)
	{
		this.ljzjkm = ljzjkm;
	}
	public String getCfdd()
	{
		return cfdd;
	}
	public void setCfdd(String cfdd)
	{
		this.cfdd = cfdd;
	}
	public String getBz()
	{
		return bz;
	}
	public void setBz(String bz)
	{
		this.bz = bz;
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
