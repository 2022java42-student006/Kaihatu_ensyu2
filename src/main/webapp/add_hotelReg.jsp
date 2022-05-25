<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>宿情報登録</title>
</head>

	<body>
	<jsp:include page="/addMenu.jsp" />
		<h3>宿登録</h3>
		
		<form action="" method="post">
			宿名<input type="text" name="hotel_name"><br>
			分類コード<input type="text" name="hotel_code"><br>
			住所<input type="text" name="hotel_address"><br>
			電話番号<input type="text" name="hotel_tel"><br>
			部屋数<input type="text" name="hotel_room"><br>
			チェックイン時間<input type="text" name="hotel_checkin"><br>
			チェックアウト時間<input type="text" name="hotel_checkout"><br>
			<input type="submit" value="登録">
		</form>
		<a href="add_hotelTop.jsp">戻る</a>
	</body>
	
</html>