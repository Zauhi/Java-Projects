package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many students will be inserted? ");
		int n = sc.nextInt();

		Student[] student = new Student[n];

		for (int i=0; i<n; i++) {
			System.out.println((i+1) + ". student's name, 1st grade and 2nd grade:");
			sc.nextLine();
			String name = sc.nextLine();
			double grade1 = sc.nextDouble();
			double grade2 = sc.nextDouble();
			
			student[i] = new Student(name, grade1, grade2);
		}
		
		System.out.println("Approved students:");
		
		for (int i=0; i<n; i++) {
			double avgGrade = (student[i].getGrade1() + student[i].getGrade2()) / 2; 
			
			if (avgGrade >= 6.0) {
				System.out.println(student[i].getName());
			}
		}
		 
		sc.close();
	}

}
