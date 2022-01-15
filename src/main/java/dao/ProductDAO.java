package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import bean.ProductBean;

public class ProductDAO {

	private static Session session = null;
	private Transaction tx = null;

	public ProductDAO() {

		session = FactoryProvider.geFactory().openSession();
		System.out.println(session.isOpen());
		System.out.println(session);
		System.out.println("got sesssion object");

//		tx = session.beginTransaction();

	}

	public boolean saveProduct(ProductBean product) {
		boolean status = false;
		try {

			tx = session.beginTransaction();
			 int id = (int) session.save(product);
			tx.commit();
			System.out.println("product saved on db. product id - " +id);
			status = true;
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

}
