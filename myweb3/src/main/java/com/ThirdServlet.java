package com;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("uname");
	/*	System.out.println("Name is : "+name);
		response.setContentType("text/html");
		//ServletOutputStream out=response.getOutputStream();  // byte Stream
		PrintWriter out=response.getWriter();         //character Stream
		out.println("<h2>Name is : "+name+"</h2>");       */
		 
		if (name.equals("Shahid")) {
			//response.sendRedirect("welcome.html");
			RequestDispatcher rd=request.getRequestDispatcher("welcome.html");
			rd.forward(request, response);
		}else {
			//response.sendRedirect("register.html");
			RequestDispatcher rd=request.getRequestDispatcher("register.html");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
