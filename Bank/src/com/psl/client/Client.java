package com.psl.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.beans.Transaction;
import com.psl.service.EmployeeService;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		EmployeeService s = ctx.getBean("service", EmployeeService.class);

		Transaction t = ctx.getBean("trans1", Transaction.class);
		Transaction t1 = ctx.getBean("trans2", Transaction.class);
		// System.out.println(u);
		// s.createEmployee(t);
		// s.createEmployee(t1);
		s.withdraw(1, 123);

		// s.updateEmployee(12,"Prabhav");s
		// s.deleteEmployee(12);

		List<Transaction> l = s.getAllEmployees();
		int j = 0, i = 0;

		for (Transaction trans : l) {
			i++;
		}
		for (Transaction transaction : l) {
			if (j < i - 5) {

			} else {
				System.out.println(transaction);
			}
			j++;
		}
		System.out.println("DOne!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
}
