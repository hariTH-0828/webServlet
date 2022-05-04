<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="stylesheet.css">
		<script src="https://kit.fontawesome.com/8717cf846e.js" crossorigin="anonymous"></script>
		
		<title>Profiles</title>
	</head>
	<body>
		<%@ page import="java.sql.*" %>
		<% Class.forName("com.mysql.jdbc.Driver"); 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
		String userid = request.getParameter("userid");
		String query = "select * from studentprofiles where Roll_No = ?";
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1, userid);
		ResultSet rs = st.executeQuery();
		rs.next();
		String res = rs.getString("Name");
		%>
		<div>
			<h3 class="heading">Mr.<%out.print(res); %>'s profile</h3>
			<table>
				
			</table>
		</div>
	</body>
</html>