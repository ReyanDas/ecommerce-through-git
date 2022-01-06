package test;



import bean.Userbean;
import dao.FactoryProvider;

public class test {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Userbean ub = new Userbean("Reyan Das","reyandas25@gmail.com","123456","8910632435",null,"kolkata");
		
		FactoryProvider.registerUser(ub);
		
		
//	 System.out.println(  FactoryProvider.geFactory(ub));
		 
		
		 
		
		
		
		
	}

}

