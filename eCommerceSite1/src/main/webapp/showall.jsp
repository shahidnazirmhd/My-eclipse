<%@page import="java.util.ResourceBundle"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ include file="header2.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Showing All</title>
</head>
<body>
<%
	session.setAttribute("pagename", "showall");
	ResourceBundle rbsal=(ResourceBundle)session.getAttribute("rb");
%>
<h2 style="text-align: center; text-decoration: underline overline;">All Products</h2>
<div class="cardcontainer">
		<c:forEach var="product" items="${sessionScope.allproduct}">
  <div class="card">
  <img src="Image-Resources/${product.getImage()}" alt="Product Image" style="width:100%">
  <h3>${product.getName()}</h3>
  <p class="price">₹${product.getPrice()}</p>
  <div class="cardbtngrp"><button class="btnaddcart">Add to Cart</button>
  <button class="btnbuy">Buy</button></div>
  </div>
</c:forEach>
</div>
</body>
</html>