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
    Id:${user.getUserId()} <br/>
    Name: ${user.getName()} <br/>
    Height: ${user.getHeight()}CM <br/>
    Weight: ${user.getWeight()}KG <br/>
    BMI: ${bmi}
    Status: ${bmistatus}
</h2>
</body>
</html>
