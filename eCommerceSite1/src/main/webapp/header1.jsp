<%@page import="java.util.ResourceBundle"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="header1.css">
<meta charset="UTF-8">
<title>Fallo Fashion-Index</title>
</head>
<body>
<%
	ResourceBundle rb=(ResourceBundle)session.getAttribute("rb");
%>
<header>
<form id="lgt" action="language.do" method="POST">
<input type="hidden" name="formid" value="language">
<input type="hidden" name="lang" value="ta">
</form>
<form id="lgh" action="language.do" method="POST">
<input type="hidden" name="formid" value="language">
<input type="hidden" name="lang" value="hi"></form>
<form id="lge" action="language.do" method="POST">
<input type="hidden" name="formid" value="language">
<input type="hidden" name="lang" value="en"></form>
<form id="tolog" action="loginPage.do" method="POST">
<input type="hidden" name="formid" value="loginto"></form>
<form id="toreg" action="registerPage.do" method="POST">
<input type="hidden" name="formid" value="registerto"></form>
<hr>
<h1 id="shopName1">Fallo</h1>
<h3 id="shopName2">fashion</h3>
<div class="btn-group">
 <button type="submit" form="lge">Engilsh</button>
 <button type="submit" form="lgt">தமிழ்</button>
 <button type="submit" form="lgh">हिन्दी</button>
</div>
<h6 id="version"><%=rb.getString("version")%>:</h6>
<div class="rsidebtns"><button class="btnlogin" type="submit" form="tolog"><%=rb.getString("login")%></button>
<button class="btnregi" type="submit" form="toreg"><%=rb.getString("register")%></button>
</div>
<hr class="end">		
</header>
</body>
</html>