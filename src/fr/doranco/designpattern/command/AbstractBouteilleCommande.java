package fr.doranco.designpattern.command;

public abstract class AbstractBouteilleCommande {

	protected Bouteille bouteille;
	
	public AbstractBouteilleCommande(Bouteille bouteille) {
		super();
		this.bouteille = bouteille;
	}
	
	public abstract void executer();
	 
}
