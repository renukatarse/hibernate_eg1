package com.scp.Hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestEmployee {

	public static void main(String[] args) {

		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		Employee emp=new Employee("renuka", "xx");
		ses.save(emp);
		ses.flush();
		tx.commit();
		
		ses.close();
		
	}

}
