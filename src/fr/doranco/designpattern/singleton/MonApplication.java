package fr.doranco.designpattern.singleton;

public class MonApplication {
	
	private static ServiceGenerationPDF serviceGenerationPDF;
	
	public MonApplication() {
		
		if (serviceGenerationPDF == null)
			serviceGenerationPDF = new ServiceGenerationPDF();
		
	}
	
	public ServiceGenerationPDF obtenirServiceGenerationPDF() {
		return serviceGenerationPDF;
	}

}
