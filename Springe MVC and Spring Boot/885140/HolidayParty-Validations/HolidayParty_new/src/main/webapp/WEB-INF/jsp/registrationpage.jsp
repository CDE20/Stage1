<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body style="background-color: lavender">
	<h1>
		<center>Welcome to Online Help Services</center>
	</h1>
	<form method="post" action="/register">
		UserName:
		<sf:input type="text" path="register.userName" name="userName" />
		<sf:errors path="register.userName" />
		<br> Contact Number
		<form:input type="text" path="register.contactNumber"
			name="contactNumber" />
		<sf:errors path="register.contactNumber" />
		<br> Email Id
		<form:input type="text" path="register.emailId" name="emailId" />
		<sf:errors path="register.emailId" />
		<br> Confirm Email Id
		<form:input type="text" path="register.confirmEmailId"
			name="confirmEmailId" />
		<sf:errors path="register.confirmEmailId" />
		<br>
		<sf:checkbox path="register.status" name="status" id="status"/>
		I agree
		<sf:errors path="register.status" />
		<br> 
		<input type="submit" name="submit" value="Register" /> <input
			type="reset" value="Cancel" />
	</form>
</body>
</html>
