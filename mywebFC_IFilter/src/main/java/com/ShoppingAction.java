package com;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShoppingAction extends Action {
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	HttpSession session=request.getSession();
	addToSession(session, request);
	String shopid=request.getParameter("shopid");
	return shopid;
}

public void addToSession(HttpSession session,HttpServletRequest requ ) {
	Enumeration<String> en=requ.getParameterNames();
	while (en.hasMoreElements()) {
		String name =  en.nextElement();
		session.setAttribute(name, requ.getParameter(name));
		
	}
}
}
