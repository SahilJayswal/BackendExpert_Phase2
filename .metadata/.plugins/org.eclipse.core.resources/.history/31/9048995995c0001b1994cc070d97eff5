<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
    <%@page import="com.flyaway.Search" %>
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
    ResultSet resultset = null;
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Select Flight</title>
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
.para{
display: flex;
justify-content: space-around;
font-size: 21px;
font-weight: bold;
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
  background-color: #dddddd;
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
}
.book:hover{
background-color: #74c69d;
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
<h1 align="center">FlayAway</h1>
<div class="para">
<p>Showing available flights from <%= Search.source %> to <%= Search.destination %></p>
<p>Date of travel : <%= Search.date %>(<%= Search.day %>)</p>
<p>No of travellers :<%= Search.persons %></p>
</div>
<h3 align=center>Select a flight</h3>
<table>
  <tr>
    <th>Flight</th>
    <th>Source</th>
    <th>Destination</th>
    <th>Date</th>
    <th>Ticket Price</th>
    <th>Select</th>
  </tr>
  		<%
            try{
                connection = DriverManager.getConnection(connectionUrl, userId, password);
                statement=connection.createStatement();
                String query = "select * from flight where source='"+Search.source+"' AND destination='"+Search.destination+"' AND days='"+Search.day+"'";
                resultset = statement.executeQuery(query);
                while(resultset.next()){
        %>
  <tr>
    <td><%= resultset.getString("name") %></td>
    <td><%= resultset.getString("source") %></td>
    <td><%= resultset.getString("destination") %></td>
    <td><%= Search.date %></td>
    <td><%= resultset.getString("price") %></td>
    <td>
    <form action="Booking_Detail.jsp" method="post">
    	<input type="hidden" id="name" name="name" value="<%= resultset.getString("name") %>">
    	<input type="hidden" id="price" name="price" value="<%= resultset.getString("price") %>">
    	<input type="hidden" id="flight_id" name="flight_id" value="<%= resultset.getString("flight_id") %>">
    	<button type="submit">Book This Flight</button>
    </form>
    </td>
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