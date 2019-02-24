<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>You have successfully registered with following Info::</h3>
</body>
<a href="/SpringMVCRequestParamWebApp/">Back</a>
<table>

			<tr>
				<td>User Name</td>
				<td>${userMessage.getName()}</td>
			</tr>

			<tr>
				<td>Email</td>
				<td>${userMessage.getEmail()}</td>
			</tr>


			<tr>
				<td>Age</td>
				<td>${userMessage.getAge()}</td>
			</tr>


			<tr>
				<td>Country</td>
				<td>${userMessage.getCountry()}</td>
			</tr>

			</table>

</html>