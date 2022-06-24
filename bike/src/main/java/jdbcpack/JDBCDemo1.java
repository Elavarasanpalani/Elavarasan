package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDemo1 {
  //it is dynamically set the name and id also ...
	public static void main(String[] args) throws Exception {
		//Step1 - Load the Driver.
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Step 2 - Establish Connection
				Connection con=DriverManager.getConnection
						("jdbc:mysql://localhost:3306/method","root","root");
				System.out.println(con);
				
				//Step 3 - Execute sql statement
		
				String sql="update users set flag=? where uid=?";
				PreparedStatement pre=con.prepareStatement(sql);// one time statement prepared to change many time of pepose..
				while(true) {
					Scanner  sc=new Scanner(System.in);
					
					System.out.println("enter the uid....!");
					
				 int uid=sc.nextInt();
					
					System.out.println("enter the flag...!");
					
					int fla=sc.nextInt();
					pre.setInt(1,fla);  //is find 1-index...2-value
			     	pre.setInt(2, uid);
				
				int noofchange=pre.executeUpdate();
				
				
				//process result
				
				System.out.println(noofchange);
				}
				
				
		

	}

}
