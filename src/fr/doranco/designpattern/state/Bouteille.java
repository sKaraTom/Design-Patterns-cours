package fr.doranco.designpattern.state;

public class Bouteille {

	private Double contenance;
	
	private EtatBouteille etat;

	public Double getContenance() {
		return contenance;
	}

	public void setContenance(Double contenance) {
		this.contenance = contenance;
	}

	public EtatBouteille getEtat() {
		return etat;
	}

	public void setEtat(EtatBouteille etat) {
		this.etat = etat;
	}
	
}
