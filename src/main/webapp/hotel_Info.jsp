<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="/Kaihatu_ensyu/css/style.css" rel="stylesheet">
<meta charset="UTF-8">
<title>宿情報詳細</title>
</head>
<body>
<div class="sample_h_7">
<p>新宿トラベル</p>
	

			<ul class="snip1217">
					<div id="menu">
  						<li class="current"><a href="top.jsp">ホーム</a></li>
  						<li><a href="mem_MyPage.jsp">マイページ</a></li>
  						<li><a href="mem_Reg.jsp">会員登録</a></li>
  						<li><a href="mem_Bc.jsp">予約確認</a></li>
  						
  					</div>
			</ul>
</div>

<br>
<br>
<br>
<a href="hotel_SeaNameRes.jsp">戻る</a>
<table>

<tr><th>宿名：</th><td>データベースより取得情報が入る</td></tr>
<tr><th>住所：</th><td>データベースより取得情報が入る</td></tr>
<tr><th>電話番号：</th><td>データベースより取得情報が入る</td></tr>
<tr><th>部屋数：</th><td>データベースより取得情報が入る</td></tr>
<tr><th>チェックイン時間：</th><td>データベースより取得情報が入る</td></tr>
<tr><th>チェックアウト時間：</th><td>データベースより取得情報が入る</td></tr>

</table>
<br>
<br>
<br>
<form action="" method="post">
<input type="submit" value="ご予約はこちらから">
<input type="hidden" name="action" value="reserve">
</form>

		<footer id="f3">
  			<h1 class="f">新宿トラベル</h1>
 		 	<h2 class="f1">&copy;  Shinjuku Travel</h2>
		</footer>

</body>
</html>