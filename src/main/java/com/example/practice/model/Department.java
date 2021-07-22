package com.example.practice.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "DEPARTMENT")
public class Department {
	@Id @Column(name = "DEPTNO")
	private Integer deptno;
	@Column(name = "DNAME")
	private String dname;
//	@OneToMany(fetch = FetchType.LAZY,mappedBy = "DEPARTMENT",cascade = CascadeType.ALL)
//	private Set<Employee> employee = new HashSet<Employee>();
	
	public Department() {
	}

	public Department(Integer deptno, String dname) {
		super();
		this.deptno = deptno;
		this.dname = dname;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

//	public Set<Employee> getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(Set<Employee> employee) {
//		this.employee = employee;
//	}

	
}
