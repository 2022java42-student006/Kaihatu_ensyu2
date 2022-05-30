<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<link href="/Kaihatu_ensyu2/css/style.css" rel="stylesheet">
<title></title>
</head>

	<body>
	<div class="sample_h_7">
			<p>新宿トラベル 管理画面</p>
	
			<ul class="snip1217">
					<div id="menu">
					<li class="current">
  					</div>
			</ul>
	</div>
		
		
		<br>
		ようこそ　${kanri.kanri_name}　さん<br>
		<br>
		<a href="add_memTop.jsp" class="button" >会員情報管理</a><br><br>
		<a href="add_hotelTop.jsp" class="button">宿情報管理</a><br><br>
		<a href="add_Login.jsp"class="button" >戻る</a><br><br>
	</body>
	
	
	
	<footer id="f3">
  			<h1 class="f">新宿トラベル</h1>
 		 	<h2 class="f1">&copy;  Shinjuku Travel</h2>
		</footer>

</html>