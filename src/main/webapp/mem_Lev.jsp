<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="/Kaihatu_ensyu2/css/style.css" rel="stylesheet">
<meta charset="UTF-8">
<title>退会手続き</title>
</head>
<body>
<div class="sample_h_7">
<p>退会手続き</p>
<ul class="snip1217">
			<div id="menu">
				<li class="current"><a href="top.jsp">ホーム</a></li>
				<li><a href="mem_MyPage.jsp">マイページ</a></li>
				<li><a href="mem_Reg.jsp">会員登録</a></li>
				<li><a href="mem_Login.jsp">ログイン</a></li>
			</div>
</ul>
</div>
<br><br>

<<<<<<< HEAD
<form action="/Kaihatu_ensyu/" method="post">
氏名:<input type="text" name="name"class="form-text">
=======
<form action="/Kaihatu_ensyu2/DeleteServlet?action=delete" method="post">
氏名<input type="text" name="name">
>>>>>>> 42ae0eb2357943b99ebc38d84999422a82e5917a
<br>
ログインID:<input type="text" name="liginID"class="form-text">
<br>
パスワード:<input type ="password" name="password"class="form-text">
<br>
<label>
  <input type="checkbox" name="checkLeave" value="checkLeave">
 退会するとデータが削除されます。<br>
 退会しますか？
 <br>
</label>
<br>
	
	<input type="submit" value="退会する" class="button">
	
	<br>
	<br>
	
	
			<footer id="f3">
  				<h1 class="f">新宿トラベル</h1>
 		 		<h2 class="f1">&copy;  Shinjuku Travel</h2>
			</footer>


</form>
</body>
</html>