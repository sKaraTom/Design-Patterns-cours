package fr.doranco.designpattern.strategy;

public class Canette extends AbstractContenant {

	public Canette() {
		super();
	}

	public Canette(Double contenance, Double contenu, boolean ouverture, OuvertureStrategy ouvertureStrategy) {
		super(contenance, contenu, ouverture, ouvertureStrategy);
	}
	
}
