<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>会員情報変更</title>
</head>
<body>
<jsp:include page="/addMenu.jsp" />
<a href="add_memInfo.jsp">戻る</a>
<h3>会員情報変更</h3>
<a>会員情報</a><br>
<table border ="1">
<tr><td>会員ID</td><td>氏名</td><td>住所</td><td>電話番号</td></tr>
<tr><td><input type="text" name="login_id"></td><td><input type="text" name="name"></td><td><input type="text" name="address"></td><td><input type="text" name="tel"></td></tr>
<tr><td>E-mail</td><td>生年月日</td><td>入会年月日</td><td>退会年月日</td></tr>
<tr><td><input type="text" name="email"></td><td><input type="text" name="birthday"></td><td><input type="text" name="en_date"></td><td><input type="text" name="se_date"></td></tr>
</table>
<br>
<br>
<input type="submit" value="保存">
<input type="hidden" name="action" value="keepmemch"> 
</body>
</html>