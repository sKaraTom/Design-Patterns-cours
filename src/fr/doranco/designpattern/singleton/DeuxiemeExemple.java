package fr.doranco.designpattern.singleton;

public class DeuxiemeExemple {
	
	private static DeuxiemeExemple monSingleton;

	/*
	 * Je n'autorise pas les clients � instancier leurs propres DeuxiemeExemple,
	 * je les force � utiliser la m�thode d'obtention du singleton.
	 */
	private DeuxiemeExemple() {
		super();
	}
	
	public DeuxiemeExemple obtenirMonDeuxiemeExemple() {
		
		/*
		 * Si je suis le premier client � demander mon deuxi�me exemple,
		 * le deuxi�me exemple sera initialis�.
		 * Sinon je r�cup�re celui que le premier client � initialis�.
		 */
		if (monSingleton == null)
			monSingleton = new DeuxiemeExemple();
		
		return monSingleton;
	}

}
