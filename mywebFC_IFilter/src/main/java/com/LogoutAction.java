package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutAction extends Action{
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	HttpSession session=request.getSession();
	String uname=(String)session.getAttribute("uname");
	String upass=(String)session.getAttribute("upass");
	if(DbCon.getInstance().reSetFlag(uname, upass)) {
		return "logout.success";
	}else {
	return "error.somethingWrong";
}
}
}
