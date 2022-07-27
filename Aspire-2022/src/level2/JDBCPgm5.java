package level2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCPgm5 {

	public static void main(String[] args) throws Exception{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "passmysql");
		System.out.println("connection status"+con);
		
		con.setAutoCommit(false);
		Statement stmt=con.createStatement();
		String sql="update users set flag=0";
		stmt.executeUpdate(sql);
		System.out.println("Press 1 to commit or 0 to Rollback");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n==1) {
			con.commit();
		}
		else {
			con.rollback();
		}
		
	}

}
