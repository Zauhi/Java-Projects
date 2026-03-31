package entities;

public class Individual extends TaxPayer {

	private Double medicalExpenses;
	
	public Individual() {
	}

	public Individual(String name, Double anualIncome, Double medicalExpenses) {
		super(name, anualIncome);
		this.medicalExpenses = medicalExpenses;
	}

	public Double getMedicalExpenses() {
		return medicalExpenses;
	}

	public void setMedicalExpenses(Double medicalExpenses) {
		this.medicalExpenses = medicalExpenses;
	}
	
	public double tax() {
		double fee = 0.0;
		
		if (getAnualIncome() < 20000.0) {
			fee = 0.15;
		}
		else {
			fee = 0.25;
		}
		
		double deductFee = 0.0;
		if (medicalExpenses > 0.0) {
			deductFee = medicalExpenses * 0.5;
		}
		
		return getAnualIncome() * fee - deductFee;
	}
}
