package com.gouhai.baoshan.entity.mould;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.gouhai.baoshan.entity.BaseEntity;

/**
 * 模板导出模型
 * 
 * @author 徐舟
 * 
 *         2014-9-30
 */
@Entity
@Table(name = "bs_mould")
public class Mould extends BaseEntity {
	@Column(name = "mould_name")
	private String mould_name;// 模板名称
	@Column(name = "department")
	private String department;// 使用部门
	@Column(name = "remark")
	private String remark;// 备注
	@Transient
	private List<Mould_Gather> mould_Gathers;// 模板表单的集合

	public String getMould_name() {
		return mould_name;
	}

	public void setMould_name(String mould_name) {
		this.mould_name = mould_name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<Mould_Gather> getMould_Gathers() {
		return mould_Gathers;
	}

	public void setMould_Gathers(List<Mould_Gather> mould_Gathers) {
		this.mould_Gathers = mould_Gathers;
	}

	public Mould() {

	}

	public Mould(String id) {
		this.id = id;
	}
}
