package level2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class JDBCPgm10 {

	public static void main(String[] args) throws Exception{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "passmysql");
		System.out.println("connection status"+con);
		
		CallableStatement cs=con.prepareCall("{call proc3(?,?)}");
		cs.setString(1, "Abu");
		cs.registerOutParameter(2,Types.INTEGER);
		boolean b= cs.execute();
		int flag=cs.getInt(2);
		System.out.println("Flag: "+flag);
		System.out.println("execute result: "+b);
		//Note: if the return type of sql is result set then the execute method will return true.
		//example,
		Statement st=con.createStatement();
		b=st.execute("select * from users");
		System.out.println("execute result which returns result set: "+b);
	}

}
