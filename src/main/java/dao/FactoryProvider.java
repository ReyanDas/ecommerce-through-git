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
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		*/
	
	}
	
	

	
	public static int geFactory() {
		
		int id = 0;

	
	try {		
				if (factory==null) {
					
				factory=  new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
				
				System.out.println(factory);
				Session session = factory.openSession();
				
				session.isOpen();
				Transaction tx = session.beginTransaction();
				
//				Userbean ub = new Userbean();
				
				
//				id =(int) session.save(ub);
				
				tx.commit();
				System.out.println("user saved successfully");
				System.out.println(id);
				session.close();
//				ub = null;
				

				
				}
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
		return id;
	}
	
	
	
	
	public static void saveUser(Userbean user) {
		
	
		
		try {
			
			
			
		
	
		} catch (Exception e) {
			System.out.println("error saving user in db");
			e.printStackTrace();
		
		}
		
		
		
		
		
		
		
	}
	
	

}
