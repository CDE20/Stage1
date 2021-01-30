<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br>

<form name="form" action="/AgeCalculator" method="get">
<table border="1">
<caption>Age Calculator</caption>

<tr>
<td>Enter Name:</td>
<td><input type="text" name="name" id="name" required></td>
</tr>
<tr>
<td>Select Birth Date:</td>
<td><input type="date" id="dob" name="dob" required></td>
</tr>
<tr>
<td><input type="submit" value="Calculate Age" name="submit"></td>
<td><input type="reset" value="Cancel" name="reset"></td>
</tr>

</table>
</form>


<br><br>
<h2 id="result">${name} ${message}</h2>

</h2>

</body>
</html>