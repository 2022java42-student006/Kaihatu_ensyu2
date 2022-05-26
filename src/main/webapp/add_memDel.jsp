<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>会員情報削除確認画面</title>
</head>
<body>
<jsp:include page="/addMenu.jsp" />

<a href="add_memCh.jsp">戻る</a><br>
<img src="" alt="警告" >
<br>
<a>削除してもよろしいですか？</a>
<form action="/Kaihatu_ensyu2/DeleteServlet?action=delete" method="post">
<input type="submit" name ="mem_id" value=削除>
</form>

<form action="/Kaihatu_ensyu2/add_memInfo.jsp"><input type="submit" value="キャンセル"></form>
</body>
</html>