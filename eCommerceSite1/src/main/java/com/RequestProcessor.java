package com;

import java.io.FileInputStream;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestProcessor {
	public void process(HttpServletRequest request,HttpServletResponse response) {
		try {
			//Part1
			ServletContext app =request.getServletContext();
			String configpath=app.getRealPath("/WEB-INF/config.properties");
			Properties prop=new Properties();
			prop.load(new FileInputStream(configpath));
			
			//Part2
			String formid=request.getParameter("formid");
			String actionClassName=prop.getProperty(formid);
			Action action=(Action)Class.forName(actionClassName).newInstance();
			String result=action.execute(request, response);
			String nxtPage=prop.getProperty(result);
			if(nxtPage!=null) {
			RequestDispatcher rd=request.getRequestDispatcher(nxtPage);
			rd.forward(request,response);}
			else {RequestDispatcher rd=request.getRequestDispatcher(result);
			rd.forward(request,response);}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}

