<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../common/common.jsp"%>
<html>
<head>
    <title>Name Card</title>

    <spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
    <spring:url value="/resources/core/css/app.css" var="appCss"/>
    <link href="${appCss}" rel="stylesheet" />
    <link href="${bootstrapCss}" rel="stylesheet" />

</head>
<body>
<div class="container">
    <h1>NameCard</h1>

        <div>

            <c:forEach var="nameCard" items="${nameCards}">
                <div class="card" style="width: 18rem;">
                    <div class="card-body">
                        <h5 class="card-title">${nameCard.name}</h5>
                        <h6 class="card-subtitle mb-2 text-muted">${nameCard.phoneNumber}</h6>
                        <p class="card-text">${nameCard.memo}</p>
                    </div>
                </div>
            </c:forEach>

        </div>

</div>


<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<spring:url value="/resources/core/js/bootstrap.min.js" var="bootstrapJs" />
<spring:url value="/resources/core/js/app.js" var="appJs"/>
<script src="${appJs}"></script>
<script src="${bootstrapJs}"></script>

</body>
</html>
