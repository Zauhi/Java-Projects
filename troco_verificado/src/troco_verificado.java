import java.util.Scanner;
import java.util.Locale;

public class troco_verificado
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Locale.setDefault(Locale.US);
	    
	    double produtoPreco, recebido, troco;
	    int qtd;
	    
	    System.out.print("Preço unitário do produto: ");
	    produtoPreco = sc.nextDouble();
	    
	    System.out.print("Quantidade comprada: ");
	    qtd = sc.nextInt();
	    
	    System.out.print("Dinheiro recebido: ");
	    recebido = sc.nextDouble();
	    
	    troco = recebido - produtoPreco * qtd;
	    
	    if (troco < 0) {
	        System.out.print("Dinheiro insuficiente. Faltam " + String.format("%.2f",(-troco)) + " reais.");
	    }
	    else if (troco == 0){
	        System.out.print("Dinheiro suficiente, sem troco.");
	    }
	    else {
	        System.out.print("Troco = " + String.format("%.2f", troco));
	    }
	    sc.close();
	}
}