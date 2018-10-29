<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP include</title>
</head>
<body>
	<jsp:include page="Header.html"></jsp:include>
	<p>Content 1</p>
	<p>COntent 2</p>
	<p>Content 3</p>
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>