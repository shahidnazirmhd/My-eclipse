package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InvertlogregAction extends Action {
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	String invert=request.getParameter("formid");
	if(invert.equals("registerFromlogin")) {
		return "login.register";
	}else {
	return "index.EnterShop";
	}
}
}
