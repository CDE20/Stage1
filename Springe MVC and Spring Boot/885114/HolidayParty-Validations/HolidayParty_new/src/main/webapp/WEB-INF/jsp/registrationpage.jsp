<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title></title>
<style>
.error {
    color: red;
}
.center {
	margin: auto;
}
</style>
</head>

<body style="background-color: lavender">
	<h1>
		<center>Welcome to Online Help Services</center>
	</h1>
	<div class="center">
		<form:form id="form"
			action="/register"
			modelAttribute="register" method="post">

			<table class="center">
				<tr>
					<td>UserName:</td>
					<td><form:input path="userName" type="text"
							id="userName" /></td>
					<td><form:errors path="userName" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Contact Number</td>
					<td><form:input path="contactNumber" type="text"
							id="contactNumber" /></td>
					<td><form:errors path="contactNumber" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Email Id</td>
					<td><form:input path="emailId" type="text"
							id="emailId" /></td>
					<td><form:errors path="emailId" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Confirm Email Id</td>
					<td><form:input path="confirmEmailId" type="text"
							id="confirmEmailId" /></td>
					<td><form:errors path="confirmEmailId" cssClass="error" /></td>
				</tr>
				<tr>
					<td><form:checkbox path="status" id="status" /></td>
					<td>I agree</td>
					<td><form:errors path="status" cssClass="error" /></td>
				</tr>
				<tr>
					<td><input type="submit" name="submit" id="submit"
							value="Register" /></td>
					<td><input type="reset" name="reset" id="reset"
							value="Cancel" /></td>
					<td></td>
				</tr>

			</table>

		</form:form>
	</div>

</body>
</html>
