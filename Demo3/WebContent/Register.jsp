<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h3>This is register page</h3>
		<center>
		<form action='Register' method='post'>
			<table border="1">
				<tr>
					<td>Username</td>
					<td><input type="text" name="username"/></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="email" name="email"/></td>
				</tr>		
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"/></td>
				</tr>	
				<tr>
					<td><input type="submit" value="Register"/></td>
					<td><input type="reset" value="Reset"/></td>
				</tr>	
			</table>
		</form>
		</center>
</body>
</html>