package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws Exception{
		//Step1 - Load the Driver.
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2 - Establish Connection
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/method","root","root");
		System.out.println(con);
		
		//Excequte sql statements
		String sql="update users set flag=0";
		Statement stat=con.createStatement();
		int noofrwochange=stat.executeUpdate(sql);
		
		
		//process result
		System.out.println("no of rwo update..."+noofrwochange);
		

	}

}
