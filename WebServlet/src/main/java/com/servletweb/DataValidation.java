package com.servletweb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataValidation {

	public static boolean validate(String userid, String password) {
		boolean status = false;
		System.out.println(userid+" "+password);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			String uid = userid;
			String pass = password;
			String query = "select * from studentlogin where ID=? and password=?";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, uid);
			st.setString(2, pass);
			
			ResultSet rs = st.executeQuery();
			status = rs.next();
		}catch (Exception e) {
			System.out.println(e);
		}
		if(status) {
			return true;
		}else return false;
	}
}
