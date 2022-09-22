<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="header1.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
<%
	session.setAttribute("pagename", "index");
%>
<div class="slideshow-container">

<div class="mySlides fade">
  <img src="Image-Resources/1617186512494.jpg" style="width:100%; height: auto;">
</div>

<div class="mySlides fade">
  <img src="Image-Resources/1620127030833.jpg" style="width:100%; height: auto;">
</div>

<div class="mySlides fade">
  <img src="Image-Resources/1617369550601.jpg" style="width:100%; height: auto;">
</div>

<div class="mySlides fade">
  <img src="Image-Resources/1617186681814.jpg" style="width:100%; height: auto;">
</div>

<div class="mySlides fade">
  <img src="Image-Resources/1617186378359.jpg" style="width:100%; height: auto;">
</div>
</div>
<div class="grpdot" style="text-align:center">
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
</div>
<br>
<script>
let slideIndex = 0;
showSlides();

function showSlides() {	
  let i;
  let slides = document.getElementsByClassName("mySlides");
  let dots = document.getElementsByClassName("dot");
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";  
  }
  slideIndex++;
  if (slideIndex > slides.length) {slideIndex = 1}    
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
  setTimeout(showSlides, 3000); // Change image every 2 seconds
}
</script>
</body>
</html>