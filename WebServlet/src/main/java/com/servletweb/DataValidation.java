package com.servletweb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.xml.crypto.Data;

public class DataValidation {

	public static boolean validate(String userid, String password) {
		String uid = null, pass = null, res = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			uid = userid;
			pass = password;
			String query = "select * from studentlogin where ID=?";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, uid);
			ResultSet rs = st.executeQuery();
			rs.next();
			res = rs.getString("password");
		}catch (Exception e) {
			System.out.println(e);
		}
		if(pass.equals(res)) {
			return true;
		}else return false;
	}
}
