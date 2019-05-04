<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${message}</h1>
	<form:form  action="${pageContext.request.contextPath}/formData" method="POST" modelAttribute="producto">
	
		<label>Nombre del producto: </label>
		<form:input type="text" name="nombre" path="nombre"/><br>
		<form:errors path="nombre" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Marca del producto: </label>
		<form:input type="text" name="marca" path="marca"/><br>
		<form:errors path="marca" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Descripcion del producto: </label>
		<form:input type="text" name="descripcion" path="descripcion"/><br>
		<form:errors path="descripcion" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Categoria del producto: </label>
		<form:input type="text" name="categoria" path="categoria"/><br>
		<form:errors path="categoria" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Precio del producto: </label>
		<form:input type="number" step="any" name="precio" path="precio"/><br>
		<form:errors path="precio" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Fecha de vencimiento del producto (dd/MM/yyyy): </label>
		<form:input type="text" name="vencimiento" path="vencimiento"/><br>
		<form:errors path="vencimiento" cssStyle="color:#E81505;"></form:errors><br>
		
		
		<input type="submit" value="Agregar producto">
	</form:form>
</body>
</html>