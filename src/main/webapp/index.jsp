<%@ page isELIgnored="false" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
    <c:forEach items="${requestScope.emps}" var="emp">
        <h1>${emp.id}---${emp.name}---${emp.salary}---${emp.age}----${emp.imgsrc}</h1>
    </c:forEach>
</body>
</html>
