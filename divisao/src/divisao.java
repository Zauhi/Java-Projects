import java.util.Scanner;
import java.util.Locale;

public class divisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n, numerador, denominador;
		double quociente;
		
		System.out.print("Quantos casos você vai digitar? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Entre com o numerador: ");
			numerador = sc.nextInt();
			System.out.print("Entre com o denominador: ");
			denominador = sc.nextInt();
			
			if (denominador == 0) {
				System.out.println("Divisão impossível.");
			}
			else {
			quociente = (double)numerador / denominador;
			System.out.println("Divisão = " + String.format("%.2f", quociente));
			}
		}
		sc.close();
	}

}
