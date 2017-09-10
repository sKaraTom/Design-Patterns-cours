package fr.doranco.designpattern.dao;

public class CommandeDao {

	// Une source de donn�e
	private String connexionBdD;
	
	// Une seconde source de donn�e
	private String cheminFichier;
	
	// Create
	public String creer(Commande commande) {
		
		// Comment se connecter � une source de donn�e ?
		// Comment enregistrer une commande dans la source de donn�e ?
		// Comment confirmer aupr�s du client, la cr�ation ?
		return null;
	}
	
	// Read
	public Commande charger(String identifiant) {
		return null;
	}
	
	// Update
	public void modifier(Commande commande) {
		
	}
	
	// Delete
	public void supprimer(String identifiant) {
		
	}
	
}
