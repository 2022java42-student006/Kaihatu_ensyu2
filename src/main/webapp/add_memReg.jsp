<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="/Kaihatu_ensyu2/css/style.css" rel="stylesheet">
<meta charset="UTF-8">
<title>会員新規登録画面</title>
</head>
<body>
<div class="sample_h_7">
	<p>会員新規登録画面</p>
	<ul class="snip1217">
					<div id="menu">
  						<li><a href="add_memTop.jsp">会員管理</a></li>
  						<li><a href="add_hotelTop.jsp">宿管理</a></li>
  					</div>
	</ul>
</div>
<br>
	<a href="add_memTop.jsp"class="btn btn-flat"><span>戻る</span></a>
	
	<form action="/Kaihatu_ensyu2/Add_RegServlet?action=mem_reg" method="post">
		名前
					<input type="text" name ="name" class="form-text"/>
			<br>
				住所
					<input type="text" name="mem_address" class="form-text"/>
			<br>
				電話番号
					<input type="tel" name="tel" class="form-text"/>
			<br>
				メール
					<input type="email" name="email" class="form-text"/>
				
			<br>
				ログインID
					<input type="text" name="login_id" class="form-text"/>
			<br>
				パスワード
					<input type="password" name="password" class="form-text"/>
	

			<br>
				生年月日
					<input type="text" name="year" size="4" class="form-text"/>年
					<input type="text" name="month" size="2" class="form-text"/>月
					<input type="text" name="day" size="2" class="form-text"/>日
		
		<br>
		<br>
		<input  type="submit" value="登録する" class="button"/>
	</form>
	<footer id="f3">
  			<h1 class="f">新宿トラベル</h1>
 		 	<h2 class="f1">&copy;  Shinjuku Travel</h2>
</footer>
</body>
</html>