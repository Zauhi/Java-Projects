package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> taxPayers = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			
			System.out.print("Individual or company (i/c)? ");
			char response = sc.next().charAt(0);
			
			while (response != 'i' && response != 'c') {
				System.out.println("Try again:");
				System.out.print("Individual or company (i/c)? ");
				response = sc.next().charAt(0);
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if (response == 'i') {
				System.out.print("Health expenditures: ");
				double medicalExpenses = sc.nextDouble();
				
				taxPayers.add(new Individual(name, anualIncome, medicalExpenses));
			}
			else if (response == 'c') {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				
				taxPayers.add(new Company(name, anualIncome, numberOfEmployees));
			}	
		}
		
		double sumTaxes = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer tp : taxPayers) {
			sumTaxes += tp.tax();
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
		}
		
		System.out.println();
		System.out.print("TOTAL TAXES: $ " + String.format("%.2f", sumTaxes));
		
		sc.close();
	}

}
