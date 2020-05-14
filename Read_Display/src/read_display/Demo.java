package read_display;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.management.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		SessionFactory sf=HybernateUtil.getSessionFactory();
		Session ses=sf.openSession();
		Scanner sc= new Scanner(System.in);
		Department d=new Department();
		Employee e=new Employee();
		
		
		
		while(true) {
		
		System.out.println("1. create\n2. Display\n3. Update\n4. Delete\n5. Exit ");
		int choice=sc.nextInt();
		
		
		if(choice==1) {
			//Transaction tx= ses.getTransaction();
			
			
			Transaction tx= ses.getTransaction();
			tx.begin();
			d.setDname("Clerk");
			e.seteName("dharma");
			e.seteDesig("Clerk");
			e.seteSal(12500);
			e.setDept(d);
		
		
			ses.save(e);
			ses.save(d);
			
			tx.commit();
		
			
			System.out.println("successfully");
			//ses.close();
			//sf.close();
		}
		
		else if(choice==2){
			//Transaction tx= ses.getTransaction();
			
			Transaction tx1= ses.getTransaction();
			tx1.begin();
			System.out.println("reading");
		
			Criteria ctr=ses.createCriteria(Employee.class);
			List ls=ctr.list();
			Iterator itr=ls.iterator();
			while(itr.hasNext())
			{
				Employee e1=(Employee)itr.next();
				System.out.println("emp id "+e1.getEid());
				System.out.println("emp name "+e1.geteName());
				System.out.println("emp desig "+e1.geteDesig());
				System.out.println("emp sal "+e1.geteSal());
				System.out.println("dept aid "+e1.getDept().getDeptid());
				System.out.println("dept dname "+e1.getDept().getDname());
			}
			
		
			/*ses.save(s);
			ses.save(s1);*/
			
			tx1.commit();
			//ses.close();
		//	sf.close();
			
			
		}
		
		else if(choice==3) {
			
			Transaction tx2= ses.getTransaction();
		
			tx2.begin();
			System.out.println("Updating");
			System.out.println("Enter the row Num u want to update");
			int num=sc.nextInt();
			Employee e2=(Employee)ses.load(Employee.class,new Integer(num));
			e2.seteName("shohan");
			e2.seteSal(5000);
			System.out.println("Updateed successfully");
			ses.update(e2);
			tx2.commit();//ses.close();
			//sf2.close();
		}
		
		else if(choice==4) {
			
			Transaction tx3= ses.getTransaction();
			tx3.begin();
			System.out.println("Deleting");
			System.out.println("Enter the row Num u want to delete");
			int Delnum=sc.nextInt();
			Employee e2=(Employee)ses.load(Employee.class,new Integer(Delnum));
			ses.delete(e2);
			System.out.println("Deleted successfully");
			tx3.commit();
			//ses.close();
			//sf3.close();
		}
		
		else {
			
			break;
		}
		}
	}

}
