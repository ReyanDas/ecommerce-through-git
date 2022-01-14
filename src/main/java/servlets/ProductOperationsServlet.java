package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.hibernate.Session;
import org.hibernate.Transaction;
import bean.CatagoryBean;
import bean.ProductBean;
import dao.CatagoryDAO;

//@WebServlet("/ProductOperationsServlet")

@MultipartConfig
public class ProductOperationsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Session session = null;
	private Transaction tx = null;

	public ProductOperationsServlet() {
		super();

	}
	/*
	 * public void init(ServletConfig config) throws ServletException {
	 * 
	 * session = FactoryProvider.geFactory().openSession();
	 * System.out.println(session.isOpen()); System.out.println(session);
	 * System.out.println("got sesssion object");
	 * 
	 * tx = session.beginTransaction();
	 * 
	 * }
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		---------------to save catagory to database-------------------
		/*
		 * String catagoryTitle = "Laptop"; String catagoryDesc =
		 * "This catagory contains Laptops";
		 * 
		 * CatagoryBean catagory = new CatagoryBean();
		 * catagory.setCatagoryTitle(catagoryTitle);
		 * catagory.setCatagoryDescription(catagoryDesc);
		 * 
		 * CatagoryDAO cd = new CatagoryDAO(); int catagoryID =
		 * cd.saveCatagory(catagory); System.out.println(catagoryID );
		 */
//		---------------to save product to database-------------------

		String productName = "";
		String productDesc = "";
		int productPrice = Integer.parseInt("");
//		int productDiscount = Integer.parseInt("");
		int productQty = Integer.parseInt("");
		int catagoryID = Integer.parseInt("");
//		Part part = request.getPart("");	

		ProductBean p = new ProductBean();
		p.setProductName(productName);
		p.setProductDescription(productDesc);
		p.setProductPrice(productPrice);
		p.setProductQuantity(productQty);
//		p.setProducPhoto(part.getSubmittedFileName());
//		p.setCatagory(null);
		p.setCatagory(CatagoryDAO.getCatagotyByID(catagoryID));


		response.getWriter().append("Served at ProductOperationsServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

}
