<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Data</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
	</head>
<body>
		 
			<jsp:include page="header.jsp"></jsp:include>
			<sql:setDataSource driver="com.mysql.jdbc.Driver"
							   url="jdbc:mysql://localhost:3306/Fashionfest"
							   user="root"
							   password="root"
							   var="con"/>
							   
			<sql:query var="rs" dataSource="${con}">
					SELECT * FROM clothes
			</sql:query>
					
			<div class="container">
				<div class="row">
					<c:forEach items="${rs.rows}" var="row">
						<div class=m-2 style="border:solid; border-radius: 10px;" >	
							<div class="card" style="width: 27rem; margin-top: 20px">
								<img alt="clothes" src="ImageServlet?id=${row.clothesid}">
														
							</div>
						</div>
				
						<div class=m-2 style="border:solid; border-radius: 10px;" >	
							<div class="card" style="width: 39rem;">
								<div class="card-body">
									<h3 class="card-title">${row.brandname}</h5>
									<p class="card-text">${row.category}</p>
								</div>
								<ul class="list-group list-group-flush">
									<li class="list-group-item">Rs.${row.price}</li>
								</ul>
								<div class="card-body">
									<a href="AddToCartServlet?id=${row.clothesid}" class="btn btn-primary">Add To Cart</a>
									<a href="#" class="btn btn-success">Buy</a>
									<!--<c:if test="${u.role=='admin'}">-->
									<a href="EditPhone.jsp?id=${row.uid}" class="btn btn-success">Edit</a>
									<%-- </c:if> --%>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
</body>
</html>