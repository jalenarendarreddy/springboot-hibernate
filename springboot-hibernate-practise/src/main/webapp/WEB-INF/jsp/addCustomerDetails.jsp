<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
<style type="text/css">
.btn-space1 {
	margin-top: 50px;
}

.header {
	text-align: center;
}
</style>
<title>Add Employee</title>
</head>
<body>

	<form:form action="/saveCustomerDetails" method="POST">
		<div class="section">
			<h1 class="header">Add CustomerDetails</h1>
			<div class=container>
				<div class="row">
					<div class="col-md-12 mb-3 space1">
						<label class="form-label">Emal</label> <input class="form-control"
							type="email" id="email" name="email">
					</div>

					<div class="col-md-12 mb-3 space1">
						<label class="form-label">Phone:</label> <input
							class="form-control" type="number" id="phone" name="phone">
					</div>

					<div class="col-md-12 mb-3 space1">
						<label class="form-label">Address:</label> <input
							class="form-control" type="text" id="address" name="address">
					</div>

					<div class="col-md-12 mb-3" class="btn-space1">
						<input class="btn btn-primary" type="submit">
					</div>

					<div class="col-md-12">
						<a href="/showCustomerDetails">show CustomerDetails</a>
					</div>

				</div>
			</div>

		</div>
	</form:form>


</body>
</html>