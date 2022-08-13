package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletSession
 */
@WebServlet("/ServletSession")
public class ServletSession extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		Object obj=session.getAttribute("count");
		ServletOutputStream out=response.getOutputStream();
		if (obj==null) {
			out.println("<h1>Welcome for the first time!</h1>");
			session.setAttribute("count",1);
		}
		else {
			int c=Integer.parseInt(obj.toString());
			c++;
			out.println("you are visiting "+c+" times");
			session.setAttribute("count", c);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
