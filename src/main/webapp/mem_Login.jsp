<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン</title>
</head>
<link href="/Kaihatu_ensyu/css/style.css" rel="stylesheet">
<body>
	<div class="sample_h_7">
		<p>ログイン</p>

<<<<<<< HEAD
<%-- <form action="/Kaihatu_ensyu/LoginServlet?action=login" method="post">
ログインID<input type="text" name="loginID">
<br>
パスワード<input type="password" name="password">
<br>
<input type="submit" value="ログイン">
</form>--%>
=======

>>>>>>> 44f29ad03df565164f49723bacc213932ecdcea7
		<ul class="snip1217">
			<div id="menu">
				<li class="current"><a href="top.jsp">ホーム</a></li>
				<li><a href="mem_MyPage.jsp">マイページ</a></li>
				<li><a href="mem_Reg.jsp">会員登録</a></li>
				<li><a href="mem_Login.jsp">ログイン</a></li>
			</div>
		</ul>
	</div>

	<form action="/Kaihatu_ensyu/LoginServlet?action=login" method="post">
	<br><br>
		ログインID<input type="text" name="login_id"> <br> 
		パスワード<input type="password" name="password"> <br> 
		
		<input type="submit" value="ログイン"> <br> <br> 
	</form>
			<br>
		<a href="mem_Lev.jsp"class="btn btn-flat"><span>退会手続きの方はこちら←</span></a>


		<footer id="f3">
			<h1 class="f">新宿トラベル</h1>
			<h2 class="f1">&copy; Shinjuku Travel</h2>
		</footer>
<<<<<<< HEAD
 
=======

>>>>>>> 44f29ad03df565164f49723bacc213932ecdcea7
</body>
</html>