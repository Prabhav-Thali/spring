package com.psl;

import org.aspectj.lang.ProceedingJoinPoint;




public class Tc {
	 public void checkingTickets() throws Exception{
		 System.out.println("checking tickets");
		 throw new Exception("Defaulter Found!!!!!!!");
	 }
	 
	 public void printinglist(){
		 System.out.println("Printing Lists");
	 }
	 public void collectfine(){
		 
		 System.out.println("collecting fine");
	 }
	 public void inform(){
		 System.out.println("delayed");
	 }
	 
	 public void Activity(ProceedingJoinPoint jp) {
		 Tc t=new Tc();
			// before
			t.printinglist();
			
			// during
			try {
				jp.proceed();
				try{
				t.checkingTickets();}
				catch (Throwable e) {
					// TODO Auto-generated catch block
					
					t.collectfine();
				}
			} catch (Throwable e) {
				// TODO Auto-generated catch block
			
				t.inform();
			}

			// after
			System.out.println("Destination Reached");
		}
}
