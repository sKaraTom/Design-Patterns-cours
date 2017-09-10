package fr.doranco.designpattern.facade;

public class SanoWeb {

	private SanoFacade facade;
	
	public void validerCommander(String commande) {
		
		// La facade me masque la complexité de l'échange avec le middleware Sanofi.
		
		facade.traiterCommande(commande);
		
	}
	
}
