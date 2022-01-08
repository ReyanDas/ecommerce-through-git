package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import bean.Userbean;
// import dao.ConnectionProvider;
import dao.FactoryProvider;


//  @WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	private Session session = null;
	private Transaction tx = null;
       
   
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    
    
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	
    	
    	
    	super.init();
    	
    	//
		 session= FactoryProvider.geFactory().openSession();
		 System.out.println(session.isOpen());
		 System.out.println(session);
		System.out.println("got sesssion object");
		
		 tx = session.beginTransaction();
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
			
			
			Userbean ub = new Userbean(userName,userEmail,userNumber,userPassword,null,userAddress,"normal");
			System.out.println("user bean created");
			 
			
			
			//System.out.println( ConnectionProvider.getConnection());
			
			
			int id =(int) session.save(ub);
			tx.commit();
			System.out.println("user saved..., id-"+id);
			
			session.close();
			System.out.println(session.isOpen());
		
//			FactoryProvider.registerUser(ub);
			
			
			System.out.println("Hello");
			ub = null;
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
