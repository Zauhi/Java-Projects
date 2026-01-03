import java.util.Scanner;
import java.util.Locale;

public class aumento
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Locale.setDefault(Locale.US);
	    
	    double salario, aumento, novoSalario;
	    int percenAumento;
	    
	    System.out.print("Digite o salário da pessoa: ");
	    salario = sc.nextDouble();
	    
	    if (salario <= 1000) {
	        percenAumento = 20;
	    }
	    else if (salario <= 3000) {
	        percenAumento = 15;
	    }
	    else if (salario <= 8000) {
	        percenAumento = 10;
	    }
	    else {
	        percenAumento = 5;
	    }
	    
	    aumento = salario * percenAumento / 100;
	    novoSalario = salario + aumento;
	    
	    System.out.println("Novo salário = R$ " + String.format("%.2f", novoSalario));
	    System.out.println("Aumento = R$ " + String.format("%.2f", aumento));
	    System.out.print("Porcentagem = " + percenAumento + " %");
	    
	    sc.close();
	}   
}