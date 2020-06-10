<%@ page import="java.util.ArrayList" %>
<%@ page import="dto.Employee" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>一覧</title>
</head>
<Style>
 body {
background-color:#DDFFFF;
}
</Style>
<body>
	登録したい情報を入力してください<br>
	<form action="/DatabaseAccessSample/hena9" method="get">
		名前:<input type="text" name="name"><br>
		内容:<input type="text" name="nai"><br>
		メールアドレス:<input type="text" name="mail"><br>

		<input type="submit"value="登録">
	</form>
</body>
</html>