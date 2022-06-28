package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class JDBCDemo11 {

	public static void main(String[] args)throws Exception {
		//Step1 - Load the Driver.
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Step 2 - Establish Connection
				Connection con=DriverManager.getConnection
						("jdbc:mysql://localhost:3306/method","root","root");
				System.out.println(con);
				
				
				//step3
				
				String  sql="select *from users where uname=?";
				PreparedStatement pre=con.prepareStatement(sql);
				pre.setString(1, "ela");
				
				ResultSet re=pre.executeQuery();
				
				ResultSetMetaData rest=re.getMetaData();
				
				int coloum =rest.getColumnCount();
				for(int i=1;i<=coloum;i++) {
					System.out.print(rest.getColumnName(i)+"\t");
					
				}
				if(re.next()) {
					for(int i=1;i<=coloum;i++) {
						System.out.println(rest.getColumnName(i));
					}
				
		
				
				}
				
	}

}
