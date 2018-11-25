<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">

<head>
    <title>Pick Your Poison</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/index.css"/>"/>

</head>
<body>

<div class="top-header">
    <h1>Pick your Poison</h1>
</div>
<div class="main-container">
    <div class="choice-container">
        <div class="container">
            <h3>Whiskey</h3>
            <ul>
                <li><a href="/whiskeysearch">Search by Whiskey</a></li>
            </ul>
        </div>
        <div class="container">
            <h3>Locations</h3>
            <ul>
                <li><a href="/locationsearch">Search by Location</a></li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>
