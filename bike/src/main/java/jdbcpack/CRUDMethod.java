package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class CRUDMethod {
public CRUDMethod() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public static void main(String[] args) {
		
		CRUDMethod c=new CRUDMethod();
		
		//System.out.println(c.creatTable());
		
		System.out.println(c.retriveUserPassword("raja"));
		
		System.out.println(c.updateTable("raja1", "raja1234"));
		
		System.out.println(c.deleteTable("raja"));
		
	}
	
	public boolean creatTable() {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String query="create table usercheck(uname varchar(20),upass varchar(10))";
			
			Statement s=(Statement) con.createStatement();
			
			s.execute();
			
			return true;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public String retriveUserPassword(String username) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String query="select upass from usercheck where uname=?";
			
			PreparedStatement s=con.prepareStatement(query);
			
			s.setString(1, username);
			
			ResultSet rs=s.executeQuery();
			
			String upass = null;
			
			if(rs.next()) {
				
				upass=rs.getString(1);
				
			}
			
			return upass;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
			return null;
			
		}
		
	}
	
	public boolean updateTable(String username,String userpass) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String query="update usercheck set upass=? where uname=?";
			
			PreparedStatement s=con.prepareStatement(query);
			
			s.setString(1, userpass);
			
			s.setString(2, username);
			
			s.execute();
			
			return true;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public boolean deleteTable(String username) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String query="delete from usercheck where uname=?";
			
			PreparedStatement s=con.prepareStatement(query);
			
			s.setString(1, username);
			
			s.execute();
			
			return true;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}

}
