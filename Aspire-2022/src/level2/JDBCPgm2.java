package level2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCPgm2 {

	public static void main(String[] args) throws Exception{
		/*
		 * 1. Load or register the driver
		 * 2. establish the connection
		 * 3. prepare and execute a statement
		 * 4. process the result
		 */
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "passmysql");
		System.out.println("connection status"+con);
		Statement stmt=con.createStatement();
		String sql="insert into users values(4,'usman','secret','tvi',0)";
		int recno=stmt.executeUpdate(sql);
		System.out.println("No. of records updated: "+recno);
	}

}
