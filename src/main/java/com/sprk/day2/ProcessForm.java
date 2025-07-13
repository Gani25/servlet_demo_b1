package com.sprk.day2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/process")
public class ProcessForm extends HttpServlet {

	/*
	 * @Override protected void doGet(HttpServletRequest req, HttpServletResponse
	 * resp) throws ServletException, IOException {
	 * resp.setContentType("text/html"); PrintWriter out = resp.getWriter();
	 * out.print("<html>"); out.print("<head>");
	 * out.print("<title>Student Response</title>"); out.print("</head>");
	 * 
	 * out.print("<body>"); String name = req.getParameter("student_name"); String
	 * email = req.getParameter("email");
	 * 
	 * out.print("<h1>Name = "+name+"</h1>");
	 * out.print("<h3>Email = "+email+"</h3>");
	 * 
	 * out.print("</body>"); out.print("</html>"); }
	 */
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Student Response</title>");
		out.print("</head>");

		out.print("<body>");
		String name = req.getParameter("student_name");
		String email = req.getParameter("email");
		
		out.print("<h1>Name = "+name+"</h1>");
		out.print("<h3>Email = "+email+"</h3>");
		
		out.print("</body>");
		out.print("</html>");
	}

}
