/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity.publics;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;

/**
 * 
 * 新闻表
 * 
 * @author 肖得明
 * 
 */
@Entity
@Table(name = "public_news")
public class News extends BaseEntity {

	@Column(name = "titles")
	private String titles; // 标题

	@Column(name = "texts", length = 100000)
	private String texts; // 内容

	@Column(name = "adddate")
	private String adddate; // 发布时间

	@Column(name = "senduser")
	private String senduser; // 发布时间

	@Column(name = "type")
	private String type;// 新闻分类

	public String getTitles() {
		return titles;
	}

	public void setTitles(String titles) {
		this.titles = titles;
	}

	public String getTexts() {
		return texts;
	}

	public void setTexts(String texts) {
		this.texts = texts;
	}

	public String getAdddate() {
		return adddate;
	}

	public void setAdddate(String adddate) {
		this.adddate = adddate;
	}

	public String getSenduser() {
		return senduser;
	}

	public void setSenduser(String senduser) {
		this.senduser = senduser;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
