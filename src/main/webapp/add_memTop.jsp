<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="/Kaihatu_ensyu2/css/style.css" rel="stylesheet">
<meta charset="UTF-8">
<title>会員情報管理</title>
</head>
<body>
<div class="sample_h_7">
<p>会員情報管理</p>
</div>
<br>
<br>
<a href="add_Top.jsp" class="btn btn-flat"><span>　　戻る　　</span></a>




<a href="add_memReg.jsp"class="btn btn-flat"><span>新規会員登録</span></a>

<br>
<br>

<form action="/Kaihatu_ensyu2/SearchServlet?action=search" method="post" >
<input type="search" name="login_id" placeholder="会員ID"  class="form-text">
<input type="submit" name="submit" class="button" value="検索"></form>


<footer id="f3">
  			<h1 class="f">新宿トラベル</h1>
 		 	<h2 class="f1">&copy;  Shinjuku Travel</h2>
</footer>




</body>
</html>