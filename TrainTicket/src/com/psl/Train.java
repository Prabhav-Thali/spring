package com.psl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Train {


	private String trname;
	
	
	private String tnum;

	public Train(String trname, String tnum) {

		this.trname = trname;
		this.tnum = tnum;
	}

	public Train() {
		// TODO Auto-generated constructor stub
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
		return "Train [trname=" + trname + ", tnum=" + tnum + "]";
	}

}
