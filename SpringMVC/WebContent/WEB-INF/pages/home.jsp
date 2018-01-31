<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	hi,HoW ArE YoU?
	<br> ${message }
	<br>

	<a href="http://localhost:8080/SpringMVC/Prabhav?dept=abc">PRABHAV</a>
	<a href="http://localhost:8080/SpringMVC/Nishit?dept=pqr">NISHIT</a>
	<a href="http://localhost:8080/SpringMVC/Sampat?dept=xyz">SAMPAT</a>
	<br>
	<br>
	<br>

	<sf:form modelAttribute="employee" method="POST">

ID:<sf:input path="id" /><sf:errors path="id"/><br>
		<br>
NAME:<sf:input path="name" /><sf:errors path="name"/><br>
		<br>
EMAIL:<sf:input path="email" /><sf:errors path="email"/><br>
		<br>

		<input type="submit" value="Submit">

	</sf:form>

	<br>
	<br> Employees Registered
	<br>
	<c:forEach items="${list }" var="e">
	${e.id } ~ ${e.name } ~ ${e.email}<br>
	</c:forEach>
	
	
</body>
</html>