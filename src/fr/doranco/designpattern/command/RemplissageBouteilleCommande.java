package fr.doranco.designpattern.command;

public class RemplissageBouteilleCommande extends AbstractBouteilleCommande {

	protected Double quantite;
	
	public RemplissageBouteilleCommande(Bouteille bouteille, Double quantite) {
		super(bouteille);
		this.quantite = quantite;
	}

	@Override
	public void executer() {
		this.bouteille.remplir(quantite);
	}

}
