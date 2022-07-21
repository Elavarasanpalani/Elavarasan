package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcimg {
	public jdbcimg() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws Exception{
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ela", "root", "root");
		
		
		String sql="insert into pic values (?,?)";
		PreparedStatement pre=con.prepareStatement(sql);
		pre.setString(1, "adi");
		InputStream ins=new FileInputStream("C:\\Users\\elavarasan.p\\image\\car.jfif");
		//.setBlob(2, ins);	
		pre.setBlob(2, ins);
		
		pre.execute();
		
		System.out.println("recored in insert.....");
		
		///retrove the result
		
		Statement stmt=con.createStatement();
		ResultSet re=stmt.executeQuery("select *from pic");
		
		while(re.next()) {
			 String name = re.getString("uname");
			  Blob blob = re.getBlob("Logo");
			  
			  System.out.println("uname"+name);
			  System.out.println("Logo"+blob);
			  
			  InputStream is = blob.getBinaryStream();
			  byte byteArray[] = new byte[is.available()];
			  is.read(byteArray);
			  
			  String filePath = "C:\\Users\\elavarasan.p\\image\\_pic_car.jfif";
			  try (FileOutputStream outPutStream = new FileOutputStream(filePath)) {
				outPutStream.write(byteArray);
			}
			  System.out.println(filePath);
			  
			 		
		}
			
		
	}
	

}
