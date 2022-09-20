<%@page import="java.util.ResourceBundle"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="header3.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<style>
h1 {text-align: center;}
</style>
</head>
<body>
<%
	session.setAttribute("pagename", "register");
	ResourceBundle rbreg=(ResourceBundle)session.getAttribute("rb");
%>
<h1><%=rbreg.getString("regtitle")%></h1><br><br>
		<form style="margin: auto; padding: 20px; width: 13.5%; border-style: double;  background-color: MistyRose;" action="register.do;jsessionid=<%= session.getId() %>" method="post">
		<input type="hidden" name="formid" value="register">
		    <%=rbreg.getString("fname")%>:<br><input type="text" name="fullname"><br><br>
		    <%=rbreg.getString("username")%>:<br><input type="text" name="uname"><br><br>
		     <%=rbreg.getString("password")%>:<br><input type="password" name="upass"><br><br>
		         <%=rbreg.getString("city")%>:<br><input type="text" name="city"><br><br>
		    <%=rbreg.getString("mnum")%>:<br><input type="number" name="mobileNum"><br><br>
		<input style="margin: 0 0 0 52px" type="submit" value="<%=rbreg.getString("register")%>"><br>
		</form><br><form style="margin: auto; width: 220px;" action="loginFromregister.do" method="post">
		<%=rbreg.getString("regqz")%> <input type="submit" value="<%=rbreg.getString("login")%>">
		<input type="hidden" name="formid" value="loginFromregister">
		</form>
</body>
</html>