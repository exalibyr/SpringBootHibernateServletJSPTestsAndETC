<%@ page language="java"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>
	<div>
		<%
			char a = 'A';
			int i = 1;
			while(true){
				for(int j = 0; j < i; j++){
					out.append(a);
				}
				out.flush();
				out.println();
				i++;
			}
		%>
	</div>
</body>
</html>