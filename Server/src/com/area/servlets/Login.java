package com.area.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.area.beans.Membre;
import com.area.dao.DAOFactory;
import com.area.dao.UtilisateurDAO;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String CHAMP_IDENTIFIANT = "email";
	private static final String CHAMP_PASSWORD = "pass";
	
	public static final String ATT_ERREUR = "erreur";
	public static final String ATT_MESSAGE = "message";
	
	public static final String VUE_ACCEPTE = "/WEB-INF/page/Action.jsp";
	public static final String VUE_REFUSE =  "/WEB-INF/page/Login.jsp";
	
	private UtilisateurDAO userdao;
	
	public Login() 
    {
        super();        
    }

	public void init(){
		DAOFactory daofactory = DAOFactory.getInstance();
		this.userdao = daofactory.getUtilisateurDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{ /* Affichage de la page login*/
		this.getServletContext().getRequestDispatcher(VUE_REFUSE).forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{ /*Traitement des donn�es du formulaire */
		String identifiant = request.getParameter(CHAMP_IDENTIFIANT);
		String password = request.getParameter(CHAMP_PASSWORD);
		
		String message;
		boolean erreur;
		Membre membre = null;
		
		/* Initialisation du message � afficher: si un des champs obligatoires 
		 * du formulaire n'est pas renseign�, alors on affiche un message
		 * d'erreur, sinon on affiche un message de succ�s.
		 */
		if ( identifiant.trim().isEmpty() || password.trim().isEmpty())
		{
			message = "Erreur - Vous n'avez pas rempli tous les champs obligatoire. <br>";
			erreur = true;
		}
		else
		{
			membre = new Membre();
			membre.setMail(identifiant);
			membre.setPassword(password);
			if (userdao.check_auth(membre)){
				// Connexion OK
				message = "Connexion -> Ok! <br>";
				erreur = false;
				membre = userdao.getMembre(membre.getMail());
			}else{
				// Erreur de connexion
				message = "Erreur de connexion, mauvais mail ou mot de passe.<br>";
				erreur = true;
			}
		}
		
		/* Ajout du bean et du message � l'objet requ�te */
		request.setAttribute(ATT_ERREUR, erreur);
		request.setAttribute(ATT_MESSAGE, message);
		request.setAttribute("user", membre);
		
		/* Tramission � la page JSP en charge de l'affichage des donn�es */
		if (erreur == true)
			this.getServletContext().getRequestDispatcher(VUE_REFUSE).forward(request, response);
		else if (erreur == false)
			this.getServletContext().getRequestDispatcher(VUE_ACCEPTE).forward(request, response);
	}	
}
