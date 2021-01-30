<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AgeCalculator</title>
</head>
<body>
<br><br>
<form name="form" action="/AgeCalculator" method="get">
<table>
  <caption>Age Calculator</caption>
  <tr>
    <th>Enter Name:</th>
    <th><input type="text" name="name" id="name"></th>
  </tr>
  <tr>
    <td>Select Birth Date:</td>
    <td><input type="date" name="dob" id="dob"></td>
  </tr>
  <tr>
    <td><input type="submit" name="calculateAge" value="Calculate Age"></td>
    <td><input type="reset" name="cancel" value="Cancel"></td>
  </tr>
</table>
</form>
<br><br>
<h2 id="result">
${name}{message}
</h2>

</body>
</html>