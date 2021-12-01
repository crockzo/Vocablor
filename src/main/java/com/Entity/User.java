package com.Entity;

public class User {

	private int userid;
	private String name;
	private String username;
	private String password;
	private int gender;
	private java.sql.Date date;
	
	public User() {}
	
	public User(String name, String username, String password, int gender) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.gender = gender;
	}
	
	public User(String name, String username, String password, int gender, java.sql.Date date) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.date = date;
	}
	
	public User(int userid, String name, String username, String password, int gender) {
		super();
		this.userid = userid;
		this.name = name;
		this.username = username;
		this.password = password;
		this.gender = gender;
	}
	
	public User(int userid, String name, String username, java.sql.Date date, int gender) {
		super();
		this.userid = userid;
		this.name = name;
		this.username = username;
		this.date = date;
		this.gender = gender;
	}
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", gender=" + gender + "]";
	}
	
	
	
}
