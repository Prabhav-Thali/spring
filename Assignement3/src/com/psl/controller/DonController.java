package com.psl.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.psl.beans.Admin;
import com.psl.beans.Donor;

import com.psl.service.DonorService;


@Controller
// @RequestMapping(value="/employee") //organizing url by prepending with value
public class DonController {

	@Autowired
	private DonorService service;

	@RequestMapping(value = { "home" }, method = RequestMethod.GET)
	public String showHome(Model model) {
		System.out.println("in empController.showHome()");
		model.addAttribute("message", "HEY YOU,Welcome to blood bank");
		model.addAttribute("message2", "Enter your details");
		model.addAttribute("donor", new Donor());

		List<Donor> l = service.getAllDonor();
		model.addAttribute("list", l);
		// TODO Auto-generated method stub
		return "home";
	}

	@RequestMapping(value = { "home" }, method = RequestMethod.POST)
	public String Register(Model model, @Valid @ModelAttribute Donor d) {
		// TODO Auto-generated method stub
		System.out.println("in empController.Register()" + d);

		service.createEmployee(d);
		return "redirect:/home";
	}

	@RequestMapping(value = { "/","login" }, method = RequestMethod.POST)
	public String Login(Model model, @Valid @ModelAttribute Admin a,
			@RequestParam String uname,
			@RequestParam(required = true) String pass) {

		if (uname.equals("admin") && pass.equals("admin")) {
			return "redirect:/home";
		}

		return "redirect:/login";
	}

	@RequestMapping(value = {"/","login" }, method = RequestMethod.GET)
	public String showLogin(Model model, @Valid @ModelAttribute Admin a) {
		// TODO Auto-generated method stub

		model.addAttribute("Admin", a);
		return "login";
	}

	@RequestMapping(value = "/{DonName}", method = RequestMethod.GET)
	public String showEmp(Model model, @PathVariable String DonName,
			@RequestParam(required = false) String bg,
			@RequestParam(required = false) String ph) {
		// TODO Auto-generated method stub
		System.out.println("in empController.showEmp() i clicked" + DonName);
		model.addAttribute("DonName", DonName);
		model.addAttribute("bg", bg);
		model.addAttribute("message", DonName + "'s phone number is:" + ph);
		return "donor";
	}

}
