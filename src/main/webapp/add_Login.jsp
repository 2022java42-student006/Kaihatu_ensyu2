<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="/Kaihatu_ensyu/css/style.css" rel="stylesheet">
<meta charset="UTF-8">
<title>管理者ログイン画面</title>
</head>

	<body>
	<jsp:include page="/addMenu2.jsp" />
		<h3>管理者ログイン</h3><a href="top.jsp">戻る</a>
		<br>
				
				<form action="/Kaihatu_ensyu/Add_LoginServlet?action=login_info" method="post">
				管理者ID:
				<input type="text" name="add_username">
				<br>	
				パスワード:
				<input type="password" name="add_password"><br>
				<input type="submit" value="ログイン" >
				</form>
				<br>	
				
		
	</body>
</html>