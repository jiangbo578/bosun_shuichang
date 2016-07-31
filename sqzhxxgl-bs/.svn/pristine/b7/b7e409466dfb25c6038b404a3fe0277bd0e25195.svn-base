/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity.business;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.utils.DateTimeUtil;

/**
 * 业务表单
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Entity
@Table(name = "bs_business_form")
public class BusinessForm extends BaseEntity {

	@Column(name = "NAME")
	private String name; // 名单名称

	@Column(name = "REMARK")
	private String remark; // 审核意见

	@Column(name = "SYS_CREATE")
	private boolean sysCreate; // 是否系统生成

	@OneToOne
	@JoinColumn(name = "BUSINESS_ID", unique = true)
	private Business business;// 业务

	@OneToOne
	@JoinColumn(name = "USER_ID", unique = true)
	private User user;

	@Column(name = "PROCESSINSTANCE_ID")
	private String processInstanceId; // 流程实例编号
	@Column(name = "PROCESS_STATUS")
	private String processStatus; // 流程状态

	@Column(name = "Submit_Date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date submitdate;// 提交审核的时候

	public Date getSubmitdate() {
		return submitdate;
	}

	public void setSubmitdate(Date submitdate) {
		this.submitdate = submitdate;
	}

	public BusinessForm() {

	}

	public BusinessForm(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	public boolean isSysCreate() {
		return sysCreate;
	}

	public void setSysCreate(boolean sysCreate) {
		this.sysCreate = sysCreate;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Transient
	private String formatRemark;
	@Transient
	private String insertTime;

	public String getInsertTime() {
		insertTime = DateTimeUtil.getDateToString(this.insertDate,"yyyy年MM月dd日 ");
		return insertTime;
	}

	public void setInsertTime(String insertTime) {
		this.insertTime = insertTime;
	}

	public String getFormatRemark() {
		if (this.processStatus==null) {
			formatRemark = "未审核";
		}else{
			formatRemark=this.processStatus;
		}
		return formatRemark;
	}

	public void setFormatRemark(String formatRemark) {
		this.formatRemark = formatRemark;
	}
}
