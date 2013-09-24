<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Student</title>
</head>
<body>

<h2>Submitted Student Information</h2>
   <table>
    <tr>
        <td>Status</td>
        <td>${status}</td>
    </tr>
    <tr>
        <td>Message</td>
        <td>${message}</td>
    </tr>
    <tr>
        <td>Exception</td>
        <td>${exception}</td>
    </tr>
</table>  
</body>
</html>