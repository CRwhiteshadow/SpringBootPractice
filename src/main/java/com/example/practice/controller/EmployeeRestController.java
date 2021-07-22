package com.example.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.practice.model.Employee;
import com.example.practice.service.EmployeeService;



@Controller
@RequestMapping("/backstage")
public class EmployeeRestController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/emp")
	public @ResponseBody List<Employee> findAll() {
		List<Employee> list = employeeService.findAll();
		return list;
	}

}
