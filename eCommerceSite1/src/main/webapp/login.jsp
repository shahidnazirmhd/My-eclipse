<%@page import="java.util.ResourceBundle"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ include file="header3.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home-Login</title>
<style>
h1 {text-align: center;}
</style>
</head>
<body>
<%
	session.setAttribute("pagename", "login");
	ResourceBundle rblog=(ResourceBundle)session.getAttribute("rb");
%>
<h1><%=rblog.getString("logtitle")%></h1><br><br>
<form style="margin: auto; padding: 25px; width: 13.5%; border-style: double; background-color: WhiteSmoke;" action="login.do;jsessionid=<%= session.getId() %>" method="post">
		<input type="hidden" name="formid" value="login">
		<%=rblog.getString("username")%>:<br><input type="text" name="uname"><br><br><br>
		<%=rblog.getString("password")%>:<br><input type="password" name="upass"><br><br>
		<input style="margin: 0 0 0 57px" type="submit" value="<%=rblog.getString("login")%>">
		</form><br><form style="margin: auto; width: 220px;" action="registerFromlogin.do" method="post">
		<%=rblog.getString("logqz")%> <input type="submit" value="<%=rblog.getString("register")%>">
		<input type="hidden" name="formid" value="registerFromlogin">
		</form>
</body>
</html>
