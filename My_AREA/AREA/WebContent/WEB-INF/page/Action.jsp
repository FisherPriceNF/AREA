<!DOCTYPE html>
<html>
   <!-- Head -->
   <head>
   		<%@ include file="../head.jsp" %>
   		<%@ include file="../style/style_action.jsp" %>
   		<!-- <link type="text/css" rel="stylesheet" href="<c:url value="/css/style_action.css"/>"/> -->
   </head>
	<body>
		
		<div class="div_formulaire">
				<!-- Formulaire -->
					<form class="facebook" method="post" action="<c:url value='/action/facebook'/>">
						<div class="div_logo">
							<img class="logo" src="http://icon-icons.com/icons2/478/PNG/512/facebook_47004.png" width="500" height="auto" alt="logo"/>
						</div>
						<input id="identifiant_facebook" class="input_text mail" name="identifiant_facebook" type="email" placeholder="Facebook" /></br>
						<c:if test="${erreur_facebook}"><p class="erreur" > ${ message } </p></c:if>
						</br>
						<input class="bouton_submit" type="submit" value="Action"/>
					</form>	  
		</div> <!-- !div_fromulaire -->
		<div class="div_formulaire">
				<!-- Formulaire -->
					<form class="twitter" method="post" action="<c:url value='/action/twitter'/>">
						<div class="div_logo">
							<img class="logo" src="http://www.freeiconspng.com/uploads/twitter-icon-download-18.png" width="500" height="auto" alt="logo"/>
						</div>
						<input id="identifiant_twitter" class="input_text util" name="identifiant_twitter" type="text" placeholder="Twitter" /></br>
						<c:if test="${erreur_twitter}"><p class="erreur" > ${ message } </p></c:if>
						</br>
						<input class="bouton_submit" type="submit" value="Action"/>
					</form>	  
		</div> <!-- !div_fromulaire -->
		<div class="div_formulaire">
				<!-- Formulaire -->
					<form class="intra" method="post" action="<c:url value='/action/intra'/>">
						<div class="div_logo">
							<img class="logo" src="https://image.winudf.com/61/444ddf9c5ed055/icon=170x.png" width="500" height="auto" alt="logo"/>
						</div>
						<input id="identifiant_intra" class="input_text mail" name="identifiant_intra" type="email" placeholder="Intranet Epitech" /></br>
						<c:if test="${erreur_intra}"><p class="erreur" > ${ message } </p></c:if>
						</br>
						<input class="bouton_submit" type="submit" value="Action"/>
					</form>	  
		</div> <!-- !div_fromulaire -->
		<div class="div_formulaire">
				<!-- Formulaire -->
					<form class="yammer" method="post" action="<c:url value='/action/yammer'/>">
						<div class="div_logo">
							<img class="logo" src="http://3.bp.blogspot.com/-lHqRV99tekU/VRBu0OpgiCI/AAAAAAAACoM/F74MkgAh61A/s1600/yammer-oficial-icone.png" width="500" height="auto" alt="logo"/>
						</div>
						<input id="identifiant_yammer" class="input_text mail" name="identifiant_yammer" type="email" placeholder="Yammer" /></br>
						<c:if test="${erreur_yammer}"><p class="erreur" > ${ message } </p></c:if>
						</br>
						<input class="bouton_submit" type="submit" value="Action"/>
					</form>	  
		</div> <!-- !div_fromulaire -->
		<div class="div_formulaire">
				<!-- Formulaire -->
					<form class="skype" method="post" action="<c:url value='/action/skype'/>">
						<div class="div_logo">
							<img class="logo" src="http://www.iconsfind.com/wp-content/uploads/2015/12/20151208_56663cb1b0e1b.png" width="500" height="auto" alt="logo"/>
						</div>
						<input id="identifiant_skype" class="input_text util" name="identifiant_skype" type="text" placeholder="Skype" /></br>
						<c:if test="${erreur_skype}"><p class="erreur" > ${ message } </p></c:if>
						</br>
						<input class="bouton_submit" type="submit" value="Action"/>
					</form>	  
		</div> <!-- !div_fromulaire -->
	</body>
</html>