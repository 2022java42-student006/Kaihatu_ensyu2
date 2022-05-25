<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>宿泊人数、チェックイン、チェックアウト入力</title>
</head>
<body>
<a href="hotel_SelectPlan1.jsp">戻る</a>
<form action="" method="post">
<p>○○ホテル・プラン○○(データベースより取得)</p>
<p>金額：￥○○(データベースより取得)</p>
<br>


宿泊人数<input type="text" name="numOfpeple">

<br>
<br>

チェックイン日
<select name="checkInMonth">
<option value="Jan">1</option>
<option value="Feb">2</option>
<option value="Mar">3</option>
<option value="Apr">4</option>
<option value="May">5</option>
<option value="Jun">6</option>
<option value="Jul">7</option>
<option value="Aug">8</option>
<option value="Sep">9</option>
<option value="Oct">10</option>
<option value="Nov">11</option>
<option value="Dec">12</option>
</select>月

<select name="checkInDate">

<option value="1">1</option>
<option value="1">2</option>
<option value="1">3</option>
<option value="1">4</option>
<option value="1">5</option>
<option value="1">6</option>
<option value="1">7</option>
<option value="1">8</option>
<option value="1">9</option>
<option value="1">10</option>
<option value="1">11</option>
<option value="1">12</option>
<option value="1">13</option>
<option value="1">14</option>
<option value="1">15</option>
<option value="1">16</option>
<option value="1">17</option>
<option value="1">18</option>
<option value="1">19</option>
<option value="1">20</option>
<option value="1">21</option>
<option value="1">22</option>
<option value="1">23</option>
<option value="1">24</option>
<option value="1">25</option>
<option value="1">26</option>
<option value="1">27</option>
<option value="1">28</option>
<option value="1">29</option>
<option value="1">30</option>
<option value="1">31</option>
</select>日


<br>
<br>

チェックアウト日
<select name="checkOutMonth">
<option value="Jan">1</option>
<option value="Feb">2</option>
<option value="Mar">3</option>
<option value="Apr">4</option>
<option value="May">5</option>
<option value="Jun">6</option>
<option value="Jul">7</option>
<option value="Aug">8</option>
<option value="Sep">9</option>
<option value="Oct">10</option>
<option value="Nov">11</option>
<option value="Dec">12</option>
</select>月

<select name="checkOutDate">

<option value="1">1</option>
<option value="1">2</option>
<option value="1">3</option>
<option value="1">4</option>
<option value="1">5</option>
<option value="1">6</option>
<option value="1">7</option>
<option value="1">8</option>
<option value="1">9</option>
<option value="1">10</option>
<option value="1">11</option>
<option value="1">12</option>
<option value="1">13</option>
<option value="1">14</option>
<option value="1">15</option>
<option value="1">16</option>
<option value="1">17</option>
<option value="1">18</option>
<option value="1">19</option>
<option value="1">20</option>
<option value="1">21</option>
<option value="1">22</option>
<option value="1">23</option>
<option value="1">24</option>
<option value="1">25</option>
<option value="1">26</option>
<option value="1">27</option>
<option value="1">28</option>
<option value="1">29</option>
<option value="1">30</option>
<option value="1">31</option>
</select>日


<br>
<br>

<input type="submit" value="予約">
<input type="hidden" name="action" value="reserve"> 
</form>
</body>
</html>