<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>会員新規登録画面</title>
</head>
<body>
<jsp:include page="/addMenu.jsp" />
	<h1>会員新規登録画面</h1>
	<a href="add_memTop.jsp">戻る</a>
	
	<form action="/Kaihatu_ensyu/Add_RegServlet?action=mem_reg" method="post">
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
		
		
		<input class="contact-submit" type="submit" value="登録する" />
	</form>
</body>
</html>