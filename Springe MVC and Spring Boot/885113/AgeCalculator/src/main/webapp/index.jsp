<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Age Calculator</title>
</head>
<body>
<br><br>
<form id="form" method="get">
Enter name:<input type="text" name="name" id="name" required="required">
Select Birth Date:<nput type="Date" name="dob" required="required">
<input type="submit" value="Calculate Age" name="CalculateAge"> 
<input type="reset" value="Cancel" name="cancel">
</form
<br><br>
<h2 id="result">

</h2>
<h2>${message}</h2>

</body>
</html>