<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="/Kaihatu_ensyu2/css/style.css" rel="stylesheet">
<meta charset="UTF-8">
<title>宿情報変更</title>
</head>
	<body>
	
	<div class="sample_h_7">
		<p>宿情報変更</p>
		
	</div>
		
<<<<<<< HEAD
		<form action="" method="post">
			宿名　　　　　　　<input type="text" name="hotel_name"class="form-text"><br>
			分類コード　　　　<input type="text" name="hotel_code"class="form-text"><br>
			住所　　　　　　　<input type="text" name="hotel_address"class="form-text"><br>
			電話番号　　　　　<input type="text" name="hotel_tel"class="form-text"><br>
			部屋数　　　　　　<input type="text" name="hotel_room"class="form-text"><br>
			チェックイン時間　<input type="text" name="hotel_checkin"class="form-text"><br>
			チェックアウト時間<input type="text" name="hotel_checkout"class="form-text"><br>
			<br>
			<input type="submit" value="変更" class="button">
			<a href="add_Login.jsp"class="button" >戻る</a>
=======
		<form action="/Kaihatu_ensyu2/Add_ChHotelServlet?action=hotel" method="post">
			宿名<input type="text" name="hotel_name"><br>
			住所<input type="text" name="hotel_address"><br>
			電話番号<input type="text" name="hotel_tel"><br>
			部屋数<input type="text" name="hotel_room"><br>
			チェックイン時間<input type="text" name="checkin_time"><br>
			チェックアウト時間<input type="text" name="checkout_time"><br>
			<input type="hidden" name="ac_id" value="${ac_id }">
			<input type="submit" value="変更">
>>>>>>> 6a858b09fe50fddb1ffd2ffb6a45ad50807fc18b
		</form>
		
		<footer id="f3">
  			<h1 class="f">新宿トラベル</h1>
 		 	<h2 class="f1">&copy;  Shinjuku Travel</h2>
		</footer>
	</body>
</html>