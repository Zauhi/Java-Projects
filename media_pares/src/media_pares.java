import java.util.Locale;
import java.util.Scanner;

public class media_pares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n, contPar, somaPar;
		double mediaPar;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextInt();
		}
		
		contPar = 0;
		for (int i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				contPar++;
			}
		}
		
		if (contPar > 0) {		
			somaPar = 0;
			for (int i = 0; i < n; i++) {
				if (vet[i] % 2 == 0) {
					somaPar = somaPar + vet[i];
				}
			}
			mediaPar = (double)somaPar / contPar;
			System.out.println("Média dos pares = " + String.format("%.1f", mediaPar));
		}
		else {
			System.out.println("Nenhum número par");
		}
		
		sc.close();
	}
}
