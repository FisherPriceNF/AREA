<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Index</title>
    </head>

    <body>
        <p>Ceci est une page générée depuis une JSP.</p>
        <p>
        	<ul>
        		<c:forEach var="user" items="${ users }" >
        			<li><c:out value="${user.getNom()}"/>  <c:out value="${user.getPrenom()}"/></li>
        		</c:forEach>
        	</ul>
        </p>
    </body>
</html>