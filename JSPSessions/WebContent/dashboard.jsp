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
if(session.getAttribute("name")==null){
	response.sendRedirect("index.jsp?error=1");
}
out.print("Hello "+session.getAttribute("name"));
%>
<a href=logout.jsp>Logout</a>
</body>
</html>