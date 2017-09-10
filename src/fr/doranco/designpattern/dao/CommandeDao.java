package fr.doranco.designpattern.dao;

public class CommandeDao {

	// Une source de donnée
	private String connexionBdD;
	
	// Une seconde source de donnée
	private String cheminFichier;
	
	// Create
	public String creer(Commande commande) {
		
		// Comment se connecter à une source de donnée ?
		// Comment enregistrer une commande dans la source de donnée ?
		// Comment confirmer auprès du client, la création ?
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
