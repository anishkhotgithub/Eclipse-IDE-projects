<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		try
		{
			String user=request.getParameter("name");
			String password=request.getParameter("password");
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Login","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from login where name='"+user+"'and password='"+password+"'");
			int count=0;
			while(rs.next())
			{
				count++;
			}
			if(count>0)
			{
				out.println("Welcome");
			}
			else
			{
				out.println("Invalid credentials");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	%>
</body>
</html>