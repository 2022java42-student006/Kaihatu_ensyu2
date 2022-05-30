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
		</form>
		
		<footer id="f3">
  			<h1 class="f">新宿トラベル</h1>
 		 	<h2 class="f1">&copy;  Shinjuku Travel</h2>
		</footer>
	</body>
</html>