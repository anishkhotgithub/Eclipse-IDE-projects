<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
<title>Insert title here</title>
<style>
	table,tr,td
	{
		border: 1px solid black;
	}
</style>
</head>
<body>
	<div class="container">
	<center>
	<table>
		<tbody>
			<tr id="col">
				<td>Rollno</td>
				<td>Name</td>
				<button id="Add">+Add</button>		
			</tr>
			<tr>
				<td>101</td>
				<td>Anish</td>
			</tr>
		</tbody>
	</table>
	</center>
	</div>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
	<script>
		$(function()
		{
			$('#Add').click(function()
			{
				var a=prompt("Enter name");	
				var td="<td>"+a+"</td>";
				$('tr').append(td);
			});
		});
	</script>
</body>
</html>