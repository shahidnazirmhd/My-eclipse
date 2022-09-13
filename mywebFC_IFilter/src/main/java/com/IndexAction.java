package com;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class IndexAction extends Action{
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	String lang=request.getParameter("lang");
	HttpSession session=request.getSession();
	//session.setAttribute("lang", lang);
	ResourceBundle rb=ResourceBundle.getBundle("dictionary", new Locale(lang));
	session.setAttribute("rb",rb);
	return "index.EnterShop";
	
}
}
