<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="/Kaihatu_ensyu2/css/style.css" rel="stylesheet">
<meta charset="UTF-8">
<title>予約確認</title>
</head>
<body>
<div class="sample_h_7">
			<p>予約確認</p>
</div>


	<br>
	<br>
	<a href="mem_MyPage.jsp"class="btn btn-flat"><span>マイページに戻る</span></a>
	<br>
<br>
	<table border="1">
		<tr>
			<td>宿名</td>
			<td>住所</td>
			<td>プラン名</td>
			<td>プラン内容</td>
			<td>価格（1人当たり）</td>
			<td>人数</td>
			<td>チェックイン日</td>
			<td>チェックイン時間</td>
			<td>チェックアウト日</td>
			<td>チェックアウト時間</td>
		</tr>
		<c:forEach items="${relist}" var="reserve">
			<tr>
				<td align="center">${reserve.ac_name}</td>
				<td align="center">${reserve.ac_address}</td>
				<td align="center">${reserve.plan_name}</td>
				<td align="center">${reserve.plan_sub}</td>
				<td align="center">${reserve.price}円</td>
				<td align="center">${reserve.num_people}人</td>
				<td align="center">1月${reserve.ci_date}日</td>
				<td align="center">${reserve.checkin_time}時</td>
				<td align="center">1月${reserve.co_date}日</td>
				<td align="center">${reserve.checkout_time}時</td>
			</tr>
		</c:forEach>
	</table>
	
	<footer id="f3">
  			<h1 class="f">新宿トラベル</h1>
 		 	<h2 class="f1">&copy;  Shinjuku Travel</h2>
		</footer>
</body>
</html>