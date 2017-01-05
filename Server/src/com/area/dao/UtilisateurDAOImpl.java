package com.area.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.area.beans.InfosConnect;
import com.area.beans.Membre;

public class UtilisateurDAOImpl implements UtilisateurDAO{
	private DAOFactory daofact;
	
	UtilisateurDAOImpl(DAOFactory daofact){
		this.daofact = daofact;
	}
	public void add(Membre membre){
		Connection connexion = null;
		PreparedStatement prep = null;
		InfosConnectDAO icdao = new InfosConnectDAOImpl(this.daofact);
		InfosConnect ic = new InfosConnect();
		try {
			connexion = daofact.getConnection();
			prep = connexion.prepareStatement("Insert Into membre(mail_client, password, nom, prenom, facebook_iden, twitter_iden, skype_iden, epitech_iden) Values (?, MD5(?), ?, ?, ?, ?, ?, ?);");
			prep.setString(1, membre.getMail());
			prep.setString(2, membre.getPassword());
			prep.setString(3, membre.getNom());
			prep.setString(4, membre.getPrenom());
			prep.setString(5, membre.getFacebook());
			prep.setString(6, membre.getTwitter());
			prep.setString(7, membre.getSkype());
			prep.setString(8, membre.getIntra());
			prep.executeUpdate();
			
			ic.setMail(membre.getMail());
			icdao.add(ic);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
				if (prep != null)
					prep.close();
			}catch (SQLException e){
				System.out.println("Error : " + e.getMessage());
			}
		}
	}
	
	public Membre getMembre(String mail){
		Connection connexion = null;
		PreparedStatement prep = null;
		ResultSet res = null;
		Membre membre = null;
		
		try{
			connexion = daofact.getConnection();
			prep = connexion.prepareStatement("Select * From Membre Where mail_client = ?");
			prep.setString(1, mail);
			res = prep.executeQuery();
			
			if (res.last()){
				membre = new Membre();
				membre.setMail(res.getString("mail_client"));
				membre.setNom(res.getString("nom"));
				membre.setPrenom(res.getString("prenom"));
				membre.setFacebook(res.getString("facebook_iden"));
				membre.setTwitter(res.getString("twitter_iden"));
				membre.setIntra(res.getString("epitech_iden"));
				membre.setSkype(res.getString("skype_iden"));
			}
			
		} catch(SQLException e){
			e.printStackTrace();
		} finally{
			try{
				if (res != null)
					res.close();
				if (prep != null)
					prep.close();
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
		return membre;
	}
	
	public void	updateMembre(Membre membre){
		Connection connexion = null;
		PreparedStatement prep = null;
		try {
			connexion = daofact.getConnection();
			prep = connexion.prepareStatement("Update Membre Set nom = ?, prenom = ?, facebook_iden = ?, twitter_iden = ?, skype_iden = ?, epitech_iden = ? Where mail_client = ?;");
			prep.setString(1, membre.getNom());
			prep.setString(2, membre.getPrenom());
			prep.setString(3, membre.getFacebook());
			prep.setString(4, membre.getTwitter());
			prep.setString(5, membre.getSkype());
			prep.setString(6, membre.getIntra());
			prep.setString(7, membre.getMail());
			prep.executeUpdate();
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if (connexion != null)
					connexion.close();
				if (prep != null)
					prep.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	public void	updateNom(Membre membre){
		Connection connexion = null;
		PreparedStatement prep = null;
		try {
			connexion = daofact.getConnection();
			prep = connexion.prepareStatement("Update Membre Set nom = ? Where mail_client = ?;");
			prep.setString(1, membre.getNom());
			prep.setString(2, membre.getMail());
			prep.executeUpdate();
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if (connexion != null)
					connexion.close();
				if (prep != null)
					prep.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	public void	updatePrenom(Membre membre){
		Connection connexion = null;
		PreparedStatement prep = null;
		try {
			connexion = daofact.getConnection();
			prep = connexion.prepareStatement("Update Membre Set prenom = ? Where mail_client = ?;");
			prep.setString(1, membre.getPrenom());
			prep.setString(2, membre.getMail());
			prep.executeUpdate();
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if (connexion != null)
					connexion.close();
				if (prep != null)
					prep.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	public void	updateFacebook(Membre membre){
		Connection connexion = null;
		PreparedStatement prep = null;
		try {
			connexion = daofact.getConnection();
			prep = connexion.prepareStatement("Update Membre Set facebook_iden = ? Where mail_client = ?;");
			prep.setString(1, membre.getFacebook());
			prep.setString(2, membre.getMail());
			prep.executeUpdate();
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if (connexion != null)
					connexion.close();
				if (prep != null)
					prep.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	public void	updateTwitter(Membre membre){
		Connection connexion = null;
		PreparedStatement prep = null;
		try {
			connexion = daofact.getConnection();
			prep = connexion.prepareStatement("Update Membre Set twitter_iden = ? Where mail_client = ?;");
			prep.setString(1, membre.getTwitter());
			prep.setString(2, membre.getMail());
			prep.executeUpdate();
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if (connexion != null)
					connexion.close();
				if (prep != null)
					prep.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	public void	updateSkype(Membre membre){
		Connection connexion = null;
		PreparedStatement prep = null;
		try {
			connexion = daofact.getConnection();
			prep = connexion.prepareStatement("Update Membre Set skype_iden = ? Where mail_client = ?;");
			prep.setString(1, membre.getSkype());
			prep.setString(2, membre.getMail());
			prep.executeUpdate();
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if (connexion != null)
					connexion.close();
				if (prep != null)
					prep.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	public void	updateEpitech(Membre membre){
		Connection connexion = null;
		PreparedStatement prep = null;
		try {
			connexion = daofact.getConnection();
			prep = connexion.prepareStatement("Update Membre Set epitech_iden = ? Where mail_client = ?;");
			prep.setString(1, membre.getIntra());
			prep.setString(2, membre.getMail());
			prep.executeUpdate();
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if (connexion != null)
					connexion.close();
				if (prep != null)
					prep.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	public List<Membre> getList(){
		List<Membre> res = new ArrayList<Membre>();
		
		Connection connexion = null;
		Statement requete = null;
		ResultSet resultat = null;
		
		try{
			connexion = daofact.getConnection();
			requete = connexion.createStatement();
			resultat = requete.executeQuery("Select * From membre;");
					
					while (resultat.next())
					{
						String nom = resultat.getString("nom");
						String prenom = resultat.getString("prenom");
						String facebook = resultat.getString("facebook_iden");
						String twitter = resultat.getString("twitter_iden");
						String skype = resultat.getString("skype_iden");
						String intra = resultat.getString("epitech_iden");
						String mail = resultat.getString("mail_iden");
						
						Membre next = new Membre();
						next.setNom(nom);
						next.setPrenom(prenom);
						next.setFacebook(facebook);
						next.setTwitter(twitter);
						next.setSkype(skype);
						next.setIntra(intra);
						next.setMail(mail);
						
						res.add(next);
					}
		}catch (SQLException e){
			System.out.println("Error : " + e.getMessage());
		}finally{
			try{
				if (resultat != null)
					resultat.close();
				if (requete!= null)
					requete.close();	
			}catch (SQLException e){
				System.out.println("Error : " + e.getMessage());
			}
		}
		return res;
	}
	
	public boolean check_auth(Membre membre)
	{
		Connection connexion = null;
		PreparedStatement prep = null;
		ResultSet resultat = null;
		InfosConnect ic = new InfosConnect();
		InfosConnectDAO icdao = new InfosConnectDAOImpl(this.daofact);
		
		try{
			connexion = daofact.getConnection();
			ic.setMail(membre.getMail());
			
			prep = connexion.prepareStatement("Select * From membre Where email_client = ? And password = MD5(?);");
			prep.setString(1, membre.getMail());
			prep.setString(2, membre.getPassword());
			
			resultat = prep.executeQuery();
			
			if (resultat.last())
			{
				ic.setConnect_error(false);
			}else{
				ic.setConnect_error(true);
			}
			icdao.update(ic);
			
		}catch (SQLException e){
			System.out.println("Error : " + e.getMessage());
		}finally{
			try{
				if (resultat != null)
					resultat.close();
				if (prep!= null)
					prep.close();	
			}catch (SQLException e){
				System.out.println("Error : " + e.getMessage());
			}
		}
		if (ic.isConnect_error())
			return false;
		else
			return true;
	}
}
