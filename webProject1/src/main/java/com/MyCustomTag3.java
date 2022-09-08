package com;

import javax.servlet.RequestDispatcher;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyCustomTag3 extends TagSupport {
	private String fullName,uname,upass,city,mobileNum;
	

	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	//DbCon db=new DbCon();
	@Override
	public int doEndTag() throws JspException {
		JspWriter out=pageContext.getOut();
		if(fullName!=""&&uname!=""&&upass!=""&&city!=""&&mobileNum!="") {
			long mNum=Long.parseLong(mobileNum);
			int addStatus=DbCon.getInstance().register(fullName, uname, upass, city,mNum);
			if(addStatus==1) {
				try {
					RequestDispatcher rd = pageContext.getServletContext().getRequestDispatcher("/login.jsp");
					rd.forward(pageContext.getRequest(), pageContext.getResponse());
					}catch(Exception e) {e.printStackTrace();}
			}else if(addStatus==2){
				try {
					out.println("UserName Already Exist-Try different");
					}catch(Exception e) {e.printStackTrace();}
			}else if(addStatus==3){
				try {
					out.println("You already have an account on this mobile number.");
					}catch(Exception e) {e.printStackTrace();}
			}
			
			else {
				try {
					out.println("Registration Failed - Something went wrong!");
					}catch(Exception e) {e.printStackTrace();}
			}
		}else {
			try {
				out.println("Please enter all details-correctly!");
				}catch(Exception e) {e.printStackTrace();}
		}
		
		return super.doEndTag();
	}
	
}
