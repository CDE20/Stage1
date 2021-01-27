<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body bgcolor="lavender">
    <center>
        <h1>ZEE-ZEE Web Portal</h1>
        <form:form action="/submitlogin" method="post" modelAttribute="login">
            <form:label path="userName">UserName</form:label>
            <form:input path="userName"/>
            <form:label path="password">Password</form:label>
            <form:password path="password"/>
            <br/>
            <input type="submit" name="submit" value="Login"/>
            <input type="reset" value="Cancel"/>
            
        </form:form>
    
    </center>

</body>
</html>