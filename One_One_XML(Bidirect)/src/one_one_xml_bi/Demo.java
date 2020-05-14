package one_one_xml_bi;

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
		pt.setPid(123);
		pt.setPnum(321);
		
		Citizen c=new Citizen();
		c.setCid(1234);
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
