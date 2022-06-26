package mysqldemo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class JDBCdemo6 {

	public static void main(String[] args) throws Exception {
		//meta data means table data of data eg= baby is result set and mom is result set meta data..

		//Step1 lode driver..
		
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//ste-2 establish connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ela","root","root");
				System.out.println(con);
				
			//database meta data .....
				DatabaseMetaData data=con.getMetaData();
				System.out.println(data.getDatabaseProductName());
				System.out.println(data.getDatabaseMinorVersion());
	}

}
