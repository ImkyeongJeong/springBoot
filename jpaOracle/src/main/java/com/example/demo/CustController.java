package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustController {
	@Autowired	 CustomerRepository	dao;
	@RequestMapping("/custList")
	public	String	custList(Model	model){
					model.addAttribute("custList",	dao.findAll());
	return	"custList";
	}
}
