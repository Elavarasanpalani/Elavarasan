package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo2 {

	public static void main(String[] args)throws Exception {
		//Step1 - Load the Driver.
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2 - Establish Connection
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/method","root","root");
		System.out.println(con);
		
		//Step 3 - Execute sql statement
		
		String sql="select * from users where uname=?";
		PreparedStatement pre=con.prepareStatement(sql);
		
		//Statement smt=con.createStatement();
		
		pre.setString(1, "ela");
		
		
		ResultSet  re=pre.executeQuery();//it will show all the table of coulum
		
		
		if(re.next()) {
			System.out.println(re.getInt("uid")+"...."+re.getString("uname")+"...."+re.getInt("amt"));
			
			
		}
		

		
	}

}
