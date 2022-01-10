package dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionProvider{

	
	
	
	
	public  static Connection getConnection() {
	String url = "jdbc:mysql://localhost:3306/ecommerce";
	String username = "Reyan";
	String password = "root";
	String driver = "com.mysql.cj.jdbc.Driver";
	
	
		Connection con = null;
		try {
			
			Class.forName(driver);
			System.out.println("hii");
			con = DriverManager.getConnection(url, username, password);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		return con;
	}
	

}
