import java.util.Scanner;
import java.util.Locale;

public class dados_pessoas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		
		int n;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Gênero da " + (i+1) + "a pessoa: ");
			genero[i] = sc.next().charAt(0);
		}
		
		double menorAlt = altura[0];
		for (int i = 0; i < n; i++) {
			if (menorAlt > altura[i]) {
				menorAlt = altura[i];
			}
		}
		System.out.println("Menor altura = " + String.format("%.2f", menorAlt));
		
		double maiorAlt = altura[0];
		for (int i = 0; i < n; i++) {
			if (maiorAlt < altura[i]) {
				maiorAlt = altura[i];
			}
		}
		System.out.println("Maior altura = " + String.format("%.2f", maiorAlt));
		
		double somaF = 0;
		double contF = 0;
		for (int i = 0; i < n; i++) {
			if (genero[i] == 'F') {
				somaF += altura[i];
				contF++;
			}
		}
		double media = (somaF / contF);
		System.out.println("Média das alturas das mulheres = " + String.format("%.2f", media));
		
		int somaM = 0;
		for (int i = 0; i < n; i++) {
			if (genero[i] == 'M') {
				somaM++;
			}
		}
		System.out.println("Número de homens = " + somaM);
		
		sc.close();
	}

}
