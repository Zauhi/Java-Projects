package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Rent[] room = new Rent[10];
		
		for (int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Rent #" + (i+1) + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			room[roomNumber] = new Rent(name, email, roomNumber);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i<room.length; i++) {
			if (room[i] != null) {
				System.out.println(room[i]);
			}
		}
		
		sc.close();
	}

}
