package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BrazilInterestService;
import entities.InterestService;
import entities.UsInterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		System.out.println();
		System.out.println("---Brazil---");
		InterestService serviceBR = new BrazilInterestService();
		double payment = serviceBR.payment(amount, months);
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));
		
		System.out.println();
		System.out.println("---US---");
		InterestService serviceUS = new UsInterestService();
		payment = serviceUS.payment(amount, months);
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));
		
		sc.close();
	}

}
