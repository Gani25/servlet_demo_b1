package com.sprk.day2;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/generic")
public class DemoGenericServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
