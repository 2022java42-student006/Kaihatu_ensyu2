<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>
<head>
<link href="/Kaihatu_ensyu2/css/style.css" rel="stylesheet">
<meta charset="UTF-8">
<title>管理者ログイン画面</title>
</head>

	<body>

	<div class="sample_h_7">
			<p>新宿トラベル 管理画面</p>
			<p>管理者ログイン</p>
			
	
			<ul class="snip1217">
					<div id="menu">
					<li class="current">
  					</div>
			</ul>
	</div>
		<br>
				
				<form action="/Kaihatu_ensyu2/Add_LoginServlet?action=login_info" method="post">
				管理者ID:
				
				<input type="text" name="login_id" class="form-text">
				
				<br>
				パスワード:
				
				<input type="password" name="password" class="form-text"><br>
				
				<br>
				<input class="button" type="submit" value="ログイン" >
				
				</form>
				<br>	
				<a href="top.jsp">戻る</a>
		
		</div>
	</body>
</html>