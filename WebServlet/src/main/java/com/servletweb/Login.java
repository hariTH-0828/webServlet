package com.servletweb;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		String userid = request.getParameter("userid");
		System.out.println(userid);
		String password = request.getParameter("password");
		System.out.println(password);
		
		if(DataValidation.validate(userid, password)) {
			RequestDispatcher rd = request.getRequestDispatcher("student.html");
			rd.forward(request, response);
			out.print(userid+"   "+password);
		}else out.print("There's no student in the Database, Enter correct student ID");
	}
}
