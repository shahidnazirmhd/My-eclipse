<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style>
h1 {text-align: center;}
</style>
</head>
<body>
<h1>Register Please</h1><br><br><br>
		<form style="margin: auto; width: 220px;" action="register.do" method="post">
		<input type="hidden" name="formid" value="register">
		    Full Name:<br><input type="text" name="fullName"><br><br>
		    User Name:<br><input type="text" name="uname"><br><br>
		     Password:<br><input type="password" name="upass"><br><br>
		         City:<br><input type="text" name="city"><br><br>
		    Mobile No:<br><input type="number" name="mobileNum"><br><br>
		
		<input type="submit" value="Register"> 
		</form>
		<form style="margin: auto; width: 220px;" action="login.jsp" method="post">
		<input type="hidden" name="formid" value="login">
		Have an account! <input type="submit" value="click here">
		</form>
		
</body>
</html>