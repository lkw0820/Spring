package com.inhatc.domain;

public class StudentVO {
	private String studentid;
	private String studentname;
	private String address;
	private String phone;
	private String email;
	
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
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
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "StudentVO [studentid=" + studentid + ", studentname=" + studentname + ", address=" + address
				+ ", phone=" + phone + ", email=" + email + "]";
	}
	public StudentVO(String studentid, String studentname, String address, String phone, String email) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
