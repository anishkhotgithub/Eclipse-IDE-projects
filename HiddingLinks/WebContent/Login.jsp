<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="LoginServlet" method="post">
		<center>
			<jsp:include page="index.jsp"></jsp:include>
			<h1>Login Page</h1>
			Name<input type="text" name="uname"><br>
			Password<input type="password" name="password"><br>
			<input type="submit" value="Submit">
		</center>
	</form>
</body>
</html>