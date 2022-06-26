package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCDemo3 {

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
				
				pre.setInt(1, 3);
				
				pre.setInt(2, 4);
				
				pre.setString(3, "salem");
				
				int noofchange=pre.executeUpdate();
				System.out.println(noofchange);
		
	
	}

}
