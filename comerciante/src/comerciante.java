import java.util.Scanner;
import java.util.Locale;

public class comerciante {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		
		int n;
		
		System.out.print("Serão digitados dados de quantos produtos? ");
		n = sc.nextInt();
		
		String[] produto = new String[n];
		double[] precoCompra = new double[n];
		double[] precoVenda = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Produto " + (i + 1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			produto[i] = sc.nextLine();
			System.out.print("Preço de compra: ");
			precoCompra[i] = sc.nextDouble();
			System.out.print("Preço de venda: ");
			precoVenda[i] = sc.nextDouble();
		}
		
		double lucroProduto;
		int abaixo = 0;
		int entre = 0;
		int acima = 0;
		
		for (int i = 0; i < n; i++) {
			lucroProduto = (precoVenda[i] - precoCompra[i]) / precoCompra[i];
			
			if (lucroProduto < 0.1) {
				abaixo++;
			}
			else if (lucroProduto <= 0.2) {
				entre++;
			}
			else {
				acima++;
			}
		}
		
		System.out.println("Relatório:");
		System.out.println("Lucro abaixo de 10%: " + abaixo);
		System.out.println("Lucro entre 10% e 20%: " + entre);
		System.out.println("Lucro acima de 20%: " + acima);
		
		double totalCompra = 0;
		double totalVenda = 0;
		for (int i = 0; i < n; i++) {
			totalCompra += precoCompra[i];
			totalVenda += precoVenda[i];
		}
		double totalLucro = totalVenda - totalCompra;
		System.out.println("Valor total de compra: " + String.format("%.2f", totalCompra));
		System.out.println("Valor total de venda: " + String.format("%.2f", totalVenda));
		System.out.println("Lucro total: " + String.format("%.2f", totalLucro));
		sc.close();
	}

}
