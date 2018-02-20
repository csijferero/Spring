<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	LOGIN  
</h1>

<f:form method="post" action="login" modelAttribute="usuario">
	<f:label path="nombre">Nombre: </f:label>
	<f:input path="nombre"/>
	<input type="submit" value="Entrar">
</f:form>
</body>
</html>
