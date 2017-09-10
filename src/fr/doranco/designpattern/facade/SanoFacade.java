package fr.doranco.designpattern.facade;

public class SanoFacade {

	private SanoStock sanoStock;
	
	public void traiterCommande(String commande) {
		
		this.sanoStock.acquiesserCommande(commande);
		this.sanoStock.payerCommande(commande);
		this.sanoStock.imprimerRecu(commande);
		this.sanoStock.preparerCommande(commande);
		
	}
	
}
