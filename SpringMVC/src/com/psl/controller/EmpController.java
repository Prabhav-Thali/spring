package com.psl.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.psl.beans.Employee;
import com.psl.service.EmployeeService;

//http://localhost:8080/springMVC/home

@Controller
//@RequestMapping(value="/employee") //organizing url by prepending with value
public class EmpController {

	@Autowired
	private EmployeeService service;
	
	@RequestMapping(value = {"/","home"}, method = RequestMethod.GET)
	public String showHome(Model model) {
		// TODO Auto-generated method stub
		System.out.println("in empController.showHome()");
		model.addAttribute("message", "Hello");
		model.addAttribute("employee", new Employee());
		
		List<Employee> l=service.getAllEmployees();
		model.addAttribute("list", l);
		return "home";
	}

	@RequestMapping(value = {"/","home"}, method = RequestMethod.POST)
	public String Register(Model model,@Valid @ModelAttribute Employee e,BindingResult res) {
		// TODO Auto-generated method stub
		System.out.println("in empController.Register()"+e);

		if(res.hasErrors())
			return "home";
		
		service.createEmployee(e);
		return "redirect:/home";
	}
	
	
	@RequestMapping(value = "/{empName}", method = RequestMethod.GET)
	public String showEmp(Model model, @PathVariable String empName,  @RequestParam(required=false) String dept) {
		// TODO Auto-generated method stub
		System.out.println("in empController.showEmp() i clicked" + empName);
		model.addAttribute("empName", empName);
		model.addAttribute("dept", dept);
		model.addAttribute("message", "Hello " + empName);
		return "emp";
	}
	
	
}
