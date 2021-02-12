<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title></title>
</head>
<body bgcolor="lavender">
<center>
<h1 id="heading">ZEE-ZEE Web Portal</h1>

	<sf:form action="/submitlogin" modelAttribute="login" method="post">
		<sf:label path="userName" for="userName">UserName: </sf:label>
		<sf:input path="userName" type="text" name="userName" id="userName"/><br/>
		
		<sf:label path="password" for="password">Password: </sf:label>
		<sf:input path="password" type="password" name="password" id="password"/><br/>
		
		<input type="submit" name="submit" value="Login"/>
		<input type="reset" name="cancel" value="Cancel"/>
	</sf:form>
</center>

</body>
</html>