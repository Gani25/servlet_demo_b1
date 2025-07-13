package com.sprk.day2;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/servlet")
public class DemoServlet implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("\n\n------Servlet is destroyed------\n\n");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("\n\n------INIT of SERVLET IS CALLED------\n\n");
		
	}

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
