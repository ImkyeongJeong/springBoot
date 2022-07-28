package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {

	 
	 @Autowired EmpMapper mapper;
	 @RequestMapping("/empList")
	public String empList(Model model){ 
		model.addAttribute("empList", mapper.getEmpList(null));
		return "empList"; 
	}
	 
	@RequestMapping("/test")
	public String test(Model model){
		model.addAttribute("str1", "<u>test</u>");
		return "test"; 
	}
	
	//등록페이지
	@GetMapping("/empInsert")
	public String empInsert(Model model){
		model.addAttribute("depts", mapper.getDepartments());
		model.addAttribute("jobs", mapper.getJobs());
		return "empInsert"; 
	}
}
