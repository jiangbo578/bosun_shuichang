package com.gouhai.baoshan.entity.assess;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.gouhai.baoshan.entity.BaseEntity;

/**
 * 600分考评提醒
 * 
 * @author 徐舟
 * 
 *         2014-9-25
 */
@Entity
@Table(name = "bs_assess_remind")
public class AssessRemind extends BaseEntity {

	@Column(name = "REMIND_DATE")
	@Temporal(TemporalType.DATE)
	private Date remindDate; // 提醒日期--月日

	@Column(name = "GREEN_START")
	@Temporal(TemporalType.DATE)
	private Date greenStart; // 绿灯开始日期--月日

	@Column(name = "YELLOW_START")
	@Temporal(TemporalType.DATE)
	private Date yellowStart; // 黄灯开始日期--月日

	@Column(name = "RED_STAERT")
	@Temporal(TemporalType.DATE)
	private Date redStart; // 红灯开始日期--月日

	private String assessTemplateInstance;// 考评

	public Date getRemindDate() {
		return remindDate;
	}

	public void setRemindDate(Date remindDate) {
		this.remindDate = remindDate;
	}

	public Date getGreenStart() {
		return greenStart;
	}

	public void setGreenStart(Date greenStart) {
		this.greenStart = greenStart;
	}

	public Date getYellowStart() {
		return yellowStart;
	}

	public void setYellowStart(Date yellowStart) {
		this.yellowStart = yellowStart;
	}

	public Date getRedStart() {
		return redStart;
	}

	public void setRedStart(Date redStart) {
		this.redStart = redStart;
	}

	public String getAssessTemplateInstance() {
		return assessTemplateInstance;
	}

	public void setAssessTemplateInstance(String assessTemplateInstance) {
		this.assessTemplateInstance = assessTemplateInstance;
	}

}
