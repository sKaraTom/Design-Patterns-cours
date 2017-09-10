package fr.doranco.designpattern.singleton;

public class DeuxiemeExemple {
	
	private static DeuxiemeExemple monSingleton;

	/*
	 * Je n'autorise pas les clients à instancier leurs propres DeuxiemeExemple,
	 * je les force à utiliser la méthode d'obtention du singleton.
	 */
	private DeuxiemeExemple() {
		super();
	}
	
	public DeuxiemeExemple obtenirMonDeuxiemeExemple() {
		
		/*
		 * Si je suis le premier client à demander mon deuxième exemple,
		 * le deuxième exemple sera initialisé.
		 * Sinon je récupère celui que le premier client à initialisé.
		 */
		if (monSingleton == null)
			monSingleton = new DeuxiemeExemple();
		
		return monSingleton;
	}

}
