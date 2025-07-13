package com.sprk.day1;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns = {"/hello","/home"})
@WebServlet("/hello")
public class Hello extends HttpServlet {
	
	

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Writer Object
		PrintWriter out = response.getWriter();

		// Set content Type
		response.setContentType("text/html");

		// Create HTML Page
		out.print("<html>");
		out.print("<head><title>Hello Page</title></head>");
		out.print("<body><h1>Hello World</h1>");

		out.print("<p>Time on Server is: " + LocalDateTime.now() + "</p></body>");
		out.print("</html>");

	}

}
