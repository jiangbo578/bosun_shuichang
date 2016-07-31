/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity.dictionary;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;

/**
 * 数据字典
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Entity
@Table(name = "bs_dictionary")
// @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Dictionary extends BaseEntity {

	private String name;
	private String description;
	private int type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
