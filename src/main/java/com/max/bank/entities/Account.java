package com.max.bank.entities;

public class Account {
	private int numAccount;
	private String typeAccount;
	private Client clientId; // Clé étrangère. Utiliser le nom de la classe Client au lieu de int
	private String dateOuverture;
	
	// Getters and Setters
	
	public int getNumAccount() {
		return numAccount;
	}
	public void setNumAccount(int numAccount) {
		this.numAccount = numAccount;
	}
	public String getTypeAccount() {
		return typeAccount;
	}
	public void setTypeAccount(String typeAccount) {
		this.typeAccount = typeAccount;
	}
	public Client getClientId() {
		return clientId;
	}
	public void setClientId(Client clientId) {
		this.clientId = clientId;
	}
	public String getDateOuverture() {
		return dateOuverture;
	}
	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	
	

}
