package One_Many_Anote;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;





public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department dept=new Department();
		dept.setDname("Electronics");
		
		Employee e=new Employee();
		e.setEname("dharma");
		e.setEmail("dha@g.com");
		
		Employee e1=new Employee();
		e1.setEname("hasan");
		e1.setEmail("hsn@g.com");
		
		Set<Employee> setEmp=new HashSet<Employee>();
		setEmp.add(e);
		setEmp.add(e1);
		
		
		SessionFactory sf=HybernateUtil.getSessionFactory();
		Session ses=sf.openSession();
		Transaction tx= ses.getTransaction();
		
		tx.begin();
		ses.save(e);
		ses.save(e1);
		ses.save(dept);
		
		tx.commit();
		ses.close();
		sf.close();
		
		System.out.println("successfully");
		
	}

}
