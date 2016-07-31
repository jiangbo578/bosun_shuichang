package com.gouhai.baoshan.entity.assess;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;

/**
 * 600分考评规则
 * 
 * @author 徐舟
 * 
 *         2014-9-18
 */
@Entity
@Table(name = "bs_business_rule")
public class Rule extends BaseEntity {

	@Column(name = "content")
	private String content;// 规则
	@Column(name = "score")
	private double score;// 分数
	@Column(name = "identity")
	private String identity; 
	@Column(name = "remark")
	private String remark;// 备注
	@Column(name = "average")
	private Double average;//平均值

	// 一方考核条目
	@ManyToOne
	@JoinColumn(name = "khtm_id")
	private AssessTemplate assessTemplate;

	public Double getAverage() {
		return average;
	}

	public void setAverage(Double average) {
		this.average = average;
	}

	public AssessTemplate getAssessTemplate() {
		return assessTemplate;
	}

	public void setAssessTemplate(AssessTemplate assessTemplate) {
		this.assessTemplate = assessTemplate;
	}



	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
