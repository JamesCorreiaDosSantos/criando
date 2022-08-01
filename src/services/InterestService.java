package services;

public interface InterestService{

	Double getInterestRate();
	
	default double payment(double amount, int months) {
		return amount * Math.pow(1.0 + getInterestRate() / 100.0,  months);
	}
	
}
