package fr.doranco.designpattern.state;

public class Main {
	
	public static void main(String[] args) {
		
		Bouteille bouteille = new Bouteille();
		
		EtatBouteille etatBouteille = bouteille.getEtat();
		
		EtatBouteilleOuverte etatOuverte = (EtatBouteilleOuverte) etatBouteille;
		
		etatOuverte.remplir(0.2d);
		etatOuverte.vider(0.3d);
		etatOuverte.fermer();
		
	}

}
