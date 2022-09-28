<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Xoá sản phẩm</title>
</head>
<body>
<h1>Xoá sản phẩm</h1>
<p>
    <a href="/products">Quay lại danh sách sản phẩm</a>
</p>
<form method="post">
    <h3>Bạn chắc chắn muốn xoá?</h3>
    <fieldset>
        <legend>Thông tin sản phẩm</legend>
        <table>
            <tr>
                <td>Tên:</td>
                <td>${requestScope['product'].getName()}</td>
            </tr>
            <tr>
                <td>Giá</td>
                <td>${requestScope['product'].getPrice()}</td>
            </tr>
            <tr>
                <td>Số lượng</td>
                <td>${requestScope['product'].getAmount()}</td>
            </tr>
            <tr>
                <td>Mô tả</td>
                <td>${requestScope['product'].getDescription()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Xoá sản phẩm"></td>
                <td><a href="/products">Quay lại danh sách sản phẩm</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>