package fr.doranco.designpattern.facade;

public class SanoWeb {

	private SanoFacade facade;
	
	public void validerCommander(String commande) {
		
		// La facade me masque la complexit� de l'�change avec le middleware Sanofi.
		
		facade.traiterCommande(commande);
		
	}
	
}
