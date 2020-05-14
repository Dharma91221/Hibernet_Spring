package bidirection;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=HybernateUtil.getSessionFactory();
		Session ses=sf.openSession();
		Transaction tx= ses.getTransaction();
		
		Address add=new Address();
		add.setCity("bglr");
		add.setZipcode("50015");
		
		Student s=new Student();
		s.setSname("ramesh");
		s.setAddress(add);
		
		Student s1=new Student();
		s1.setSname("fayaz");
		s1.setAddress(add);
		
		Set<Student> setStu=new HashSet();
		setStu.add(s);
		setStu.add(s1);
		
		
		//Address can get student
		Address a=(Address)ses.load(Address.class, new Integer(1));
		System.out.println("address id is "+a.getAid());
		System.out.println("address city is "+a.getCity());
		System.out.println("address zipcode is "+a.getZipcode());
		
		
		Set<Student> x=a.getStu();
		for(Student student :x) {
			System.out.println("Student name "+student.getSname());
		}
		
		//student can get address as it is bidirectional
		Student st=(Student)ses.load(Student.class, new Integer(2));
		System.out.println("Student id is "+st.getSid());
		System.out.println("Student name is "+st.getSname());
		
		System.out.println("Student city is "+st.getAddress().getCity());
		System.out.println("Student zipcode is "+st.getAddress().getZipcode());
		
		
		
		
		tx.begin();
		ses.save(add);
		ses.save(s);
		ses.save(s1);
		
		tx.commit();
		ses.close();
		sf.close();
		
		System.out.println("successfully");
		
	}

}
