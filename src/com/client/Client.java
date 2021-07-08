package com.client;

import javax.security.auth.login.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bean.AdminEmployee;
import com.bean.Employee;
import com.bean.HEmployee;
import com.bean.SoftwareEmployee;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		org.hibernate.cfg.Configuration configuration=new org.hibernate.cfg.Configuration();
		configuration.configure("resource/hibernate-cfg.xml");
		SessionFactory sf= configuration.buildSessionFactory();
		Session s= sf.openSession();
		Transaction t=s.beginTransaction();
		SoftwareEmployee se=new SoftwareEmployee(1, "Rohit", "rk", 100000, "SONAR");
		HEmployee he=new HEmployee(2, "Ram", "sk", 50000, 9);
		AdminEmployee admin=new AdminEmployee(3, "Admin", "adm", 60000, "AP1");
		
		
		s.save(se);
		s.save(he);
		s.save(admin);
		t.commit();

	}

}
