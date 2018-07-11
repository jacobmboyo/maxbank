package com.max.bank.entities;

import org.joda.time.DateTime;

public class Client {
	private int id;
	private String nom;
	private String prenom;
	private DateTime dateNaissance;
	
	// Getters and Setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public DateTime getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(DateTime dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	//
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + "]";
	}
	
	
}
