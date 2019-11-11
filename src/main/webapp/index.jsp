<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Katalog Książek</title>
    <style><%@include file="/assets/style.css"%></style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script><%@include file="/assets/app.js"%></script>
</head>
<body>
<h1>Katalog Książek</h1>
<div id="form">
    <form>
        <p>Tytuł: <input id="title" type="text"></p>
        <p>Autor: <input id="author" type="text"></p>
        <p>Wydawca: <input id="publisher" type="text"></p>
        <p>ISBN: <input id="isbn" type="text"></p>
        <p>Gatunek: <input id="type" type="text"></p>
        <p id="buttonsP"><button id="submit">Zapisz</button></p>
    </form>
</div>

<br><br><br><br>

<div>
    <table>
        <thead>
        <td>Tytuł</td>
        <td>Autor</td>
        <td style="border: 0px;"></td>
        </thead>
        <tbody id="tbody">

        </tbody>
    </table>
</div>


</body>
</html>
