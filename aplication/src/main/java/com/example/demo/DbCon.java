package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbCon {
	
	public ResultSet met(String emp) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anound","root","root");
			String sql="select * from "+emp;
			Statement st=con.createStatement();
			ResultSet re=st.executeQuery(sql);
			return re;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

}
