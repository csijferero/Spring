<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="t"%>


<%@ page session="false"%>
<html>
<head>
<link rel="stylesheet" href='<c:url value="/resources/css/bootstrap.min.css"/>'>
<script type="text/javascript" src='<c:url value="/resources/js/bootstrap.min.js" />'></script>
<title>Principal</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
			<c:if test="${!empty listPersons }"></c:if>
				<table class="table table-striped">
					<thead>
						<tr>
							<th>ID</th>
							<th>NAME</th>
							<th>COUNTRY</th>
							<th>EDIT</th>
							<th>DELETE</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${listPersons }" var="p">
							<tr>
								<td>${p.id }</td>
								<td>${p.name }</td>
								<td>${p.country }</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>
