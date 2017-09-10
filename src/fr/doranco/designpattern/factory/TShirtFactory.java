package fr.doranco.designpattern.factory;

public class TShirtFactory {

	public static TShirt newInstance(String texte) {
		
		TShirt nouveauTShirt = new TShirt();
		nouveauTShirt.setTexte(texte);
		
		// Ma r�gle m�tier arbitraire.
		
		nouveauTShirt.setCouleur(String.valueOf(Math.random()));
		
		return nouveauTShirt;
	}
	
}
