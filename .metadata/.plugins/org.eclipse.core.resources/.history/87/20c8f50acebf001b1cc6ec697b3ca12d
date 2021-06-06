<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.flyaway.Booking" %>
 <%
    Booking.flight_booking_id = request.getParameter("flight_id");
    Booking.ticket_price = Integer.parseInt(request.getParameter("price"));
    Booking.flight_name = request.getParameter("name");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight Booking Registration</title>
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
input[type=text], [type=email] {
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
  margin-left: 525px;
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
    top: 200px;
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
<h2 align="center">Booking Details</h2><br>
<div class="container">
  <form action="Payment.jsp" method="post">

    <label for="name">Name: </label><br>
    <input type="text" id="name" name="name" placeholder="Enter Your Name" required>
 
    
    <br><label for="email">Email: </label><br>
    <input type="email" id="email" name="email" placeholder="Enter Your Email" required><br>
    
    <label for="phone">Phone: </label><br>
    <input type="text" id="phone" name="phone" placeholder="Enter Phone Number" required>
  
    
    <input type="submit" value="Submit">
    
</form>
</div>

<footer>
<div class="center">
Copyright &copy; FlyAway developed by Sahil Jayswal. All rights reserved!
</div>
</footer>
</body>
</html>