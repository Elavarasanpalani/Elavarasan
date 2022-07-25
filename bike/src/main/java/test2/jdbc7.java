package test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc7 {
	public jdbc7() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		jdbc7 j=new jdbc7();
		System.out.println(j.createtab());
		
		System.out.println(j.insert(1, "tala", "aj"));
		System.out.println(j.insert(2, "vijay", "vj"));
		System.out.println(j.insert(3, "kamal", "ka"));
		
		System.out.println(j.updatetable("ela", 1));
		System.out.println(j.updatetable("adi", 2));
		
		System.out.println(j.delete("tala"));
		System.out.println(j.retrive());
	}
	
	public boolean createtab() {
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ela", "root", "root");
		
			//String sql="create table cell(uid int(10),uname varchar(30),upass varchar(10))";
			
			Statement state=con.createStatement();
		
			//state.execute(sql);
			System.out.println("table is created...."+state);
			
			return true;
			
			
			
		} catch (Exception  e) {
			
			e.printStackTrace();
		}
		
		
		return false;
	}
	
	public boolean insert(int a,String b,String c) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ela", "root", "root");
		
			String sql="insert into cell values(?,?,?)";
			PreparedStatement pre=con.prepareStatement(sql);
			pre.setInt(1,a);
			pre.setString(2, b);
			pre.setString(3, c);
			pre.execute();
			
			
			System.out.println("the vlaue is enterd....");
			
			
			return true;
			
			
			
		} catch (Exception  e) {
			
			e.printStackTrace();
		}
		return false;
		
	}
	
	public boolean updatetable(String d,int f) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ela", "root", "root");
		
			String sql="update cell set upass=? where uid=?";
			PreparedStatement pre=con.prepareStatement(sql);
			pre.setString(1, d);
			pre.setInt(2, f);
			pre.execute();
			
			
			
			
			System.out.println("the vlaue is updated....");
			
			
			return true;
			
			
			
		} catch (Exception  e) {
			
			e.printStackTrace();
		}
		return false;
		
	}
	
	public boolean delete(String s) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ela", "root", "root");
		
			String sql="delete from cell where uname=?";
			PreparedStatement pre=con.prepareStatement(sql);
			pre.setString(1, s);
			
			pre.execute();
			
			
			
			
			
			
			
			System.out.println("the vlaue is deleted.......");
			
			
			return true;
			
			
			
		} catch (Exception  e) {
			
			e.printStackTrace();
		}
		return false;
		
	}
	
	public String retrive() {
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ela", "root", "root");
		
			String sql="select *from cell";
			PreparedStatement pre=con.prepareStatement(sql);
			ResultSet re=pre.executeQuery();
			System.out.println(re);
			
			while(re.next()) {
				System.out.println(re.getInt("uid"));
				System.out.println(re.getString("uname"));
				System.out.println(re.getString("upass"));
			}
			
		
			
			
		} catch (Exception  e) {
			
			e.printStackTrace();
		}
		return null;
	}

}
