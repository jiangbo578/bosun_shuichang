package com.gouhai.baoshan.utils.jaxb;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "username", "password", "realName" })
public class XmlUser {
	
	private String username;
	private String password;
	private String realName;

	public XmlUser() {

	}

	public XmlUser(String username, String pwd, String realName) {
		this.username = username;
		this.password = pwd;
		this.realName = realName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

}
