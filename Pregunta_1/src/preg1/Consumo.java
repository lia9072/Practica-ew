package preg1;

public class Consumo {
	// atributos privados
	private int boleta;
	private String detalle;
	private double pago;
	
	// variables privadas
	private static int  contarObejetos;
	private static double acumularPagos;
	//inicializacion 
	static{
		contarObejetos =0;
		acumularPagos =0;
	}
	// constructor 
	public  Consumo(int bol, String det, double pa ) {
		this.boleta = bol; this.detalle = det; this.pago = pa;
		contarObejetos++;
		acumularPagos = acumularPagos + pago; 
	}
	
	// metodos con set 
	public void setboleta( int bol) {
		this.boleta = bol;
	}
	public void setdetalle(String det) {
		this.detalle = det;
	}
	public void setpago( double pa) {
		this.pago = pa;
	}
	
	//metodos con get
	
	public int getboleta( ) {
		return boleta ;
	}
	public String  getdetalle() {
		return detalle ;
	}
	public double getpago() {
		return pago ;
	}

	// metodos set y get para las variables 
	
	public static void setcantO(int ca) {
		Consumo.contarObejetos = ca;
	}
	public static void setaculador( double acu) {
		Consumo.acumularPagos = acu;
	}
	
	
	public static int setcantO() {
		return contarObejetos ;
	}
	public static double setaculador( ) {
		return acumularPagos;
	}
	
	
	
}




















