package com.area.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ATwitter")
public class ATwitter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String CHAMP_TWITTER = "identifiant_twitter";
	
	public static final String ATT_ERREUR = "erreur_twitter";
	public static final String ATT_MESSAGE = "message";
	
	public static final String VUE_PAGE = "/WEB-INF/page/Action.jsp";
	
	public ATwitter() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{ /* Affichage de la page Action*/
		this.getServletContext().getRequestDispatcher(VUE_PAGE).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{ /*Traitement des donn�es du formulaire */
		String identifiant = request.getParameter(CHAMP_TWITTER);
		
		String message;
		boolean erreur;
		
		/* Initialisation du message � afficher: si un des champs obligatoires 
		 * du formulaire n'est pas renseign�, alors on affiche un message
		 * d'erreur, sinon on affiche un message de succ�s.
		 */
		if ( identifiant.trim().isEmpty())
		{
			message = "Erreur - Vous n'avez pas rempli le champs obligatoire. <br>";
			erreur = true;
		}
		else
		{
			message = "Connexion � Twitter -> Ok! <br>";
			erreur = false;
		}
		
		/* Ajout du bean et du message � l'objet requ�te */
		request.setAttribute(ATT_ERREUR, erreur);
		request.setAttribute(ATT_MESSAGE, message);
				
		this.getServletContext().getRequestDispatcher(VUE_PAGE).forward(request, response);
	}
}
