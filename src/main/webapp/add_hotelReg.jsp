<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="/Kaihatu_ensyu2/css/style.css" rel="stylesheet">
<meta charset="UTF-8">
<title>宿情報登録</title>
</head>
	<body>
	<div class="sample_h_7">
	<p>宿登録</p>
	<ul class="snip1217">
					<div id="menu">
  						<li><a href="add_memTop.jsp">会員管理</a></li>
  						<li><a href="add_hotelTop.jsp">宿管理</a></li>
  					</div>
	</ul>
</div>
<br>
		
		<form action="/Kaihatu_ensyu2/Add_hotelServlet" method="post">
			宿名<input type="text" name="hotel_name" class="form-text"><br>
			
			住所<input type="text" name="hotel_address" class="form-text"><br>
			電話番号<input type="text" name="hotel_tel" class="form-text"><br>
			部屋数<input type="text" name="hotel_room" class="form-text"><br>
			
			チェックイン時間<input type="text" name="checkin_time" class="form-text">時<br>
			チェックアウト時間<input type="text" name="checkout_time" class="form-text">時<br>
			<br>
			<input type="submit"class="button" value="登録">
		</form>
		<br>
		<a href="add_hotelTop.jsp"class="btn btn-flat"><span>　　戻る　　</span></a>
		<footer id="f3">
  			<h1 class="f">新宿トラベル</h1>
 		 	<h2 class="f1">&copy;  Shinjuku Travel</h2>
	</footer>
		
	</body>
	
</html>