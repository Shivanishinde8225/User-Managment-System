<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "skyblue">
	<center>
	<%String Username = request.getParameter("username"); %><br>
	<h2>Welcome <%out.print(Username); %></h2><br>
	<h2><a href = "ListUsers.jsp">Registered Users</a></h2>
	</center>
</body>
</html>