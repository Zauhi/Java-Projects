package entities;

public class UsInterestService extends AbstractInternetService implements InterestService {

	private static final double INTEREST_RATE = 0.01;

	@Override
	public double getInterestRate() {
		return INTEREST_RATE;
	}
}
