package com;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class SessionListener
 *
 */
@WebListener
public class SessionListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent se)  { 
        System.out.println("session created...");
        HttpSession session=se.getSession();
        String lang=Lang.getInstance().getLang();
    	ResourceBundle rb=ResourceBundle.getBundle("dictionary", new Locale(lang));
    	session.setAttribute("rb",rb);
    	List<ProductModel> product = DbCon.getInstance().getAllProducts();
    	session.setAttribute("allproduct",product);
    }
	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
        HttpSession session=se.getSession();
        Object o1=session.getAttribute("uname");
        Object o2=session.getAttribute("upass");
        if(o1!=null&&o2!=null) {
        	String uname=(String)o1;
        	String upass=(String)o2;
        	DbCon.getInstance().reSetFlag(uname, upass);
        }
                
    	System.out.println("session destroyed...");
    	
    }
	
}
