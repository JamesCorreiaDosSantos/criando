package entities;

public class Juridica extends TaxPayer{

	public Integer empregados;
	
	public Juridica() {
		
	}

	

	public Juridica(String name, Double anual, Integer empregados) {
		super(name, anual);
		this.empregados = empregados;
	}




	public Integer getEmpregados() {
		return empregados;
	}

	public void setEmpregados(Integer empregados) {
		this.empregados = empregados;
	}

	@Override
	public double tax() {
		
		if(empregados > 10)	{
			return getAnual() * 0.14;
		}else {
			return getAnual() * 0.16;
		}
		
		
		
	}
	
	
	
}
