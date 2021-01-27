<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body bgcolor="lavender">
	<center>
		<h1>ZEE-ZEE Web Portal</h1>
	

	<form:form modelAttribute="login" action="submitlogin" method="POST">
		
    		<table>
    			<tr>
    				<td><form:label path="userName">UserName:</form:label></td>
    				<td><form:input path="userName" id="userName"/></td>
    			</tr>
    			<tr>
    				<td><form:label path="password">Password:</form:label></td>
    				<td><form:password path="password" id="password"/></td>
    			</tr>
    			<tr>
    				<td><input type="submit" value="Login" name="submit"></td>
    				<td><input type="reset" value="Cancel" name="reset"></td>
    			</tr>
    		</table>
    	
	</form:form>
</center>
</body>
</html>