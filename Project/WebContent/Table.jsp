<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<form action="AddTable.jsp">
		<button style="margin-top: 20px; margin-left:10px; border:none;"><img alt="document image" src="Image/doc.png" height="100px;" width="100px"></button>
	</form>
	<sql:setDataSource driver="com.mysql.jdbc.Driver"
					   url="jdbc:mysql://localhost:3306/Table1"
					   user="root"
					   password="root"
					   var="con"/>
					   
	<sql:query var="rs" dataSource="${con}">
		select * from image where imageid=?
		<sql:param>${param.imageid}</sql:param>
	</sql:query>
	<div class="row">
		<c:forEach items="${rs.rows}" var="row">
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<img src="ImageTableServlet?imageid=${row.image}" class="col-lg-12"/>
			</div>
			<div class="col-lg-8 col-md-8 col-sm-12 col-xs-12">
				<h3 class="col-lg-12">${row.name}</h3>
			</div>
		</c:forEach>
	</div>
</body>
</html>