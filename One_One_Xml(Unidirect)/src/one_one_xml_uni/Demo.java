package one_one_xml_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf=HybernateUtil.getSessionFactory();
		Session ses=sf.openSession();
		Transaction tx= ses.getTransaction();
		
		Passport pt = new Passport();

		pt.setPnum(12345);
		
		Citizen c=new Citizen();
	
		c.setName("dharma");
		c.setPassport(pt);
		

		tx.begin();
		ses.save(c);
		ses.save(pt);
		
		tx.commit();
		ses.close();
		sf.close();
		
	}

}
