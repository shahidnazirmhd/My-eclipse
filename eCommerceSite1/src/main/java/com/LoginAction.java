package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginAction extends Action {
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	String uname=request.getParameter("uname");
	String upass=request.getParameter("upass");
	HttpSession session=request.getSession();
	
	if(DbCon.getInstance().checkUser(uname, upass)) {
		if(DbCon.getInstance().checkFlag(uname, upass)) {
			session.setAttribute("uname", uname);
			session.setAttribute("upass", upass);
			return "login.success";
		}else {
			return "login.alreadylogin";
		}
	}else {
		return "login.register";
	}
	
}
}
