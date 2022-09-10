<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Use of intrinsic Object in Jsp</h1>
	Query String<%=request.getQueryString() %><br>
	Context path<%=request.getContextPath() %><br>
	Remote Host<%=request.getRemoteHost() %><br>
	<h1>Response Object</h1>
	Character Encoding Type<%=response.getCharacterEncoding() %><br>
	Content type<%=response.getContentType() %><br>
	Locale <%response.getLocale(); %><br>
	<h1>Session Object</h1>
	ID<%=session.getId() %>
	Creation Time<%=new java.util.Date(session.getCreationTime()) %>
	Last Access Time<% new java.util.Date(session.getLastAccessedTime()); %>
</body>
</html>