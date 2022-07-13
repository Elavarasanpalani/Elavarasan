package excersicepro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class jdcdemo {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/method","root","root");
		
		System.out.println(con);
		
		//sql statement excequte..
		
		String sql="select *from users where uname";
		
		PreparedStatement pre=con.prepareStatement(sql);
		
		pre.setString(1,"ela");
		
		ResultSet re=pre.executeQuery();
		
			//steep4 excequt process 
		
		ResultSetMetaData rsmd=re.getMetaData();
		int colcount=rsmd.getColumnCount();
		for(int i=1;i<=colcount;i++) {
			System.out.print(rsmd.getColumnName(i)+"\t");
		}
		System.out.println("\n=====================================================\n");
		if(re.next()) {
			for(int i=1;i<=colcount;i++) {
				System.out.print(re.getString(i)+"\t");
			}
		}
		
		
		
		
		
		
	

	}

}
