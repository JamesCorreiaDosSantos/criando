package entities;

import services.InterestService;

public class Usa implements InterestService{

	private Double interestRate;
	
	public Usa() {
		
	}
	
	

	public Usa(Double interestRate) {
		this.interestRate = interestRate;
	}


	@Override
	public Double getInterestRate() {
		return interestRate;
	}
	

	
}
