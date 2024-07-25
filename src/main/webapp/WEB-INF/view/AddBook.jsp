<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="send">
		<table>
			<tr>
				<th>
					Book Category
				</th>
				<td>
					<select name="category">
						<option value="novel">Novel</option>
						<option value="story">Story</option>
						<option value="poem">Poem</option>
						<option value="biograph">Biograph</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>
					Book Name
				</th>
				<td>
					<input type="text" name="bname">
				</td>
			</tr>
			<tr>
				<th>Author</th>
				<td>
					<input type="text" name="author">
				</td>
			</tr>
			<tr>
				<th>Price</th>
				<td>
					<input type="text" name="price">
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="Add Book" />
				</td>
				
			</tr>
		</table>
	</form>
</body>
</html>