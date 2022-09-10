<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form>
		<nav>
			<c:if test="${u.uname==null}">
				<a href="Login.jsp">Login</a>
			</c:if>
			<a href="Hello.html">Hello</a>
			<a href="FeedBack.html">Feed Back</a>
			<a href="Contact.html">Contact</a>
			<c:if test="${uname!=null}">
				<c:if test="${uname=='Salim'}">
					<a href="ohYeah.jsp">Oh Yeah</a>
				</c:if>
			</c:if>
		</nav>
	</form>
</body>
</html>