package mysqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class JDBCdemoconfil {

	public static void main(String[] args) throws Exception {
		//Step1 lode driver..
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//ste-2 establish connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ela","root","root");
		System.out.println(con);
		
		//Step3 process statements..
		
		String sql="users set flag=1";
		Statement stat=con.createStatement();
		int noof=stat.executeUpdate(sql);
		
		System.out.println(noof);
	}

}
