<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		application.setAttribute("author", "Tom");
		application.setAttribute("Site", "www.google.com");
	%>
	<a href="check.jsp">Click</a>
</body>
</html>