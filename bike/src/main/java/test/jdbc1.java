package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc1 {

	public static void main(String[] args)throws Exception {
		//Step1 - Load the Driver.
		//Step1 - Load the Driver.
		
	}
	public  String creatable() throws Exception {	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//Step 2 - Establish Connection
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/anound","root","root");
		
		System.out.println(con);
		//Step 3 - Execute sql statement
		
		String sql="select * from checkusers";
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery(sql);
		
		//step 4 - process result
		
		while(rs.next()) {
			System.out.println(rs.getString("uname")+":"+rs.getString("upass"));
		}
		return sql;
	}
	}
	
	
	
	
	
	

			

	


