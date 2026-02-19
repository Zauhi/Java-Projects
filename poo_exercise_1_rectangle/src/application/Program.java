package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;
//Reads a rectangle's width and height, then returns its area, perimeter and diagonal
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.println("AREA = " + String.format("%.2f", rect.Area()));
		System.out.println("PERIMETER = " + String.format("%.2f", rect.Perimeter()));
		System.out.println("DIAGONAL = " + String.format("%.2f", rect.Diagonal()));
		
		sc.close();
	}

}
