package crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;





public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	EmplMgmt em=new EmplMgmt();
		em.setName("Dharma");
		em.setAge(18);
		em.setSalary(25000);
		em.setDesig("clerk");*/
		
		
		SessionFactory sf=HybernateUtil.getSessionFactory();
		Session ses=sf.openSession();
		Transaction tx= ses.getTransaction();
		tx.begin();
		
		
		//Display
		/*EmplMgmt em1=(EmplMgmt)ses.load(EmplMgmt.class, new Integer(1));
		System.out.println("Student id is "+em1.getId());
		System.out.println("Student name is "+em1.getName());
		System.out.println("Student city is "+em1.getAge());
		System.out.println("Student zipcode is "+em1.getDesig());
		System.out.println("Student zipcode is "+em1.getSalary());*/
		
		//Update
		EmplMgmt em1=(EmplMgmt)ses.load(EmplMgmt.class, new Integer(1));
		
		em1.setName("hasan");
		em1.setAge(27);
		ses.update(em1);
		
		
		//ses.save(em);
		tx.commit();
		ses.close();
		sf.close();
		
		System.out.println("successfully");
		

	}

}
