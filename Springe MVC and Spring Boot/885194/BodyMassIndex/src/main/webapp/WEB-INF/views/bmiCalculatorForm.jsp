<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BMI Calculator</title>
<style type="text/css">
	.error {
		color: red;
	}
</style>
</head>
<body>
	<br>
	<br>
	<h1 id="heading">BMI Calculator</h1>
	<table>
		<caption style="font-weight: bolder;">Body Mass Index
			Calculator Form</caption>

		<sf:form action="/getBMI" modelAttribute="user" method="GET"
			name="form">
			<tr>
				<td colspan="2"><sf:errors path="name" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Enter Name:</td>
				<td><sf:input path="name" type="text" name="name" id="name" /></td>
			</tr>
			<tr>
				<td colspan="2"><sf:errors path="phoneNumber" cssClass="error" /></td>
			</tr>

			<tr>
				<td>Phone Number:</td>
				<td><sf:input path="phoneNumber" type="text" name="phoneNumber"
						id="phoneNumber" /></td>
			</tr>
			<tr>
				<td colspan="2"><sf:errors path="height" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Height in CM:</td>
				<td><sf:input path="height" type="text" name="height"
						id="height" /></td>
			</tr>

			<tr>
				<td colspan="2"><sf:errors path="weight" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Weight in KG:</td>
				<td><sf:input path="weight" type="text" name="weight"
						id="weight" /></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><sf:select path="genderType" name="genderType"
						id="genderType" items="${ genderType }">
					</sf:select></td>
			</tr>
			<tr>
				<td><input type="submit" name="calculateBMI"
					value="CalculateBMI" /></td>
				<td><input type="reset" name="Cancel" value="Clear" /></td>
			</tr>
		</sf:form>
	</table>

</body>
</html>