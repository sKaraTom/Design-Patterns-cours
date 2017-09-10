package fr.doranco.designpattern.factory;

public class TShirt {
	
	private String texte;
	
	private String couleur;

	TShirt() {
		super();
	}

	TShirt(String texte, String couleur) {
		super();
		this.texte = texte;
		this.couleur = couleur;
	}
	
	public static TShirt newInstance(String texte) {
		
		TShirt nouveauTShirt = new TShirt();
		nouveauTShirt.setTexte(texte);
		
		// Ma règle métier arbitraire.
		
		nouveauTShirt.setCouleur(String.valueOf(Math.random()));
		
		return nouveauTShirt;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

}
