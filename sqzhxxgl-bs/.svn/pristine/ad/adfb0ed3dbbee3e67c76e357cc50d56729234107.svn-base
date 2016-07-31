/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.annotations.GenericGenerator;

import com.gouhai.baoshan.utils.StringUtil;

/**
 * Entity的基类
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@MappedSuperclass
public class BaseEntity{

	@Id
	@Column(name = "PID")
	@GeneratedValue(generator = "hibernate-uuid")
	@GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
	protected String id;
	
	@Column(name = "INSERT_DATE", insertable = true, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	protected Date insertDate = new Date();

	@Column(name = "UPDATE_DATE", insertable = false, updatable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate = new Date();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BaseEntity)) {
            return false;
        }
        BaseEntity o = (BaseEntity)other;
        String oid = o.getId();
        if( StringUtil.isEmpty(id) || StringUtil.isEmpty(oid) ){
            return false;
        }
        return id.equalsIgnoreCase(oid);
    }
    
    @Override
    public int hashCode() {
		return new HashCodeBuilder().append(this.getId()).toHashCode();
    }
    
    @Override
    public String toString(){
		return id;
    }

}
