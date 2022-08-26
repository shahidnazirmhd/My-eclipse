<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="WEB-INF/mytags3.tld" prefix="my" %>
    <%@ include file="register.jsp" %>
<h3><my:reisterUser 
fullName="<%=request.getParameter(\"fullName\")%>" 
uname="<%=request.getParameter(\"uname\")%>"
upass="<%=request.getParameter(\"upass\")%>" 
city="<%=request.getParameter(\"city\")%>"
mobileNum="<%=request.getParameter(\"mobileNum\")%>"/></h3>
