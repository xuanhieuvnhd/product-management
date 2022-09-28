<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sửa thông tin sản phẩm</title>
</head>
<style>
    .message{
        color: #0446d7;
    }
</style>
<body>
<h1>Sửa thông tin sản phẩm</h1>
<p>
    <c:if test="${requestScope['message'] != null}">
        <span class="message">${requestScope['message']}</span>
    </c:if>
</p>
<p>
    <a href="/products">Quay lại danh sách sản phẩm</a>
</p>
<form method="post">
    <fieldset>
        <legend>Thông tin sản phẩm</legend>
        <table>
            <tr>
                <td>Tên</td>
                <td><input type="text" id="name" name="name" value="${requestScope['product'].getName()}"></td>
            </tr>
            <tr>
                <td>Giá</td>
                <td><input type="text" id="price" name="price" value="${requestScope['product'].getPrice()}"></td>
            </tr>
            <tr>
                <td>Số lượng</td>
                <td><input type="text" id="amount" name="amount" value="${requestScope['product'].getAmount()}"></td>
            </tr>
            <tr>
                <td>Mô tả</td>
                <td><input type="text" id="description" name="description" value="${requestScope['product'].getDescription()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Sửa sản phẩm"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>