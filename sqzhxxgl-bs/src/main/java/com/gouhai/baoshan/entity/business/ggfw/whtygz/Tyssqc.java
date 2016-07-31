package com.gouhai.baoshan.entity.business.ggfw.whtygz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.ggfw.whtygz.head.Tyssqclb;

/**
 * 上海市社区公共体育设施器材（场地）详细情况登记表
 * 
 * @author 徐舟
 * 
 *         与人口无关，无需审核，有填报周期
 */
@Entity
@Table(name = "bs_business_tyssqc")
public class Tyssqc extends BaseEntity {
	@Column(name = "qcmc")
	private String qcmc;// 名称
	@Column(name = "sl")
	private String sl;// 数量
	@ManyToOne
	@JoinColumn(name = "tyssqclb_id")
	private Tyssqclb tyssqclb;

	public String getQcmc() {
		return qcmc;
	}

	public void setQcmc(String qcmc) {
		this.qcmc = qcmc;
	}

	public String getSl() {
		return sl;
	}

	public void setSl(String sl) {
		this.sl = sl;
	}

	public Tyssqclb getTyssqclb() {
		return tyssqclb;
	}

	public void setTyssqclb(Tyssqclb tyssqclb) {
		this.tyssqclb = tyssqclb;
	}

	public Tyssqc(String id) {
		this.id = id;
	}

	public Tyssqc() {

	}
}
