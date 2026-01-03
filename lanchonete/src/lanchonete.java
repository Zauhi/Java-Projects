import java.util.Scanner;
import java.util.Locale;

public class lanchonete
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Locale.setDefault(Locale.US);
	    
	    int codigo, qtd;
	    double pagamento;
	    
	    System.out.print("Código do produto comprado: ");
	    codigo = sc.nextInt();
	    
	    System.out.print("Quantidade comprada: ");
	    qtd = sc.nextInt();
	    
	    if (codigo == 1) {
	        pagamento = 5.0 * qtd;
	    }
	    else if (codigo == 2) {
	        pagamento = 3.5 * qtd;
	    }
	    else if (codigo == 3) {
	        pagamento = 4.8 * qtd;
	    }
	    else if (codigo == 4) {
	        pagamento = 8.9 * qtd;
	    }
	    else {
	        pagamento = 7.32 * qtd;
	    }
	    
	    System.out.print("Valor a pagar: R$ " + String.format("%.2f", pagamento));
	    
	    sc.close();
	}   
}