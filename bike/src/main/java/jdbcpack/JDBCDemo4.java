	package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class JDBCDemo4 {

	public static void main(String[] args)  throws Exception{
		//step 1 Load the Driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step 2-Establish connection
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/method","root","root");
		
		System.out.println(con);
		//step 3-Excequte steatement
		
		String sql="select *from users where uname=?";
		PreparedStatement pre=con.prepareStatement(sql);
		
		pre.setString(1,"kamal");	
		
		ResultSet re=pre.executeQuery();
		
		//step-4 -process result
		
		ResultSetMetaData rsmd=re.getMetaData();
		
		int colcont=rsmd.getColumnCount();
		for(int  i = 1;i<=colcont;i++) {
			System.out.println(rsmd.getColumnName(i));
			
		}
		System.out.println("\n=====================================================\n");
		if(re.next()) {
			for(int i=1;i<=colcont;i++) {
				System.out.print(re.getString(i)+"\t");
			}
		
		
		}

	}

}
