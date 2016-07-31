package com.gouhai.baoshan.entity.spilt;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
/**
 * 流转单
 * @author MedivhQ
 *
 */
@Entity
@Table(name = "bs_copyobject")
public class CopyObject
{
	@Id
	@Column(name = "pid")
	@GeneratedValue(generator = "hibernate-uuid")
	@GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
	private String pid;
	@Column(name = "fromId")
	private String fromId;
	@Column(name = "fromName")
	private String fromName;
	@Column(name = "myId")
	private String myId;
	@Column(name = "myName")
	private String myName;
	@Column(name = "splitId")
	private String splitId;
	@Column(name = "copyType")
	private String copyType;
	@Column(name = "replyContent",length = 100000)
	private String replyContent;
	@Column(name = "copyDate")
	private String copyDate;
	@Column(name = "replyDate")
	private String replyDate;
	@Column(name = "tempData")
	private String tempData;
	@Column(name = "num")
	private String num;
	
	
	public String getPid()
	{
		return pid;
	}
	public void setPid(String pid)
	{
		this.pid = pid;
	}
	public String getFromId()
	{
		return fromId;
	}
	public void setFromId(String fromId)
	{
		this.fromId = fromId;
	}
	public String getFromName()
	{
		return fromName;
	}
	public void setFromName(String fromName)
	{
		this.fromName = fromName;
	}
	public String getMyId()
	{
		return myId;
	}
	public void setMyId(String myId)
	{
		this.myId = myId;
	}
	public String getMyName()
	{
		return myName;
	}
	public void setMyName(String myName)
	{
		this.myName = myName;
	}
	public String getSplitId()
	{
		return splitId;
	}
	public void setSplitId(String splitId)
	{
		this.splitId = splitId;
	}
	public String getCopyType()
	{
		return copyType;
	}
	public void setCopyType(String copyType)
	{
		this.copyType = copyType;
	}
	public String getReplyContent()
	{
		return replyContent;
	}
	public void setReplyContent(String replyContent)
	{
		this.replyContent = replyContent;
	}
	public String getCopyDate()
	{
		return copyDate;
	}
	public void setCopyDate(String copyDate)
	{
		this.copyDate = copyDate;
	}
	public String getReplyDate()
	{
		return replyDate;
	}
	public void setReplyDate(String replyDate)
	{
		this.replyDate = replyDate;
	}
	public String getTempData()
	{
		return tempData;
	}
	public void setTempData(String tempData)
	{
		this.tempData = tempData;
	}
	public String getNum()
	{
		return num;
	}
	public void setNum(String num)
	{
		this.num = num;
	}
	
	public Object clone() 
	{ 
		Object o = null; 
		try
		{ 
			o = super.clone(); 
		}
		catch (CloneNotSupportedException e) 
		{
			
		} 
		return o;
	}
}
