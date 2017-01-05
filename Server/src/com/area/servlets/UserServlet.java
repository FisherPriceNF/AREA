package com.area.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.area.beans.Membre;
import com.area.dao.DAOFactory;
import com.area.dao.UtilisateurDAO;

public class UserServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UtilisateurDAO userdao;

	public void init(){
		DAOFactory daofactory = DAOFactory.getInstance();
		this.userdao = daofactory.getUtilisateurDAO();
	}
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		request.setAttribute("users", userdao.getList());
		this.getServletContext().getRequestDispatcher( "/WEB-INF/Index.jsp" ).forward( request, response );
	}
	
	public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		Membre membre = new Membre();
		membre.setMail(request.getParameter("mail"));
		membre.setPassword(request.getParameter("password"));
		membre.setNom(request.getParameter("nom"));
		membre.setPrenom(request.getParameter("prenom"));
		membre.setFacebook(request.getParameter("facebook"));
		membre.setTwitter(request.getParameter("twitter"));
		membre.setSkype(request.getParameter("skype"));
		membre.setIntra(request.getParameter("intra"));
		
		userdao.add(membre);
		
		request.setAttribute("users", userdao.getList());
		this.getServletContext().getRequestDispatcher( "/WEB-INF/Index.jsp" ).forward( request, response );
	}
}
