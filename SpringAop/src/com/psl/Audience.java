package com.psl;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {

	@Pointcut(value = "execution(* com.psl.Performer.perform(String,String)) && args(song,artist)")
	public void pc1(String song,String artist) {
	}

	@Before(value = "pc1(song,artist)")
	public void takeSeats(String song,String artist) {
		// TODO Auto-generated method stub
		System.out.println("Audience take seats to listen to"+song+"sung by "+artist);
	}

	@Before(value = "pc1(song,artist)")
	public void switchoff(String song,String artist) {
		// TODO Auto-generated method stub
		System.out.println("Audience switch off phones");
	}

	@AfterThrowing(value="pc1(song,artist)")
	public void demandRefund(String song,String artist) {
		// TODO Auto-generated method stub
		System.out.println("Audience demand refund");
	}

	@AfterReturning(value="pc1(song,artist)")
	public void applaud(String song,String artist) {
		System.out.println("Audience clap ");
	}

	@After(value="pc1(song,artist)")
	public void goHome(String song,String artist) {
		System.out.println("Audience go home");
	}

	public void record(ProceedingJoinPoint jp) {

		// before
		System.out.println("Audience take seats");
		System.out.println("Audience switch off phones");
		System.out.println("starts camera recording the performance");

		// during
		try {
			jp.proceed();// Performer.perform()
			System.out.println("Audience clap");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Audience demand refund");
		}

		// after
		System.out.println("stop recording");
		System.out.println("Audience go home");
	}
}
