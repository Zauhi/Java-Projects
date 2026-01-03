import java.util.Scanner;
import java.util.Locale;

public class media_idades
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int x, soma, cont;
		double media;

		System.out.println("Digite as idades:");
		x = sc.nextInt();

		soma = 0;
		cont = 0;
		if (x >= 0) {
			while (x >= 0) {
				cont++;
				soma = soma + x;
				x = sc.nextInt();
			}
			media = (double)soma / cont;
			System.out.println("Média = " + String.format("%.2f", media));
		}
		else {
			System.out.println("Impossível calcular");
		}
		sc.close();
	}
}