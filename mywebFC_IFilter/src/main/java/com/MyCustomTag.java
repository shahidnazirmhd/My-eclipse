package com;

import javax.servlet.RequestDispatcher;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyCustomTag extends TagSupport{
		private String status;

		public String getStatus() {
			return status;
		}




		public void setStatus(String status) {
			this.status = status;
		}




		@Override
		public int doEndTag() throws JspException {
			JspWriter out=pageContext.getOut();
			if(getStatus().equals("fail")) {
				try {
					out.println("Username or Password Wrong");
					}catch(Exception e) {e.printStackTrace();}
			}
			
			return super.doEndTag();
		}
		
}
