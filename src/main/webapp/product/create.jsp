<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tạo sản phẩm mới</title>
</head>
<style>
    .message{
        color: mediumvioletred;
    }
</style>
<body>
<h1>Tạo sản phẩm mới</h1>
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
                <td><input type="text" id="name" name="name" ></td>
            </tr>
            <tr>
                <td>Giá</td>
                <td><input type="text" id="price" name="price"></td>
            </tr>
            <tr>
                <td>Số lượng</td>
                <td><input type="text" id="amount" name="amount"></td>
            </tr>
            <tr>
                <td>Mô tả</td>
                <td><input type="text" id="description" name="description"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Tạo sản phẩm mới"></td>
            </tr>
        </table>

    </fieldset>
</form>
</body>
</html>
