package com.area.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String CHAMP_NOM = "nom";
	private static final String CHAMP_PRENOM = "prenom";
	private static final String CHAMP_MAIL = "email";
	private static final String CHAMP_PASSWORD = "pass";
    
	public static final String ATT_ERREUR = "erreur";
	public static final String ATT_MESSAGE = "message";
	
	public static final String VUE_ACCEPTE = "/WEB-INF/page/Login.jsp";
	public static final String VUE_REFUSE = "/WEB-INF/page/SignUp.jsp";
	
    public SignUp() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{ /* Affichage de la page SignUp*/
		this.getServletContext().getRequestDispatcher(VUE_REFUSE).forward(request, response);			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String nom = request.getParameter(CHAMP_NOM);
		String prenom = request.getParameter(CHAMP_PRENOM);
		String email = request.getParameter(CHAMP_MAIL);
		String password = request.getParameter(CHAMP_PASSWORD);
		
		String message;
		boolean erreur;
		
		/* Initialisation du message à afficher: si un des champs obligatoires 
		 * du formulaire n'est pas renseigné, alors on affiche un message
		 * d'erreur, sinon on affiche un message de succès.
		 */
		if (  nom.trim().isEmpty() || prenom.trim().isEmpty() || email.trim().isEmpty() || password.trim().isEmpty())
		{
			message = "Erreur - Vous n'avez pas rempli tous les champs obligatoire. <br>";
			erreur = true;
		}
		else
		{
			message = "Enregistrement -> Ok! <br>";
			erreur = false;
		}
		
		/* Ajout du bean et du message à l'objet requête*/
		request.setAttribute(ATT_ERREUR, erreur);
		request.setAttribute(ATT_MESSAGE, message);
		
		/* Tramission à la page JSP en charge de l'affichage des données */
		if (erreur == true)
			this.getServletContext().getRequestDispatcher(VUE_REFUSE).forward(request, response);
		else if (erreur == false)
			this.getServletContext().getRequestDispatcher(VUE_ACCEPTE).forward(request, response);
	}

}
