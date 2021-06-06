<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Session</title>
</head>
<body>
<%
if(request.getParameter("error")!=null){
	out.println("<b>Your session is expired or invalid</b><br>");
}
%>

<form action="login.jsp" method="post">
Name: <input type="text" id="name" name="name" maxlength="40"/>
Password: <input type="password" id="password" name="password" maxlength="40"/>
<button>Submit</button>
</form>
</body>
</html>