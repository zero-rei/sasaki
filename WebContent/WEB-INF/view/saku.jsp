<%@ page import="java.util.ArrayList" %>
<%@ page import="dto.Employee" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
　　削除したい行の名前を入力してください<br>
	<form action="/DatabaseAccessSample/Sak2" method="get">
		名前:<input type="text" name="name"><br>
		<input type="submit"value="削除">
	</form>
</body>
</html>