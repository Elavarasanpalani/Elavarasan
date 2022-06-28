package mysqldemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

//import com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type;

public class JDBCdemo8 {

	public static void main(String[] args) throws Exception{
		//Step1 lode driver..
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//ste-2 establish connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ela","root","root");
		System.out.println(con);
		
		String sql="{call proc1(?)}";
		
		CallableStatement cal=con.prepareCall(sql);
		cal.registerOutParameter(1, Types.INTEGER);
		
		cal.execute();
		
		int coun=cal.getInt(0);
		System.out.println("No of columns..."+coun);
		
		
	}

}
