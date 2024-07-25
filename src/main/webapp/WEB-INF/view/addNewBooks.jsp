<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>ADD NEW BOOKS</h1>
	<form:form action="save" modelAttribute="books">
		<form:select path="category">
			<option value="novel">Novel</option>
			<option value="story">Story</option>
			<option value="poem">Poem</option>
			<option value="Biograph">Biograph</option>
		</form:select>
		<br><br>
		<form:label path="bname">Book Name</form:label>
		<form:input path="bname"/>
		<br><br>
		<form:label path="author">Author</form:label>
		<form:input path="author"/>
		<br><br>
		<form:label path="price">Price</form:label>
		<form:input path="price"/>
		<br><br>
		<input type="submit" value="ADD"/>
	</form:form>
</body>
</html>