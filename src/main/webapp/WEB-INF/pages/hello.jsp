<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
${hello}
<c:forEach var="message" items="${messages}">
    ${message.name}
    <br>
</c:forEach>
</body>
</html>
