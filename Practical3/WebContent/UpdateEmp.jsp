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
		int empid=Integer.parseInt(request.getParameter("number"));
		String EmpName=request.getParameter("name");
		int Age=Integer.parseInt(request.getParameter("age"));
		int salary=Integer.parseInt(request.getParameter("salary"));
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","root");
			PreparedStatement ps1=con.prepareStatement("select * from employee where empid=?");
			ps1.setInt(1, empid);
			ResultSet rs=ps1.executeQuery();
			if(rs.next())
			{
				out.println("<h1>Employee Update Successfully");
				out.println("<h1>Employee " + EmpName + " Exist</h1>");
				PreparedStatement ps2=con.prepareStatement("update employee set Salary=? where empid=?");
				PreparedStatement ps3=con.prepareStatement("update employee set Age=? where empid=?");
				ps2.setInt(1, salary);
				ps2.setInt(2, empid);
				ps3.setInt(1, Age);
				ps3.setInt(2, empid);
				ps2.executeUpdate();
				ps3.executeUpdate();
			}
			else
			{
				out.println("<h1>Employee " + EmpName + " Not Exist</h1>");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	%>
</body>
</html>