import java.util.Scanner;
import java.util.Locale;

public class experiencias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n, qtd, cobaias, coelhos, ratos, sapos;
		double percenC, percenR, percenS;
		char tipo;

		System.out.print("Quantos casos de teste serão digitados? ");
		n = sc.nextInt();

		coelhos = 0;
		ratos = 0;
		sapos = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Quantidade de cobaias: ");
			qtd = sc.nextInt();
			System.out.print("Tipo de cobaia: ");
			tipo = sc.next().charAt(0);

			if (tipo == 'C') {
				coelhos = coelhos + qtd;
			} else if (tipo == 'R') {
				ratos = ratos + qtd;
			} else {
				sapos = sapos + qtd;
			}
		}

		System.out.println("Relatório final:");

		cobaias = coelhos + ratos + sapos;
		System.out.println("Total: " + cobaias + " cobaias");
		System.out.println("total de coelhos: " + coelhos);
		System.out.println("total de ratos: " + ratos);
		System.out.println("total de sapos: " + sapos);

		percenC = (double) coelhos / cobaias * 100.0;
		percenR = (double) ratos / cobaias * 100.0;
		percenS = (double) sapos / cobaias * 100.0;
		System.out.println("Percentual de coelhos: " + String.format("%.2f", percenC));
		System.out.println("Percentual de ratos: " + String.format("%.2f", percenR));
		System.out.println("Percentual de sapos: " + String.format("%.2f", percenS));

		sc.close();
	}

}
