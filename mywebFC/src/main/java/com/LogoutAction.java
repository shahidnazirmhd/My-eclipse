package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutAction extends Action{
		@Override
		public String execute(HttpServletRequest request, HttpServletResponse response) {
			
			return "logout.success";
		}
}
