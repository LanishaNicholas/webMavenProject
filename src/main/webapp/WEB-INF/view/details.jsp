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
	<h1>Book Details</h1>
	<core:forEach var="bdata" items="${allbook}">
		${bdata.category}
		${bdata.bname }
		${bdata.author }
		${bdata.price }
		
	</core:forEach>
</body>
</html>