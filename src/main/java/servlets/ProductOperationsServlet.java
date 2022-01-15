package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.File;

import bean.CategoryBean;
import bean.ProductBean;
import dao.CatagoryDAO;
import dao.ProductDAO;

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

		String operation = request.getParameter("value");
		PrintWriter out = response.getWriter();

		if (operation.trim().equals("addCatagory")) {

//---------------to save category to database-------------------

			String catagoryTitle = "Phones";
			String catagoryDesc = "This category contains Mobile Phones";

			CategoryBean catagory = new CategoryBean();
			catagory.setCatagoryTitle(catagoryTitle);
			catagory.setCatagoryDescription(catagoryDesc);

			CatagoryDAO cd = new CatagoryDAO();
			int catagoryID = cd.saveCatagory(catagory);
			out.println(catagoryID);

		} else if (operation.trim().equals("addProduct")) {

//---------------to save product to database-------------------

			String productName = "test_product";
			String productDesc = "test_productDesc";
			int productPrice = Integer.parseInt("100");
			int productDiscount = Integer.parseInt("20");
			int productQty = Integer.parseInt("10");
			int catagoryID = Integer.parseInt("1");
			Part part = request.getPart("pic");
			System.out.println(part.getContentType());

			ProductBean productbean = new ProductBean();
			productbean.setProductName(productName);
			productbean.setProductDescription(productDesc);
			productbean.setProductPrice(productPrice);
			productbean.setProductQuantity(productQty);
			productbean.setProducPhoto(part.getSubmittedFileName());
//			productbean.setCatagory(CatagoryDAO.getCatagotyByID(catagoryID));

//			ProductDAO product = new ProductDAO();
//			product.saveProduct(productbean);
			
			
			String path =request.getRealPath("images")+File.separator+"productImages" ;
			System.out.println(path);
			
			
			System.out.println("adding product works");

		} else {

			// ---------------do something in else part-------------------

			out.println("doing something");

		}

		response.getWriter().append("   Served at ProductOperationsServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

}
