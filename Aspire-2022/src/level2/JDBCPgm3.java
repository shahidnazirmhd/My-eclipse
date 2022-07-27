package level2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCPgm3 {

	public static void main(String[] args) throws Exception{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "passmysql");
		System.out.println("connection status"+con);
		Statement stmt=con.createStatement();
		String sql1="create table department (dno int(5),dname varchar(30))";
		String sql2="insert into department values (1,'market')";
		String sql3="insert into department values (2,'reception')";
		String sql4="update users set flag=1";
		String sql5="delete from users where uid=4";
		System.out.println(stmt.executeUpdate(sql1));
		System.out.println(stmt.executeUpdate(sql2));
		System.out.println(stmt.executeUpdate(sql3));
		System.out.println(stmt.executeUpdate(sql4));
		System.out.println(stmt.executeUpdate(sql5));
		
		
	}

}
