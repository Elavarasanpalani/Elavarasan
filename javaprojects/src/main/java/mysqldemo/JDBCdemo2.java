package mysqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCdemo2 {

	public static void main(String[] args)  throws Exception{
		//Step1 lode driver..
		
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//ste-2 establish connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ela","root","root");
				System.out.println(con);
				
				//Step3 process statements../
				
				String sql="update users set flag =?";
				PreparedStatement pre=con.prepareStatement(sql);
				
				pre.setInt(1, 3);
				
				int no=pre.executeUpdate();
				System.out.println("ddls"+no);
	
	}

}
