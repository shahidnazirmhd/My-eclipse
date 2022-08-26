package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterAction extends Action{
		@Override
		public String execute(HttpServletRequest request, HttpServletResponse response) {
			String fName=request.getParameter("fullName");
			String userN=request.getParameter("uname");
			String passW=request.getParameter("upass");
			String ucity=request.getParameter("city");
			long mNum=Long.parseLong(request.getParameter("mobileNum"));
			DbCon dbcon=new DbCon();
			int add=dbcon.register(fName, userN, passW, ucity, mNum);
			if(add==1) {
				return "register.success";
			}else {
				return "register.failure";
			}
		}
}
