package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo9 {

	public static void main(String[] args) throws Exception {
		//Step1 - Load the Driver.
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2 - Establish Connection
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/method","root","root");
		System.out.println(con);
		//Step 3
		
		String sql="select *from users";
		
		Statement stat=con.createStatement();
		
		boolean result=stat.equals(sql);
		
		System.out.println(result);
		

	}

}
