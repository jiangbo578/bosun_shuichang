package com.gouhai.baoshan.entity.assess;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.user.Organization;

/**
 * 保存600分评级的分数
 * 
 * @author 徐舟
 * 
 *         2014-10-14
 */
@Entity
@Table(name = "bs_assess_score")
public class Score extends BaseEntity {
	@OneToOne
	@JoinColumn(name = "Asses_ID", unique = true)
	private AssessBaseEntity assessBaseEntity;// 考核条目所属大类

	@OneToOne
	@JoinColumn(name = "ORGANIZATION_ID", unique = true)
	private Organization organization;// 用户所在组织机构（给具体村居添加时设置的）

	@Column(name = "score")
	private double score;
	@Column(name = "date")
	private String date;// 时间

	public AssessBaseEntity getAssessBaseEntity() {
		return assessBaseEntity;
	}

	public void setAssessBaseEntity(AssessBaseEntity assessBaseEntity) {
		this.assessBaseEntity = assessBaseEntity;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
