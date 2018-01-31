package com.psl;

public class Performer {
	public void practices() {
		System.out.println("Performer practices");
	}

	public void perform(String song,String artist) throws Exception {
		System.out.println(artist+"Performs a song"+song);
//		throw new Exception("Rain");
	}

	public void hasSupper(){
		System.out.println("performer has supper");
	}
	public void autograph() {
		// TODO Auto-generated method stub
		System.out.println("gives autographs");
	}
	
}
