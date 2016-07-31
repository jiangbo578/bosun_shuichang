/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity.publics;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


/**
 * 
 * 文件上传
 * @author 肖得明
 * 
 */
@Entity
@Table(name = "bs_upfiles")
public class Upfiles{


	@Id
	@Column(name = "PID")
	@GeneratedValue(generator = "hibernate-uuid")
	@GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
	protected String id;
	@Column(name = "fileName")
	private String fileName; //文件名
	
	@Column(name = "filePath")
	private String filePath;
	@Column(name = "userName")
	private String userName;
	@Column(name = "userId")
	private String userId;
	@Column(name = "applyId")
	private String applyId;
	@Column(name = "applyType")
	private String applyType;
	@Column(name = "fileType")
	private String fileType;

	@Column(name = "shareDate")
	private String shareDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getApplyId() {
		return applyId;
	}

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getApplyType() {
		return applyType;
	}

	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getShareDate() {
		return shareDate;
	}

	public void setShareDate(String shareDate) {
		this.shareDate = shareDate;
	}

	

}
