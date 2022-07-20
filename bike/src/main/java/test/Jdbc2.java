package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc2 {
	public static void main(String[] args) {
		
	}
	public String createtable() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ela","root","root");
			
			
			String sql="create table fats ( "+"uname varchar(20), " +"upass   VARCHAR2(20),  " + "city carchar(10), " +")";
			Statement stmt=con.createStatement();
			stmt.executeQuery(sql);
			//System.out.println(rs);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
		
		
		
		return null;
		
	}

}
