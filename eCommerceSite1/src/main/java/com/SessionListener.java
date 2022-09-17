package com;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
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
        String lang=getLang();
    	ResourceBundle rb=ResourceBundle.getBundle("dictionary", new Locale(lang));
    	session.setAttribute("rb",rb);
    }
    public String getLang() {
    	try (FileReader fr = new FileReader("D:\\git\\My-eclipse\\eCommerceSite1\\lang.txt");){
    		String data;
    		char ch[]=new char[2];
    		fr.read(ch);
    		data=new String(ch);
    		return data;
        }catch (Exception e) {
            e.getStackTrace();
           return null;
        }
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
