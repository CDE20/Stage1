<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br>
<table>
    <form name="form" action="/AgeCalculator" method="get">
    <caption>Age Calculator</caption>
    <tr>
        <td>Enter Name:</td>
        <td><input type="text" id="name" required></td>
    </tr>
    <tr>
        <td>Select Birth Date:</td>
        <td><input type="date" id="dob" required></td>
    </tr>
    <tr>
        <td><input type="submit" name="calculateAge" value="Calculate Age"></td>
        <td><input type="reset" value="Cancel">
    </tr>
    </form>
</table>
<br><br>
<h2 id="result">

</h2>

</body>
</html>