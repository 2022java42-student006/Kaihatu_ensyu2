<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="/Kaihatu_ensyu2/css/style.css" rel="stylesheet">
<meta charset="UTF-8">
<title>宿情報削除</title>
</head>

	<body>
	<div class="sample_h_7">
			<p>新宿トラベル</p>
	
			<ul class="snip1217">
					<div id="menu">
  						<li><a href="add_memTop.jsp">会員管理</a></li>
  						<li><a href="add_hotelTop.jsp">宿管理</a></li>
  					</div>
			</ul>
		 </div>
		<h3>削除してよろしいでしょうか。</h3>
		<br>
		<form action="/Kaihatu_ensyu2/DeleteHotelServlet?action=delete" method="post">
		<input type ="hidden" name="ac_id" value="${ac_id}">
<input type="submit" name ="ac_id" class="button" value=削除>
</form>
<form action="/Kaihatu_ensyu2/add_hotelInfo.jsp"><input type="submit"class="button" value="キャンセル"></form>
<footer id="f3">
  			<h1 class="f">新宿トラベル</h1>
 		 	<h2 class="f1">&copy;  Shinjuku Travel</h2>
		</footer>
	</body>
</html>