<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>宿情報</title>
</head>

<link href="/Kaihatu_ensyu2/css/style.css" rel="stylesheet">
<body>
	<div class="sample_h_7">
			<p>新宿トラベル 管理画面</p>
			<p>宿情報</p>		
</div>
	
<c:forEach items="${hotels}" var="hotel">
	<table border="1">
	
		<tr>
			<td>宿名</td>
			<td>${hotel.ac_name}</td>
		</tr>
		
		<tr>
			<td>住所</td>
			<td>${hotel.ac_address}</td>
		</tr>
		<tr>
			<td>電話番号</td>
			<td>${hotel.ac_tel}</td>
		</tr>
		<tr>
			<td>部屋数</td>
			<td>${hotel.ac_room}</td>
		</tr>
		
	<tr>
			<td>チェックイン時間</td>
			<td>${hotel.checkin_time}時</td>
		</tr>
		<tr>
			<td>チェックアウト時間</td>
			<td>${hotel.checkout_time}時</td>
		</tr>
		
		

	</table>
<br>
		<br>
	<form action="/Kaihatu_ensyu2/Add_ChHotelServlet?action=change" method="post">
		<input type ="hidden" name="ac_id" value ="${ hotel.ac_id}">
		<input type="submit"class="button" value="変更">

	</form>

	<form action="/Kaihatu_ensyu2/DeleteHotelServlet?action=confirmDelete" method="post">
	<input type ="hidden" name="ac_id" value ="${ hotel.ac_id}">
		<input type="submit"class="button" value="削除">

	</form>
	</c:forEach>
	<br>
	<br>

	<footer id="f3">
  			<h1 class="f">新宿トラベル</h1>
 		 	<h2 class="f1">&copy;  Shinjuku Travel</h2>
	</footer>
</body>

</html>