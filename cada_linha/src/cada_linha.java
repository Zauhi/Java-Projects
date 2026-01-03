import java.util.Scanner;
import java.util.Locale;

public class cada_linha {

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
		
		System.out.println("Maior elemento de cada linha:");
		
		for (int i = 0; i < n; i++) {
			int maior = mat[i][0];
			for (int j = 1; j < n; j++) {
				if (maior < mat[i][j]) {
					maior = mat[i][j];
				}
			}
			System.out.println(maior);
		}
		
		sc.close();
	}
}