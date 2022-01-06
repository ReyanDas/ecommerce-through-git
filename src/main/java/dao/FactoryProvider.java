package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.Userbean;

public class FactoryProvider {
	
	
	
	
	private static SessionFactory factory;
	
	
	public FactoryProvider() {
		

	
	}
	
	

	// method to get SessionFactory--------------
	public  SessionFactory geFactory() {

	
	try {		
				if (factory==null) {
					
				factory=  new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
				
				
			}
				
	} catch (Exception e) {
				e.printStackTrace();
			}
		
		return factory;
	}
	
	
	// ----------------- method for save user----------------------
	public  static void registerUser(Userbean ub) {

		
	try {		
				if (factory==null) {
					
				factory=  new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
				Session session= factory.openSession();
				Transaction tx = session.beginTransaction();
				
				int id =(int) session.save(ub);
				tx.commit();
				System.out.println("FactoryProvider user id- "+id);
				session.close();
				
			}
				
	} catch (Exception e) {
		
		
				e.printStackTrace();
			}
		

	}
	
	

}
