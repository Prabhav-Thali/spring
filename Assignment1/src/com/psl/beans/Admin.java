package com.psl.beans;

public class Admin {

	private String uname;
	private String pass;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	
	public String getUname() {
		return uname;
	}
	
	
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Admin [uname=" + uname + ", pass=" + pass + "]";
	}
	public Admin(String uname, String pass) {
		super();
		this.uname = uname;
		this.pass = pass;
	}
	
	
}
