<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ホテルプラン情報登録</title>
</head>

	<body>
	<jsp:include page="/addMenu.jsp" />
		<h3>宿プラン登録</h3>
		
		<table border=1>
		<tr><td>宿名  </td><td>住所  </td><td>チェックイン時間  </td><td>チェックアウト時間  </td><td>電話番号</td></tr>
		<tr><td>${hotel.ac_name}  </td><td>${hotel.ac_address}  </td><td>${hotel.checkin_time}時  </td><td>${hotel.checkin_time}  </td><td>${hotel.ac_tel}</td></tr>
		
		
		</table>
		
		<form action="/Kaihatu_ensyu2/Add_RegHotelPlanServlet" method="post">
			プラン名<input type="text" name="plan_name"><br>
			プラン内容<input type="text" name="plan_sub"><br>
			金額<input type="text" name="price"><br>
			部屋数<input type="text" name="room_num"><br>
			<input type="submit" value="登録">
		</form>
		
		<p>プランの繰り返し表示が入ります。</p>
		<p>削除</p>
		
		<a href="add_hotelTop.jsp">トップに戻る</a>
	</body>
</html>