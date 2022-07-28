package level2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCPgm7 {

	public static void main(String[] args) throws Exception{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "passmysql");
		System.out.println("connection status"+con);
		String sql="select * from users where uid=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		while (true) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a id: ");
		int uid=scan.nextInt();
		
		//String sql="select * from users where uid="+uid;// this type of dynamism is not allowed 
		//- it leads problem called SQL injection - a security problem
		stmt.setInt(1, uid);
		ResultSet rs= stmt.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString(2));
		}
		}	
	}

}
