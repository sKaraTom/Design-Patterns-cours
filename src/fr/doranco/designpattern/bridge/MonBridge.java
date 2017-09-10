package fr.doranco.designpattern.bridge;

public class MonBridge {
	
	private CarteGraphique carteGraphique;

	private MonBridge(CarteGraphique carteGraphique) {
		super();
		this.carteGraphique = carteGraphique;
	}
	
	public void dessiner(Rond monRond) {
		this.carteGraphique.dessiner(new String[] {
				monRond.getCentre(),
				monRond.getRayon()
			});
	}
	
	public void dessiner(Carre monCarre) {
		this.carteGraphique.dessiner(monCarre.getCotes());
	}
	
	public void dessiner(Triangle monTriangle) {
		this.carteGraphique.dessiner(monTriangle.getSommets());
	}
	

}
