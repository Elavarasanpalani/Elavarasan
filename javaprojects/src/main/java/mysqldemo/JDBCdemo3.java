package mysqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCdemo3 {

	public static void main(String[] args)throws Exception {
		//Step1 lode driver..
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//ste-2 establish connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ela","root","root");
		System.out.println(con);
		
		//Step3 process statements../
//		String sql="update users set flag=?  where uid=?";
//		PreparedStatement pre=con.prepareStatement(sql);
//		
//		pre.setInt(1, 4);
//		pre.setInt(2, 3);
//		
//		int no=pre.executeUpdate();
//		System.out.println(no);
		
		
		String sql="update users set flag=? where uid=?";
		PreparedStatement pre=con.prepareStatement(sql);
		pre.setInt(1, 8);
		pre.setInt(2, 4);
		
		int no=pre.executeUpdate();
		System.out.println(no); 	
		
//		
//		String sql="update useres set cit=? where uname=?";
//		PreparedStatement pre=con.prepareStatement(sql);
//		pre.setString(1, "bangalour");
//        pre.setString(2, "samu");
//        
//        int no=pre.executeUpdate(sql);
//        System.out.println(no);	 
		
		
		
		
	}

}
