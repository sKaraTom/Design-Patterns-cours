package fr.doranco.designpattern.command;

public class Main {

	public static void main(String[] args) {
		
		Bouteille vittel = new Bouteille();
		Bouteille evian = new Bouteille();
		
		AbstractBouteilleCommande commande1 =
				new VidageBouteilleCommande(vittel);
		
		AbstractBouteilleCommande commande2 =
				new RemplissageBouteilleCommande(vittel, 10d);
		
		commande1.executer();
		commande2.executer();

	}

}
