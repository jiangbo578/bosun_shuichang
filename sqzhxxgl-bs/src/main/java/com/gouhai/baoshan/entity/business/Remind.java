/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity.business;

import org.codehaus.jackson.map.annotate.JsonSerialize;


/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Remind {

	private String name;
	private String url;
	private int type; //提醒类型：1：绿灯，2：黄灯，3：红灯

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String code) {
		this.url = new StringBuilder().append("/").append(code).append("/add").toString();
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
