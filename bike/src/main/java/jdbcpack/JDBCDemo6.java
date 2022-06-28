package jdbcpack;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDemo6 {

	public static void main(String[] args) throws Exception {
		//Step1 - Load the Driver.
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2 - Establish Connection
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/method","root","root");
		System.out.println(con);
		
//		//step 3
//		String sql="{call proc4(?,?)}";
//		
//		CallableStatement call=con.prepareCall(sql);
//		
//		call.setString(1,"ela");
//		call.setInt(2, 9);
//		
//		
//		int no=call.executeUpdate();
//		
//		System.out.println(no);
		
		
		String sql="{call proc4(?,?)}";
		
		CallableStatement call=con.prepareCall(sql);
		
		call.setString(1, "kamal");
		call.setInt(2, 10);
		
		
		int no=call.executeUpdate();
		System.out.println(no);
		
		
		

	}

}

