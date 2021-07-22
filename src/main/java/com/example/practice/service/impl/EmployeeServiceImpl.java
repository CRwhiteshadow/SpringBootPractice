package com.example.practice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.model.Employee;
import com.example.practice.repository.EmployeeRepository;
import com.example.practice.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee findByEmpno(Integer empno) {
		return employeeRepository.findByEmpno(empno);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.addEmployee(employee);
	}

	@Override
	public void deleteByEmpno(Integer empno) {
		employeeRepository.deleteByEmpno(empno);

	}

	@Override
	public Employee updatEmployee(Employee employee) {
		return employeeRepository.updatEmployee(employee);
	}

}
