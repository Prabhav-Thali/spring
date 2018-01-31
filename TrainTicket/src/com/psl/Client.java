package com.psl;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("train.xml");
		Booking e = (Booking) ctx.getBean("Book");
		System.out.println(e);

		ctx.registerShutdownHook();
}
}