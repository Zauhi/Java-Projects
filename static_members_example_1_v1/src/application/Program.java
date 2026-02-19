package application;

import java.util.Locale;
import java.util.Scanner;

/*
 *  Reads a radius, then returns the circumference and volume based on this, and PI's value
 */

public class Program {
	
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		System.out.println("Circumference: " + String.format("%.2f", Circumference(radius)));
		System.out.println("Volume: " + String.format("%.2f", Volume(radius)));
		System.out.println("PI value: " + String.format("%.2f", PI));
	
		sc.close();
	}
	
	public static double Circumference(double radius) {
		return 2.0 * PI * radius; 
	}
	
	public static double Volume(double radius) {
		return 4.0 / 3.0 * PI * Math.pow(radius, 3);
	}
}
