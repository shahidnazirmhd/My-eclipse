<%@page import="java.util.ResourceBundle"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#selectLang {margin: -40px 0 0 1080px;}
#shopName1 {margin: -10px 0px 0px 5px;}
#shopName2 {margin: -10px 0px 0px 50px;}
.userCred {margin: 10px 0 -2px 1100px;}
</style>
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
<h6 id="selectLang">Site Language: <a href="#" onclick="submitEnglish()"> English</a>&ensp;<a href="#" onclick="submitTamil()">தமிழ்</a>&ensp;<a href="#" onclick="submitHindi()">हिन्दी</a></h6>
<div class="userCred"><button id="btnLogin" type="submit" form="tolog"><%=rb.getString("login")%></button>&emsp;<button id="btnRegister" type="submit" form="toreg"><%=rb.getString("register")%></button></div>
<hr>		
</header>
 <script>
            function submitEnglish() {document.getElementById("lge").submit();}
            function submitTamil() {document.getElementById("lgt").submit();}
            function submitHindi() {document.getElementById("lgh").submit();}
 </script>
</body>
</html>