package com.inhatc.domain;

import java.util.Date;

public class MemberVO {
	private String userid;
	private String userpw;
	private String username;
	private String email;
	private Date regdata;
	private Date updatedata;
	
	public MemberVO(String userid, String userpw, String username, String email, Date regdata, Date updatedata) {
		super();
		this.userid = userid;
		this.userpw = userpw;
		this.username = username;
		this.email = email;
		this.regdata = regdata;
		this.updatedata = updatedata;
	}
	
	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MemberVO [userid=" + userid + ", userpw=" + userpw + ", username=" + username + ", email=" + email
				+ ", regdata=" + regdata + ", updatedata=" + updatedata + "]";
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegdata() {
		return regdata;
	}
	public void setRegdata(Date regdata) {
		this.regdata = regdata;
	}
	public Date getUpdatedata() {
		return updatedata;
	}
	public void setUpdatedata(Date updatedata) {
		this.updatedata = updatedata;
	}

}
