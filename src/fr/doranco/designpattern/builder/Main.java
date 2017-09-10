package fr.doranco.designpattern.builder;

public class Main {
	
	public static void main(String[] args) {
		
		// Une utilisation de mon builder d'Ordinateur.
		
		final OrdinateurBuilder jojo = new OrdinateurBuilder("AMD", "RYZEN");
		
		try {
			Ordinateur monOrdinateurAmoi = jojo.build();
		} catch (Exception e) {
			// Je peux r�agir aux cas alternatifs de la construction de mon PC.
		}
		
		
		// Une utilisation d'un builder pr�-�cris.
		
		StringBuilder sb = new StringBuilder();
		
		final String maSuperStringConcatenee = sb.append("toto")
			.append("Salut2 !")
			.append("Toto2")
			.append("Salut!")
			.toString();
	}

}
