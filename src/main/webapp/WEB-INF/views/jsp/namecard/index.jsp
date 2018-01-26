<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../common/common.jsp"/>
<html>
<head>
    <title>Name Card</title>
</head>
<body>
<div class="container">
    <h1>NameCard</h1>

    <ul>
        <c:forEach var="nameCard" items="${nameCards}">
        <li>${nameCard.name} ${nameCard.phoneNumber} ${nameCard.memo}</li>
        </c:forEach>
    </ul>

</div>
</body>
</html>
