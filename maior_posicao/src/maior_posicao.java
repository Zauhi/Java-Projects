import java.util.Scanner;
import java.util.Locale;

public class maior_posicao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		
		int n, posicao;
		double maior;
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
		}
		
		maior = vet[0];
		posicao = 0;
		for (int i = 1; i < n; i++) {
			if (maior < vet[i]) {
				maior = vet[i];
				posicao = i;
			}
		}
		System.out.println();
		System.out.println("Maior valor = " + String.format("%.1f", maior));
		System.out.println("Posição do maior valor = " + posicao);
		
		sc.close();
	}

}
