package entities;

public class Fisica extends TaxPayer{

	private double saude;
	
	public Fisica() {
		
	}

	

	public Fisica(String name, Double anual, double saude) {
		super(name, anual);
		this.saude = saude;
	}



	public double getSaude() {
		return saude;
	}

	public void setSaude(double saude) {
		this.saude = saude;
	}

	@Override
	public double tax() {
		
		if ( getAnual() < 20000.00 ) {
			
			double desconto = 0;
			if(saude > 0) {
				desconto = saude / 2;
			}
			 return  getAnual() * 0.15 - desconto;
			 
			 
		}	else  {
			
			double desconto = 0;
			if(saude > 0) {
				desconto = saude / 2;
			}
			
			return  getAnual() * 0.25 - desconto;
		}
		

	}
	
	
	
}
