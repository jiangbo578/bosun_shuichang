package com.gouhai.baoshan.entity.business.dqgz.zb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 联系服务群众工作统计表
 * 
 * @author 徐舟
 * 
 */
@Entity
@Table(name = "bs_business_lxfwqzgz")
public class Lxfwqzgz extends BaseEntity {
	@Column(name = "rhzfys")
	private String rhzfys;// 入户走访月数
	@Column(name = "rhzfljs")
	private String rhzfljs;// 入户走访累计数

	@Column(name = "frhzfys")
	private String frhzfys;// 非入户走访月数
	@Column(name = "frhzfljs")
	private String frhzfljs;// 非入户走访累计数

	@Column(name = "mslys")
	private String mslys;// 民生类月数
	@Column(name = "mslljs")
	private String mslljs;// 民生类累计数

	@Column(name = "wslys")
	private String wslys;// 公共环境卫生类月数
	@Column(name = "wslljs")
	private String wslljs;// 公共环境卫生类月数

	@Column(name = "wygllys")
	private String wygllys;// 物业管理类月数
	@Column(name = "wygllljs")
	private String wygllljs;// 物业管理类累计数

	@Column(name = "zagllys")
	private String zagllys;// 治安管理类月数
	@Column(name = "zagllljs")
	private String zagllljs;// 治安管理类累计数

	@Column(name = "hjys")
	private String hjys;// 合计月数
	@Column(name = "hjljs")
	private String hjljs;// 合计

	@Column(name = "qtlys")
	private String qtlys;
	@Column(name = "qtlljs")
	private String qtlljs;

	@Column(name = "zxwtlys")
	private String zxwtlys;// 征询问题类月数
	@Column(name = "zxwtlljs")
	private String zxwtlljs;// 征询问题类累计数

	@Column(name = "jmqyjjys")
	private String jmqyjjys;// 居民区已解决问题（件）
	@Column(name = "jmqyjjljs")
	private String jmqyjjljs;// 居民区已解决问题（件）

	@Column(name = "kczxjjys")
	private String kczxjjys;// 块层面自行解决（件）
	@Column(name = "kczxjjljs")
	private String kczxjjljs;// 块层面自行解决（件）

	@Column(name = "cmxtjjys")
	private String cmxtjjys;// 街镇层面协调解决（件）
	@Column(name = "cmxtjjljs")
	private String cmxtjjljs;// 街镇层面协调解决（件）

	@Column(name = "sdbjjys")
	private String sdbjjys;// 双代表解决（件）
	@Column(name = "sdbjjljs")
	private String sdbjjljs;// 双代表解决（件）

	@Column(name = "nyjjys")
	private String nyjjys;// 短时期内难以解决（件）
	@Column(name = "nyjjljs")
	private String nyjjljs;// 短时期内难以解决（件）

	@Column(name = "hjzdmdys")
	private String hjzdmdys;// 化解重大矛盾（起）
	@Column(name = "hjzdmdljs")
	private String hjzdmdljs;// 化解重大矛盾（起）

	@Column(name = "djjwtys")
	private String djjwtys;// 上报街道待解决问题（件）
	@Column(name = "djjwtljs")
	private String djjwtljs;// 上报街道待解决问题（件）

	@Column(name = "sbnwjj")
	private String sbnwjj;// 上年未解决问题（起）
	@Column(name = "sbnyl")
	private String sbnyl;// 上年遗留问题解决
	@Column(name = "ks")
	private String ks;// 块数
	@Column(name = "ztll")
	private String ztll;// 组团力量（人）
	@Column(name = "bz")
	private String bz;// 备注
	@Column(name = "tbrqm")
	private String tbrqm;// 填表人签名
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getRhzfys() {
		return rhzfys;
	}

	public void setRhzfys(String rhzfys) {
		this.rhzfys = rhzfys;
	}

	public String getRhzfljs() {
		return rhzfljs;
	}

	public void setRhzfljs(String rhzfljs) {
		this.rhzfljs = rhzfljs;
	}

	public String getFrhzfys() {
		return frhzfys;
	}

	public void setFrhzfys(String frhzfys) {
		this.frhzfys = frhzfys;
	}

	public String getFrhzfljs() {
		return frhzfljs;
	}

	public void setFrhzfljs(String frhzfljs) {
		this.frhzfljs = frhzfljs;
	}

	public String getMslys() {
		return mslys;
	}

	public void setMslys(String mslys) {
		this.mslys = mslys;
	}

	public String getMslljs() {
		return mslljs;
	}

	public void setMslljs(String mslljs) {
		this.mslljs = mslljs;
	}

	public String getWslys() {
		return wslys;
	}

	public void setWslys(String wslys) {
		this.wslys = wslys;
	}

	public String getWslljs() {
		return wslljs;
	}

	public void setWslljs(String wslljs) {
		this.wslljs = wslljs;
	}

	public String getWygllys() {
		return wygllys;
	}

	public void setWygllys(String wygllys) {
		this.wygllys = wygllys;
	}

	public String getWygllljs() {
		return wygllljs;
	}

	public void setWygllljs(String wygllljs) {
		this.wygllljs = wygllljs;
	}

	public String getZagllys() {
		return zagllys;
	}

	public void setZagllys(String zagllys) {
		this.zagllys = zagllys;
	}

	public String getZagllljs() {
		return zagllljs;
	}

	public void setZagllljs(String zagllljs) {
		this.zagllljs = zagllljs;
	}

	public String getHjys() {
		return hjys;
	}

	public void setHjys(String hjys) {
		this.hjys = hjys;
	}

	public String getHjljs() {
		return hjljs;
	}

	public void setHjljs(String hjljs) {
		this.hjljs = hjljs;
	}

	public String getQtlys() {
		return qtlys;
	}

	public void setQtlys(String qtlys) {
		this.qtlys = qtlys;
	}

	public String getQtlljs() {
		return qtlljs;
	}

	public void setQtlljs(String qtlljs) {
		this.qtlljs = qtlljs;
	}

	public String getZxwtlys() {
		return zxwtlys;
	}

	public void setZxwtlys(String zxwtlys) {
		this.zxwtlys = zxwtlys;
	}

	public String getZxwtlljs() {
		return zxwtlljs;
	}

	public void setZxwtlljs(String zxwtlljs) {
		this.zxwtlljs = zxwtlljs;
	}

	public String getJmqyjjys() {
		return jmqyjjys;
	}

	public void setJmqyjjys(String jmqyjjys) {
		this.jmqyjjys = jmqyjjys;
	}

	public String getJmqyjjljs() {
		return jmqyjjljs;
	}

	public void setJmqyjjljs(String jmqyjjljs) {
		this.jmqyjjljs = jmqyjjljs;
	}

	public String getKczxjjys() {
		return kczxjjys;
	}

	public void setKczxjjys(String kczxjjys) {
		this.kczxjjys = kczxjjys;
	}

	public String getKczxjjljs() {
		return kczxjjljs;
	}

	public void setKczxjjljs(String kczxjjljs) {
		this.kczxjjljs = kczxjjljs;
	}

	public String getCmxtjjys() {
		return cmxtjjys;
	}

	public void setCmxtjjys(String cmxtjjys) {
		this.cmxtjjys = cmxtjjys;
	}

	public String getCmxtjjljs() {
		return cmxtjjljs;
	}

	public void setCmxtjjljs(String cmxtjjljs) {
		this.cmxtjjljs = cmxtjjljs;
	}

	public String getSdbjjys() {
		return sdbjjys;
	}

	public void setSdbjjys(String sdbjjys) {
		this.sdbjjys = sdbjjys;
	}

	public String getSdbjjljs() {
		return sdbjjljs;
	}

	public void setSdbjjljs(String sdbjjljs) {
		this.sdbjjljs = sdbjjljs;
	}

	public String getNyjjys() {
		return nyjjys;
	}

	public void setNyjjys(String nyjjys) {
		this.nyjjys = nyjjys;
	}

	public String getNyjjljs() {
		return nyjjljs;
	}

	public void setNyjjljs(String nyjjljs) {
		this.nyjjljs = nyjjljs;
	}

	public String getHjzdmdys() {
		return hjzdmdys;
	}

	public void setHjzdmdys(String hjzdmdys) {
		this.hjzdmdys = hjzdmdys;
	}

	public String getHjzdmdljs() {
		return hjzdmdljs;
	}

	public void setHjzdmdljs(String hjzdmdljs) {
		this.hjzdmdljs = hjzdmdljs;
	}

	public String getDjjwtys() {
		return djjwtys;
	}

	public void setDjjwtys(String djjwtys) {
		this.djjwtys = djjwtys;
	}

	public String getDjjwtljs() {
		return djjwtljs;
	}

	public void setDjjwtljs(String djjwtljs) {
		this.djjwtljs = djjwtljs;
	}

	public String getSbnwjj() {
		return sbnwjj;
	}

	public void setSbnwjj(String sbnwjj) {
		this.sbnwjj = sbnwjj;
	}

	public String getSbnyl() {
		return sbnyl;
	}

	public void setSbnyl(String sbnyl) {
		this.sbnyl = sbnyl;
	}

	public String getKs() {
		return ks;
	}

	public void setKs(String ks) {
		this.ks = ks;
	}

	public String getZtll() {
		return ztll;
	}

	public void setZtll(String ztll) {
		this.ztll = ztll;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getTbrqm() {
		return tbrqm;
	}

	public void setTbrqm(String tbrqm) {
		this.tbrqm = tbrqm;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
