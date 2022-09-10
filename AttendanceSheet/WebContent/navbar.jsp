<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.1/css/bootstrap.min.css" integrity="sha384-VCmXjywReHh4PwowAiWNagnWcLhlEJLA5buUprzK8rxFgeH0kww/aWY76TfkUoSX" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.1/js/bootstrap.min.js" integrity="sha384-XEerZL0cuoUbHE4nZReLT7nx9gQrQreJekYhJD9WNWhH8nEW+0c5qq7aIo2Wl30J" crossorigin="anonymous"></script>
<style type="text/css">
	body
	{
		height: 100%;
	}
	
	.nav
	{
		background-color: #1BD7CC;
		justify-content: center;
		padding: 13px;
		word-spacing: 15px;
	}
	.mydiv 
	{
	 width:1500px;
	 height:1000px;
  	 color:black;
     font-weight:bold;
     animation: myanimation 10s infinite;
 	}

@keyframes myanimation 
{
  0% {background-color: #088981;}
  25%{background-color:#066B65;}
  50%{background-color:#20C5BB;}
  75%{background-color:#45C4BD;}
  100% {background-color: #0F716C;}
}
</style>
<title>Insert title here</title>
</head>
<body>
	<div class="nav">
		<nav>
			<a href="Home.jsp">Home</a>
			<a href="Table.jsp">Table</a>
			<a href="Login.jsp">Login</a>
			<a href="Register.jsp">Register</a>
			<a href="Contactus.jsp">Contactus</a>
			<a href="FeedBack.jsp">FeedBack</a>		
		</nav>
	</div>
	
	</body>
</html>