package fr.doranco.designpattern.factory;

public class MonMagasinDeTShirt {
	
	public void produireDesTShirts() {
		
		for (int i = 0 ; i < 100 ; i++) {
			TShirt.newInstance("TEXTE");
		}
		
	}

}
