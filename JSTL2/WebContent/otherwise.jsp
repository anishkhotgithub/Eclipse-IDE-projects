<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="income" scope="session" value="${10000}"/>
	Your income is:<c:out value="${income}"/>
	<c:choose>
	<c:when test="${income<=10000}">
		Income is not good
	</c:when>
	<c:when test="${income>=10000}">
		Income is good
	</c:when>
	<c:otherwise>
		Income is undetermined
	</c:otherwise>
	</c:choose>
</body>
</html>