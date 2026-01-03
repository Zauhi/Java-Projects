import java.util.Scanner;
import java.util.Locale;

public class alturas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		
		int n, cont16;
		double somaAltura, mediaAltura, percen16;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		somaAltura = 0;
		for (int i = 0; i < n; i++) {
			somaAltura = somaAltura + altura[i];
		}
		mediaAltura = somaAltura / n;
		System.out.println();
		System.out.println("Altura média: " + String.format("%.2f", mediaAltura));
		
		cont16 = 0;
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				cont16++;
			}
		}
		percen16 = (double)cont16 / n * 100;
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", percen16) + "%");
		
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
	}

}
