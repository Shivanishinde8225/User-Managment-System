<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		int add(int x,int y){
			return x+y;
	    }
		int square(int n){
			return n*n;
		}
	%>
	<%= "Addition of 5 and 6 is : "+add(5, 6) %><br>
	<%= "Square of 5 : "+square(5) %>
	
	<%out.print("Square of 5 : "+square(5) );%><br>
	
	<%-- This is comments --%>
	
	<%! int day = 6 ; %>
	<%if(day == 6 || day == 7){%>
		<p>This is Weekend.</p>
	<%}else{%>
		<p>This is not Weekend.</p>
	<%}%>
	
	<%--This is comments --%>
	
	<%!String days = "mon" ; %>
	<%switch(days){
	case "mon":
		out.print("Today is Monday");
		break;
	case "tue":
		out.print("Today is Tusday");
		break;
	case "wed":
		out.print("Today is Wednesday");
		break;
	case "thu":
		out.print("Today is Thrusday");
		break;
	case "fri":
		out.print("Today is Friday");
		break;
	case "sat":
		out.print("Today is Saturday");
		break;
	case "sun":
		out.print("Today is Sunday");
		break;
	default:
		out.print("invalid input");
	} %><br>
	<center>
	<%for(int  i = 1; i <= 5; i++){%>
		<font color = "red" size= "<%=i%>">
		Welcome to Home..
		</font><br>	
	<% }%>
	</center>
	
</body>
</html>