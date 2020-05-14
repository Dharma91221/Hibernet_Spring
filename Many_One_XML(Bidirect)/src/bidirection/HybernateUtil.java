package bidirection;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HybernateUtil {
	private static final SessionFactory sf=buildSessionFactory();
	private static SessionFactory buildSessionFactory() {
		try {
			Configuration con=new Configuration();
			con.configure();
			Properties prop =con.getProperties();
			StandardServiceRegistryBuilder srb=new StandardServiceRegistryBuilder();
			StandardServiceRegistry sr=srb.applySettings(prop).build();
			SessionFactory fct=con.buildSessionFactory(sr);
			return fct;
		}
		catch(Exception e) {
			System.err.println("Session Factory creation failed " +e);
			throw new ExceptionInInitializerError(e);
		}
	}
	public static SessionFactory getSessionFactory() {
		return sf;
	}
}
