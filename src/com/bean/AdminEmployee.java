package com.bean;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Admin")
public class AdminEmployee extends Employee {

	
	String branchName;
	int val;

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public AdminEmployee(int id, String name, String email, int salary, String branchName) {
		super(id, name, email, salary);
		this.branchName = branchName;
	}

	public AdminEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
