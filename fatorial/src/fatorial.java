import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, fatorial;
		
		System.out.print("Digite o valor de N: ");
		n = sc.nextInt();
		
		fatorial = 1;
		for (int i = 1; i <= n; i++) {
			fatorial = fatorial * i;
		}
		
		System.out.print("Fatorial = " + fatorial);
		
		sc.close();
	}

}
