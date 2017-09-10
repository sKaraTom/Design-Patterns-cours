package fr.doranco.designpattern.strategy;

public class Bouteille extends AbstractContenant {

	public Bouteille() {
		super();
	}

	public Bouteille(Double contenance, Double contenu, boolean ouverture, OuvertureStrategy ouvertureStrategy) {
		super(contenance, contenu, ouverture, ouvertureStrategy);
	}
	
}
