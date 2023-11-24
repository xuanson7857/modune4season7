<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1>Simple Caculator</h1>
<form method="post" action="hello-servlet">
    <label>First Operand : </label>
    <input type="number" name="operand1"></br>
    <label>Operator : </label>
    <select name="select">
        <option value="1">Cộng</option>
        <option value="2">Trừ</option>
        <option value="3">Nhân</option>
        <option value="4">Chia</option>
    </select></br>
    <label>Second Operand : </label>
    <input type="number" name="operand2"></br>
    <input type="submit" id="submit" value="Caculate">
</form>
</body>
</html>