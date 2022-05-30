<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>宿情報</title>
</head>

<body>
	<jsp:include page="/addMenu.jsp" />
	<h3>宿情報</h3>
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
		<a href="add_hotelTop.jsp">宿管理Topへ戻る</a>

		<form action="/Kaihatu_ensyu2/Add_ChHotelServlet?action=change"
			method="post">
			<input type="hidden" name="ac_id" value="${ hotel.ac_id}"> <input
				type="submit" value="変更">

		</form>

		<form action="/Kaihatu_ensyu2/DeleteHotelServlet?action=confirmDelete"
			method="post">
			<input type="hidden" name="ac_id" value="${ hotel.ac_id}"> <input
				type="submit" value="削除">

		</form>
	</c:forEach>
	<br>
	<br>


</body>

</html>