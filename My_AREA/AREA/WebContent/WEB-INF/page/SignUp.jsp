<!DOCTYPE html>
<html>
   <!-- Head -->
   <head>
   		<%@ include file="../head.jsp" %>
   		<%@ include file="../style/style_signUp.jsp" %>
   		<!-- <link type="text/css" rel="stylesheet" href="<c:url value="/css/style_signUp.css"/>"/> -->
   </head>
	<body>
		<div class="div_formulaire">
			<div class="div_logo">
				<img class="logo" src="https://upload.wikimedia.org/wikipedia/fr/thumb/b/bb/AREA.svg/727px-AREA.svg.png" width="200" height="auto" alt="logo"/>
			</div>
			<h1> Enregistrement </h1>
			<div class="form_container">
			<!-- Formulaire -->
				<form class="signUp" method="post" action="<c:url value='/signUp'/>">
				
					<div class="top-row">
						<input id="nom" name="nom" type="text" placeholder="Nom" class="input_text util"/>
						<input id="prenom" name="prenom" type="text" placeholder="Prenom" class="input_text util"/><br/>
					</div> <!-- !top-row -->
				
					<div class="top-row">
					<input id="email" name="email" type="email" placeholder="Entrée votre mail" class="input_text mail"/><br/>
					</div> <!-- !top-row -->
				
					<div class="top-row">					
					<input id="pass" name="pass" type="password" placeholder="Entrée votre mot de passe" maxlength="8" class="input_text pass"/><br/>
					</div> <!-- !top-row -->
					
					<c:if test="${erreur}">
					<p class="erreur"> ${message} </p>
					</c:if>					
					
					<input class="bouton_submit" type="submit" value="Enregister !"/>
				</form>
			</div> <!-- !form_container -->

		</div>	<!-- !div_fromulaire  -->	  
	</body>
</html>