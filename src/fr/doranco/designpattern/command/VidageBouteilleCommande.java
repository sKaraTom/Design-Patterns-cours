package fr.doranco.designpattern.command;

public class VidageBouteilleCommande extends AbstractBouteilleCommande {

	public VidageBouteilleCommande(Bouteille bouteille) {
		super(bouteille);
	}

	@Override
	public void executer() {
		this.bouteille.vider();
	}

}
