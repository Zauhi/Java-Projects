package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double FinalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public String CheckIfPass() {
		double goal = 60.0;
		
		if (FinalGrade() >= goal) {
			return "PASS";
		}
		
		else {
			double missPoints = goal - FinalGrade();
			
			return "FAILED\n"
					+ "MISSING "
					+ String.format("%.2f", missPoints)
					+ " POINTS";
		}
	}
}
