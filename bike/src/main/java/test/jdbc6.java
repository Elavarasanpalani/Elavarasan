package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc6 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ela", "root", "root");
		
		
	//	String sql="create table pen(uid int(10),uname varchar(30),upass varchar(10))";
		
		Statement stem=con.createStatement();
		
		//stem.execute(sql);
		
		System.out.println("table is created form ttabse..."+stem);
		
		//insert
		
	String sql1="insert into pen values(?,?,?)";
		
		PreparedStatement pre=con.prepareStatement(sql1);
		
//		pre.setInt(1, 1);
//		pre.setString(2, "ela");
//		pre.setString(3, "secret");
//		//System.out.println(pre);
//		pre.execute();
//		pre.setInt(1, 2);
//		pre.setString(2, "kalam");
//		pre.setString(3, "secret");
//		
//		pre.execute();
		
//		pre.setInt(1, 3);
//		pre.setString(2, "raj");
//		pre.setString(3, "pass");
//		pre.execute();
		
		
		//update
		
		String sql2="update pen set upass=? where uid=?";
		PreparedStatement be=con.prepareStatement(sql2);
		be.setString(1, "tamil");
		be.setInt(2, 1);
		
		int re=be.executeUpdate();
		System.out.println(re);
		
		
			//retrive
		
		String sql3="select*from pen";
		PreparedStatement dd=con.prepareStatement(sql3);
		ResultSet rdd=dd.executeQuery();
		
		while(rdd.next()) {
			System.out.println(rdd.getInt("uid"));
			System.out.println(rdd.getNString("uname"));
			System.out.println(rdd.getString("upass"));
		}
		
		//delete
		
		String sql4="delete from pen where uname=?";
		
		PreparedStatement fff=con.prepareStatement(sql4);
		fff.setString(1, "ela");
		
		fff.execute();
		System.out.println("name is deleted...");

		
		
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
