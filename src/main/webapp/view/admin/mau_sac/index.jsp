<%@page pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>

<head></head>
<body>

<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Mã</th>
        <th>Tên</th>
        <th colspan="2">Thao tác</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="ms" items="${ pageData.content }">
        <tr>
            <td>${ ms.id }</td>
            <td>${ ms.ma }</td>
            <td>${ ms.ten }</td>
            <td>
                <a href="/mau-sac/edit/${ ms.id }">Update</a>
            </td>
            <td>
                <a href="/mau-sac/delete/${ ms.id }">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>

</table>
<div>
    <nav aria-label="Page navigation example">
        <ul class="pagination">
<%--            <c:if test="">--%>
                <li class="page-item">
                    <a class="page-link" href="/mau-sac/index?page=${pageData.number - 1}">Previous</a>
                </li>
<%--            </c:if>--%>
            <li class="page-item"><a class="page-link disabled" href="#">${pageData.number}</a></li>
            <li class="page-item"><a class="page-link" href="/mau-sac/index?page=${pageData.number + 1}">Next</a></li>
        </ul>
    </nav>
</div>
</body>

</html>
