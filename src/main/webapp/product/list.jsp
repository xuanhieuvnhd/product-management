<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách sản phẩm</title>
</head>
<style>
    .findProductByName {
        margin-bottom: 20px;
        padding-bottom: 10px;
    }
</style>
<body>
<p style="color: #0446d7"><a href="/products?action=create">Tạo sản phẩm mới</a>
</p>
<form method="post" action="/products?action=find">
    <div class="findProductByName">
        <h4 style="color: #0446d7">Tìm sản phẩm theo tên</h4>
        <input type="text" name="inputProduct" placeholder="Nhập tên sản phẩm: ">
        <input type="submit" value="Tìm kiếm">
    </div>

</form>
<table border="1" style="width: 100%">
    <tr>
        <td style="background: aquamarine"><h3>Mã</h3></td>
        <td style="background: aquamarine"><h3>Tên</h3></td>
        <td style="background: aquamarine"><h3>Giá</h3></td>
        <td style="background: aquamarine"><h3>Số lượng</h3></td>
        <td style="background: aquamarine"><h3>Mô tả</h3></td>
        <td style="background: aquamarine"><h3>Sửa</h3></td>
        <td style="background: aquamarine"><h3>Xoá</h3></td>
    </tr>
    <c:forEach items="${requestScope['products']}" var="product">
        <tr>
            <td>${product.getId()}</td>
            <td><a href="/products?action=view&id=${product.getId()}">${product.getName()}</a></td>
            <td>${product.getPrice()}</td>
            <td>${product.getAmount()}</td>
            <td>${product.getDescription()}</td>
            <td><a href="/products?action=edit&id=${product.getId()}">sửa</a></td>
            <td><a href="/products?action=delete&id=${product.getId()}">xoá</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>