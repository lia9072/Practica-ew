package preg2;

public class ArregloPesos {
	//atributo privado 
	private double[] peso = { 80.2, 75.6, 40.6, 90.8, 56.3, 70.1, 63.8, 20.4, 32.9, 90.2};
	
	//constructor 
	public  ArregloPesos() {
		
	}
	
	// metodo tama�o
	public int  tama�o() {
		return peso.length;
	}
	// metodo obtener
	public double  obtener(int i) {
		return peso[i];
	}
	// metodo edadPromedio
	public double pesoPromedio() {
		double suma=0;
		for(int i = 0; i< tama�o(); i++)
		 suma =+ peso[i]/10;
		
		return suma;
	}
	// metodo pesoMayor
	public double pesoMayor() {
		double mayor;
		mayor= peso[0];
		
		for(int i = 0; i< tama�o(); i++) {
			if(peso[i]>mayor) {
				mayor=peso[i];				
			}
		}
	return mayor;
	}
	
	//metodo cantMayoresPesoPromedio
	public double  cantMayoresPesoPromedio() {
		double mayorEdad;
	 	mayorEdad=peso[0];
	 for(int i = 0; i<tama�o(); i++) {
		 if(peso[i]>pesoPromedio())
			 return mayorEdad;
	 }
	 
	 return mayorEdad;
	}
		
	// metodo posPrimerPesoMayorA70
	public int posPrimerPesoMayorA70() {
		for (int i=0; i<tama�o(); i++)
			if (peso[i]>70)
				return i;
		return -1;
	}
	
}














