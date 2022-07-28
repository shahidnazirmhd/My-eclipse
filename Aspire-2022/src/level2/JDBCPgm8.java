package level2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.util.Scanner;

public class JDBCPgm8 {

	public static void main(String[] args) throws Exception{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "passmysql");
		System.out.println("connection status"+con);
		String sql="insert into users values (?,?,?,?,?)";
		PreparedStatement stmt=con.prepareStatement(sql);
		while (true) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a id: ");
		int uid=scan.nextInt();
		System.out.println("Please enter a name: ");
		String uname=scan.next();
		System.out.println("Please enter a password: ");
		String upass=scan.next();
		System.out.println("Please enter a city: ");
		String ucity=scan.next();
		System.out.println("Please enter a flag: ");
		int flag=scan.nextInt();
		//int flag=0;
		stmt.setInt(1, uid);
		stmt.setString(2, uname);
		stmt.setString(3, upass);
		stmt.setString(4, ucity);
		stmt.setInt(5, flag);
		int no= stmt.executeUpdate();
			System.out.println(no+" Records inserted");
		}	
	}

}
