<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BMI Status</title>
</head>
<body>
	<h2 id="status">
	   Id: ${user1.getUserId()}<br>
	   Name: ${user1.getName()}<br>
	   Height: ${user1.getHeight()}<br>
	   Weight: ${user1.getWeight()}<br>
	   BMI: ${bmi}<br>
	   Status: ${bmiStatus}
	</h2>
</body>
</html>
