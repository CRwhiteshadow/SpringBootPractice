package com.example.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.practice.model.Employee;
import com.example.practice.service.EmployeeService;

@Controller
public class BasicController {
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/")
	public String showIndex(Model m) {
		List<Employee> emps=employeeService.findAll();
		m.addAttribute("emps", emps);
		return "index";
	}

}
