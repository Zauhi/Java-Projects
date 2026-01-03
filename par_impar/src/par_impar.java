import java.util.Scanner;

public class par_impar
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, x;
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
		    System.out.print("Digite um número: ");
		    x = sc.nextInt();
		    
		    if (x == 0) {
		        System.out.println("Nulo");
		    }
		    else if (x > 0 && x % 2 == 0) {
		        System.out.println("Par positivo");
		    }
		    else if (x < 0 && x % 2 != 0) {
		        System.out.println("Impar negativo");
		    }
		    else if (x > 0) {
		        System.out.println("Impar positivo");
		    }
		    else {
		        System.out.println("Par negativo");
		    }
		}
		sc.close();
	}
}