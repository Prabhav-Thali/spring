package com.psl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"config.xml");
		Employee e = (Employee) ctx.getBean("emp");
		System.out.println(e);

		ctx.registerShutdownHook();
	}
}
