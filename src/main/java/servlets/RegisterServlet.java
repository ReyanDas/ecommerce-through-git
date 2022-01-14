package servlets;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

//    user existence validation

	@SuppressWarnings("unchecked")
	public boolean isUserExist(Userbean ub) {
		boolean status = true;
		String email = ub.getUserEmail();
		System.out.println("email get from clint " + email);
		List<String> allemails = (List<String>) session.createQuery("select u.userEmail from bean.Userbean u").list();
		for (String emails : allemails) {

			System.out.println("email matched " + emails);

			if (emails.equals(email)) {
				status = false;

			}

		}
		return status;

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			String userName = request.getParameter("userName");
			String userEmail = request.getParameter("userEmail");
			String userNumber = request.getParameter("userNumber");
			String userPassword = request.getParameter("userPassword");
			String userAddress = request.getParameter("userAddress");

			Userbean ub = new Userbean(userName, userEmail, userNumber, userPassword, null, userAddress, "normal");
			System.out.println("user bean created");
//			System.out.println(isUserExist(ub));

//			checking if email already exists or not 
			if (isUserExist(ub)) {

//           if not saving the user
				int id = (int) session.save(ub);
				tx.commit();
				System.out.println("user saving.......");
				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("massege", "Registration successful. Please Login.. ID- " + id);
				response.sendRedirect("signup.jsp");

			} else {
//				if yes showing error message
				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("errormassege", "Email already exist! ");
				response.sendRedirect("signup.jsp");
				System.out.println("user exist showing error msg...");

			}

			return;

		} catch (Exception e) {

			e.printStackTrace();
		}

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
