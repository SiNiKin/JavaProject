package com.myweb.user.model;

import java.sql.Timestamp;

public class UserVO {
	
	private String id;
	private String pw;
	private String name;
	private String email;
	private String address;
	private Timestamp regdate;
	
	public UserVO() {}
	

	public UserVO(String id, String pw, String name, String email, String address, Timestamp regdate) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.address = address;
		this.regdate = regdate;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}
	
	public Timestamp getRegdate() {
		return regdate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + ", address=" + address + ", regdate=" + regdate + "]";
	}

}
