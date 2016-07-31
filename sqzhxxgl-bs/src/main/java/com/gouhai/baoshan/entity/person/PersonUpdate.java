///**
// * Copyright (c) www.zouqi.com
// */
//
//package com.gouhai.baoshan.entity.person;
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//
//import com.gouhai.baoshan.entity.BaseEntity;
//
///**
// * 社区人口库更新内容记录
// * 
// * @author zhengzhi [zheng_zhi@163.com]
// * 
// */
//@Entity
//@Table(name = "bs_person_update")
//public class PersonUpdate extends BaseEntity {
//
//	@Column(name = "UPDATETIME", insertable = true)
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date updateTime = new Date(); // 更新时间
//
//	@OneToOne
//	@JoinColumn(name = "PERSONID", insertable = true, unique = true)
//	private Person person; // 本地人口库
//
//	public Date getUpdateTime() {
//		return updateTime;
//	}
//
//	public void setUpdateTime(Date updateTime) {
//		this.updateTime = updateTime;
//	}
//
//	public Person getPerson() {
//		return person;
//	}
//
//	public void setPerson(Person person) {
//		this.person = person;
//	}
//}
