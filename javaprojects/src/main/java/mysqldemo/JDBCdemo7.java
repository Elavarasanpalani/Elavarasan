package mysqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class JDBCdemo7 {
//stored proceture...
	public static void main(String[] args) throws Exception{
		//meta data means table data of data eg= baby is result set and mom is result set meta data..

		//Step1 lode driver..
		
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//ste-2 establish connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ela","root","root");
				System.out.println(con);
				
				//step3
//				String sql="select *from users  where uname=?";
//				PreparedStatement pre=con.prepareStatement(sql);
//				
//				pre.setString(1, "kamal");
//				
//				ResultSet re=pre.executeQuery();
//				
//				ResultSetMetaData remt=re.getMetaData();
//				int no=remt.getColumnCount();
//				for(int i=1;i<=no;i++) {
//					System.out.println(remt.getColumnName(i));
				
				
				String sql="select *from users where uname=?";
				PreparedStatement pre=con.prepareStatement(sql);
				pre.setString(1,"kamal");
				
				ResultSet re=pre.executeQuery();
				ResultSetMetaData rsmt=re.getMetaData();
				int no=rsmt.getColumnCount();
			//	System.out.println(no);
				
				for(int i=1;i<=no;i++) {
					System.out.println(rsmt.getColumnName(i));
				
				
				
				
					
				}
				

	}

}
