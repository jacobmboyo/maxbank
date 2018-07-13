package com.max.bank.entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DbConnexion {
	
	String url = "jdbc:mysql://localhost:3306/maxbank?autoReconnect=true&useSSL=false";
	String username = "root";
	String mdp = "jacobmboyo@gmail.com";
	Connection strCon;
	
	//Méthodes d'insertion dans la Base de données
	public void insertClient(Client cl){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			strCon = DriverManager.getConnection(url, username, mdp);
			
			Statement st = strCon.createStatement();
			
			String sql = "insert into client(id, nom, prenom) " +
					"values(null, '" + cl.getNom() + "', '" + cl.getPrenom() + "')";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Méthodes d'affichage des enregistrements
	public List<Client> getClient(int id){
	
		List<Client> clients = new ArrayList<Client>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			strCon = DriverManager.getConnection(url, username, mdp);
			
			String sql = "SELECT * FROM client";
			
			Statement st = strCon.createStatement();
			
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()){
				Client c = new Client();
				c.setId(rs.getInt("id"));
				c.setNom(rs.getString("nom"));
				c.setPrenom(rs.getString("prenom"));
				/*DateTimeFormatter f=DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.0Z");
				DateTime d = f.parseDateTime(rs.getString("dateNaissance"));
				c.setDateNaissance(d);*/
				
				clients.add(c);
			}
			
			st.close();
			strCon.close();
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return clients;
	}




}