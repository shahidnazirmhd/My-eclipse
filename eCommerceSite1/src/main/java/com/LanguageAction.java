package com;


import java.io.File;
import java.io.FileWriter;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LanguageAction extends Action {
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	String lang=request.getParameter("lang");
	setLang(lang);
	HttpSession session=request.getSession();
	ResourceBundle rb=ResourceBundle.getBundle("dictionary", new Locale(lang));
	session.setAttribute("rb",rb);		
	return "language.changed";
}
public void setLang(String lang) {
	Lang set=new Lang(lang);
	
	 String data = set.getLang();
	  
    try (FileWriter output = new FileWriter("D:\\git\\My-eclipse\\eCommerceSite1\\lang.txt",false);){
        output.write(data);
        System.out.println(data);
    }catch (Exception e) {
        e.getStackTrace();
    }
}

}
