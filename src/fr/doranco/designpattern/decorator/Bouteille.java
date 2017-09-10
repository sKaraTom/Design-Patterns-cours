package fr.doranco.designpattern.decorator;

public class Bouteille {
	
	/*
	 * Au lieu de sp�cialiser une bouteille en utilisant l'h�ritage,
	 * j'utilise le design pattern Decorator.
	 * J'int�gre une variable de membre Contenant � ma Bouteille,
	 * et lui d�l�gue tout traitement commun.
	 */
	private Contenant delegue;
	
	public void remplir() {
		
		this.delegue.remplir();
	}
	
	public void vider() {
		
		String toto = "TOTO";
		this.delegue.vider();
	}
	
	public void ouvrir() {
		
		// Je dois impl�menter moi m�me l'algorithme d'ouverture.
	}
	
	public void fermer() {
		
		// Je dois impl�menter moi m�me l'algorithme de fermeture.
	}

}
