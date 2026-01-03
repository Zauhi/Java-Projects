import java.util.Scanner;
import java.util.Locale;

public class abaixo_da_media {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		
		int n;
		double media, soma;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
		}
		
		soma = 0;
		for (int i = 0; i < n; i++) {
			soma = soma + vet[i];
		}
		media = soma / n;
		System.out.println();
		System.out.println("Média do vetor = " + String.format("%.3f", media));
		
		System.out.println("Elementos abaixo da média:");
		for (int i = 0; i < n; i++) {
			if (vet[i] < media) {
				System.out.println(String.format("%.1f", vet[i]));
			}
		}
		sc.close();
	}

}
