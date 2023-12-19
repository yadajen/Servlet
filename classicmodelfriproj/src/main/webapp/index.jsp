<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Welcome - classic models</title>
    <style>
        body {
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
            background-color: #f8f9fa; /* Light gray background */
        }

        .container {
            text-align: center;
            padding: 20px;
            border-radius: 10px;
            background-color: #f4f4f4 ; /* White container background */
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* Subtle shadow */
        }

        h1 {
            color: #3498db; /* Bootstrap primary color */
        }

        a.btn-primary {
            background-color:  #2ecc71; /* Bootstrap success color */
            border-color: #28a745; /* Bootstrap success color */
        }

        a.btn-primary:hover {
            background-color: #27ae60 ; /* Darker shade on hover */
            border-color: #218838; /* Darker shade on hover */
        }
    </style>
</head>
<body>
<div class="container">
    <h1><%= "65130500017 Yada Jenrungrodsakul" %></h1>
    <br/>
    <a href="office-list" class="btn btn-primary">OFFICE LIST</a>
</div>
</body>
</html>
