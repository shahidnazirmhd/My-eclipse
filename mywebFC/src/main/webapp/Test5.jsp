<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="WEB-INF/mytags.tld" prefix="my" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<!-- %
		
		String n=request.getParameter("number");
		int num=Integer.parseInt(n);
		if(num%2==0){
			out.println("Even Number");
		}else{
			out.println("Odd Number");
		}
	%-->
	<h1><my:checkNumber num="<%=request.getParameter(\"number\")%>"/></h1>
		
</body>
</html>