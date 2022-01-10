package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.Userbean;

public class FactoryProvider {
	
	
	
	
	private static SessionFactory factory;
	
	
	public FactoryProvider() {
		
		try {
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	
	}
	
	

	// --------------method to get SessionFactory--------------
	public  static SessionFactory geFactory() {

	
	try {		
				if (factory==null) {
					Class.forName("com.mysql.cj.jdbc.Driver");
					
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
					Class.forName("com.mysql.cj.jdbc.Driver");
					
				factory=  new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
				Session session= factory.openSession();
				Transaction tx = session.beginTransaction();
				
				int id =(int) session.save(ub);
				tx.commit();
				System.out.println("user saved successfully..., id-"+id);
				session.close();
				
			}
				
	} catch (Exception e) {
		
		
				e.printStackTrace();
			}
		

	}
	
	

}
