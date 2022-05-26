<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>

<title></title>
</head>

	<body>
	<jsp:include page="/addMenu.jsp" />
		<a href="add_Login.jsp">戻る</a><br>
		
		ようこそ　${kanri.kanri_name}　さん<br>
		<a href="add_memTop.jsp">会員情報管理</a><br>
		<a href="add_hotelTop.jsp">宿情報管理</a>
		
	</body>

</html>