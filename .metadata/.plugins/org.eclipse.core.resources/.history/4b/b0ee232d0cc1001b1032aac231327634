<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*"%>
   <%
    String driverName = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/flyaway";
    String userId = "root";
    String password = "root";
    String id = null;
    String pass = null;
    try {
        Class.forName(driverName);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<style>
body{
    background-image: url("images/airplane_index.jpg");
    background-size: cover;
    background-repeat: no-repeat;
}
nav{
position: relative;
display: flex;
align-items: center;
justify-content: space-between;
margin: -8px;
padding: 12px;
background-color: black;
opacity: 0.5;
}
.home{
font-size: 20px;
text-decoration: none;
color: white;
}
.home:hover{
color: #dce1de;
}
input[type=text], [type=password] {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
}
.container {
  width: 20%;
  border-radius: 15px;
  background-color: #f1faee;
  padding: 10px;
  margin-left: 535px;
}
input[type=submit]:hover{
background-color: #8ecae6;
}
input[type=submit] {
  background-color: #457b9d;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
footer{
    position: relative;
    top: 230px;
    color: black;
    padding: 9px 25px;
    text-align: center;
}
</style>
</head>
<body>       
<nav>
<a class="home" href="index.html">FlyAway</a>
</nav><br>
<%
		if (request.getParameter("error") != null) 
			out.println("<b><span style='color:red; background-color:white'> Your Session has Expired or Invalid, Please Login Again!!!</span>");
	%> 
<h2 align="center">Admin Login</h2><br>
<%
                try{
                    connection = DriverManager.getConnection(connectionUrl, userId, password);
                    statement=connection.createStatement();
                    String sql ="SELECT * FROM admin";
                    resultSet = statement.executeQuery(sql);
                    while(resultSet.next()){
                    	 id = resultSet.getString("user");
                    	 pass = resultSet.getString("pass");
        %>
        <% 
              }       
                } catch (Exception e) {
                    e.printStackTrace();
                }
            
  %>
<div class="container">
  <form action="Login" method="post">

    <label for="userid">Username: </label><br>
    <input type="text" id="userid" name="userid" placeholder="Enter Userid" required>
    <br><small id="userid" >&nbsp;&nbsp;Username : <%= id %> </small><br>
    
    <br><label for="password">Password: </label><br>
    <input type="password" id="password" name="password" placeholder="Password" required><br>
    <small id="password" >&nbsp;&nbsp;Password : <%= pass %> </small><br><br>
    
    <input type="submit" value="Login">
    
</form>
</div>

<footer>
<div class="center">
Copyright &copy; FlyAway developed by Sahil Jayswal. All rights reserved!
</div>
</footer>
</body>
</html>