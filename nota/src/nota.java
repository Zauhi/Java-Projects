import java.util.Scanner;
import java.util.Locale;

public class nota
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Locale.setDefault(Locale.US);
	    
	    double nota1, nota2, soma;
	    
	    System.out.print("Digite a primeira nota: ");
	    nota1 = sc.nextDouble();
	    
	    System.out.print("Digite a segunda nota: ");
	    nota2 = sc.nextDouble();
	    
	    soma = nota1 + nota2;
	    
	    System.out.println("Nota final = " + String.format("%.1f", soma));
	    
	    if (soma < 60) {
	        System.out.print("Reprovado");
	    }
	    sc.close();
	}
}