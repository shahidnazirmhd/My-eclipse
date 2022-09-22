package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MenuAction extends Action{
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	String id=request.getParameter("formid");
	if(id.equals("showall")) {
		return id+".jsp";
	}
	return null;
}
}
