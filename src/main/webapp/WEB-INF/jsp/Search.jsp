<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html lang="en">

<head>
    <title>Pick your poison</title>
    <link href="https://fonts.googleapis.com/css?family=Oswald" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/search.css"/>"/>

</head>
<body>
<div class="top-header">
    <div class="faux-div"></div>
    <h1>PICK YOUR POISON!</h1>
    <a class="link" href="/">Home</a>
    </div>
</div>
<div class="main-container">
    <p>write in the drink you want to find down below and we will get you to your poison &#128521</p>
    <sf:form name="search" method="POST" modelAttribute="offer" action="/search/">
    <div class="form-container">
        <sf:input path="name" type="text" placeholder="Enter name of drink"/>
        <input type="submit" VALUE="I HAVE PICKED MY POISON!"/>
    </div>
    </sf:form>
    <div>
        <c:choose>
            <%--If the model has an attribute with the name `offer`--%>
            <c:when test="${not empty offers}">
                <%--Create a table for the offers--%>
                <ul class="drinks">

                        <%--For each name, that is in the list that was passed in the model--%>
                        <%--generate a row in the table--%>
                        <%--Here we set `offer` as a singular item out of the list `offers`--%>
                    <c:forEach var="offer" items="${offers}">
                        <%--We can reference attributes of the Entity by just entering the name we gave--%>
                        <%--it in the singular item var, and then just a dot followed by the attribute name--%>
                        <li>NAME: ${offer.name}, LOCATION: ${offer.location.name}, PRICE: ${offer.price}</li>
                    </c:forEach>
                </ul>
            </c:when>

                    <%--If all tests are false, then do this--%>
            <c:otherwise>
                <h3>No drink chosen!</h3>
            </c:otherwise>
        </c:choose>
    </div>
</div>

</body>

</html>