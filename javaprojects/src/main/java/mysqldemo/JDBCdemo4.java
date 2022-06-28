package mysqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCdemo4 {
  ///this progrme is used scener model
	public static void main(String[] args)throws Exception {
		// /Step1 lode driver..
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//ste-2 establish connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ela","root","root");
		System.out.println(con);
		
		//step 3 executer the process..
		
		String sql="update users set flag=? where uid=?";
		PreparedStatement pre=con.prepareStatement(sql);
		
//		while(true) {
//			Scanner sc=new Scanner(System.in);
//			System.out.println("enter te uid....");
//			int uid =sc.nextInt();
//			
//			System.out.println("enter the flag");
//			int flag=sc.nextInt();
//			pre.setInt(1, flag);
//			pre.setInt(2, uid);
//			
//			int no=pre.executeUpdate();
//			
//			System.out.println(no);
		
		
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the uid");
			int uid=sc.nextInt();
			
			System.out.println("enter the flag");
			
			int flag=sc.nextInt();
			
			pre.setInt(1, flag);
			pre.setInt(2, uid);
			
			int in=pre.executeUpdate();
			System.out.println(in);
			
		}
		
		}
		
		
	}


