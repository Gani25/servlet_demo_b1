package com.sprk.day2.redirect;

import java.io.IOException;

import com.sprk.day2.entity.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/student_new")
public class StudentController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String gender = request.getParameter("gender");
		
		Student student = new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setGender(gender);
		
		HttpSession session = request.getSession();
		session.setAttribute("studentObj", student);
		response.sendRedirect("student-response2.jsp");
		
	}
}
