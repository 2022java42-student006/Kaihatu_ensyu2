<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link href="/Kaihatu_ensyu2/css/style.css" rel="stylesheet">
<meta charset="UTF-8">
<title>ホテルプラン情報登録</title>
</head>

	<body>
	<div class="sample_h_7">
			<p>新宿トラベル 管理画面</p>
			<p>宿プラン登録</p>		
	</div>
	
		
		<table border="1" style="width: 80%">
		<tr><td class="planTable">宿名 </td><td  class="planTable">住所  </td><td  class="planTable">チェックイン時間  </td><td  class="planTable">チェックアウト時間  </td><td  class="planTable">電話番号</td></tr>
		<tr><td>${hotel.ac_name}  </td><td>${hotel.ac_address}  </td><td>${hotel.checkin_time}時  </td><td>${hotel.checkout_time}時 </td><td>${hotel.ac_tel}</td></tr>
		
		
		</table>
		
		<form action="/Kaihatu_ensyu2/Add_RegHotelPlanServlet" method="post">
			プラン名<input type="text" name="plan_name"class="form-text"><br>
			プラン内容<input type="text" name="plan_sub"class="form-text"><br>
			金額<input type="text" name="price"class="form-text"><br>
			部屋数<input type="text" name="room_num"class="form-text"><br>
			<input type="submit" class="button" value="登録">
			<br>
		</form>
		

		<table border="1">
		<c:forEach items="${plans}" var="plan">
		<tr><td>プラン名  </td><td>プラン内容  </td><td>金額(/人) </td><td>部屋数 </td></tr>
		<tr><td> ${plan.plan_name}</td><td>${plan.plan_sub }  </td><td>${plan.price } </td><td>${plan.room_num } </td></tr>
		</c:forEach>
		</table>
		
	<br>
		
		<a href="/Kaihatu_ensyu2/TopServlet" class="btn btn-flat"><span>トップに戻る</span></a>
		<footer id="f3">
  			<h1 class="f">新宿トラベル</h1>
 		 	<h2 class="f1">&copy;  Shinjuku Travel</h2>
		</footer>
	</body>
</html>