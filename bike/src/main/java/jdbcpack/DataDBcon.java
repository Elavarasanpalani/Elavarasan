package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataDBcon {
	
	public static void main(String[] args) {
		Counder comm=new Counder();
		//comm.createinsert();
//	comm.createinsert("kamal", "passs", 1);
	//	comm.update("ela", 2);
		comm.Delete(1);
		comm.Retrive();
		
		
		
		
	}
}
class Counder{
	public Counder() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	

	
	
	
	public  void createinsert(String a,String b,int c) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ela","root","root");
//			Statement ste=con.createStatement();
//			String sql="create table raja(uname varchar(30),upass varchar(20),flag int)";
//			
//			ste.execute(sql);
//			System.out.println("tbale is created..");
			
	
			//insert  
			String sql="insert into raja values(?,?,?)";
			PreparedStatement pre=con.prepareStatement(sql);
			pre.setString(1, a);
			pre.setString(2, b);
			pre.setInt(3, c);
			
			pre.execute();
			System.out.println("instet in complemete");
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void update (String uname,int flag) {
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ela","root","root");
			String sql="update raja set flag=? where uname=?";
			PreparedStatement pre=con.prepareStatement(sql);
			pre.setInt(1,flag);
			pre.setString(2, uname);
			
			pre.executeUpdate();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Delete(int flag) {

		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ela","root","root");
			String sql="delete from raja where flag=?";
			PreparedStatement pre=con.prepareStatement(sql);
			
			pre.setInt(1, flag);
			pre.execute();
			System.out.println("it is deleted...");
			
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Retrive() {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ela","root","root");
			String sql="select * from raja";
			PreparedStatement pre=con.prepareStatement(sql);
			ResultSet re=pre.executeQuery();
			while(re.next()) {
				System.out.println(re.getString("uname"));
				System.out.println(re.getString("upass"));
				System.out.println(re.getInt("flag"));
			}
			
			System.out.println("table is retrive.....");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}




