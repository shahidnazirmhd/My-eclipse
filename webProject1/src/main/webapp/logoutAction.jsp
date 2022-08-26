<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="WEB-INF/mytags2.tld" prefix="my" %>
    <%@ include file="welcome.jsp" %>
    <h3><my:LogoutUnSetFlag uname="<%=request.getParameter(\"uname\")%>"
upass="<%=request.getParameter(\"upass\")%>"/></h3>