package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();
		System.out.println("End of program.");

	}
	
	public static void method1() {
		System.out.println("***Method 1 Starting***");
		method2();
		System.out.println("***Method 1 End***");
	}
	
	public static void method2() {
		System.out.println("***Method 2 Starting***");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (InputMismatchException e) {
			System.out.println("Input error!");
			e.printStackTrace();
			sc.next();
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			sc.next();
		}
		
		sc.close();
		System.out.println("***Method 2 End***");
	}

}