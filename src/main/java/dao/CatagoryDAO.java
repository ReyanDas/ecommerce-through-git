package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import bean.CatagoryBean;

public class CatagoryDAO {

	private static Session session = null;
	private Transaction tx = null;

	public CatagoryDAO() {

		try {

			session = FactoryProvider.geFactory().openSession();
			System.out.println(session.isOpen());
			System.out.println(session);
			System.out.println("got sesssion object");

			tx = session.beginTransaction();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int saveCatagory(CatagoryBean catagory) {
		int catagoryID = 0;

		try {

			catagoryID = (int) session.save(catagory);
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return catagoryID;
	}

	public static CatagoryBean getCatagotyByID(int catagoryID) {

		CatagoryBean catagory = null;

		try {

			catagory = session.get(CatagoryBean.class, catagoryID);

		} catch (Exception e) {
			// TODO: handle exception
		}

		return catagory;
	}

}
