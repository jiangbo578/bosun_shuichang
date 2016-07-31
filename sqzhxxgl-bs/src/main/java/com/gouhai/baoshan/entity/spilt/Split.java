package com.gouhai.baoshan.entity.spilt;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 联系单主信息表
 * 
 * @author Administrator
 * 
 */
@Entity
@Table(name = "bs_split")
public class Split {
	@Id
	@Column(name = "pid")
	@GeneratedValue(generator = "hibernate-uuid")
	@GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
	private String pid;
	@Column(name = "street")
	private String street;
	@Column(name = "streetId")
	private String streetId;
	@Column(name = "year")
	private String year;
	@Column(name = "num")
	private String num;
	@Column(name = "address")
	private String address;
	@Column(name = "event")
	private String event;
	@Column(name = "eventDate")
	private String eventDate;
	@Column(name = "content", length = 10000000)
	private String content;
	@Column(name = "committee")
	private String committee;
	@Column(name = "committeeId")
	private String committeeId;
	@Column(name = "date")
	private String date;
	@Column(name = "realDate")
	private String realDate;
	@Column(name = "receipt")
	private String receipt;
	@Column(name = "receiptDate")
	private String receiptDate;
	@Column(name = "tempData")
	private String tempData;
	@Column(name = "wbj")
	private String wbj;

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreetId() {
		return streetId;
	}

	public void setStreetId(String streetId) {
		this.streetId = streetId;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCommittee() {
		return committee;
	}

	public void setCommittee(String committee) {
		this.committee = committee;
	}

	public String getCommitteeId() {
		return committeeId;
	}

	public void setCommitteeId(String committeeId) {
		this.committeeId = committeeId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getRealDate() {
		return realDate;
	}

	public void setRealDate(String realDate) {
		this.realDate = realDate;
	}

	public String getReceipt() {
		return receipt;
	}

	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}

	public String getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(String receiptDate) {
		this.receiptDate = receiptDate;
	}

	public String getTempData() {
		return tempData;
	}

	public void setTempData(String tempData) {
		this.tempData = tempData;
	}

	public String getWbj() {
		return wbj;
	}

	public void setWbj(String wbj) {
		this.wbj = wbj;
	}

}
