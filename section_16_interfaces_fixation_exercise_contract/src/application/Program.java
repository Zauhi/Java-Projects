package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter contract data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();
		
		Contract c1 = new Contract(number, date, totalValue);
		
		System.out.print("Enter number of installments: ");
		int n = sc.nextInt();
		
		ContractService service = new ContractService(new PaypalService());
		
		service.processContract(c1, n);
		
		System.out.println("Installments:");
		for(Installment x : c1.getInstallments()) {
			System.out.println(x);
		}
		
		sc.close();
	}

}
