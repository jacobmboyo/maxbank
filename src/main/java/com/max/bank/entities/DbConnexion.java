package com.max.bank.entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnexion {
	
	String url = "jdbc:mysql://localhost:3306/maxbank?autoReconnect=true&useSSL=false";
	String username = "root";
	String mdp = "jacobmboyo@gmail.com";
	Connection strCon;
	
	public void insertClient(Client cl){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			strCon = DriverManager.getConnection(url, username, mdp);
			
			Statement st = strCon.createStatement();
			
			String sql = "insert into client(id, nom, prenom, dateNaissance) " +
					"values(null, '" + cl.getNom() + "', '" + cl.getPrenom() + "', '" + cl.getDateNaissance() + "')";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




}