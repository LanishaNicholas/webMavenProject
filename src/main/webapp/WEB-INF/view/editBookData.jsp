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

<h1>Edit BOOKS</h1>
	<form:form >
		<form:select path="category">
			<form:option value="novel">Novel</form:option>
			<form:option value="story">Story</form:option>
			<form:option value="poem">Poem</form:option>
			<form:option value="Biograph">Biograph</form:option>
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
		<input type="submit" value="Update"/>
	</form:form>

</body>
</html>