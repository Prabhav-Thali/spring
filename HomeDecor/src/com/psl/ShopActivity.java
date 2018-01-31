package com.psl;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ShopActivity {

	long st, ct;

	@Pointcut(value = "execution(* com.psl.Shopping.shop(..))")
	public void pc() {

	}

	public void suggestions() {
		st = Calendar.getInstance().getTimeInMillis();
		System.out
				.println("suggestions for sofa are matching rug, table cover.");
	}

	public void addtocart() {
		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Added to cart");
		ct = Calendar.getInstance().getTimeInMillis();
	}

	public void addvouchers() {
		System.out.println("Vouchers Added.");
	}

	@Around(value = "pc()")
	public void procedure(ProceedingJoinPoint jp) {

		// before
		suggestions();
		addtocart();
		addvouchers();

		// during
		try {

			System.out.println("time between browsing and placing order is:"
					+ (ct - st) / 1000 + "secs");
			jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("check your connections");
		}

	}

}
