<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="/Kaihatu_ensyu/css/style.css" rel="stylesheet">
<meta charset="UTF-8">
<title>会員情報変更</title>
</head>
<body>
		<div class="sample_h_7">
		<p>会員情報変更</p>
		
		
		
		<ul class="snip1217">
					<div id="menu">
  						<li class="current"><a href="top.jsp">ホーム</a></li>
  						<li><a href="mem_MyPage.jsp">マイページ</a></li>
  						<li><a href="mem_Reg.jsp">会員登録</a></li>
  						<li><a href="mem_Login.jsp">ログイン</a></li>
  					</div>
		</ul>
		</div>
		
	<br>
	<h4>※変更する場合は、変更したい記入事項のみ記入</h4>
				<form action="/Kaihatu_ensyu/RegServlet?action=mem_reg" method="post">
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

			
				
				

				<input class="contact-submit" type="submit" value="変更" />
	</form>
				
			<footer id="f3">
  				<h1 class="f">新宿トラベル</h1>
 		 		<h2 class="f1">&copy;  Shinjuku Travel</h2>
			</footer>
	
			
</body>
</html>