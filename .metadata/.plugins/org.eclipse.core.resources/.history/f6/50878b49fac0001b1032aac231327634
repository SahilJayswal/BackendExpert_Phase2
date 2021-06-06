<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*"%>

<%
    String driverName = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/flyaway";
    String userId = "root";
    String password = "root";
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
<title>Admin Dashboard</title>
<style>
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
.para{
display: flex;
justify-content: space-around;
margin-bottom: 20px;
}
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
  background-color: #cce3de;
}

th {
border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}
button {
  background-color: #457b9d;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  width: 200px;
}
.logout:hover{
background-color: #dc2f02;
}
.cp:hover{
background-color: #8ecae6;
}
footer{
    position: relative;
        top: 40px;
    color: black;
    padding: 9px 25px;
    text-align: center;
}
</style>
</head>
<body>
<nav>
<a class="home" href="index.html">FlyAway</a>
</nav>
<h1 align="center">Admin Dashboard</h1>
<p align=center>You are LoggedIn as : admin<br></p><br>
<div class="para">
<form action="Change_Password.jsp" method="post">
<button class="cp">Change Password</button>
</form>
<form method="post" action="Admin_Login.jsp">
<button class="logout">Logout</button>
</form>
</div>
<h3 align=center>Flight Table</h3>
		
<table>
  <tr>
    <th>Flight ID</th>
    <th>Name</th>
    <th>Source</th>
    <th>Destination</th>
    <th>Day</th>
    <th>Ticket Price</th>
  </tr>
  <%
                try{
                    connection = DriverManager.getConnection(connectionUrl, userId, password);
                    statement=connection.createStatement();
                    String sql ="SELECT * FROM flight";
                    resultSet = statement.executeQuery(sql);
                    while(resultSet.next()){
        %>
  <tr>
    <td><%= resultSet.getString("flight_id") %></td>
    <td><%= resultSet.getString("name") %></td>
    <td><%= resultSet.getString("source") %></td>
    <td><%= resultSet.getString("destination") %></td>
    <td><%= resultSet.getString("days") %></td>
    <td><%= resultSet.getString("price") %></td>
  </tr>
  <% 
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            
  %>
</table>
<footer>
<div class="center">
Copyright &copy; FlyAway developed by Sahil Jayswal. All rights reserved!
</div>
</footer>
</body>
</html>