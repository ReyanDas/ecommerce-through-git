package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.Userbean;

public class FactoryProvider {
	
	
	
	
	private static SessionFactory factory;
	
	public FactoryProvider() {
		
/*try {
	System.out.println("factory "+factory+ " in method");
			
			if (factory==null) {			
			factory=  new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			}
		} 
			catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			
		*/
	
	}
	
	

	
	public  SessionFactory geFactory() {

	
	try {		
				if (factory==null) {
					
				factory=  new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
				Session session= factory.openSession();
				
			}
				
	} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
		return factory;
	}
	
	
	
	public void geFactory(Userbean ub) {

		
	try {		
				if (factory==null) {
					
				factory=  new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
				Session session= factory.openSession();
				Transaction tx = session.beginTransaction();
				
				session.save(ub);
				tx.commit();
				session.close();
				
			}
				
	} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
//		return factory;
	}
	
	

}
