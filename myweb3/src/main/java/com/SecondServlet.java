package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num=request.getParameter("number");
		//ServletOutputStream out=response.getOutputStream();
		int n=Integer.parseInt(num);
		if (n%2==0) {
			//out.println("<h1 style='color:blue'>Even number</h1>");
			response.sendRedirect("even.html");
		}
		else {
			//out.println("<h1 style='color:red'>Odd number</h1>");
			//response.sendRedirect("odd.html");
			RequestDispatcher rd=request.getRequestDispatcher("odd.html");// - it doesn't redirect to odd.html in new URL, 
			rd.forward(request, response);                                //  rather it took the odd.html generates response and forward it to same URL. 
		}																	
	}

}
