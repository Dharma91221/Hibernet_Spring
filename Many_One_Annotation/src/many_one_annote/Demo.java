package many_one_annote;

import java.rmi.StubNotFoundException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add=new Address();
		add.setCity("kolkata");
		add.setZipcode("50065");
		
		Student s=new Student();
		s.setSname("shohan");
		s.setAddress(add);
		
		Student s1=new Student();
		s1.setSname("renu");
		s1.setAddress(add);
		
		SessionFactory sf=HybernateUtil.getSessionFactory();
		Session ses=sf.openSession();
		Transaction tx= ses.getTransaction();
		
		/*Student st=(Student)ses.load(Student.class,new Integer(1));
		
		System.out.println("Stu id "+st.getSid());
		System.out.println("Stu name "+st.getSname());
		System.out.println("Stu aid "+st.getAddress().getAid());
		System.out.println("Stu aid "+st.getAddress().getCity());
		System.out.println("Stu aid "+st.getAddress().getZipcode());
		System.out.println("reading");*/
		
		tx.begin();
		ses.save(s);
		ses.save(s1);
		
		tx.commit();
		ses.close();
		sf.close();
		
		System.out.println("successfully");
	}

}
