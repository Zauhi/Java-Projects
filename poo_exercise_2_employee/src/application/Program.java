package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
/*
 * Program to manage an employee's data.
 * Reads name, gross salary and tax, calculates and display net salary,
 * applies percentage increase in its gross salary, then shows the update
 */
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		employee.GrossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.Tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.print("Updated data: " + employee);
		
		sc.close();
	}
}
