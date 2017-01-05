package com.area.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.area.beans.InfosConnect;

public class InfosConnectDAOImpl implements InfosConnectDAO{
	private DAOFactory daofact;
	
	InfosConnectDAOImpl(DAOFactory daofact){
		this.daofact = daofact;
	}
	
	public void add(InfosConnect ic){
		Connection connexion = null;
		PreparedStatement prep = null;
		try {
			connexion = daofact.getConnection();
			prep = connexion.prepareStatement("Insert Into connexion(email_client, last_connection, connect_errors) Values (?, NOW(), 0);");
			prep.setString(1, ic.getMail());
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
	
	public void	update(InfosConnect ic){
		Connection connexion = null;
		PreparedStatement prep = null;
		try {
			connexion = daofact.getConnection();
			if (ic.isConnect_error()){
				prep = connexion.prepareStatement("Update connexion Set connect_errors = connect_errors + 1 Where mail_client = ?;");
			}else{
				prep = connexion.prepareStatement("Update connexion Set last_connect = NOW() and connect_errors = 0 Where mail_client = ?;");
			}
			prep.setString(1, ic.getMail());
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
}