package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterFromloginAction extends Action {
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	
	return "login.register";
}
}
