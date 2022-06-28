package jdbcpack;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class JDBCDemo8 {
	//it will be use out put procedure

	public static void main(String[] args) throws Exception{
		//Step1 - Load the Driver.
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Step 2 - Establish Connection
				Connection con=DriverManager.getConnection
						("jdbc:mysql://localhost:3306/method","root","root");
				System.out.println(con);
				
				String sql="{call proc1(?)}";
				
				CallableStatement cs=con.prepareCall(sql);
				cs.registerOutParameter(1,Types.INTEGER);
				cs.execute();
				int noof=cs.getInt(1);
				System.out.println(noof);
				

	}

}
