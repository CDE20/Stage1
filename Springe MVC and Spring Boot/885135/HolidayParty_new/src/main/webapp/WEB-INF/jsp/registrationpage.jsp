<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body style="background-color:lavender">
<h1><center> Welcome to Online Help Services </center></h1>
<form:form action="register" method="post" name="form" modelAttribute="register">
<table align="center">
			<tr>
				<td><form:label path="userName">UserName:</form:label></td>
				<td><form:input type="text" name="userName" path="userName" id="userName" /></td>
				<td><form:errors path="userName"></form:errors>
			</tr>
			<tr>
				<td><form:label path="contactNumber">Contact Number</form:label></td>
				<td><form:input type="text" name="contactNumber"
						path="contactNumber" id="contactNumber" /></td>
				<td><form:errors path="contactNumber"></form:errors>
			</tr>
			<tr>
				<td><form:label path="emailId">Email Id</form:label></td>
				<td><form:input type="text" name="emailId" path="emailId"
						id="emailId" /></td>
				<td><form:errors path="emailId"></form:errors>
			</tr>
			<tr>
				<td><form:label path="confirmEmailId">Confirm Email Id</form:label></td>
				<td><form:input type="text" name="confirmEmailId"
						path="confirmEmailId" id="confirmEmailId" /></td>
				<td><form:errors path="confirmEmailId"></form:errors>
			</tr>
			<tr>
				<td><form:checkbox name="status" path="status" id="status" />I agree</td>
				<td><form:errors path="status"></form:errors>
			</tr>
			<tr>
				<td><input type="submit" name="submit" id="submit" value="Register"></td>
				<td><input type="reset" name="clear" value="Cancel" id="clear" /></td>
			</tr>
		</table>


</form:form>


</body>
</html>	 	  	    	    	     	      	 	
