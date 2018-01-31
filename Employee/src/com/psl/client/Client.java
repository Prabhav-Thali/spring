package com.psl.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.beans.Employee;
import com.psl.service.EmployeeService;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeService s=ctx.getBean("service",EmployeeService.class);
		Employee e=ctx.getBean("emp", Employee.class);
		
//		s.createEmployee(e);
//		s.updateEmployee(12,"Prabhav");
//		s.deleteEmployee(12);
		
		List<Employee> l=s.getAllEmployees();
		for (Employee employee : l) {
			System.out.println(employee);
			
		}
		System.out.println("DOne!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
}
