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
		
		
//		String hql = "FROM bean.Userbean WHERE userEmail =: e and password =: p";
		String hql1 = "FROM bean.Userbean WHERE userEmail ='abhisek@gmail.com' and password = '1234'";
	    Query q= session.createQuery(hql1);
//	    q.setParameter("e", email);
//	    q.setParameter("p", password);
	     user = (Userbean) q.getSingleResult();
	     System.out.println( user.getUserEmail());
	     System.out.println( user.getPassword());
		
	     return user;
	}

}
