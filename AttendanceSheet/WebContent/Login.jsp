<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form>
		<jsp:include page="navbar.jsp"></jsp:include>
		<center>
		<h1>Login form</h1>
		<label>Username</label>
		<input type="text" name="uname"><br>
		<label>Password</label>
		<input type="password" name="password"><br>
		<input type="submit" value="Submit">
		</center>
	</form>
</body>
</html>