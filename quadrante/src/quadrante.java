import java.util.Scanner;

public class quadrante
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite os valores das coordenadas X e Y:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != 0 && y != 0) {
		    if (x > 0 && y > 0) {
		        System.out.println("Quadrante Q1");
		    }
		    else if (x < 0 && y < 0) {
		        System.out.println("Quadrante Q3");
		    }
		    else if (x > 0) {
		        System.out.println("Quadrante Q4");
		    }
		    else {
		        System.out.println("Quadrante Q2");
		    }
		    
		    System.out.println("Digite os valores das coordenadas X e Y:");
	    	x = sc.nextInt();
	    	y = sc.nextInt();
		}
		sc.close();
	}
}