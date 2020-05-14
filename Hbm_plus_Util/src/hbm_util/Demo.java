package hbm_util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;





public class Demo {
	public static void main(String[] args) {
		
		Date dt=new Date();
		Date dj=null;
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		SessionFactory sf=HybernateUtil.getSessionFactory();
		Session ses=sf.openSession();
		Transaction tx= ses.getTransaction();
		
		Employee emp=new Employee();
		emp.setDoj(dt);
		emp.setLogin(dt);
		emp.setName("Dharma");
		emp.setSalary(12345);
		
		
		tx.begin();
		ses.save(emp);
		tx.commit();
		ses.close();
		sf.close();
		
		System.out.println("successfully");
	}
}
