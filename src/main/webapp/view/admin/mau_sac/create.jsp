<%@page pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>

<head></head>
<body>
<sf:form action="/mau-sac/store" method="POST" modelAttribute="data">
    <div>
        <label>ID</label>
        <sf:input name="id" type="text" path="id" />
        <sf:errors path="id" cssStyle="color: red" />
    </div>
    <div>
        <label>Mã</label>
        <sf:input name="ma" type="text" path="ma" />
        <sf:errors path="ma" cssStyle="color: red" />
    </div>
    <div>
        <label>Tên</label>
        <sf:input name="ten" type="text" path="ten" />
        <sf:errors path="ten" cssStyle="color: red" />
    </div>
    <div>
        <button>Submit</button>
    </div>
</sf:form>
</body>

</html>
