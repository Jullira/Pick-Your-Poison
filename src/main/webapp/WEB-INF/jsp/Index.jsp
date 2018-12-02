<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">

<head>
    <title>Pick Your Poison</title>
    <link href="https://fonts.googleapis.com/css?family=Oswald" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/index.css"/>"/>

</head>
<body>

<div class="top-header">
    <h1>Pick your Poison</h1>
</div>
<div class="main-container">
    <div class="choice-container">
        <a href="/Search">
            <div class="container">
                <h3>Whiskey</h3>
                <p>Search by Whiskey</p>
            </div>
        </a>
        <a href="/locationsearch">
            <div class="container">
                <h3>Locations</h3>
                <p>Search by Location</p>
            </div>
        </a>
    </div>
</div>
</body>
</html>
