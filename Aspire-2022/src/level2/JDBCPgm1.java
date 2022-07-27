package level2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCPgm1 {

	public static void main(String[] args) throws Exception{
		/*
		 * 1. Load or register the driver
		 * 2. establish the connection
		 * 3. prepare and execute a statement
		 * 4. process the result
		 */
		// --1.--
		Class.forName("com.mysql.cj.jdbc.Driver");
		// --2.--
		// url= protocol:database://ipaddress/dbname
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","passmysql");
		System.out.println("connection= "+con);
		
		Statement stmt=con.createStatement();
		String sql="select * from users";
		ResultSet rs= stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println("Uid: "+rs.getInt(1)+" Uname: "+rs.getString(2)+" city: "+rs.getString(4));
		}
		System.out.println("------------------------------------------------------------");
		stmt=con.createStatement();
		sql="select * from users where city='kumbakonam'";
		rs= stmt.executeQuery(sql);
		if(rs.next()) {
			System.out.println("Uid: "+rs.getInt(1)+" Uname: "+rs.getString(2)+" city: "+rs.getString(4));
		}
		else {
			System.out.println("no records...");
		}
	}

}
