package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] product = new Product[n];
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			product[i] = new Product(name, price);
		}
		
		double soma = 0;
		for (int i=0; i<n; i++) {
			soma += product[i].getPrice();
		}
		
		double avg = soma / n;
		
		System.out.println("Average price = " + String.format("%.2f", avg));
		
		sc.close();
	}

}
