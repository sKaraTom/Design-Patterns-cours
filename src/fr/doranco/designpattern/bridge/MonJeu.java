package fr.doranco.designpattern.bridge;

public class MonJeu {

	private MonBridge monBridge;
	
	public void rendreScene() {
		
		monBridge.dessiner(new Rond());
		monBridge.dessiner(new Carre());
		monBridge.dessiner(new Triangle());
		
	}
	
}
