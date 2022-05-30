<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="/Kaihatu_ensyu2/css/style.css" rel="stylesheet">
<meta charset="UTF-8">
<title>宿管理画面</title>
</head>

	<body>
		<div class="sample_h_7">
			<p>宿管理</p>
	
			<ul class="snip1217">
					<div id="menu">
  						<li><a href="add_memTop.jsp">会員管理</a></li>
  						<li><a href="add_hotelTop.jsp">宿管理</a></li>
  					</div>
			</ul>
		 </div>
		
		
		<br>
		<a href="add_Top.jsp" class="btn btn-flat"><span>　　戻る　　</span></a>
		<a href="add_hotelReg.jsp" class="btn btn-flat"><span>宿情報新規登録</span></a>
		
		
		<br>
		<br>
				<form action="/Kaihatu_ensyu2/SearchHotelServlet?action=search" method="post">
					<input type="search" name="ac_name"class="form-text" placeholder="宿名">
					<input type="submit" name="submit"class="button" value="検索">
					
				</form>
					<br>
			
				
			<footer id="f3">
  			<h1 class="f">新宿トラベル</h1>
 		 	<h2 class="f1">&copy;  Shinjuku Travel</h2>
		</footer>
	</body>
</html>