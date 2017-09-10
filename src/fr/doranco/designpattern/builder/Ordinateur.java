package fr.doranco.designpattern.builder;

public class Ordinateur {
	
	private String carteMere;
	
	private String carteGraphique;
	
	private String processeur;
	
	private Integer memoireVive;
	
	private Integer memoireDisque;

	public Ordinateur() {
		super();
	}
	
	public String getCarteMere() {
		return carteMere;
	}

	public void setCarteMere(String carteMere) {
		this.carteMere = carteMere;
	}

	public String getCarteGraphique() {
		return carteGraphique;
	}

	public void setCarteGraphique(String carteGraphique) {
		this.carteGraphique = carteGraphique;
	}

	public String getProcesseur() {
		return processeur;
	}

	public void setProcesseur(String processeur) {
		this.processeur = processeur;
	}

	public Integer getMemoireVive() {
		return memoireVive;
	}

	public void setMemoireVive(Integer memoireVive) {
		this.memoireVive = memoireVive;
	}

	public Integer getMemoireDisque() {
		return memoireDisque;
	}

	public void setMemoireDisque(Integer memoireDisque) {
		this.memoireDisque = memoireDisque;
	}

}