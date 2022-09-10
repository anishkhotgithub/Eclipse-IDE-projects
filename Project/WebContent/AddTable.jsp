<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	.myclass
	{
		margin-top: 10%;
		margin-left: 38%;
		
	}
</style>
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<form action="AddTableServlet" method="post" enctype="multipart/form-data" class="myclass col-lg-6 col-md-9 col-sm-12 col-xs-12">
		<div>
			<label>Name</label>
			<input type="text" name="name" placeholder="Name"><br>
		</div>
		<div>
			<label>Image</label>
			<input type="file" name="image" placeholder="choose image"><br>
		</div>
		<div>
			<input type="submit" value="Submit" style="align-content: center;">
		</div>
	</form>
</body>
</html>