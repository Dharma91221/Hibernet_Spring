package AnnotationCrud;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=HybernateUtil.getSessionFactory();
		Session ses=sf.openSession();
		Transaction tx= ses.getTransaction();
		Employee emp=new Employee();
		emp.setName("raja");
		emp.setSal(7000);
		
		tx.begin();
		ses.save(emp);
		tx.commit();
		ses.close();
		sf.close();
		
		System.out.println("inserted");
		
		
	}

}
