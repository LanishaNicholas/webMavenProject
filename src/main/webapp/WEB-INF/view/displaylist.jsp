<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Id</th>
			<th>Category</th>
			<th>Book name</th>
			<th>Author</th>
			<th>price</th>
			<th>Action</th>
		</tr>
		
		<c:forEach var="data" items="${allbook }">
		
		<tr>
		<td>${data.bookid }</td>
		<td>${data.category }</td>
		<td>${data.bname }</td>
		<td>${data.author }</td>
		<td>${data.price }</td>
		<!-- <td><a href="edit/${data.id }">Edit</a>
		<a href="Delete/${data.id }">Delete</a></td>
		 -->		
		
		
		</tr>
		</c:forEach>
	</table>
</body>
</html>