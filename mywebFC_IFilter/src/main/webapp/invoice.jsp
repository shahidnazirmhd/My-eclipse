<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%
			Enumeration<String> en=session.getAttributeNames();
		while(en.hasMoreElements()){
			String name=en.nextElement();
			Object value1=session.getAttribute(name);
			String value=value1.toString();
			out.println("<h1>"+name+":"+value+"</h1>");
		}
		
		
		%>


</body>
</html>