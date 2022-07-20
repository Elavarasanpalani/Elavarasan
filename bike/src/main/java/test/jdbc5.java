package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class jdbc5 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud", "root", "Root");
		
		Statement stmt = con.createStatement();
   		String sql = "CREATE TABLE college " + "(rollno INTEGER not NULL, " +"name VARCHAR(255), " + " address VARCHAR(255), " + "section VARCHAR(255))";
		stmt.execute(sql);
		System.out.println("Created table in given database...");
		int R;
		//Insert
		String sql1 = "INSERT INTO college (rollno, name, address,section) VALUES (?, ?, ?, ?)";
		PreparedStatement statement1 = con.prepareStatement(sql1);
		
		statement1.setInt(1, 1);
		statement1.setString(2, "sinki");
		statement1.setString(3, "dolakpoor");
		statement1.setString(4, "6-a");
		System.out.println(statement1);
		R = statement1.executeUpdate(
				"INSERT INTO Std1 (rollno, name, address,section) VALUES (2, 'kumar', 'lenin st', '10-a')");
		System.out.println(R);
		System.out.println("A new user was inserted successfully!");
		
		//Update std1 record
		R = statement1.executeUpdate("Update std1 set section='6-b' where name='sinki'");
		System.out.println(R);
		System.out.println("Update successfully!");
//		// delete std1 record
//		R = statement1.executeUpdate("delete from college where address = 'monk'");
//		System.out.println(R);
//		System.out.println("Deleted successfully...");
		
		// read std1 records
		ResultSet rs = statement1.executeQuery("Select * from college");
		while (rs.next()) {
			System.out.println("rollno : " + rs.getInt("rollno") + ", name : " + rs.getString("name") + ", address : "
					+ rs.getString("address") + ", section : " + rs.getString("section"));
		}
		System.out.println("showed success");
	}

}
