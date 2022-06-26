package mysqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCdemo5{
	public static void main(String[] args)throws Exception {
		
	
	// /Step1 lode driver..
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//ste-2 establish connection
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ela","root","root");
	System.out.println(con);
	
//	//step 3 executer the process..
//	String sql="select *from users where uname=?";
//	PreparedStatement pre=con.prepareStatement(sql);
//	
//	pre.setString(1, "ramu");
//	ResultSet re=pre.executeQuery();
//	
//	
//	System.out.println(re);
//	
//	if(re.next()) {
//		System.out.println(re.getInt("uid")+".."+re.getString("uname")+"..."+re.getInt("amt"));
//	}
	
	//step 3
	String sql="select *from users";
	Statement stmt=con.createStatement();
	
	ResultSet re=stmt.executeQuery(sql);
	
	while(re.next()) {
		System.out.println(re.getInt("uid")+"...."+re.getString("uname"));
		
	}


	
	
	//sterp 4 process result...
	
	}
	

}
