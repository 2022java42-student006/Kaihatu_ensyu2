<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>宿管理画面</title>
</head>

	<body>
	<jsp:include page="/addMenu.jsp" />
		<h3>宿管理</h3><a href="add_Top.jsp">戻る</a>
				
				<form action="text" method="get">
					<input type="search" name="search" plachholder="キーワードを入力" class="form-text">
					<input type="submit" name="submit" value="検索">
					
					</form>
					<br>
				<a href="add_hotelReg.jsp">宿情報新規登録</a>
	</body>
</html>