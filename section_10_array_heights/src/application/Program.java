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

		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + " person's data:");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Age: ");
			int age = sc.nextInt();

			System.out.print("Height: ");
			double height = sc.nextDouble();

			person[i] = new Person(name, age, height);
		}

		double sumHeight = 0.0;
		for (int i = 0; i < n; i++) {

			sumHeight += person[i].getHeight();
		}

		double avgHeight = sumHeight / n;
		System.out.println();
		System.out.println("Average height: " + String.format("%.2f", avgHeight));

		int under16YearsOld = 0;
		for (int i = 0; i < n; i++) {
			if (person[i].getAge() < 16) {
				under16YearsOld++;
			}
		}
		double percUnder16YearsOld = under16YearsOld * 100.0 / n ; // keep division at last, otherwise it results 0.0
		System.out.println("People under 16 years old: " + String.format("%.1f%%", percUnder16YearsOld));

		for (int i = 0; i < n; i++) {
			if (person[i].getAge() < 16) {
				System.out.println(person[i].getName());
			}
		}

		sc.close();
	}

}
