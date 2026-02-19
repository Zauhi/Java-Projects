package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

/*
 *  Reads a radius, then returns the circumference and volume based on this, and PI's value
 */

public class Program {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculator calc = new Calculator();
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		System.out.println("Circumference: " + String.format("%.2f", calc.Circumference(radius)));
		System.out.println("Volume: " + String.format("%.2f", calc.Volume(radius)));
		System.out.println("PI value: " + String.format("%.2f", calc.PI));
		
		sc.close();
	}

}
