<%@ page import="java.util.ArrayList" %>
<%@ page import="dto.Employee" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<title>Insert title here</title>
</head>
<Style>
 body {
background-color:#DDFFFF;
}
</Style>
<body>
<table border="1">
	<form action="/DatabaseAccessSample/top" method="get">
	<button>topへ</button></form>
	<form action="/DatabaseAccessSample/Sak" method="get">
	<button>削除</button></form>
	<form action="/DatabaseAccessSample/hen9" method="get">
	<button>編集</button></form>
	<tr>
	<th>名前</th>
	<th>内容</th>
	<th>メールアドレス</th>
	<th>更新時間</th>
	<th>編集時間</th>
	</tr>

<% 	ArrayList<Employee> List = (ArrayList<Employee>)request.getAttribute("list");
	for(int i = 0 ; i < List.size() ; i++){
		Employee human = List.get(i);
%>
<tr>

	<th><%= human.getName() %></th>
	<th><%= human.getNai() %></th>
	<th><%= human.getMail() %> </th>
	<th><%= human.getTime() %></th>
	<th><%= human.getTimes() %></th>

</tr>

<%} %>

</table>
</body>
</html>