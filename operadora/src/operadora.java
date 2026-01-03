import java.util.Scanner;
import java.util.Locale;

public class operadora
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Locale.setDefault(Locale.US);
	    
	    int duracao;
	    double pagamento;
	    
	    System.out.print("Digite a quantidade de minutos: ");
	    duracao = sc.nextInt();
	    
	    if (duracao > 100) {
	        pagamento = (50.0 + (duracao - 100) * 2.0);
	    }
	    else {
	        pagamento = 50.0;
	    }
	    
	    System.out.print("Valor a pagar: R$ " + String.format("%.2f", pagamento));
	    
	    sc.close();
	}
}