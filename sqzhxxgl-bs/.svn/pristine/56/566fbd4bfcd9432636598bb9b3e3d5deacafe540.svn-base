/**
 * Copyright (c) www.zouqi.com
 */
package com.gouhai.baoshan.entity.log;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.gouhai.baoshan.entity.BaseEntity;

/**
 * 记录日志
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Entity
@Table(name = "bs_log")
public class Logger extends BaseEntity {

	@Column(name = "URL")
	private String url;
	
	@Column(name = "TIME", insertable=true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date time = new Date();
	
	@Column(name = "MESSAGE")
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}
