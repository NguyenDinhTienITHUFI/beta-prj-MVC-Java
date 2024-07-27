<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet">
    <title>Manage Your Customer</title>
</head>
<body>
		<div class="container">
	<div>
		<h1>Add new Customer</h1>
	</div>
	<form:form method="post" modelAttribute="cus">
	<fieldset class="mb-3">
		<form:label path="name">Name</form:label>
		<form:input type="text" path="name" required="required"
			class="form-control" />
		<form:errors path="name" cssClass="text-warning" />
	</fieldset>
	<fieldset class="mb-3">
		<form:label path="dob">Date of birth</form:label>
		<form:input type="text" path="dob" required="required"
			class="form-control" id="dob" />
		<form:errors path="dob" cssClass="text-warning" />
	</fieldset>
	<fieldset class="mb-3">
		<form:label path="address">Address</form:label>
		<form:input type="text" path="address" required="required"
			class="form-control" />
		<form:errors path="address" cssClass="text-warning" />
	</fieldset>
	<form:input type="hidden" path="id" />
	
	<input type="submit" class="btn btn-success">
</form:form>
</div>
	</body>
</html>