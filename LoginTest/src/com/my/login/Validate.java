package com.my.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validate {
	
	public static void main (String ar[]) {
		boolean st = false;
		try {

			// loading driver
			//Class.forName("com.mysql.jdbc.Driver");

			// creating connection with the database
			Connection con = DriverManager.getConnection("jdbc:mysql://172.20.84.84:3306/dangerzone_fsit", "devuser", "devuser123");
			PreparedStatement ps = con.prepareStatement("select * from register where email=? and pass=?");
			ps.setString(1, "abc@gmail.com");
			ps.setString(2, "abcd");
			ResultSet rs = ps.executeQuery();
			st = rs.next();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean checkUser(String email, String pass) {
		boolean st = false;
		try {

			// loading driver
			//Class.forName("com.mysql.jdbc.Driver");

			// creating connection with the database
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://172.20.84.84:3306/dangerzone_fsit", "devuser", "devuser123");
			PreparedStatement ps = con.prepareStatement("select * from register where email=? and pass=?");
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			st = rs.next();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return st;
	}
}
