import java.util.Scanner;
import java.util.Locale;

public class aprovados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		
		int n;
		double media;
		
		System.out.print("Quantos alunos serão digitados? ");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
			sc.nextLine();
			nome[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados: ");
		
		for (int i = 0; i < n; i++) {
			media = (nota1[i] + nota2[i]) / 2.0;
			if (media >= 6.0) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
	}

}
