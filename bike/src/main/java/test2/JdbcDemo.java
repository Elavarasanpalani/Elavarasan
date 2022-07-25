package test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ela","root","root");
	 System.out.println(con);
	 							
  String sql="create table checkusers (uname varchar(30),upass varchar(10))";
  
  Statement state=con.createStatement();
  
 
	 state.execute(sql);
	 
	 

}
}

