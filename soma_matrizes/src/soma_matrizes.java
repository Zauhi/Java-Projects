import java.util.Scanner;
import java.util.Locale;

public class soma_matrizes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Locale.setDefault(Locale.US);

		int m, n;
		
		System.out.print("Quantas linhas vai ter cada matriz? ");
		m = sc.nextInt();
		System.out.print("Quantas colunas vai ter cada matriz? ");
		n = sc.nextInt();
		
		int[][] A = new int[m][n];
		int[][] B = new int[m][n];
		int[][] C = new int[m][n];
		
		System.out.println("Digite os valores da matriz A:");
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				A[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite os valores da matriz B:");
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				B[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matriz soma:");
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				C[i][j] = A[i][j] + B[i][j];
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}