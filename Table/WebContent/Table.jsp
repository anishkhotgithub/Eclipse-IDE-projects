<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.1/css/bootstrap.min.css" integrity="sha384-VCmXjywReHh4PwowAiWNagnWcLhlEJLA5buUprzK8rxFgeH0kww/aWY76TfkUoSX" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.1/js/bootstrap.min.js" integrity="sha384-XEerZL0cuoUbHE4nZReLT7nx9gQrQreJekYhJD9WNWhH8nEW+0c5qq7aIo2Wl30J" crossorigin="anonymous"></script>

<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>Table Register</h1>
		<form action="RegisterName" method="post">
		<center>
			Enter Name:<input type="text" name="name"><br>
			Enter Email:<input type="text" name="email"><br>
			<input type="submit" value="Submit">
		</center>
		</form>
		
		<br>
		<sql:setDataSource driver="com.mysql.jdbc.Driver"
								url="jdbc:mysql://localhost:3306/hello"
								user="root"
								password="root"
								var="con"/>
		<sql:query var="rs" dataSource="${con}">
			Select * from Person
		</sql:query>
		
		<table class="table">
			<tr id="myRow">
				<th>Name</th>
				<th>Email</th>
			</tr>
			
		<c:forEach items="${rs.rows}" var="row">
			<tr>
				<th>${row.name}</th>
				<th>${row.email}</th>
			</tr>
		</c:forEach>	
		</table>
	</div>	
</body>

</html>