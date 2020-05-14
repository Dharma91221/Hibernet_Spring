package WithMysql;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Demo { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration con=new Configuration();
		con.configure();
		Properties prop=con.getProperties();
		StandardServiceRegistryBuilder srb=new StandardServiceRegistryBuilder();
		StandardServiceRegistry sr=srb.applySettings(prop).build();
		SessionFactory sf=con.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.getTransaction();
		
		Employeee emp=new Employeee();
		emp.setName("dharma");
		emp.setSal(2500);
		
		/*Employeee emp=(Employeee)ses.load(Employeee.class,new Integer(1));
		System.out.println("empl name "+emp.getName());
		
		System.out.println("reading");
		*/
		
		/*Employeee emp1=(Employeee)ses.load(Employeee.class,new Integer(1));
		emp1.setSal(5000);
		ses.update(emp1);*/
		
		/*Employeee emp2=(Employeee)ses.load(Employeee.class,new Integer(1));
		ses.delete(emp1);*/
		
		
		tx.begin();
		ses.save(emp);
		tx.commit();
		ses.close();
		sf.close();
		
		System.out.println("inserted");
		
		
	}

}



