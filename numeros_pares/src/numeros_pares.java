import java.util.Scanner;

public class numeros_pares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n, contPar;
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextInt();
		}
		
		contPar = 0;
		System.out.println();
		System.out.println("Números pares:");
		for (int i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
				contPar++;
			}
		}
		
		System.out.println();
		System.out.print("Quantidade de pares = " + contPar);
		
		sc.close();
	}

}
