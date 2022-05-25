<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="/Kaihatu_ensyu/css/style.css" rel="stylesheet">
<meta charset="UTF-8">
<title>未検索画面</title>
</head>
<body>
		<ul class="snip1217">
					<div id="menu">
  						<li class="current"><a href="top.jsp">ホーム</a></li>
  						<li><a href="mem_MyPage.jsp">マイページ</a></li>
  						<li><a href="mem_Reg.jsp">会員登録</a></li>
  						<li><a href="mem_Bc.jsp">予約確認</a></li>
  					</div>
		</ul>
		
		<br>
		<h2>該当するホテルがありません</h2>
		
		<form action="text" method="get">
					<input type="search" name="search" plachholder="キーワードを入力" class="form-text">
					<input type="submit" name="submit" value="検索">
</body>
</html>