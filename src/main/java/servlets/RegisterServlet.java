package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import bean.Userbean;
import dao.FactoryProvider;


//  @WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
			
			String userName = request.getParameter("userName");
			String userEmail = request.getParameter("userEmail");
			String userNumber =  request.getParameter("userNumber");
			String userPassword = request.getParameter("userPassword");
			String userAddress = request.getParameter("userAddress");
			
			
			System.out.println(userName);
			System.out.println(userEmail);
			System.out.println(userNumber);
			System.out.println(userPassword);
			System.out.println(userAddress);
			
			
			System.out.println("hiii");
			Userbean ub = new Userbean(userName,userEmail,userNumber,userPassword,null,userAddress);
			
			/*
			Session session= FactoryProvider.geFactory().openSession();
			Transaction tx = session.beginTransaction();
			
			int id = (int) session.save(ub);
			
			*/
			FactoryProvider fc = new FactoryProvider();
			System.out.println(fc);
			
			fc.geFactory();
			FactoryProvider.registerUser(ub);
		
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
