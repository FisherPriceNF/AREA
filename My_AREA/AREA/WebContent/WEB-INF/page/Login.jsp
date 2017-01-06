<!DOCTYPE html>
<html>
     <!-- Head -->
   <head>
   		<%@ include file="../head.jsp" %>
   		<%@ include file="../style/style_login.jsp" %>
   		<!-- <link type="text/css" rel="stylesheet" href="<c:url value="/css/style_login.css"/>"/> -->
   </head>
	<body>
		<div class="div_formulaire">
				<div class="div_logo">
					<img class="logo" src="https://upload.wikimedia.org/wikipedia/fr/thumb/b/bb/AREA.svg/727px-AREA.svg.png" width="200" height="auto" alt="logo"/>
				</div>
				
				<h1> Connexion </h1>
				<div class="form_container">
				<!-- Formulaire -->
					<form class="login" method="post" action="<c:url value='/'/>">
						<input id="email" class="input_text mail" name="email" type="email" placeholder="Mail" /></br>
						<input id="pass" class="input_text pass" name="pass" type="password" placeholder="Password" maxlength="8" /><br/>			
						<a class="lien_enregistre" id="lien_enregistre" href="<c:url value='/signUp'/>">s'enregistre ?</a>
						
						<c:if test="${erreur}">
						<p class="erreur" > ${ message } </p>
						</c:if>
						</br>
						<input class="bouton_submit" type="submit" value="Connexion !"/>
					</form>	  
				</div> <!-- !form_container -->
		</div> <!-- !div_fromulaire -->
	</body>
</html>