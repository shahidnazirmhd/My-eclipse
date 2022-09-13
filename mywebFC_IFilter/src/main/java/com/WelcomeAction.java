package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeAction extends Action {
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	
	return "shopping.start";
}
}
