package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		product.setName("Computer");
		product.setPrice(900);
		
		System.out.println(product);
		
		System.out.print("Enter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());
		
		System.out.println("Updated data: " + product);
		
		System.out.println("Enter the number of products to be removed from stock: ");
		product.removeProducts(sc.nextInt());
		
		System.out.println("Updated data: " + product);
		sc.close();
	}
}