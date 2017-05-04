<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
        <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:300,400,500,700" type="text/css">
        <style type="text/css">
            body {
                background: #76b852; /* fallback for old browsers */
                background: -webkit-linear-gradient(right, #76b852, #8DC26F);
                background: -moz-linear-gradient(right, #76b852, #8DC26F);
                background: -o-linear-gradient(right, #76b852, #8DC26F);
                background: linear-gradient(to left, #76b852, #8DC26F);
                font-family: "Roboto", sans-serif;
                -webkit-font-smoothing: antialiased;
                -moz-osx-font-smoothing: grayscale;
            }
        </style>
        <title>Home Page</title>
    </head>
    <body>
        <h3 align="center" style="color: #ffffff">Employee Details</h3>
        <div align="center" style="padding-top: 25px">
            <table class="mdl-data-table mdl-js-data-table mdl-shadow--2dp">
                <thead>
                    <tr>
                        <th ></th>
                        <th class="mdl-data-table__cell--non-numeric">Name</th>
                        <th >Age</th>
                        <th class="mdl-data-table__cell--non-numeric">Address</th>
                        <th >Department</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${employees}" var="employee">
                        <tr>
                            <td class="mdl-data-table__cell--non-numeric"><c:out value="${employee.emp_id}"></c:out></td>
                            <td class="mdl-data-table__cell--non-numeric" ><c:out value="${employee.emp_name}"></c:out></td>
                            <td ><c:out value="${employee.emp_age}"></c:out></td>
                            <td class="mdl-data-table__cell--non-numeric"><c:out value="${employee.emp_address}"></c:out></td>
                            <td class="mdl-data-table__cell--non-numeric"><c:out value="${employee.department.dep_name}"></c:out></td>
                            <td ><a href="edituser?userid=${employee.emp_id}">
                                    <button class="mdl-button mdl-js-button mdl-button--raised 
                                            mdl-js-ripple-effect mdl-button--accent">Edit</button></a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>