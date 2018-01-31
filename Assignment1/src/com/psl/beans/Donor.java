package com.psl.beans;


import javax.validation.constraints.Size;

public class Donor {

//	@Min(value=1)
	
	@Size(min=5,max=15,message="name should be between 5-15 chars")
	private String name;

//	@Pattern(regexp="(^$|[0-9]{10})")
	private int phone;
	
	
	private String bg;
	
	public Donor(){
		
	}
	public Donor(String name, int phone, String bg) {
		super();
		this.name = name;
		this.phone = phone;
		this.bg = bg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getBg() {
		return bg;
	}
	public void setBg(String bg) {
		this.bg = bg;
	}
	@Override
	public String toString() {
		return "Donor [name=" + name + ", phone=" + phone + ", bg=" + bg + "]";
	}
	
	

	
}
