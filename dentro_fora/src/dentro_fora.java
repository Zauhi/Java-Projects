import java.util.Scanner;

public class dentro_fora
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, x, dentro, fora;
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		dentro = 0;
		for (int i = 0; i < n; i++) {
		    System.out.print("Digite um número: ");
		    x = sc.nextInt();
		    
		    if (x >= 10 && x <= 20) {
		        dentro++;
		    }
		}
		fora = n - dentro;
		
		System.out.println(dentro + " dentro");
		System.out.println(fora + " fora");
		sc.close();
	}
}