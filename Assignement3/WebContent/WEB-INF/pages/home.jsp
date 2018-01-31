<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Blood Bank</title>
</head>
<body>
	<br> ${message }
	<br> ${message2 }
	<br>

	<sf:form modelAttribute="donor" method="POST">

Name:<sf:input path="name" /><sf:errors path="name"/><br>
		<br>
Phone:<sf:input path="phone" /><sf:errors path="phone"/><br>
		<br>
BG:<sf:input path="bg" /><sf:errors path="bg"/><br>
		<br>

		<input type="submit" value="Submit">

	</sf:form>

	<br>
	<br> Donors Registered
	<br>
	<a href="http://localhost:8080/Assignment1/Sampat?bg=o positive">SAMPAT</a>1234567890
	
	<c:forEach items="${list }" var="d">
	<a href="http://localhost:8080/Assignment1/${d.name }?bg= ${d.bg }&ph=${d.phone }">${d.name }</a>${d.phone }<br>
	</c:forEach>
	
	
</body>
</html>