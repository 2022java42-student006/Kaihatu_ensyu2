<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>会員情報管理</title>
</head>
<body>
<jsp:include page="/addMenu.jsp" />
<h1>会員情報管理</h1>
<a href="add_Top.jsp">戻る</a>
<br>
<br>
<form action="/" method="post">

<%--<input type="submit" value="新規会員登録"><br>
<input type="text" name="add_mem_reg"> --%>

<a href="add_memReg.jsp">新規会員登録</a>

<br>
<br>


<input type="search" name="search" placeholder="会員名">
<input type="submit" name="submit" value="検索"></form>
</body>
</html>