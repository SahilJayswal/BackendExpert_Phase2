<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.flyaway.Search"%>
<%@page import="com.flyaway.Booking"%>
<%
	Booking.passenger_name = request.getParameter("name");
	Booking.passenger_email = request.getParameter("email");
	Booking.passenger_phone = request.getParameter("phone");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Detail</title>
<style>
body {
	background-image: url("images/airplane_index.jpg");
	background-size: cover;
	background-repeat: no-repeat;
}

nav {
	position: relative;
	display: flex;
	align-items: center;
	justify-content: space-between;
	margin: -8px;
	padding: 12px;
	background-color: black;
	opacity: 0.5;
}

.home {
	font-size: 20px;
	text-decoration: none;
	color: white;
}

input[type=text] {
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

input[type=submit] {
	background-color: #457b9d;
	color: white;
	padding: 12px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

footer {
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
	<h2 align="center">Booking Details</h2>
	<br>
	<div class="container">
		<form action="Ticket_Summary.jsp" method="post">

			<label for="name_on_card">Name On Card: </label><br> <input type="text"
				id="name_on_card" name="name_on_card" placeholder="Enter Name On Card" required>

			<br>
			<label for="card_number">Card Number: </label><br> <input type="text"
				id="card_number" name="card_number" placeholder="Enter Your Card Number"
				required><br> 
				
				<label for="cvv">CVV: </label><br> <input
				type="text" id="cvv" name="cvv" placeholder="Enter CVV on Card"
				required><br>

			<h3 align="Center">
				<span><strong>Total fare = <br><%=Booking.ticket_price%>
						X <%=Search.persons%> persons = Rs.<%=Booking.ticket_price * Search.persons%></strong></span>
			</h3>

			<input type="submit" value="Confirm">

		</form>
	</div>

	<footer>
		<div class="center">Copyright &copy; FlyAway developed by Sahil
			Jayswal. All rights reserved!</div>
	</footer>
</body>
</html>