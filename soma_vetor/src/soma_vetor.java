import java.util.Scanner;
import java.util.Locale;

public class soma_vetor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n;
		double soma, media;
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();			
		}
		
		System.out.println();
		System.out.print("Valores = ");
		for (int i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", vet[i]) + " ");			
		}
		
		soma = 0;
		for (int i = 0; i < n; i++) {
			soma = soma + vet[i];			
		}
		System.out.println();
		System.out.println("Soma = " + String.format("%.2f", soma));
				
		media = soma / n;
		System.out.println("Média = " + String.format("%.2f", media));
		
		sc.close();
	}

}
