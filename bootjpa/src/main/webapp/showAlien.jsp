<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border=1>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Team</th>
		</tr>
		<tr>
			<td> ${alien.aid} </td>
			<td> ${alien.aname} </td>
			<td> ${alien.team} </td>
		</tr>
	</table>
	${alien }
</body>
</html>