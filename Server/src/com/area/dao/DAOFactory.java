package com.area.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOFactory {
	private String url;
	private String username;
	private String password;
	
	DAOFactory(String url, String username, String password)
	{
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	public static DAOFactory getInstance()
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		
		DAOFactory instance = new DAOFactory("jdbc:mysql://localhost:3306/area", "root", "");
		return instance;
	}
	
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(this.url, this.username, this.password);
	}
	
	public UtilisateurDAO getUtilisateurDAO(){
		return new UtilisateurDAOImpl(this);
	}
}
