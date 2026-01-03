import java.util.Scanner;
import java.util.Locale;

public class temperatura
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Locale.setDefault(Locale.US);
	    
	    char T;
	    double C, F;
	    
	    System.out.print("Você vai digitar a temperatura em qual escala(C/F)? ");
	    T = sc.next().charAt(0);
	    
	    if (T == 'F') {
	        System.out.print("Digite a temperatura em Fahrenheit: ");
	        F = sc.nextDouble();
	        
	        C = 5.0 / 9.0 * (F - 32.0);
	        System.out.print("Temperatura equivalente em Celsius: " + String.format("%.2f", C));
	    }
	    else {
	        System.out.print("Digite a temperatura em Celsius: ");
	        C = sc.nextDouble();
	        
	        F = C * 9.0 / 5.0 + 32.0;
	        System.out.print("Temperatura equivalente em Fahrenheit: " + String.format("%.2f", F));
	    }
	    sc.close();
	}
}