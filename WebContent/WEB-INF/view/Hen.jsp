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
<Style>
 body {
background-color:#DDFFFF;
}
</Style>
<body>
	編集したい行の名前を入力して！<br>
	<form action="/DatabaseAccessSample/hens9" method="get">
		名前:<input type="text" name="name"><br>
		<input type="submit"value="検索">
	</form>
</body>
</html>