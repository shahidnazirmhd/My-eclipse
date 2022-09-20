<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ResourceBundle"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ include file="header2.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	session.setAttribute("pagename", "welcome");
	ResourceBundle rbwel=(ResourceBundle)session.getAttribute("rb");
%>
<h1>Vegetables and Fruit Shop</h1><br>
		<h3>Welcome!</h3><br><br> 
		<form action="shop1.do;jsessionid=<%= session.getId() %>" method="post">
		<input type="hidden" name="formid" value="ShoppingStarted">
		<h3><input type="submit" value="Click here"> to show Today's Vegetables and Fruit.</h3>
		</form>
		<%List<String> products = new ArrayList<>();
		products.add("hai");
		products.add("dai");
		products.add("jai");
		products.add("gai");
		products.add("bai");
				for (String i : products) {
			%> 
  <div class="cardcontainer"><div class="card">
  <img src="no_product_image.png" alt="Product Image" style="width:100%">
  <h1>Product Name</h1>
  <p class="price">₹00.00</p>
  <button class="btnaddcart">Add to Cart</button>
  <button class="btnbuy">Buy</button>
  </div></div>
<%
}%> 
</body>
</html>