<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>宿情報削除</title>
</head>

	<body>
	<jsp:include page="/addMenu.jsp" />
		<h3>削除してよろしいでしょうか。</h3>
		<form action="/Kaihatu_ensyu2/DeleteHotelServlet?action=delete" method="post">
<input type="submit" name ="ac_id" value=削除>
</form>

<form action="/Kaihatu_ensyu2/add_hotelInfo.jsp"><input type="submit" value="キャンセル"></form>
	</body>
</html>