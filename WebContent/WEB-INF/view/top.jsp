<%@ page import="java.util.ArrayList" %>
<%@ page import="dto.Employee" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>掲示板</title>
</head>
    <style>
  h2 {　　border: 6px purple;　　　
  border-bottom-style: double;
}
p {
line-height: 150%;
}
p.example{
width: 250px;
height: 7em;
}
button{

display: block;
 margin: 0 0 0 auto;
    }
body {
background-color:#DDFFFF;
}
</style>
<body>
<div style="padding: 10px; margin-bottom: 10px; border: 1px solid #333333;">
<section>
	<form action="/uploadTest/upload" method="get">
	<button>アップロード画面へ</button></form>
	<form action="/DatabaseAccessSample/listServle" method="get">
	<button>管理画面へ</button></form>

	<form action="/DatabaseAccessSample/ResultServlet" method="get">

		投稿者<br><input type="text" name="name"><br>
		内容<br><textarea  name ="nai"cols="50" rows="10"></textarea><br>
		メールアドレス<br><input type="text" name="mail"><br>
		<button id="hello">投稿</button>
	</form>

</section>
</div>
</body>
</html>