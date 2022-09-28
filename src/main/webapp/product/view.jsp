<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Xem sản phẩm</title>
</head>
<body>
<h1>Thông tin chi tiết</h1>
<p>
    <a href="/products">Quay lại danh sách sản phẩm</a>

</p>
<table border="1">
    <tr>
        <td>Tên</td>
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
</table>
</body>
</html>