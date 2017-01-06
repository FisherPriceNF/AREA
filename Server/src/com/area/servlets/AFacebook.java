package com.area.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.area.beans.Membre;
import com.area.dao.DAOFactory;
import com.area.dao.UtilisateurDAO;

@WebServlet("/AFacebook")
public class AFacebook extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String CHAMP_FACEBOOK = "identifiant_facebook";
	
	public static final String ATT_ERREUR = "erreur_facebook";
	public static final String ATT_MESSAGE = "message";
	
	public static final String VUE_PAGE = "/WEB-INF/page/Action.jsp";
	private UtilisateurDAO userdao;
	private HttpSession	Session;
	
	public AFacebook() {
        super();
    }

	public void init(){
		DAOFactory daofactory = DAOFactory.getInstance();
		this.userdao = daofactory.getUtilisateurDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{ /* Affichage de la page Action*/
		this.getServletContext().getRequestDispatcher(VUE_PAGE).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{ /*Traitement des donn�es du formulaire */
		String identifiant = request.getParameter(CHAMP_FACEBOOK);
		
		String message;
		boolean erreur;
		Membre membre = null;
		
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
			membre = new Membre();
			// TODO : session
			//Session = request.getSession();
			
			//membre.setMail(Session.getAttribute("identifiant").toString());
			membre.setSkype(identifiant);
			userdao.updateSkype(membre);
			message = "Connexion � Facebook -> Ok! <br>";
			erreur = false;
		}
		
		/* Ajout du bean et du message � l'objet requ�te */
		request.setAttribute(ATT_ERREUR, erreur);
		request.setAttribute(ATT_MESSAGE, message);
				
		this.getServletContext().getRequestDispatcher(VUE_PAGE).forward(request, response);
	}
}
