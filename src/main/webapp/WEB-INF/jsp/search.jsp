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
    <p>write in the drink or location you want to find down below and we will get you to your poison &#128521</p>

    <div class="form-container">

        <sf:form method="POST" modelAttribute="Offer" action="/search">
            <%--the `path` attribute matches the `name` attribute of the Entity that was passed in the model--%>
            <label for="search__input">search: </label>

            <sf:input id="search__input" path="name" type="text" placeholder="Enter drink or location"/>
            <input type="submit" VALUE="I HAVE PICKED MY POISON!" onclick="form.action='search';"/>
        </sf:form>
    </div>
    <div>
        <c:choose>
            <%--If the model has an attribute with the name `prices`--%>
            <c:when test="${not empty nameOffer}">
                <%--Create a table for the prices--%>
                <ul class="drinks">

                        <%--For each drink, that is in the list that was passed in the model--%>
                        <%--generate a row in the table--%>
                        <%--Here we set `drink` as a singular item out of the list `drinks`--%>
                    <c:forEach var="offer" items="${nameOffer}">
                        <%--We can reference attributes of the Entity by just entering the name we gave--%>
                        <%--it in the singular item var, and then just a dot followed by the attribute name--%>

                        <%--Create a link based on the name attribute value--%>
                        <%--<li><a href="/drink/${drink.name}">${drink.name}</a></li>--%>
                        <li>NAME: ${offer.name}, LOCATION: ${offer.location.name}, PRICE: ${offer.price}</li>
                    </c:forEach>
                </ul>
            </c:when>

                    <%--If all tests are false, then do this--%>
            <c:otherwise>
                <h3>No drink chosen</h3>
            </c:otherwise>
        </c:choose>
    </div>
</div>

</body>

</html>