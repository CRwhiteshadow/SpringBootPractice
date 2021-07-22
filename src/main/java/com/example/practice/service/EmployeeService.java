package com.example.practice.service;

import java.util.List;

import com.example.practice.model.Employee;

public interface EmployeeService {

	public List<Employee> findAll();

	public Employee findByEmpno(Integer empno);

	public Employee addEmployee(Employee employee);

	public void deleteByEmpno(Integer empno);

	public Employee updatEmployee(Employee employee);

}
