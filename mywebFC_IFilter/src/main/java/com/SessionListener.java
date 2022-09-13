package com;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
