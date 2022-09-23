package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MenuAction extends Action{
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	String id=request.getParameter("formid");
	String categid=request.getParameter("category");

	if(id.equals("categ")) {
		return categid+".jsp";
		}
	else {
		return id+".jsp";
	}
	
}
}
