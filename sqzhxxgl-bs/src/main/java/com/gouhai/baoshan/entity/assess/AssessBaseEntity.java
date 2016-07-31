package com.gouhai.baoshan.entity.assess;

/**
 * @author sun 2014-09-04
 */

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;

/**
 * 业务表单
 * 
 * @author sun 六大考核 大类 社会治安 公共安全 住宅管理 社区环境 民主自治 人口管理 各为100分
 */
@Entity
@Table(name = "bs_business_assess_baseentity")
public class AssessBaseEntity extends BaseEntity {

	@Column(name = "NAME")
	private String name; // 考核名称

	@Column(name = "enableFlag")
	// 可用状态
	private boolean enableFlag;

	@Column(name = "SUM_SCORE")
	private String sumScore; // 总分

	@Column(name = "DESCRIPTION")
	private String description; // 描述

	@Column(name = "identity")
	private int identity; // 标识居委 和村委 1:表示居委 0：标识村委

	@Column(name = "identityName")
	private String identityName;// 据魏村委描述

	@Column(name = "des")
	private String des;// 排序的字段

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getIdentityName() {
		return identityName;
	}

	public void setIdentityName(String identityName) {
		this.identityName = identityName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "assessBaseEntity")
	private List<AssessTemplate> assessTemplates = new ArrayList<AssessTemplate>();

	public List<AssessTemplate> getAssessTemplates() {
		return assessTemplates;
	}

	public void setAssessTemplates(List<AssessTemplate> assessTemplates) {
		this.assessTemplates = assessTemplates;
	}

	public String getName() {
		return name;
	}

	public int getIdentity() {
		return identity;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isEnableFlag() {
		return enableFlag;
	}

	public void setEnableFlag(boolean enableFlag) {
		this.enableFlag = enableFlag;
	}

	public String getSumScore() {
		return sumScore;
	}

	public void setSumScore(String sumScore) {
		this.sumScore = sumScore;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AssessBaseEntity() {

	}

	public AssessBaseEntity(String id) {
		this.id = id;
	}
}
