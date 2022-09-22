<%@page import="com.ProductModel"%>
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
<h3>Vegetables and Fruit Shop</h3><br>
		<h3>Welcome!</h3><br><br> 
		<form action="shop1.do;jsessionid=<%= session.getId() %>" method="post">
		<input type="hidden" name="formid" value="ShoppingStarted">
		<h3><input type="submit" value="Click here"> to show Today's Vegetables and Fruit.</h3>
		</form>
		<div class="cardcontainer">
		<c:forEach var="product" items="${sessionScope.allproduct}">
  <div class="card">
  <img src="no_product_image.png" alt="Product Image" style="width:100%">
  <h4>${product.getName()}</h4>
  <p class="price">₹${product.getPrice()}</p>
  <button class="btnaddcart">Add to Cart</button>
  <button class="btnbuy">Buy</button>
  </div>
</c:forEach>
</div>
</body>
</html>