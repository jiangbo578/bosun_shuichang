package com.gouhai.baoshan.entity.spilt;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
/**
 * 社管办
 * @author MedivhQ
 *
 */
@Entity
@Table(name = "bs_linkman")
public class LinkMan
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
	@Column(name = "receiptId",length = 100000)
	private String receiptId;
	@Column(name = "splitId")
	private String splitId;
	@Column(name = "copy")
	private String copy;
	@Column(name = "sendDate")
	private String sendDate;
	@Column(name = "receiptDate")
	private String receiptDate;
	@Column(name = "replyContent",length = 100000)
	private String replyContent;
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
	public String getReceiptId()
	{
		return receiptId;
	}
	public void setReceiptId(String receiptId)
	{
		this.receiptId = receiptId;
	}
	public String getSplitId()
	{
		return splitId;
	}
	public void setSplitId(String splitId)
	{
		this.splitId = splitId;
	}
	public String getCopy()
	{
		return copy;
	}
	public void setCopy(String copy)
	{
		this.copy = copy;
	}
	public String getSendDate()
	{
		return sendDate;
	}
	public void setSendDate(String sendDate)
	{
		this.sendDate = sendDate;
	}
	public String getReceiptDate()
	{
		return receiptDate;
	}
	public void setReceiptDate(String receiptDate)
	{
		this.receiptDate = receiptDate;
	}
	public String getReplyContent()
	{
		return replyContent;
	}
	public void setReplyContent(String replyContent)
	{
		this.replyContent = replyContent;
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
	
	
}
