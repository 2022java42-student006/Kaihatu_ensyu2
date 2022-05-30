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
		<h3>宿情報変更</h3>
		
		<form action="/Kaihatu_ensyu2/Add_ChHotelServlet?action=hotel" method="post">
			宿名<input type="text" name="hotel_name"><br>
			住所<input type="text" name="hotel_address"><br>
			電話番号<input type="text" name="hotel_tel"><br>
			部屋数<input type="text" name="hotel_room"><br>
			チェックイン時間<input type="text" name="checkin_time"><br>
			チェックアウト時間<input type="text" name="checkout_time"><br>
			<input type="hidden" name="ac_id" value="${ac_id }">
			<input type="submit" value="変更">
		</form>
	</body>
	
</html>