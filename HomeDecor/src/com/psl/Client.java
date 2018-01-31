package com.psl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		Shopping s=(Shopping) ctx.getBean("shop");
		
		s.shop();
	}
	
}
