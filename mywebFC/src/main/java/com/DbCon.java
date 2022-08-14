package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbCon {
		public DbCon() {
			try {
					Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public boolean checkUser(String uname,String upass) {
			
			try {
				Connection con= DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","passmysql");
				PreparedStatement ps=con.prepareStatement("select * from webUsers where uname=? and upass=?");
				ps.setString(1, uname);
				ps.setString(2, upass);
				ResultSet rs=ps.executeQuery();
				if (rs.next()) {
					return true;
				}else {
					return false;
				}
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			
		}
		public int register(String fullName,int birthYear,String uname,String upass,String city,long mobileNum) {
			try {
			Connection con=	DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","passmysql");
			PreparedStatement ps=con.prepareStatement("insert into webUsers values (?,?,?,?,?,?)");
			ps.setString(1, fullName);
			ps.setInt(2, birthYear);
			ps.setString(3, uname);
			ps.setString(4, upass);
			ps.setString(5, city);
			ps.setLong(6, mobileNum);
			int i=ps.executeUpdate();
			return i;
			} catch (Exception e) {
				e.printStackTrace();
				return 0;
			}
		}
		
}
