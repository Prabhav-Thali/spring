package com.psl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("t2")
public class Train2 {

	
	private int seats;
	@Value(value="Mumbai Express")
	private String trname;
	@Value(value="12134")
	private String tnum;
	
	
	public Train2(int seats,String trname, String tnum) {
		
		this.seats = seats;
		this.trname = trname;
		this.tnum = tnum;
	}
	public Train2() {
		// TODO Auto-generated constructor stub
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getTrname() {
		return trname;
	}
	public void setTrname(String trname) {
		this.trname = trname;
	}
	public String getTnum() {
		return tnum;
	}
	public void setTnum(String tnum) {
		this.tnum = tnum;
	}
	@Override
	public String toString() {
		return "Train2 [trainame=" + seats + ", trname=" + trname
				+ ", tnum=" + tnum + "]";
	}
	
	

	
}
