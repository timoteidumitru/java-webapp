<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to Our Web Application</title>
</head>
<body style='margin: 0 auto; padding: 25px; width: 100vw;'>
<h2>Welcome to Our Web Application</h2>
<p>This is a simple Java web application demonstrating authentication, servlets, and JSP pages.</p>

<!-- Link to the public servlet -->
<p><a href="public">Go to Public Page</a></p>

<!-- Link to the secured servlet (will prompt for credentials if not authenticated) -->
<!-- <p><a href="secured?username=tim&password=passw">Go to Secured Page</a></p> -->
<p><a href="secured">Go to Secured Page</a></p>

<!-- Link to the calendar JSP page -->
<p><a href="WEB-INF/views/calendar.jsp">View Calendar</a></p>
</body>
</html>
