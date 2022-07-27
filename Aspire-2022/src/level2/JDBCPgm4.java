package level2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DatabaseMetaData;


public class JDBCPgm4 {

	public static void main(String[] args) throws Exception{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "passmysql");
		System.out.println("connection status"+con);
		
		con.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
		System.out.println("for IRCTC..."+con.getTransactionIsolation());
		con.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
		System.out.println("for Reservation Counter..."+con.getTransactionIsolation());
		System.out.println("-------------------------------------------------------------------------");
		DatabaseMetaData dbmd=con.getMetaData();
		System.out.println(dbmd.getDatabaseProductName());
		System.out.println(dbmd.getDefaultTransactionIsolation());
		System.out.println(con.getTransactionIsolation());
		System.out.println(dbmd.getDriverName());
		System.out.println(dbmd.getUserName());
		System.out.println(dbmd.getDriverVersion());
	}

}
