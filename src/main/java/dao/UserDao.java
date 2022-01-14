package dao;

import javax.persistence.Query;

import org.hibernate.Session;

import bean.Userbean;


public class UserDao {

	private Session session;

	public UserDao(Session session) {
		super();
		this.session = session;
	}

	public Userbean authenticateLogin(String email, String password) {
		
		Userbean user= null;
		
		try {
			
		String hql = "FROM bean.Userbean WHERE userEmail =: e and password =: p";
//		String hql1 = "FROM bean.Userbean WHERE userEmail ='abhisek@gmail.com' and password = '1234'";
	    Query q= session.createQuery(hql);
	    q.setParameter("e", email);
	    q.setParameter("p", password);
	     user = (Userbean) q.getSingleResult();
	     
	     System.out.println( "email get from database "+user.getUserEmail());
	     System.out.println("email get from clint "+ email);
	     System.out.println("password get from database "+ user.getPassword());
	     System.out.println("password get from clint "+ password);
	     
	     
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	     return user;
	}

}
