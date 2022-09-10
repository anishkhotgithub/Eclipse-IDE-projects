<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Validating user Name and Password</h1>
	<%
		String name=request.getParameter("name");
		String pass=request.getParameter("password");
		//PrintWriter printWriter=response.getWriter();
		if(name.equalsIgnoreCase("Anish") && pass.equalsIgnoreCase("anish123"))
		{
			out.println("<h1>Thankyou Valid Credential</h1>");	
		}
		else
		{
			out.println("<h1>Sorry,Invalid Credential</h1>");	
		}
		
	%>
	
</body>
</html>