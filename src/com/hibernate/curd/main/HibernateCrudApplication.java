package com.hibernate.curd.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.curd.model.Employee;

public class HibernateCrudApplication {

	public static void main(String[] args) {
	
		SessionFactory factory=new Configuration().configure("hib.cfg.xml").buildSessionFactory();
		
		Session session=factory.openSession();
		
		Transaction t=session.beginTransaction();
		
//		Employee emp1= new Employee("Tony",20000.00);
//		
//
//		Employee emp2= new Employee("pinky",30000.00);
//
//		Employee emp3= new Employee("sony",40000.00);
//
//		Employee emp4= new Employee("mony",50000.00);
//
//		Employee emp5= new Employee("Rocky",60000.00);
//
//		Employee emp6= new Employee("Docky",70000.00);
//	    Employee emp8= new Employee("mooni",80000.00);
//		session.save(emp1);
//		session.save(emp2);
//		session.save(emp4);
//		session.save(emp5);
//		session.save(emp6);
//		 session.save(emp8);
		
	
		Employee g = session.get(Employee.class, 1); // get the particular row from the database.

		System.out.println(g.getId() + "\t" + g.geteName() + "\t" + g.geteSal());
		
		

		int i = 1;
		while (i > 0) { // get all rows from the database

			Employee get = session.get(Employee.class, i);

			System.out.println(get.getId() + "\t" + get.geteName() + "\t" + get.geteSal());

			System.out.println();

			i++;
		}

		// Update Query:
		
		Employee emp= new Employee();
		
		
		 session.update(emp.getId());
		
		t.commit();

		session.close();
	    factory.close();

	}

}
