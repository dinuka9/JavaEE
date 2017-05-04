<%-- 
    Document   : edit
    Created on : Mar 1, 2017, 6:36:53 PM
    Author     : Dinuka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
        <title>Edit Employee</title>
    </head>
    <body>
        <h3 align="center" style="color: #ffffff">Edit Employee Details</h3>
        <div align="center" style="padding-top: 25px">
            <form action="saveuser" method="get">
                <table class="mdl-data-table mdl-js-data-table mdl-shadow--2dp">
                    <thead>
                        <tr>
                            <th></th>
                            <th class="mdl-data-table__cell--non-numeric">Name</th>
                            <th class="mdl-data-table__cell--non-numeric">Age</th>
                            <th class="mdl-data-table__cell--non-numeric">Address</th>
                            <th class="mdl-data-table__cell--non-numeric">Department</th>
                            <th ></th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                        <td>${employee.emp_id}</td>
                            <input type="hidden" name="user_id" value="${employee.emp_id}"/>
                        <td class="mdl-data-table__cell--non-numeric">${employee.emp_name}
                            <!--<input name="user_name" value="${employee.emp_name}"/>-->
                        </td>
                        <td >${employee.emp_age}
                            <!--<input name="user_age" value="${employee.emp_age}"/>-->
                        </td>
                        <td class="mdl-data-table__cell--non-numeric">${employee.emp_address}
                            <!--<input name="user_address" value="${employee.emp_address}"/>-->
                        </td>
                        <td class="mdl-data-table__cell--non-numeric">
                            <select name="dep_id">
                                <c:forEach items="${departmentlist}" var="department">
                                    <option value="${department.dep_id}">${department.dep_name}</option>
                                </c:forEach>
                            </select> 
                    </td>
                    <td class="mdl-data-table__cell--non-numeric">
                        <button class="mdl-button mdl-js-button mdl-button--raised 
                                mdl-js-ripple-effect mdl-button--accent" type="submit">Save</button></td>
                    </tr>
                    </tbody>
                </table>
            </form>
        </div>
    </body>
</html>
