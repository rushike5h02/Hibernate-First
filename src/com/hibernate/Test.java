package com.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
	
//		StandardServiceRegistry obj= new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
//		Metadata obj1=new MetadataSources(obj).getMetadataBuilder().build();

//		SessionFactory sessionFactory = obj1.getSessionFactoryBuilder().build();


	System.out.println("1");
// object of config class	
	Configuration cfg = new Configuration();
	
	System.out.println("2");
// call config file	
	cfg.configure("hibernate.cfg.xml");
	
	System.out.println("3");
// to get all config from session factory to its reference	
	SessionFactory sessionFactory = cfg.buildSessionFactory();      // cfg.configure("hibernate.cfg.xml").buildses..

// to open session	
	Session session = sessionFactory.openSession();

// for starting transaction	
	Transaction t = session.beginTransaction();

	// insert data into database
	Student s = new Student();
	
	
	s.setFirstName("rushikesh");
	s.setLastName("bhand");
	
// to store data into database	
	
	session.save(s);

	
	t.commit();
	session.close();
	
// to check for data insertion	
	System.out.println("Record saved successfully.");

//	


	}

}
