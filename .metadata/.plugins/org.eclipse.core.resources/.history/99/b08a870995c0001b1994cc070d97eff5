<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Flight</title>
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
input[type=date], select {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
}
input[type=submit] {
  background-color: #457b9d;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
.container {
  width: 20%;
  border-radius: 15px;
  background-color: #f1faee;
  padding: 10px;
  margin-left: 535px;
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
<h2 align="center">Ticket Booking</h2><br>
<div class="container">
  <form action="SearchServlet" method="post">

    <label for="date">Date: </label><br>
    <input type="date" id="date" name="date" required><br>

    <label for="source">Source: </label><br>
    <select id="source" name="source">
      <option value="India">India</option>
      <option value="Canada">Canada</option>
      <option value="USA">USA</option>
    </select><br>
    <label for="destination">Destination: </label><br>
    <select id="destination" name="destination">
      <option value="Canada">Canada</option>
      <option value="USA">USA</option>
      <option value="India">India</option>
    </select><br>
    <label for="person">No of Persons: </label><br>
    <select id="person" name="person">
      <option value="1">1</option>
      <option value="2">2</option>
      <option value="3">3</option>
    </select><br>
    <input type="submit" value="Search Flight">

  </form>
</div>
<footer>
<div class="center">
Copyright &copy; FlyAway developed by Sahil Jayswal. All rights reserved!
</div>
</footer>
</body>
</html>