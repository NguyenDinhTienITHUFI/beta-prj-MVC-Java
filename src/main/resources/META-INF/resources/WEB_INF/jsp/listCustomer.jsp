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

  <div><h1>Your Customer</h1></div>
  <table class="table">
      <thead>
          <tr>
              
              <th>Name</th>
              <th>Date of birth</th>
              <th>Address</th>
              <th></th>
              <th></th>
          </tr>
      </thead>
      <tbody>
          <c:forEach items="${listCus}" var="customer">
            <tr>
                
                <td>${customer.name}</td>
                <td>${customer.dob}</td>
                <td>${customer.address}</td>
                <td><a href="update-cus?id=${customer.id }" class="btn btn-warning">UPDATE</a></td>
                <td> <a href="delete-cus?id=${customer.id}" class="btn btn-danger">DELETE</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<a href="add-cus" class="btn btn-success">Add New Customer</a>
</div>
	</body>
</html>