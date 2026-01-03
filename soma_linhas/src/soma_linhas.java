import java.util.Scanner;
import java.util.Locale;

public class soma_linhas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Locale.setDefault(Locale.US);

		int m, n;
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		m = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		n = sc.nextInt();

		double[][] mat = new double[m][n];
		
		for (int i = 0; i < m; i++) {
			System.out.println("Digite os elementos da " + (i + 1) + "a linha: ");
			for (int j = 0; j < n; j++) {			
				mat[i][j] = sc.nextDouble();
			}
		}
		
		double[] soma = new double[m];
		
		System.out.println("Vetor gerado: ");
		for (int i = 0; i < m; i++) {
			soma[i] = 0;
			for (int j = 0; j < n; j++) {
				soma[i] += mat[i][j];
			}
			
			System.out.println(String.format("%.1f", soma[i]));
		}
		
		sc.close();
	}
}