package com.bean;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Software")
public class SoftwareEmployee extends Employee{

	
	String tools;

	public String getTools() {
		return tools;
	}

	public void setTools(String tools) {
		this.tools = tools;
	}

	public SoftwareEmployee(int id, String name, String email, int salary, String tools) {
		super(id, name, email, salary);
		this.tools = tools;
	}

	public SoftwareEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
