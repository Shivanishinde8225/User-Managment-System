<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "pink">
	<center>
		<b>Welcome <% out.print(request.getAttribute("f_name")+"<br>"+"Registered Successfully"); %></b>
		<a href = "LoginForm.jsp">Login</a>
	</center>
</body>
</html>