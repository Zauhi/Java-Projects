package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PersonData;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people will be inserted? ");
		int n = sc.nextInt();
		
		PersonData[] person = new PersonData[n];
		
		for (int i=0; i<n; i++) {
			System.out.println(i+1 + ".person:");
			System.out.print("height: ");
			double height = sc.nextDouble();
			
			System.out.print("gender: ");
			char gender = sc.next().charAt(0);
			
			person[i] = new PersonData(height, gender);
		}
		
		int idxLowestHeight = 0;
		for (int i=1; i<n; i++) {
			if (person[idxLowestHeight].getHeight() > person[i].getHeight()) {
				idxLowestHeight = i;
			}
		}
		System.out.println("Lowest height = " + String.format("%.2f",person[idxLowestHeight].getHeight()));
		
		int idxHighestHeight = 0;
		for (int i=1; i<n; i++) {
			if (person[idxHighestHeight].getHeight() < person[i].getHeight()) {
				idxHighestHeight = i;
			}
		}
		System.out.println("Lowest height = " + String.format("%.2f",person[idxHighestHeight].getHeight()));
		
		double sumFemHeight = 0.0;
		int contFem = 0;
		for (int i=0; i<n; i++) {
			if (person[i].getGender() == 'F') {
				sumFemHeight += person[i].getHeight();
				contFem++;
			}
		}
		double femaleAvg = sumFemHeight / contFem;
		System.out.println("Female's average height = " + String.format("%.2f", femaleAvg));
		
		int contMan = 0;
		for (int i=0; i<n; i++) {
			if (person[i].getGender() == 'M') {
				contMan++;
			}
		}
		System.out.println("Number of mans: " + contMan);
		
		sc.close();
	}

}
