<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<h2>User Management System</h2>
	<form action="LoginServlet" method="post">
	<table width= "30%">
		<tr>
		<td>Username:</td>
			<td><input type = "text" name = "username" required></td> 
		</tr>
		<tr>
		<td>Password:</td>
			<td><input type = "password" name = "password" required></td> 
		</tr>
	</table><br>
	<input type = "submit" value = "login"><br>
	<a href = "RegistrationForm.jsp">new User</a>	 
	</form>
	</center>
</body>
</html>