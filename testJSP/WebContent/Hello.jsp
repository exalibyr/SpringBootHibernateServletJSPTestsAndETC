<%@ page import="java.util.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String header = "VSAUCE";
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title><%= header %></title>
		
	</head>
	<body>
		<p>Hi Vsauce!! Michael here!!!</p>
		<p>What is 2 + 2? It is <%= 2 + 2 %></p>
		<p>Is it really so that five is less than two? Really <%= 5 > 2 %></p>
		<p><%= new String("vsauce!!").toUpperCase() %></p>
		<p><%= new Date() %></p>
	</body>
</html>