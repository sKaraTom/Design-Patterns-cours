package fr.doranco.designpattern.strategy;

/**
 * Un contenant abstrait
 */
public abstract class AbstractContenant {

	private Double contenance;
	
	private Double contenu;
	
	private boolean ouverture;
	
	private OuvertureStrategy ouvertureStrategy;
	
	public AbstractContenant() {
		super();
	}

	public AbstractContenant(Double contenance, Double contenu,
			boolean ouverture, OuvertureStrategy ouvertureStrategy) {
		super();
		this.contenance = contenance;
		this.contenu = contenu;
		this.ouverture = ouverture;
		this.ouvertureStrategy = ouvertureStrategy;
	}

	public Double getContenance() {
		return contenance;
	}

	public void setContenance(Double contenance) {
		this.contenance = contenance;
	}

	public Double getContenu() {
		return contenu;
	}

	public void setContenu(Double contenu) {
		this.contenu = contenu;
	}

	public boolean isOuverture() {
		return ouverture;
	}

	public void setOuverture(boolean ouverture) {
		this.ouverture = ouverture;
	}
	
	public void ouvrir() {
		this.ouvertureStrategy.ouvrir();
	}
	
}
