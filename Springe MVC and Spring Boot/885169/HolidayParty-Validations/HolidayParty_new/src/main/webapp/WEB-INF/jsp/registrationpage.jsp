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
<table>
<form:form action="register" modelAttribute="register" method="post">
<tr>
<td>UserName:</td>
<td><form:input type="text" path="userName" id="userName" name="userName" /></td>
<td><form:errors path="userName"></form:errors></td>
</tr> 
<tr>
<td>Contact Number</td>
<td><form:input type="text" path="contactNumber" id="contactNumber" name="contactNumber" /><td>
<td><form:errors path="contactNumber"></form:errors></td>
</tr>
<tr>
<td>Email Id</td>
<td><form:input type="text" path="emailId" id="emailId" name="emailId" /><td>
<td><form:errors path="emailId"></form:errors></td>
</tr>
<tr>
<td>Confirm Email Id</td>
<td><form:input type="text" path="confirmEmailId" id="confirmEmailId" name="confirmEmailId" /></td>
<td><form:errors path="confirmEmailId"></form:errors></td>
</tr>
<tr>
<td><form:checkbox id="status" path="status" name="status"/> I agree</td>
<td><form:errors path="status"></form:errors></td>
</tr>
<tr>
				<td><input type="submit"  name="submit"
					value="Register"></td>
				<td><input type="reset" id="clear" name="clear" value="Cancel"></td>
			</tr>


</form:form>
</table>


</body>
</html>	 	  	    	    	     	      	 	
