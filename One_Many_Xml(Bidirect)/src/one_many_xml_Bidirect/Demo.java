package one_many_xml_Bidirect;

import java.util.Set;
import java.util.HashSet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department dept=new Department();
		dept.setDname("Computer");
		
		Employee e=new Employee();
		e.setEname("kiran");
		e.setEmail("bha@g.com");
		e.setDepartment(dept);
		
		Employee e1=new Employee();
		e1.setEname("shohan");
		e1.setEmail("sai@g.com");
		e1.setDepartment(dept);
		
		SessionFactory sf=HybernateUtil.getSessionFactory();
		Session ses=sf.openSession();
		Transaction tx= ses.getTransaction();
		
		tx.begin();
		
		Department d=(Department)ses.load(Department.class, new Integer(4));
		System.out.println("Depart id is "+d.getDepid());
		System.out.println("Depart name is "+d.getDname());
		
		Set<Employee> sete=d.getEmployees();
		
		for(Employee emp : sete) {
			System.out.println("empl id "+emp.getEmpid());
			System.out.println("empl name "+emp.getEname());
			System.out.println("empl email "+emp.getEmail());
		}
		
		
		ses.save(e);
		ses.save(e1);
	
		tx.commit();
		ses.close();
		sf.close();
		
		System.out.println("successfully");
	}

}
