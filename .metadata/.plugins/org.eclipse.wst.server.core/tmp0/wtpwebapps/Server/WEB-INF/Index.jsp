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