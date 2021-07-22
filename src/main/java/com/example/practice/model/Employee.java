package com.example.practice.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "DEPTNO")
//	private Department department;
	
	@Id @Column(name = "EMPNO")
	private Integer empno;
	@Column(name = "ENAME")
	private String ename;
	@Column(name = "HIREDATE")
	private Date hireDate;
	@Column(name = "SALARY")
	private Integer salary;
	
	
	@Column(name = "DEPTNO")
	private Integer deptno;
	@Column(name = "TITLE")
	private  String title;
	
	public Employee() {}

	public Employee(Integer empno, String ename, Date hireDate, Integer salary, Integer deptno, String title) {
		this.empno = empno;
		this.ename = ename;
		this.hireDate = hireDate;
		this.salary = salary;
		this.deptno = deptno;
		this.title = title;
	}

	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

//	public Department getDepartment() {
//		return department;
//	}
//
//	public void setDepartment(Department department) {
//		this.department = department;
//	}
	
	
	

}
