package com;

import java.io.FileInputStream;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletProcessor {
	public void process(HttpServletRequest request,HttpServletResponse response) {
		try {
			ServletContext app =request.getServletContext();
			String configpath=app.getRealPath("/WEB-INF/config.properties");
			Properties prop=new Properties();
			prop.load(new FileInputStream(configpath));
			
			String formid=request.getParameter("formid");
			String actionJsp=prop.getProperty(formid);
			
			RequestDispatcher rd=request.getRequestDispatcher(actionJsp);
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
