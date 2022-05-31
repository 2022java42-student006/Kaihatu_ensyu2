<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
	
<!DOCTYPE html>
<html>
<head>
<link href="/Kaihatu_ensyu2/css/style.css" rel="stylesheet">
<meta charset="UTF-8">
<title>宿検索結果URL一覧</title>
</head>
<body>

	<div class="sample_h_7">
			<p>新宿トラベル</p>

	<ul class="snip1217">
		<div id="menu">
			<li class="current"><a href="top.jsp">ホーム</a></li>
			<li><a href="mem_MyPage.jsp">マイページ</a></li>
			<li><a href="mem_Reg.jsp">会員登録</a></li>
			<li><a href="/Kaihatu_ensyu2/CheckReserveServlet?action=check">予約確認</a></li>
		</div>
	</ul>
	</div>

	<br>
	<br>
	<br>

	<table border="1">
		<tr>
			<td>宿検索結果</td>
		</tr>
		<c:forEach items="${hotel}" var="item">

		<tr>
			<td>宿名：<a href="/Kaihatu_ensyu2/SearchPlanServlet?action=hotel&acid=${item.ac_id}">${item.ac_name}</a>　住所：${item.ac_address}</td>
		</tr>
		</c:forEach>
		

	</table>

	<br>
	<br>
	<footer id="f3">
  			<h1 class="f">新宿トラベル</h1>
 		 	<h2 class="f1">&copy;  Shinjuku Travel</h2>
		</footer>
</body>
</html>