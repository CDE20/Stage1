<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br>
	<br>
	<table>
	<form name="form" method="get" action="/AgeCalculator">


		
			<caption>Age Calculator</caption>
			<tr>
				<td>Enter Name :</td>
				<td><input type="text" id="name" required></td>
			</tr>
			<tr>
				<td>Select Birth Date :</td>
				<td><input type="date" id="dob" required></td>
			</tr>
			<tr>
				<td><input type="submit" value="Calculate Age" name="calculateAge"></td>
				<td><input type="reset" value="Cancel"></td>
			</tr>
		
	</form>
	</table>
	<br>
	<br>
	<h2 id="result">
	${name} ${message}
	</h2>

</body>
</html>