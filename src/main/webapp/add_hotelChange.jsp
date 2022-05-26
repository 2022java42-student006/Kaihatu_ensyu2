<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>宿情報変更</title>
</head>

<body>
	<jsp:include page="/addMenu.jsp" />
	<h3>宿変更</h3>

	<form action="" method="post">
		宿名<input type="text" name="hotel_name"><br> 分類コード<input
			type="text" name="hotel_code"><br> 住所<input type="text"
			name="hotel_address"><br> 電話番号<input type="text"
			name="hotel_tel"><br> 部屋数<input type="text"
			name="hotel_room"><br> プランID<input type="text"
			name="plan_id"><br> <input type="submit" value="変更">
	</form>
	<a href="add_hotelTop.jsp">戻る</a>

</body>
</html>