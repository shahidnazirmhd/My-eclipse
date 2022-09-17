package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexToAction extends Action {
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	// TODO Auto-generated method stub
	String toWhat=request.getParameter("formid");
	if(toWhat.equals("loginto")) {
		return "index.EnterShop";
	}else {
	    return "login.register";
	}
		
}
}
