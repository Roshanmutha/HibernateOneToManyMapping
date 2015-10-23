package com.roshanonjava.hibernate.HibernateOneToMany;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {

	@Id
	@GeneratedValue
	@Column(name = "department_id")
	private Long departmentId;

	@Column(name = "dept_name")
	private String departmentName;

	@OneToMany(mappedBy = "department")
	private Set<Employee> employees;

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
