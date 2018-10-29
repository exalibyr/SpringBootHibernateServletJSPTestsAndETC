<%
	String header = "foes";
	String[] people = new String[]{"Miclael", "Tom", "Jack", "Alice"};
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Scriplet</title>
</head>
<body>
	<%
		int code = 65;
		for(int i = 0; i < 26; i++){
			out.print((char)(code + i));
		}
	%>
	<h2><%= header.toUpperCase() %></h2>
	<div>
		<ul>
			<%
			for(String person : people){
				out.println("<li>" + person + "</li>");
			}
			%>
		</ul>
	</div>
	
</body>
</html>