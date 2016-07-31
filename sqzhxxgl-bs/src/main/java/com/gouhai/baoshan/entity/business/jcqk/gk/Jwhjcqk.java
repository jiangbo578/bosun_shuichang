package com.gouhai.baoshan.entity.business.jcqk.gk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 村委会基础情况
 * 
 * @author MedivhQ 需要审核 与人口无关
 * 
 */
@Entity
@Table(name = "bs_business_jwhjcqk")
public class Jwhjcqk extends BaseEntity {
	@Column(name = "wygsmc")
	private String wygsmc;
	@Column(name = "wygsgs")
	private String wygsgs;
	@Column(name = "bags")
	private String bags;
	@Column(name = "jwhbgyfmj")
	private String jwhbgyfmj;
	@Column(name = "hdsmj")
	private String hdsmj;
	@Column(name = "xqzdmj")
	private String xqzdmj;
	@Column(name = "fwjzmj")
	private String fwjzmj;
	@Column(name = "lhmj")
	private String lhmj;
	@Column(name = "jmzzxq")
	private String jmzzxq;
	@Column(name = "zzl")
	private String zzl;
	@Column(name = "xqlds")
	private String xqlds;
	@Column(name = "mld")
	private String mld;
	@Column(name = "xqdw")
	private String xqdw;
	@Column(name = "gjqydw")
	private String gjqydw;
	@Column(name = "wmls")
	private String wmls;
	@Column(name = "sjwmls")
	private String sjwmls;
	@Column(name = "qjwmls")
	private String qjwmls;
	@Column(name = "jdjwmls")
	private String jdjwmls;
	
	@Column(name = "whwmjtqg")
	private String whwmjtqg;
	@Column(name = "whwmjtqgbl")
	private String whwmjtqgbl;
	@Column(name = "whwmjtsj")
	private String whwmjtsj;
	@Column(name = "whwmjtsjbl")
	private String whwmjtsjbl;
	@Column(name = "whwmjtqj")
	private String whwmjtqj;
	@Column(name = "whwmjtqjbl")
	private String whwmjtqjbl;
	@Column(name = "whwmjtjdj")
	private String whwmjtjdj;
	@Column(name = "whwmjtjdjbl")
	private String whwmjtjdjbl;
	@Column(name = "xxxjtqg")
	private String xxxjtqg;
	@Column(name = "xxxjtqgbl")
	private String xxxjtqgbl;
	@Column(name = "xxxjtsj")
	private String xxxjtsj;
	@Column(name = "xxxjtsjbl")
	private String xxxjtsjbl;
	@Column(name = "xxxjtqj")
	private String xxxjtqj;
	@Column(name = "xxxjtqjbl")
	private String xxxjtqjbl;
	@Column(name = "xxxjtjdj")
	private String xxxjtjdj;
	@Column(name = "xxxjtjdjbl")
	private String xxxjtjdjbl;
	@Column(name = "pajtqg")
	private String pajtqg;
	@Column(name = "pajtqgbl")
	private String pajtqgbl;
	@Column(name = "pajtsj")
	private String pajtsj;
	@Column(name = "pajtsjbl")
	private String pajtsjbl;
	@Column(name = "pajtqj")
	private String pajtqj;
	@Column(name = "pajtqjbl")
	private String pajtqjbl;
	@Column(name = "pajtjdj")
	private String pajtjdj;
	@Column(name = "pajtjdjbl")
	private String pajtjdjbl;
	@Column(name = "lsjtqg")
	private String lsjtqg;
	@Column(name = "lsjtqgbl")
	private String lsjtqgbl;
	@Column(name = "lsjtsj")
	private String lsjtsj;
	@Column(name = "lsjtsjbl")
	private String lsjtsjbl;
	@Column(name = "lsjtqj")
	private String lsjtqj;
	@Column(name = "lsjtqjbl")
	private String lsjtqjbl;
	@Column(name = "lsjtjdj")
	private String lsjtjdj;
	@Column(name = "lsjtjdjbl")
	private String lsjtjdjbl;

	@Column(name = "qzxfxcls")
	private String qzxfxcls;
	@Column(name = "sxfhs")
	private String sxfhs;
	@Column(name = "xwg")
	private String xwg;
	
	@Column(name = "lxxm")
	private String lxxm;
	@Column(name = "lxdh")
	private String lxdh;
	
	@Column(name = "ljxf")
	private String ljxf;
	@Column(name = "ggcs")
	private String ggcs;
	@Column(name = "jkxcl")
	private String jkxcl;
	
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

	public String getWygsmc()
	{
		return wygsmc;
	}

	public void setWygsmc(String wygsmc)
	{
		this.wygsmc = wygsmc;
	}

	public String getWygsgs()
	{
		return wygsgs;
	}

	public void setWygsgs(String wygsgs)
	{
		this.wygsgs = wygsgs;
	}

	public String getBags()
	{
		return bags;
	}

	public void setBags(String bags)
	{
		this.bags = bags;
	}

	public String getJwhbgyfmj()
	{
		return jwhbgyfmj;
	}

	public void setJwhbgyfmj(String jwhbgyfmj)
	{
		this.jwhbgyfmj = jwhbgyfmj;
	}

	public String getHdsmj()
	{
		return hdsmj;
	}

	public void setHdsmj(String hdsmj)
	{
		this.hdsmj = hdsmj;
	}

	public String getXqzdmj()
	{
		return xqzdmj;
	}

	public void setXqzdmj(String xqzdmj)
	{
		this.xqzdmj = xqzdmj;
	}

	public String getFwjzmj()
	{
		return fwjzmj;
	}

	public void setFwjzmj(String fwjzmj)
	{
		this.fwjzmj = fwjzmj;
	}

	public String getLhmj()
	{
		return lhmj;
	}

	public void setLhmj(String lhmj)
	{
		this.lhmj = lhmj;
	}

	public String getJmzzxq()
	{
		return jmzzxq;
	}

	public void setJmzzxq(String jmzzxq)
	{
		this.jmzzxq = jmzzxq;
	}

	public String getZzl()
	{
		return zzl;
	}

	public void setZzl(String zzl)
	{
		this.zzl = zzl;
	}

	public String getXqlds()
	{
		return xqlds;
	}

	public void setXqlds(String xqlds)
	{
		this.xqlds = xqlds;
	}

	public String getMld()
	{
		return mld;
	}

	public void setMld(String mld)
	{
		this.mld = mld;
	}

	public String getXqdw()
	{
		return xqdw;
	}

	public void setXqdw(String xqdw)
	{
		this.xqdw = xqdw;
	}

	public String getGjqydw()
	{
		return gjqydw;
	}

	public void setGjqydw(String gjqydw)
	{
		this.gjqydw = gjqydw;
	}

	public String getWmls()
	{
		return wmls;
	}

	public void setWmls(String wmls)
	{
		this.wmls = wmls;
	}

	public String getSjwmls()
	{
		return sjwmls;
	}

	public void setSjwmls(String sjwmls)
	{
		this.sjwmls = sjwmls;
	}

	public String getQjwmls()
	{
		return qjwmls;
	}

	public void setQjwmls(String qjwmls)
	{
		this.qjwmls = qjwmls;
	}

	public String getJdjwmls()
	{
		return jdjwmls;
	}

	public void setJdjwmls(String jdjwmls)
	{
		this.jdjwmls = jdjwmls;
	}

	public String getWhwmjtqg()
	{
		return whwmjtqg;
	}

	public void setWhwmjtqg(String whwmjtqg)
	{
		this.whwmjtqg = whwmjtqg;
	}

	public String getWhwmjtqgbl()
	{
		return whwmjtqgbl;
	}

	public void setWhwmjtqgbl(String whwmjtqgbl)
	{
		this.whwmjtqgbl = whwmjtqgbl;
	}

	public String getWhwmjtsj()
	{
		return whwmjtsj;
	}

	public void setWhwmjtsj(String whwmjtsj)
	{
		this.whwmjtsj = whwmjtsj;
	}

	public String getWhwmjtsjbl()
	{
		return whwmjtsjbl;
	}

	public void setWhwmjtsjbl(String whwmjtsjbl)
	{
		this.whwmjtsjbl = whwmjtsjbl;
	}

	public String getWhwmjtqj()
	{
		return whwmjtqj;
	}

	public void setWhwmjtqj(String whwmjtqj)
	{
		this.whwmjtqj = whwmjtqj;
	}

	public String getWhwmjtqjbl()
	{
		return whwmjtqjbl;
	}

	public void setWhwmjtqjbl(String whwmjtqjbl)
	{
		this.whwmjtqjbl = whwmjtqjbl;
	}

	public String getWhwmjtjdj()
	{
		return whwmjtjdj;
	}

	public void setWhwmjtjdj(String whwmjtjdj)
	{
		this.whwmjtjdj = whwmjtjdj;
	}

	public String getWhwmjtjdjbl()
	{
		return whwmjtjdjbl;
	}

	public void setWhwmjtjdjbl(String whwmjtjdjbl)
	{
		this.whwmjtjdjbl = whwmjtjdjbl;
	}

	public String getXxxjtqg()
	{
		return xxxjtqg;
	}

	public void setXxxjtqg(String xxxjtqg)
	{
		this.xxxjtqg = xxxjtqg;
	}

	public String getXxxjtqgbl()
	{
		return xxxjtqgbl;
	}

	public void setXxxjtqgbl(String xxxjtqgbl)
	{
		this.xxxjtqgbl = xxxjtqgbl;
	}

	public String getXxxjtsj()
	{
		return xxxjtsj;
	}

	public void setXxxjtsj(String xxxjtsj)
	{
		this.xxxjtsj = xxxjtsj;
	}

	public String getXxxjtsjbl()
	{
		return xxxjtsjbl;
	}

	public void setXxxjtsjbl(String xxxjtsjbl)
	{
		this.xxxjtsjbl = xxxjtsjbl;
	}

	public String getXxxjtqj()
	{
		return xxxjtqj;
	}

	public void setXxxjtqj(String xxxjtqj)
	{
		this.xxxjtqj = xxxjtqj;
	}

	public String getXxxjtqjbl()
	{
		return xxxjtqjbl;
	}

	public void setXxxjtqjbl(String xxxjtqjbl)
	{
		this.xxxjtqjbl = xxxjtqjbl;
	}

	public String getXxxjtjdj()
	{
		return xxxjtjdj;
	}

	public void setXxxjtjdj(String xxxjtjdj)
	{
		this.xxxjtjdj = xxxjtjdj;
	}

	public String getXxxjtjdjbl()
	{
		return xxxjtjdjbl;
	}

	public void setXxxjtjdjbl(String xxxjtjdjbl)
	{
		this.xxxjtjdjbl = xxxjtjdjbl;
	}

	public String getPajtqg()
	{
		return pajtqg;
	}

	public void setPajtqg(String pajtqg)
	{
		this.pajtqg = pajtqg;
	}

	public String getPajtqgbl()
	{
		return pajtqgbl;
	}

	public void setPajtqgbl(String pajtqgbl)
	{
		this.pajtqgbl = pajtqgbl;
	}

	public String getPajtsj()
	{
		return pajtsj;
	}

	public void setPajtsj(String pajtsj)
	{
		this.pajtsj = pajtsj;
	}

	public String getPajtsjbl()
	{
		return pajtsjbl;
	}

	public void setPajtsjbl(String pajtsjbl)
	{
		this.pajtsjbl = pajtsjbl;
	}

	public String getPajtqj()
	{
		return pajtqj;
	}

	public void setPajtqj(String pajtqj)
	{
		this.pajtqj = pajtqj;
	}

	public String getPajtqjbl()
	{
		return pajtqjbl;
	}

	public void setPajtqjbl(String pajtqjbl)
	{
		this.pajtqjbl = pajtqjbl;
	}

	public String getPajtjdj()
	{
		return pajtjdj;
	}

	public void setPajtjdj(String pajtjdj)
	{
		this.pajtjdj = pajtjdj;
	}

	public String getPajtjdjbl()
	{
		return pajtjdjbl;
	}

	public void setPajtjdjbl(String pajtjdjbl)
	{
		this.pajtjdjbl = pajtjdjbl;
	}

	public String getLsjtqg()
	{
		return lsjtqg;
	}

	public void setLsjtqg(String lsjtqg)
	{
		this.lsjtqg = lsjtqg;
	}

	public String getLsjtqgbl()
	{
		return lsjtqgbl;
	}

	public void setLsjtqgbl(String lsjtqgbl)
	{
		this.lsjtqgbl = lsjtqgbl;
	}

	public String getLsjtsj()
	{
		return lsjtsj;
	}

	public void setLsjtsj(String lsjtsj)
	{
		this.lsjtsj = lsjtsj;
	}

	public String getLsjtsjbl()
	{
		return lsjtsjbl;
	}

	public void setLsjtsjbl(String lsjtsjbl)
	{
		this.lsjtsjbl = lsjtsjbl;
	}

	public String getLsjtqj()
	{
		return lsjtqj;
	}

	public void setLsjtqj(String lsjtqj)
	{
		this.lsjtqj = lsjtqj;
	}

	public String getLsjtqjbl()
	{
		return lsjtqjbl;
	}

	public void setLsjtqjbl(String lsjtqjbl)
	{
		this.lsjtqjbl = lsjtqjbl;
	}

	public String getLsjtjdj()
	{
		return lsjtjdj;
	}

	public void setLsjtjdj(String lsjtjdj)
	{
		this.lsjtjdj = lsjtjdj;
	}

	public String getLsjtjdjbl()
	{
		return lsjtjdjbl;
	}

	public void setLsjtjdjbl(String lsjtjdjbl)
	{
		this.lsjtjdjbl = lsjtjdjbl;
	}

	public String getQzxfxcls()
	{
		return qzxfxcls;
	}

	public void setQzxfxcls(String qzxfxcls)
	{
		this.qzxfxcls = qzxfxcls;
	}

	public String getSxfhs()
	{
		return sxfhs;
	}

	public void setSxfhs(String sxfhs)
	{
		this.sxfhs = sxfhs;
	}

	public String getXwg()
	{
		return xwg;
	}

	public void setXwg(String xwg)
	{
		this.xwg = xwg;
	}

	public String getLjxf()
	{
		return ljxf;
	}

	public void setLjxf(String ljxf)
	{
		this.ljxf = ljxf;
	}

	public String getGgcs()
	{
		return ggcs;
	}

	public void setGgcs(String ggcs)
	{
		this.ggcs = ggcs;
	}

	public String getJkxcl()
	{
		return jkxcl;
	}

	public void setJkxcl(String jkxcl)
	{
		this.jkxcl = jkxcl;
	}

	public String getLxxm()
	{
		return lxxm;
	}

	public void setLxxm(String lxxm)
	{
		this.lxxm = lxxm;
	}

	public String getLxdh()
	{
		return lxdh;
	}

	public void setLxdh(String lxdh)
	{
		this.lxdh = lxdh;
	}
	

}
