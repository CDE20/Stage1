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
	<form action="/AgeCalculator" name="form" method="GET">
		<table>
			<caption id="heading">Age Calculator</caption>
			<tr>
				<td><label for="name">Enter Name :</label></td>
				<td><input type="text" id="name" name="name"
					required="required" /></td>
			</tr>
			<tr>
				<td><label>Select Birth Date :</label></td>
				<td><input type="date" id="dob" name="dob" required="required" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Calculate Age"
					name="calculateAge" /></td>
				<td><input type="reset" value="Cancel" name="cancel" /></td>
			</tr>
		</table>

	</form>

	<br>
	<br>
	<h2 id="result">${ name} ${ message }</h2>

</body>
</html>