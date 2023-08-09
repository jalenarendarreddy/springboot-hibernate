<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Add Employee</title>
</head>
<body>
	<table border="1">
		<tr>
		<th>Name</th>
		<th>Email</th>
		</tr>

		</th>
		<c:forEach items="${emp}" var="employee">
			<tr>
			<td>${employee.name }</td>
			<td>${employee.email }</td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>