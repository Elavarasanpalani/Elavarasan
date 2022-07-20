package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class passwordcheck {
	public passwordcheck() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	
	}
	public static void main(String[] args) {
		passwordcheck ps=new passwordcheck();
		System.out.println(ps.check("vijay", "adi"));
		
	}
	
public boolean check(String uname,String upass) {
	
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ela", "root", "root");
		
		String sql="select * from cell where uname=? and upass=? ";
		PreparedStatement pre=con.prepareStatement(sql);
		pre.setString(1, uname);
		pre.setString(2,upass);
		ResultSet re=pre.executeQuery();
		
		if(re.next()) {
			return true;
		}
		else {
			return false;
		}

	} catch (Exception  e) {
		
		e.printStackTrace();
	}
	return false;
	
}

}
