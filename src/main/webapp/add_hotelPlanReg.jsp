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
		
		<form action="" method="post">
			プラン名<input type="text" name="hotel_name"><br>
			金額<input type="text" name="hotel_code"><br>
			人数<input type="text" name="hotel_address"><br>
			<input type="submit" value="登録">
		</form>
		
		<p>プランの繰り返し表示が入ります。</p>
		<p>削除</p>
		
		<a href="add_hotelTop.jsp">トップに戻る</a>
	</body>
</html>