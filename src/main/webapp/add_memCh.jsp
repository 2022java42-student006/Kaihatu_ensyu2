<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="/Kaihatu_ensyu2/css/style.css" rel="stylesheet">
<meta charset="UTF-8">
<title>会員情報変更</title>
</head>
<body>
<div class="sample_h_7">
			<p>新宿トラベル 管理画面</p>
			<p>会員情報変更</p>		
</div>
<br>
<a href="add_memInfo.jsp"class="btn btn-flat"><span>　　戻る　　</span></a>



<br><br>
<form action="/Kaihatu_ensyu2/Add_ChServlet" method="post">

氏名<input type="text" name="name"class="form-text" value="${member.name}"><br>
住所<input type="text" name="mem_address"class="form-text" value="${member.mem_address}"><br>
電話番号<input type="text" name="Tel"class="form-text" value="${member.tel}"><br>
E-mail<input type="text" name="Email"class="form-text" value="${member.email}"><br>
ログインID<input type="text" name="login_id"class="form-text" value="${member.login_id}"><br>
パスワード<input type="text" name="password"class="form-text" value="${member.password}"><br>

生年月日
<input type="text" name="year"class="form-text" size="4">年
<input type="text" name="month"class="form-text" size="2">月
<input type="text" name="day"class="form-text" size="2">日
<br>
<br>
<input type="submit" class="button" value="保存">
<input type="hidden" name="action" value="keepmemch"> 
</form>


<footer id="f3">
  			<h1 class="f">新宿トラベル</h1>
 		 	<h2 class="f1">&copy;  Shinjuku Travel</h2>
		</footer>
</body>
</html>