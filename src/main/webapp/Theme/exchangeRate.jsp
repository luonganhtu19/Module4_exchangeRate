<%--
  Created by IntelliJ IDEA.
  User: luong
  Date: 1/20/2021
  Time: 10:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>ExchangeRate</title>
</head>
<body>
<form action="/exchange" method="post">
    <legend>ExchangeRate</legend>

    <select name="NameMoney" >
        <option value="usd">USD-VND</option>
        <option value="vnd">VND-USD</option>
    </select>
    <input type="text" name="quantityMoney" value="${moneyType.quantityMoney}" placeholder="Input quantity" >
<%--    <input type="text" name="result" value="${result}" >--%>

    <button type="submit" name="submit" value="exchange">exchange</button>
</form>
</body>
</html>
