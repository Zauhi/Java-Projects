package entities;

public class BrazilInterestService extends AbstractInternetService implements InterestService {

	private static final double INTEREST_RATE = 0.02; 
	
	@Override
	public double getInterestRate() {
		return INTEREST_RATE;
	}
}
