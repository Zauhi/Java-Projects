package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;
	
	public Company() {
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployee() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployee(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public double tax() {
		double fee = 0.16;
		
		if (numberOfEmployees > 10) {
			fee = 0.14;
		}
		
		return getAnualIncome() * fee;
	}
}
