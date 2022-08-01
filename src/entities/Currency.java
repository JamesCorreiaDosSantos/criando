package entities;

public class Currency {

	public static final double IOF  =  6.0;
	
	public static double cotacao(double valorDolar, double valorReais) {
		
		double imposto = 0;
		
		imposto = valorDolar * valorReais;
		imposto = imposto * IOF / 100.0;
		
		return valorDolar * valorReais + imposto;
		
	}
	
	
}
