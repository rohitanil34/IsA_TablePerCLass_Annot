package com.bean;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("Hardware")
public class HEmployee extends Employee {
	
	int workingHours;

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	public HEmployee(int id, String name, String email, int salary, int workingHours) {
		super(id, name, email, salary);
		this.workingHours = workingHours;
	}

	public HEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
