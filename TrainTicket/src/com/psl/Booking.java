package com.psl;

public class Booking {

	private int id;
	private String name;
	private Train2 tname;

	public Booking() {
		// TODO Auto-generated constructor stub
	}

	public Booking(int id, String name, Train2 tname) {
		super();
		this.id = id;
		this.name = name;
		this.tname = tname;
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

	public Train2 getTname() {
		return tname;
	}

	public void setTname(Train2 tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", name=" + name + ", tname=" + tname
				+ "]";
	}

}
