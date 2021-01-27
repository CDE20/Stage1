<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Status</title>
</head>
<body>

<h2 id="status">
Your order is successfully placed, <br>
Order Id id: ${orderId}<br>
Order Date is: <% Date date = new Date();
         out.print( date.toString());%> <br>
Amount in Rupees: Rs ${indianPrice}
</h2>

</body>
</html>
