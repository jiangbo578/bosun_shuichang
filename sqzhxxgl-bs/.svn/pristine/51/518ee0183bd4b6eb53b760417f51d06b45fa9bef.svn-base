package com.gouhai.baoshan.entity.business.dqgz.zb.head;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Zcdygkbt;

/**
 * 在册党员概况及名册
 * 
 * @author 徐舟
 * 
 */
@Entity
@Table(name = "bs_business_zcdygk")
public class Zcdygk extends BaseEntity {
	@Column(name = "jzsj")
	private String jzsj;// 截止时间
	@Column(name = "dyzs")
	private String dyzs;// 党员总数
	@Column(name = "zsdy")
	private String zsdy;// 正式党员
	@Column(name = "ybdy")
	private String ybdy;// 预备党员
	@Column(name = "tx")
	private String tx;// 退休党员
	@Column(name = "zz")
	private String zz;// 在职党员
	@Column(name = "ndy")
	private String ndy;// 男党员
	@Column(name = "nvdy")
	private String nvdy;// 女党员
	@Column(name = "ew")
	private String ew;// 25岁一下党员
	@Column(name = "ws")
	private String ws;// 26-54岁党员
	@Column(name = "wj")
	private String wj;// 55-59岁党员
	@Column(name = "lj")
	private String lj;// 60—69岁党员
	@Column(name = "bs")
	private String bs;// 70—80岁党员
	@Column(name = "bsys")
	private String bsys;// 80岁以上党员
	@Column(name = "cz")
	private String cz;// 初中及以下
	@Column(name = "gz")
	private String gz;// 高中/中专/职高
	@Column(name = "dx")
	private String dx;// 大学及以上
	@Column(name = "kndy")
	private String kndy;// 困难党员
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	@OneToMany(mappedBy = "zcdygk", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Zcdygkbt> zcdygkbtlist;

	public Zcdygk() {

	}

	public Zcdygk(String id) {
		this.id = id;
	}

	public List<Zcdygkbt> getZcdygkbtlist() {
		return zcdygkbtlist;
	}

	public void setZcdygkbtlist(List<Zcdygkbt> zcdygkbtlist) {
		this.zcdygkbtlist = zcdygkbtlist;
	}

	public String getJzsj() {
		return jzsj;
	}

	public void setJzsj(String jzsj) {
		this.jzsj = jzsj;
	}

	public String getDyzs() {
		return dyzs;
	}

	public void setDyzs(String dyzs) {
		this.dyzs = dyzs;
	}

	public String getZsdy() {
		return zsdy;
	}

	public void setZsdy(String zsdy) {
		this.zsdy = zsdy;
	}

	public String getYbdy() {
		return ybdy;
	}

	public void setYbdy(String ybdy) {
		this.ybdy = ybdy;
	}

	public String getTx() {
		return tx;
	}

	public void setTx(String tx) {
		this.tx = tx;
	}

	public String getZz() {
		return zz;
	}

	public void setZz(String zz) {
		this.zz = zz;
	}

	public String getNdy() {
		return ndy;
	}

	public void setNdy(String ndy) {
		this.ndy = ndy;
	}

	public String getNvdy() {
		return nvdy;
	}

	public void setNvdy(String nvdy) {
		this.nvdy = nvdy;
	}

	public String getEw() {
		return ew;
	}

	public void setEw(String ew) {
		this.ew = ew;
	}

	public String getWs() {
		return ws;
	}

	public void setWs(String ws) {
		this.ws = ws;
	}

	public String getWj() {
		return wj;
	}

	public void setWj(String wj) {
		this.wj = wj;
	}

	public String getLj() {
		return lj;
	}

	public void setLj(String lj) {
		this.lj = lj;
	}

	public String getBs() {
		return bs;
	}

	public void setBs(String bs) {
		this.bs = bs;
	}

	public String getBsys() {
		return bsys;
	}

	public void setBsys(String bsys) {
		this.bsys = bsys;
	}

	public String getCz() {
		return cz;
	}

	public void setCz(String cz) {
		this.cz = cz;
	}

	public String getGz() {
		return gz;
	}

	public void setGz(String gz) {
		this.gz = gz;
	}

	public String getDx() {
		return dx;
	}

	public void setDx(String dx) {
		this.dx = dx;
	}

	public String getKndy() {
		return kndy;
	}

	public void setKndy(String kndy) {
		this.kndy = kndy;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
