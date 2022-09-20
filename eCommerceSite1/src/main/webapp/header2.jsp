<%@page import="java.util.ResourceBundle"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="header2.css">
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<%
	ResourceBundle rb=(ResourceBundle)session.getAttribute("rb");
%>
<header>
<form id="lge" action="language.do" method="POST">
<input type="hidden" name="formid" value="language">
<input type="hidden" name="lang" value="en"></form>
<form id="lgt" action="language.do" method="POST">
<input type="hidden" name="formid" value="language">
<input type="hidden" name="lang" value="ta"></form>
<form id="lgh" action="language.do" method="POST">
<input type="hidden" name="formid" value="language">
<input type="hidden" name="lang" value="hi"></form>
<form id="logout" action="logouted.do" method="POST">
<input type="hidden" name="formid" value="logout"></form>
<form id="order" action="myorder.do" method="POST">
<input type="hidden" name="formid" value="myorder"></form>
<form id="cart" action="mycart.do" method="POST">
<input type="hidden" name="formid" value="mycart"></form>
<form id="home" action="shophome.do" method="POST">
<input type="hidden" name="formid" value="shophome"></form>
<form id="shirt" action="shirts.do" method="POST">
<input type="hidden" name="formid" value="categ">
<input type="hidden" name="category" value="shirt"></form>
<form id="pant" action="pants.do" method="POST">
<input type="hidden" name="formid" value="categ">
<input type="hidden" name="category" value="pant"></form>
<form id="jeans" action="jeans.do" method="POST">
<input type="hidden" name="formid" value="categ">
<input type="hidden" name="category" value="jeans"></form>
<form id="tshirt" action="tshirts.do" method="POST">
<input type="hidden" name="formid" value="categ">
<input type="hidden" name="category" value="tshirt"></form>
<form id="footw" action="footwear.do" method="POST">
<input type="hidden" name="formid" value="categ">
<input type="hidden" name="category" value="footwear"></form>
<form id="accesso" action="accessories.do" method="POST">
<input type="hidden" name="formid" value="categ">
<input type="hidden" name="category" value="accessories"></form>
<form id="showall" action="showall.do" method="POST">
<input type="hidden" name="formid" value="showall"></form>
<form id="about" action="about.do" method="POST">
<input type="hidden" name="formid" value="about"></form>

<hr>
<h1 id="shopName1">Fallo</h1>
<h3 id="shopName2">fashion</h3>
<ul class="menu">
  <li class="mitem"><a href="#" onclick="submithome()"><%=rb.getString("home")%></a></li>
  <li class="dropdown"><a class="dropbtn"><%=rb.getString("categories")%></a>
	<div class="dropdown-content">
		<a href="#" onclick="submitshirt()"><%=rb.getString("shirts")%></a>
		<a href="#" onclick="submitpant()"><%=rb.getString("pants")%></a>
		<a href="#" onclick="submitjeans()"><%=rb.getString("jeans")%></a>
		<a href="#" onclick="submitTshirt()"><%=rb.getString("tshirts")%></a>
		<a href="#" onclick="submitfootwear()"><%=rb.getString("footwear")%></a>
		<a href="#" onclick="submitaccesso()"><%=rb.getString("accessories")%></a>
</div>
  </li>
  <li class="mitem"><a href="#" onclick="submitshowall()"><%=rb.getString("showall")%></a></li>
  <li class="mitem"><a href="#" onclick="submitabout()"><%=rb.getString("about")%></a></li>
</ul>
<div class="btn-group">
 <button type="submit" form="lge">Engilsh</button>
 <button type="submit" form="lgt">தமிழ்</button>
 <button type="submit" form="lgh">हिन्दी</button>
</div>
<h6 id="version"><%=rb.getString("version")%>:</h6>
<div class="rsidebtns"><button class="btncart" type="submit" form="cart"><%=rb.getString("mycart")%></button>
<button class="btnorder" type="submit" form="order"><%=rb.getString("myorder")%></button>
<button class="btnlogout" type="submit" form="logout"><%=rb.getString("logout")%></button></div>
<hr class="end">		
</header>
<script src="header2.js"></script>
</body>
</html>