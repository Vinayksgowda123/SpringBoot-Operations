<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>IPL Teams</title>
</head>
<body>
    <h2>IPL Teams List</h2>
    <table border="1">
        <tr>
            <th>Team Name</th>
            <th>Team Captain</th>
            <th>Team Wins</th>
        </tr>
        <c:forEach var="team" items="${Iplteams}">
            <tr>
                <td>${team.teamname}</td>
                <td>${team.teamcaptain}</td>
                <td>${team.teamwins}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
