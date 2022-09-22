<%@page import="java.util.ResourceBundle"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="header2.css">
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
<input type="hidden" name="lang" value="ta"></form>
<form id="lgh" action="language.do" method="POST">
<input type="hidden" name="formid" value="language">
<input type="hidden" name="lang" value="hi"></form>
<form id="lge" action="language.do" method="POST">
<input type="hidden" name="formid" value="language">
<input type="hidden" name="lang" value="en"></form>
<form id="index" action="index.do" method="POST">
<input type="hidden" name="formid" value="indexclick"></form>
<hr>
<h1 id="shopName1">Fallo</h1>
<h3 id="shopName2">fashion</h3>
<div class="btn-group">
 <button type="submit" form="lge">Engilsh</button>
 <button type="submit" form="lgt">தமிழ்</button>
 <button type="submit" form="lgh">हिन्दी</button>
</div>
<h6 id="version"><%=rb.getString("version")%>:</h6>
<hr class="hr3end">		
</header>
<script src="header2.js"></script>
</body>
</html>