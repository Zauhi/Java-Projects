package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;
/*
	Reads student's name and 3 grades to check if it passed
*/
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
				
		System.out.print("Student's name: ");
		student.name = sc.nextLine();
		
		System.out.print("Grade 1: ");
		student.grade1 = sc.nextDouble();
		
		System.out.print("Grade 2: ");
		student.grade2 = sc.nextDouble();
		
		System.out.print("Grade 3: ");
		student.grade3 = sc.nextDouble();
		
		
		System.out.println();
		System.out.println("FINAL GRADE = " + student.FinalGrade());
		System.out.println(student.CheckIfPass());
		
		sc.close();
	}

}
