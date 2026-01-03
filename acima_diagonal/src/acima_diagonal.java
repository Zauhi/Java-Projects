import java.util.Scanner;
import java.util.Locale;

public class acima_diagonal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Locale.setDefault(Locale.US);

		int n;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		int somaAcimaDiagonal = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i < j) {
					somaAcimaDiagonal += mat[i][j];
				}
			}
		}
		System.out.println("Soma dos elementos acima da diagonal principal = " + somaAcimaDiagonal);
		
		sc.close();
	}
}