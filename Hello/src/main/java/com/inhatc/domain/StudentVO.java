package com.inhatc.domain;

public class StudentVO {
	private String userid;
	private String username;
	private String address;
	private String phone;
	private String Email;
	
	
	@Override
	public String toString() {
		return "StudentVO [userid=" + userid + ", username=" + username + ", address=" + address + ", phone=" + phone
				+ ", Email=" + Email + "]";
	}
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentVO(String userid, String username, String address, String phone, String email) {
		super();
		this.userid = userid;
		this.username = username;
		this.address = address;
		this.phone = phone;
		Email = email;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	

}
