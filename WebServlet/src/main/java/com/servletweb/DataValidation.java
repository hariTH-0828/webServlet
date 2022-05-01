package com.servletweb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.xml.crypto.Data;

public class DataValidation {

	public static boolean validate(String userid, String password) {
		String uid = null, pass = null;
		boolean res = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			uid = userid;
			pass = password;
			String query = "select * from studentlogin where ID = ? AND BINARY Password = ?";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, uid);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			res = rs.next();
			//res = rs.getString("password");
		}catch (Exception e) {
			System.out.println(e);
		}
		if(res) {					//pass.equals(res)
			return true;
		}else return false;
	}
	/*
	 * public static void main(String args[]) {
	 * System.out.println(DataValidation.validate("1902001", "Guru@2001")); }
	 */
}
