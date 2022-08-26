<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home-Login</title>
<style>
h1 {text-align: center;}
</style>
</head>
<body>
<h1>Hello! Login please</h1><br><br><br>
<form style="margin: auto; width: 220px;" action="login.do" method="post">
		<input type="hidden" name="formid" value="login">
		UserName:<br><input type="text" name="uname"><br><br><br>
		PassWord:<br><input type="password" name="upass"><br><br>
		<input type="submit" value="Login">
		</form>
			

</body>
</html>