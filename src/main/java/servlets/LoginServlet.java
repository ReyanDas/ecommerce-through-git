package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import bean.Userbean;
import dao.FactoryProvider;
import dao.UserDao;


//@WebServleturlPatterns = { "/LoginServlet" }
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	private Session session = null;
	private Transaction tx = null;
    
    public LoginServlet() {
        super();

    }
    
    

	
	@Override
	public void init() throws ServletException {
		
		super.init();
		
		session = FactoryProvider.geFactory().openSession();
		System.out.println(session.isOpen());
		System.out.println(session);
		System.out.println("got sesssion object");

		tx = session.beginTransaction();
		
		
	}




	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at LoginServlet");
		
		String username = request.getParameter("usename");
		String password = request.getParameter("password");
		
		
		UserDao userdao = new UserDao(session);
		Userbean ub = userdao.authenticateLogin(username,password);
		ub.toString();
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
