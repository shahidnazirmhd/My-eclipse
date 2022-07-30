package level2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.util.Scanner;

public class JDBCPgm9 {

	public static void main(String[] args) throws Exception{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "passmysql");
		System.out.println("connection status"+con);
		
		CallableStatement cs=con.prepareCall("{call proc1()}");
		int no=cs.executeUpdate();
		System.out.println("Updated records: "+no);
		System.out.println("-----------------------------------------------------------------");
		cs=con.prepareCall("{call proc2(?,?)}");
		cs.setString(1, "Abu");
		cs.setInt(2, 0);
		no=cs.executeUpdate();
		System.out.println("Updated records: "+no);
	}

}
