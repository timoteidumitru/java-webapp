<%@ page import="java.time.LocalDateTime" %>
<html>
<body>
    <h2>Current Date and Time</h2>
    <p><%= LocalDateTime.now().toString() %></p>
</body>
</html>
