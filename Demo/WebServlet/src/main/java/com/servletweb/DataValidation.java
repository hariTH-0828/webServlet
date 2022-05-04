package com.servletweb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataValidation {

	public static boolean validate(String userid, String password) {
		String uid, pass = null;
		boolean res = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			uid = userid;
			pass = password;
			String query = "select * from studentlogin where ID = ? AND BINARY password = ?";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, uid);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			res = rs.next();
		}catch (Exception e) {
			System.out.println(e);
		}
		if (res) {
			return true;
		}else return false;
	}
}
