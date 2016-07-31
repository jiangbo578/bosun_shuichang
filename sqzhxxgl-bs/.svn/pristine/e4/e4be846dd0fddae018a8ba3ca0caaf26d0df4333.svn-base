/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.utils.StringUtil;

/**
 * 业务
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Entity
@Table(name = "bs_business")
public class Business extends BaseEntity {

	@Column(name = "NAME")
	private String name; // 业务名称
	@Column(name = "CODE")
	private String code; // 业务代号,首字母大写
	@Column(name = "LOWER_CODE")
	private String lowerCode; // 小写业务代号
	@Column(name = "FORMAT")
	private String format; // 业务名称格式
	@Column(name = "AUDIT")
	private boolean audit; // 是否审核
	@Column(name = "REMIND")
	private boolean remind; // 是否提醒
	@Column(name = "PARID")
	private String parid; // 父类
	@Column(name = "period")
	private String period;// 填报周期
	@Column(name = "exporttype")
	private int exporttype;// 导出类型。0代表doc，1代表excel

	/*
	 * @Column(name = "TRREID") private Integer trreid; //
	 * 
	 * @Column(name = "PARNAME") private String parName; //
	 * 
	 * 
	 * public Integer getTrreid() { return trreid; }
	 * 
	 * public void setTrreid(Integer trreid) { this.trreid = trreid; }
	 * 
	 * public String getParName() { return parName; }
	 * 
	 * public void setParName(String parName) { this.parName = parName; }
	 */

	public int getExporttype() {
		return exporttype;
	}

	public void setExporttype(int exporttype) {
		this.exporttype = exporttype;
	}

	public Business() {

	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getParid() {
		return parid;
	}

	public void setParid(String parid) {
		this.parid = parid;
	}

	public Business(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isAudit() {
		return audit;
	}

	public void setAudit(boolean audit) {
		this.audit = audit;
	}

	public boolean isRemind() {
		return remind;
	}

	public void setRemind(boolean remind) {
		this.remind = remind;
	}

	public String getLowerCode() {
		return lowerCode;
	}

	public void setLowerCode() {
		if (!StringUtil.isEmpty(code)) {
			this.lowerCode = code.toLowerCase();
		}
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

}
