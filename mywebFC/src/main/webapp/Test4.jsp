<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- >%
		String name =request.getParameter("uname");
		if(name.equals("shahid")){
	%-->
			<!--RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
			rd.forward(request, response);-->
			<c:set var="uname" value="<%=request.getParameter(\"uname\") %>"/>
			<c:if test="${uname.equals(\"shahid\")}">
					<jsp:forward page="welcome.jsp"/>
			</c:if>
			
	<!--	
	} 
	            else{
			//RequestDispatcher rd=request.getRequestDispatcher("");
			
		}
	
	%-->
</body>
</html>