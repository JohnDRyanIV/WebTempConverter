<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>
			Convert Fahrenheit to Celsius or Vice-Versa
		</title>
	</head>
<body>
	<h1> Temperature Converter </h1>
	<form action="toCelsiusServlet" method="post">
		Enter Fahrenheit number you wish to convert: 
		<input type="text" name="fNum" size="10">
		<input type="submit" value="Convert" />
	</form>
	<form action="toFahrenheitServlet" method="post">
		Enter Celsius number you wish to convert: 
		<input type="text" name="cNum" size="10">
		<input type="submit" value="Convert" />
	</form>
</body>
</html>