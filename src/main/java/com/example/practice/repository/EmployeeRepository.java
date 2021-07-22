package com.example.practice.repository;

import com.example.practice.model.Employee;
import java.util.List;

public interface EmployeeRepository{
	
	public List<Employee> findAll();
	
	public Employee findByEmpno(Integer empno);
	
	public Employee addEmployee(Employee employee);
	
	public void deleteByEmpno(Integer empno);
	
	public Employee updatEmployee(Employee employee);

}
