package com.simpleproject.models;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String favLanguage = request.getParameter("language");
		String homeTown = request.getParameter("city");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write(" <h1> Welcome, " + firstName + " " +lastName + "</h1>");
		out.write(" <h4> Your favorite language is: " + favLanguage + "</h4>");
		out.write(" <h4> Your hometown is: " + homeTown + "</h4>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
