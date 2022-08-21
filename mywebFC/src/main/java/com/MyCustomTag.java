package com;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyCustomTag extends TagSupport{
		private String num;

		public String getNum() {
			return num;
		}

		public void setNum(String num) {
			this.num = num;
		}

		@Override
		public int doEndTag() throws JspException {
			JspWriter out=pageContext.getOut();
			int n=Integer.parseInt(num);
			if(n%2==0){
				try {
				out.println("Even Number");}catch(Exception e) {e.printStackTrace();}
			}else{
				try {
				out.println("Odd Number");}catch(Exception e) {e.printStackTrace();}
			}
			return super.doEndTag();
		}
		
}
