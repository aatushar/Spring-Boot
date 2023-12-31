<%-- 
    Document   : index.jsp
    Created on : Dec 26, 2023, 11:44:37 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSp page</title>
    <!-- Add Bootstrap CDN link or include Bootstrap CSS file -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>

    <div class="container mt-5">
        <h1>Add and View Form</h1>

        <div class="row mt-3">
            <div class="col-md-6">
                <a href="/empsaveform" class="btn btn-primary">Add Student</a>
            </div>
            <div class="col-md-6">
                <a href="/viewallemp" class="btn btn-success">View All Students</a>
            </div>
        </div>
    </div>

    <!-- Add Bootstrap JS and Popper.js if needed -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
