package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction extends Action {
		@Override
		public String execute(HttpServletRequest request, HttpServletResponse response) {
			String userN=request.getParameter("uname");
			String passW=request.getParameter("upass");
			DbCon dbcon=new DbCon();
			boolean valid=dbcon.checkUser(userN, passW);
			
			if (valid) {
				return "login.success";
			}else {
				return "login.register";
			}
				
			
		}
}
