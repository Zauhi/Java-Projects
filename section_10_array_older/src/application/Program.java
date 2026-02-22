package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many people will be inserted? ");
		int n = sc.nextInt();

		Person[] person = new Person[n];

		for (int i=0; i<n; i++) {
			System.out.println((i + 1) + " person's data:");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Age: ");
			int age = sc.nextInt();
			
			person[i] = new Person(name, age);
		}
		
		int idxOlder = 0;
		for (int i=1; i<n; i++) {
			if (person[idxOlder].getAge() < person[i].getAge()) {
				idxOlder = i;
			}
		}
		
		System.out.println("Pessoa mais velha: " + person[idxOlder].getName());
		sc.close();
	}

}
