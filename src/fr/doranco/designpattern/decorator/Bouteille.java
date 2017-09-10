package fr.doranco.designpattern.decorator;

public class Bouteille {
	
	/*
	 * Au lieu de spécialiser une bouteille en utilisant l'héritage,
	 * j'utilise le design pattern Decorator.
	 * J'intègre une variable de membre Contenant à ma Bouteille,
	 * et lui délégue tout traitement commun.
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
		
		// Je dois implémenter moi même l'algorithme d'ouverture.
	}
	
	public void fermer() {
		
		// Je dois implémenter moi même l'algorithme de fermeture.
	}

}
