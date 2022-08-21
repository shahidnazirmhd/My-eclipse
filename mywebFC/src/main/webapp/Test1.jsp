Scripting tags

Scriplet-Goes in service method.
<%@page import="java.util.List,java.util.Date"%>
<%
	//any java program
	Date d=new Date();
	out.println("\n"+d);
	List li;
	out.println(name);
	sayHello();
	
	String uname=request.getParameter("name");
	session.setAttribute("myname", uname);

%>
Declaration-Goes outside service method(cant use implicit objects here)
<%!
	String name="Hello World";
	public void sayHello(){
		System.out.println("Hello to system....");
	}
%>
Expression - a single line code, which only gives an output.
Also goes into service method and also use implicit object.
<%=application.getRealPath("")%>
<%="Hello world..." %>
<h1><%=session.getAttribute("myname")%></h1>
