<%@page pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>

    <link rel="stylesheet" href="/bootstrap/css/bootstrap.css" />
</head>
<body>
    <div class="container-xl">
        <div class="row">
            <div class="col-8">
                <div class="row">

                    <table>
                        <thead>
                        <tr>
                            <th>ID</th>
                            <th>Khách hàng</th>
                            <th>Ngày mua</th>
                            <th>Thao tác</th>
                        </tr>
                        </thead>
                        <tbody id="tbl_hd_cho">
                        </tbody>
                    </table>

                </div>
                <div class="row mt-5">HDCT</div>
                <div class="row mt-5">
                    <table>
                        <thead>
                        <tr>
                            <th>ID</th>
                            <th>Mã</th>
                            <th>Tên</th>
                            <th>Kích thước</th>
                            <th>Màu sắc</th>
                            <th>Số lượng</th>
                            <th>Đơn giá</th>
                            <th>Thao tác</th>
                        </tr>
                        </thead>
                        <tbody id="tbl_spct">
                        </tbody>
                    </table>
                    <nav aria-label="Page navigation example">
                        <ul class="pagination">
                            <li class="page-item" id="btn_prev_page"><a class="page-link" href="#">Previous</a></li>
                            <li class="page-item"><a class="page-link" href="#">1</a></li>
                            <li class="page-item" id="btn_next_page"><a class="page-link" href="#">Next</a></li>
                        </ul>
                    </nav>
                </div>

            </div>
            <div class="col-4 bg-danger">
                <h2>KH</h2>
            </div>
        </div>
    </div>

    <script src="/js/jquery.min.js"></script>
    <script src="/js/popper.js"></script>
    <script src="/bootstrap/js/bootstrap.js"></script>


    <script src="/js/ban_hang.js"></script>
</body>
</html>