<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../common/common.jsp" %>


<!doctype html>
<html lang="en">
<head>
    <jsp:include page="../common/head.jsp"/>
</head>
<body>
<jsp:include page="../nav/nav.jsp"/>
<div class="container">
    <h1>NameCard</h1>
    <div class="row mb-2">
        <div class="col-sm-12">
            <a href="${ctx}/namecards/add" class="btn btn-info">등록</a>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-12">
            <c:forEach var="nameCard" items="${nameCards}">
                <div class="card mb-2" style="width: 18rem;">
                    <div class="card-body">
                        <div class="float-right">
                            <a href="${ctx}/namecards/${nameCard.id}">
                                <i class="material-icons">keyboard_arrow_right</i>
                            </a>
                        </div>
                        <h5 class="card-title">${nameCard.name}</h5>
                        <h6 class="card-subtitle mb-2 text-muted">${nameCard.phoneNumber}</h6>
                        <p class="card-text">${nameCard.memo}</p>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</div>


<jsp:include page="../common/tail.jsp"/>
</body>
</html>
