package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final String username="root";
	final String password="ansh";
	final String jdbcurl="jdbc:mysql://localhost:3306/jdbcdemo1";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String checkString=request.getParameter("check");
		Connection connection=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection(jdbcurl,username,password);
			System.out.println("Connected...");
			Statement statement=connection.createStatement();
			
		
			if(checkString.equals("Register")) {
		
				String firstname=request.getParameter("firstname");
				String lastname=request.getParameter("lastname");
				String gender=request.getParameter("gender");
				String emailid=request.getParameter("emailid");
				String pass=request.getParameter("pass");
				
				String sql="insert into emp values('"+firstname+"','"+lastname+"','"+gender+"','"+emailid+"','"+pass+"')";
				int i=statement.executeUpdate(sql);
				if(i>0) {
				
				     response.sendRedirect("http://localhost:8080/ServletLoginSession/Register.html?msg=Registered Successfully");
				}
			}
			else if(checkString.equals("Login")) {
				String emailid=request.getParameter("id");
				String pass=request.getParameter("pass");
				
				String sql="select * from emp where Emailid='"+emailid+"' and Pass='"+pass+"'";
				ResultSet rs=statement.executeQuery(sql);
				rs.next();
				response.sendRedirect("http://localhost:8080/ServletLoginSession/Screen?message=Login Successfully");
			}
			else {
				response.sendRedirect("http://localhost:8080/ServletLoginSession/Register.html?message=Something went wrong");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			out.print(e);
		}
		
	}

}
