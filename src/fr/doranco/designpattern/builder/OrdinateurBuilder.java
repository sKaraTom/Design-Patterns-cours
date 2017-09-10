package fr.doranco.designpattern.builder;

public class OrdinateurBuilder {

	private String vendeurProcesseur;

	private String modeleProcesseur;

	public OrdinateurBuilder(String vendeur, String modele) {
		super();
		this.modeleProcesseur = modele;
		this.vendeurProcesseur = vendeur;
	}

	public Ordinateur build() throws Exception {

		final Ordinateur nouvelOrdinateur = new Ordinateur();

		nouvelOrdinateur.setProcesseur(modeleProcesseur + vendeurProcesseur);

		if (false) {
			throw new Exception();
		}

		return nouvelOrdinateur;
	}

}
