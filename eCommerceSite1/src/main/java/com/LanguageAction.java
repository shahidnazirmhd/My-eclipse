package com;


import java.io.File;
import java.io.FileWriter;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LanguageAction extends Action {
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	String lang=request.getParameter("lang");
	Lang.getInstance().setLang(lang);
	HttpSession session=request.getSession();
	ResourceBundle rb=ResourceBundle.getBundle("dictionary", new Locale(lang));
	session.setAttribute("rb",rb);
	String pname=session.getAttribute("pagename").toString();
	return pname+".jsp";
	
}
}
