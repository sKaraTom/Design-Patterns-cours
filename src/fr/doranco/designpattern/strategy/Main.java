package fr.doranco.designpattern.strategy;

public class Main {

	public static void main(String[] args) {
		
		Bouteille vittel = new Bouteille(1d, 0d,
				false, new OuvertureSimpleStrategy());
		
		Bouteille javel = new Bouteille(1d, 0d,
				false, new OuvertureSecuriseStrategy());
		
		Bouteille concept = new Bouteille(1d, 0d,
				false, new OuvertureCapsuleStrategy());
		
		Canette coca = new Canette(0.75d, 0.d,
				false, new OuvertureCapsuleStrategy());
		
		// S'ouvre en tournant le bouchon.
		vittel.ouvrir();
		
		// S'ouvre en appuyant puis en tournant le bouchon.
		javel.ouvrir();
		
		// S'ouvre en decapsulant.
		coca.ouvrir();

	}

}
