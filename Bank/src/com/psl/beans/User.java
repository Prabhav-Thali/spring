package com.psl.beans;

public class User {
	private int id;
	private String name;
	private int initamt;
	
	
//	public User(int id, String name, int initamt) {
//		
//	}

	public User() {
		// TODO Auto-generated constructor stub
		System.out.println("user constructor");
		this.id = 1;
		this.name = "asasa";
		this.initamt = 12000;
	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getInitamt() {
		return initamt;
	}


	public void setInitamt(int initamt) {
		this.initamt = initamt;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", initamt=" + initamt
				+ "]";
	}


}