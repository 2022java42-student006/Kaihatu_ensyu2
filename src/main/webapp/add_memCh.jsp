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
<form action="/Kaihatu_ensyu2/Add_ChServlet" method="post">

氏名<input type="text" name="name" value="${member.name}"><br>
住所<input type="text" name="mem_address" value="${member.mem_address}"><br>
電話番号<input type="text" name="Tel" value="${member.tel}"><br>
E-mail<input type="text" name="Email" value="${member.email}"><br>
ログインID<input type="text" name="login_id" value="${member.login_id}"><br>
パスワード<input type="text" name="password" value="${member.password}"><br>

生年月日
<input type="text" name="year" size="4">年
<input type="text" name="month" size="2">月
<input type="text" name="day" size="2">日
<br>
<br>
<input type="submit" value="保存">
<input type="hidden" name="action" value="keepmemch"> 
</form>

</body>
</html>