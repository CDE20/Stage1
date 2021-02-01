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
	<form action="/AgeCalculator" name="form" method="post">
		<h1>Age Calcuator</h1>
		<table>
			<tr>
				<td>Enter Name:</td>
				<td><input type="text" id="name" pattern="[A-Z]{1}[a-zA-Z]+"
					required>
			</tr>
			<tr>
				<td>Select Birth Date:</td>
				<td><input type="date" id="dob" required>
			</tr>
			<tr>
				<td><input type="submit" name="calculateAge"
					value="Calculate Age"></td>
				<td><input type="reset" value="Cancel"></td>
			</tr>
		</table>

	</form>

	<br>
	<br>
	<h2 id="result">${name} ${message}</h2>

</body>
</html>