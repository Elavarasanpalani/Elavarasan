package jdbcpack;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

import com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type;

public class JDBCDemo5 {

	public static void main(String[] args) throws Exception{
		//Step1 - Load the Driver.
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Step 2 - Establish Connection
				Connection con=DriverManager.getConnection
						("jdbc:mysql://localhost:3306/method","root","root");
				System.out.println(con);
				
				//Step 3 - Execute sql statement
//				String sql="{call proc3(?,?)}";
//				
//				CallableStatement call=con.prepareCall(sql);
//				call.setString(1, "kamal");
//				call.registerOutParameter(2, Types.INTEGER);
//				
//				call.execute();
//				
//				int flag=call.getInt(2);
//				System.out.println("fl	ag status..."+flag);
				
				
				String sql="{call proc3(?,?)}";
				
				CallableStatement call=con.prepareCall(sql);
				call.setString(1, "kani");
				call.registerOutParameter(2, Types.INTEGER);
				call.execute();
				
				int flag=call.getInt(2);
				System.out.println("flag...="+flag);
				
				
	}

}
