<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String username=request.getParameter("name");
		String password=request.getParameter("password");
		String rpassword=request.getParameter("rpassword");
		String Email=request.getParameter("email");
		String Country=request.getParameter("country");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Login","root","root");
			PreparedStatement ps=con.prepareStatement("insert into Register values(?,?,?,?)");
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, Email);
			ps.setString(4, Country);
			int rs=ps.executeUpdate();
			if(rs==1)
			{
				out.println("<h1>Register Successfully!!</h1>");
			}
			else
			{
				out.println("<h1>Register fail</h1>");
			}
		}
		catch(Exception e)
		{
			System.out.println("error");		
		}
	%>
</body>
</html>