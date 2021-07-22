package com.example.practice.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.practice.model.Employee;
import com.example.practice.repository.EmployeeRepository;

@Repository
@Transactional
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Autowired
	EntityManager entityManger;
	
	@Override
	public List<Employee> findAll() {
		List<Employee> emps = entityManger.createQuery("FROM Employee", Employee.class).getResultList();
		return emps;
	}

	@Override
	public Employee findByEmpno(Integer empno) {
		Employee employee = entityManger.find(Employee.class, empno);
		return employee;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		if(findByEmpno(employee.getEmpno())!=null) {
			return null;
		}else {
			entityManger.persist(employee);	
			return employee;
		}
		
	}

	@Override
	public void deleteByEmpno(Integer empno) {
		entityManger.remove(findByEmpno(empno));
	}

	@Override
	public Employee updatEmployee(Employee employee) {
		Employee result = entityManger.find(Employee.class, employee.getEmpno());
		if(result!=null) {
			result.setEmpno(employee.getEmpno());
			result.setEname(employee.getEname());
			result.setHireDate(employee.getHireDate());
			result.setDeptno(employee.getDeptno());
			result.setSalary(employee.getSalary());
			result.setTitle(employee.getTitle());
		}
		return result;
	}

}
