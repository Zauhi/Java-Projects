import java.util.Scanner;
import java.util.Locale;

public class matriz_geral {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Locale.setDefault(Locale.US);

		int n;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		double[][] mat = new double[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextDouble();
			}
		}
		
		System.out.println();
		
		double somaPositivo = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] > 0) {
					somaPositivo += mat[i][j];
				}
			}
		}
		System.out.println("Soma dos positivos: " + String.format("%.1f", somaPositivo));
		
		System.out.println();
		int linha = 0;
		System.out.print("Escolha uma linha: ");
		linha = sc.nextInt();
		System.out.print("Linha escolhida: ");
		for (int i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", mat[linha][i]) + " ");
		}
		
		System.out.println();
		System.out.println();
		int coluna = 0;
		System.out.print("Escolha uma coluna: ");
		coluna = sc.nextInt();
		System.out.print("Coluna escolhida: ");
		for (int i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", mat[i][coluna]) + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.print("Diagonal principal: ");
		for (int i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", mat[i][i]) + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Matriz alterada:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					mat[i][j] = Math.pow(mat[i][j], 2);
				}
				
				System.out.print(String.format("%.1f", mat[i][j]) + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}