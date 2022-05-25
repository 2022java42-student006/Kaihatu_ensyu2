<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show All Items</title>
</head>
<body>
    
    
    
    
    

<form action="/lesson/ItemServlet3" method="post">
修正:宿ID<input type="text" name="code" size="5">予約プランを<input type="text"
name="price" size="5">に<input type="submit" value="変更">
<input type="hidden" name="action" value="update">
</form>

</body>
</html>