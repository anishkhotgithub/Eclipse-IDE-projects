<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL Even Odd Program</h1>
	<c:set value="10" var="num"></c:set>
	<c:choose>
		<c:when test="${num%2==0}">
			<c:out value="${num} is even number"></c:out>
		</c:when>
		<c:otherwise>
			<c:out value="${num} is odd number"></c:out>
		</c:otherwise>
	</c:choose>
</body>
</html>