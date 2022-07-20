package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc4 {
	public jdbc4() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		
		jdbc4 j=new jdbc4();
		System.out.println(j.createtable());
		System.out.println(j.insettable());
	

	}
	
	public boolean createtable() {
		
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ela","root","root");
			String sql="create table  book(uname varchar(30),upass varchar(10),city varchar(30))";
			
			Statement stat=con.createStatement();
		 
			stat.execute(sql);
			
			return true;
			
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		return false;
		
	}
	
	public boolean insettable() {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ela","root","root");
			String sql="inset table from book(uname,upass,city)where(?,?,?)";
			PreparedStatement pre=con.prepareStatement(sql);
			pre.setString(1, "ela");
			pre.setString(2, "secret");
			pre.setNString(3, "chennai");
			
			ResultSet re=pre.executeQuery();
			System.out.println(re);
			
			return true;
//			while(re.next()) {
//				System.out.println(re.getString("uname")+":"re.getString("upass")+";"re.getString("city"));
//			}
			
		
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		return false;
		
		
	}

}
