package com;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class FirstFilter
 */
@WebFilter("*.do")
public class FilterOne extends HttpFilter implements Filter {
       
    
	public void destroy() {
		System.out.println("filter destroy called");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
			System.out.println("do Filter called");
			HttpServletRequest hrequest=(HttpServletRequest)request;
			HttpServletResponse hresponse=(HttpServletResponse)response;
			HttpSession session=hrequest.getSession();
			if(session.isNew()) {
				//String formid=hrequest.getParameter("formid");
				//if(formid.equals("login")||formid.equals("language")) {
				//chain.doFilter(request, response);
			//}else {
				RequestDispatcher rd=request.getRequestDispatcher("timeOut.jsp");
				rd.forward(hrequest, hresponse);
			//}
			}else {		
		chain.doFilter(request, response);
	}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter init called");
	}

}
