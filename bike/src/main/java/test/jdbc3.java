package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc3 {

	public jdbc3() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		jdbc3 j=new jdbc3();
		System.out.println(j.createtable());
	}
	
	public boolean createtable() {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ela","root","root");
			String sql="create table facte(uname varchar(30),upass varchar(10),city varchar(10))";
			Statement state=con.createStatement();
			state.execute(sql);
			
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
}
	public void retriveupass() {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ela","root","root");
			String sql="select upass from facte where uname=?";
			
			PreparedStatement pre=con.prepareStatement(sql);
			
			//String uname;
			pre.setString(1, sql);
			ResultSet re=pre.executeQuery();
			
			String upass=null;
			
          
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
