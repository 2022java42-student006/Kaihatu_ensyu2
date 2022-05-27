<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>会員情報画面</title>
</head>
<body>
<jsp:include page="/addMenu.jsp" />

<a href="add_memTop.jsp">戻る</a>
<!--<form action="/" method="post">-->
<br>
<br>
会員情報<br>
<table border ="1">

<tr><td>会員ID</td>
<td>${member.mem_id}</td></tr>

<tr><td>氏名</td>
<td>${member.name}</td></tr>

<tr><td>住所</td>
<td>${member.mem_address}</td></tr>

<tr><td>電話番号</td>
<td>${member.tel}</td></tr>

<tr><td>E-mail</td>
<td>${member.email}</td></tr>

<tr><td>生年月日</td>
<td>${member.birthday}</td></tr>

<tr><td>入会年月日</td>
<td>${member.endate}</td></tr>

<tr><td>退会年月日</td>
<td>${member.seDate}</td></tr>


</table>

<form action="/Kaihatu_ensyu2/add_memCh.jsp" method="post">
<input type="submit" value="変更">
 
</form>

<form action="/Kaihatu_ensyu2/add_memDel.jsp" method="post">
<input type="submit" value="削除">

</form>

<br>
<br>

</body>

</body>
</html>