<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Student Information</title>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

    <!-- Your custom CSS -->
    <style>
        body {
            padding: 20px;
        }

        table {
            width: 100%;
            margin-bottom: 1rem;
            color: #212529;
        }

        th,
        td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #dee2e6;
        }

        th {
            background-color: #007bff;
            color: #fff;
        }

        .btn {
            margin-right: 5px;
        }
    </style>
</head>
<body>
    <h1>Student Information</h1>

    <table class="table">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Department</th>
                <th> Gender</th>
                <th>Marks</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="emp" items="${empList}">
                <tr>
                    <td>${emp.id}</td>
                    <td>${emp.name}</td>
                    <td>${emp.department}</td>
                    <td>${emp.gender}</td>
                    <td>${emp.marks}</td>
                    <td>
                        <a href="/empeditform/${emp.id}" class="btn btn-warning">Edit</a>
                        <a href="/deleteemp/${emp.id}" class="btn btn-danger">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <!-- Bootstrap JS (Optional) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
</body>
</html>
