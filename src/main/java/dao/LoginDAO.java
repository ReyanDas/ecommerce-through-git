package dao;

import org.hibernate.Session;

public class LoginDAO {

	private Session session;

	public LoginDAO(Session session) {
		super();
		this.session = session;
	}

	public boolean authenticateLogin() {
		
		
		String hql = null;
		
		session.createQuery("FROM bean.Userbean WHERE ");
		
		
		
		
		

		return false;
	}

}
