<style>
/*---- html ----*/
html  /* Balise html*/
{
	overflow-y: scroll;
}

/*---- boby ----*/
body /*Balise body*/
{
	margin: auto;
	background-image: url("https://images.alphacoders.com/176/thumb-1920-176261.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	font-family: 'Titillium Web', sans-serif;
  	-webkit-background-size: cover; /* pour anciens Chrome et Safari */
  	background-size: cover; /* version standardisée */
}

/*--- Balise H1 ---*/
h1
{
 	text-align: center;
 	color: white;
 	font-weight: 30px;
 	margin: 0 0 40px;
}


/* Div avec class= div_formulaire*/
.div_formulaire
{
	width: 500px;
	height: 500px;
	text-align: center;
	background-color: rgba(52, 73, 94, 0.7);
	border-raduis: 4px;
	margin: 0 auto;
	margin-top: 150px;
}

/* Div avec class= form_container*/
.div_container
{


}

/* Div avec class= div_logo*/
.div_logo img
{
    width: 220px;	
	height: 220px;
	margin-top: -60px;
	margin-bottom: 30px;
}

/* Div avec class=input_text*/
.input_text
{
	height: 40px;
	width: 300px;
	font-size: 18px;
	margin-bottom: 20px;
	background-color: #fff;
	padding-left: 5px;
}

/* Div avec class=mail */
.mail
{
	background-image: url("http://www.icone-png.com/png/54/53711.png");
	background-repeat: no-repeat;
	background-position: 5px 10px;
	background-size: 20px;
	padding-left: 30px;
}

/* Div avec class=pass */
.pass
{
	background-image: url("http://www.pngfactory.net/_png/_thumb/20638-bubka-Security.png");
	background-repeat: no-repeat;
	background-position: 5px 10px;
	background-size: 20px;
	padding-left: 30px;
}

/* Div avec class=bouton_submit */
.bouton_submit
{
 	padding: 20px 40px;
 	margin-left: auto;
 	margin-right: auto;
 	color: #fff;
 	border-radius: 4px;
 	border: none;
 	background-color: #1ab188;
 	display: block;
 	
 	text-transform: uppercase;
 	font-size: 2rem;
 	font-weight: 600;
 	letter-spacing: .1em;
 	-webkit-transition: all 0.5s ease;
 	transition: all 0.5s ease;
 	-webkit-appearance: none;
 	outline: none;
}

/* Div avec class=bouton_submit sur le hover et le focus */
.bouton_submit:hover, .bouton_submit:focus
{
	background: #179b77;
}

/* ---- Balise lien_enregistre ----*/
.lien_enregistre
{
	text-decoration: none;
	color: #fff;
	-webkit-transition: .5s ease;
	transition: .5s ease;	
}

/* P avec class=erreur*/
.erreur
{
	text-decoration: none;
	color: #ff0066;
}
</style>