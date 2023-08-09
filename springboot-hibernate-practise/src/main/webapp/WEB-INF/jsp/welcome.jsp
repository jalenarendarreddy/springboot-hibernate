<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Employee</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
</head>
<body>
	<nav
		class="navbar navbar-expand-lg navbar-light bg-light navbar navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Ammunuru</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown"
				aria-controls="navbarNavDropdown" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNavDropdown">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Home</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#"
						id="navbarDropdownMenuLink" role="button"
						data-bs-toggle="dropdown" aria-expanded="false"> Customer </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
							<li><a class="dropdown-item" href="/addCustomer">addCustomer</a></li>
							<li><a class="dropdown-item" href="/showCustomer">showCustomer</a></li>
							<li><a class="dropdown-item" href="/getCustomerDetailsFromCustomer">GetCustomerDetailsFromCustomer
									here</a></li>
						</ul></li>
						<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#"
						id="navbarDropdownMenuLink" role="button"
						data-bs-toggle="dropdown" aria-expanded="false"> CustomerDetails </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
							<li><a class="dropdown-item" href="/addCustomerDetails">addCustomerDetails</a></li>
							<li><a class="dropdown-item" href="/showCustomerDetails">showCustomerDetails</a></li>
							<li><a class="dropdown-item" href="/getCustomerFromCustomerDetails">getCustomerFromCustomerDetails
									here</a></li>
						</ul></li>
						
						<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#"
						id="navbarDropdownMenuLink" role="button"
						data-bs-toggle="dropdown" aria-expanded="false"> OrderDetails </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
							<li><a class="dropdown-item" href="/saveOrders">saveOrders</a></li>
							<li><a class="dropdown-item" href="/saveCustomerFromOrders">saveCustomerFromOrders</a></li>
							<li><a class="dropdown-item" href="/deleteCustomerAlongWithOrders">deleteCustomerAlongWithOrders</a></li>
							<li><a class="dropdown-item" href="/getMaxOrderPrice">getMaxOrderPrice</a></li>
							<li><a class="dropdown-item" href="/getOrderPriceinDescendingOrder">getOrderPriceinDescendingOrder</a></li>
						</ul></li>
						
						<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#"
						id="navbarDropdownMenuLink" role="button"
						data-bs-toggle="dropdown" aria-expanded="false"> Employee </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
							<li><a class="dropdown-item" href="/saveEmployeeAlongWithProjects">saveEmployeeAlongWithProjects</a></li>
							<li><a class="dropdown-item" href="/deleteEmployee">deleteEmployee</a></li>
							<li><a class="dropdown-item" href="/getAllEmployees">getAllEmployees</a></li>
						</ul></li>
						
						<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#"
						id="navbarDropdownMenuLink" role="button"
						data-bs-toggle="dropdown" aria-expanded="false"> Project </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
							<li><a class="dropdown-item" href="/saveProjectAlongWithEmployees">saveProjectAlongWithEmployees</a></li>
							<li><a class="dropdown-item" href="#">somethingelse</a></li>
							
						</ul></li>
						
					
				</ul>
			</div>
		</div>
	</nav>

</body>
</html>