<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="/Kaihatu_ensyu/css/style.css" rel="stylesheet">
<meta charset="UTF-8">
<title>新宿トラベル</title>
</head>
<body>
		<div class="sample_h_7">
			<p>新宿トラベル</p>
	
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
				<p>宿名で検索:</p>
				
				
				<form action="text" method="get">
					<input type="search" name="search" placeholder="宿名を入力" class="form-text">
					<input type="submit" name="submit" value="検索">
					
					
					<br>
					<br>
					<br>	
					<p >キーワードで検索:</p>
				
				
					<input type="search" name="search" placeholder="キーワードを入力" class="form-text">
					<input type="submit" name="submit" value="検索">
				</form>
					<br>
					<br>
					<br>
	
	
	<a href="add_Login.jsp" class="btn btn-flat"><span>管理者はこちらから←</span></a>
	
	
	
		<footer id="f3">
  			<h1 class="f">新宿トラベル</h1>
 		 	<h2 class="f1">&copy;  Shinjuku Travel</h2>
		</footer>
</body>
</html>