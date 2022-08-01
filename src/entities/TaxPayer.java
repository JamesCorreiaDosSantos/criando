package entities;

public abstract class TaxPayer {

	private String name;
	private Double anual;
	
	public TaxPayer() {
		
	}
	
	

	public TaxPayer(String name, Double anual) {
		super();
		this.name = name;
		this.anual = anual;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnual() {
		return anual;
	}

	public void setAnual(Double anual) {
		this.anual = anual;
	}

	public abstract double tax();
	
	public String toString() {
		return name + ": $ " + tax();
	}
	
}
