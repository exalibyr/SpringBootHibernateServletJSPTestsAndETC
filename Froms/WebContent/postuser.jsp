<%@ page language="java"%>
<%!
	boolean checkAge(String userAge){
		if(userAge.length() < 1){
			return false;
		}
		for(int i = 0; i < userAge.length(); i++){
			if(!Character.isDigit(userAge.charAt(i))){
				return false;
			}
		}
		return true;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User information</title>
</head>
<body>
	<p>Name: <%= request.getParameter("username") %></p>
	<%
		String userAge = request.getParameter("userage");
		if(checkAge(userAge)){
			out.println(userAge);
		}
		else{
			out.println("Invalid age");
		}
	%>	
	<p>Gender: ${param.usergender}</p>
	<h4>Selected courses</h4>
	<ul>
		<%
			String[] courses = request.getParameterValues("courses");
			for(String course : courses){
				out.println("<li>" + course + "</li>");
			}
		%>
	</ul>
	
</body>
</html>