package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutAction extends Action{
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	HttpSession session=request.getSession();
	String uname=session.getAttribute("uname").toString();
	String upass=session.getAttribute("upass").toString();
	DbCon.getInstance().reSetFlag(uname, upass);
	return "logout.success";
}
}
