import java.util.Scanner;
import java.util.Locale;

public class baskara
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Locale.setDefault(Locale.US);
	    
	    double a, b, c, x1, x2, delta;
	    
	    System.out.print("Coeficiente a: ");
	    a = sc.nextDouble();
	    
	    System.out.print("Coeficiente b: ");
	    b = sc.nextDouble();
	    
	    System.out.print("Coeficiente c: ");
	    c = sc.nextDouble();
	    
	    delta = Math.pow(b, 2) - 4 * a * c;
	    
	    if (delta < 0 || c == 0) {
	        System.out.print("Esta equação não possui raízes reais.");
	    }
	    else if (delta == 0) {
	        x1 = (-b + Math.sqrt(delta)) / (2 * a);
	        System.out.print("X = " + String.format("%.4f", x1));
	    }
	    else {
	        x1 = (-b + Math.sqrt(delta)) / (2 * a);
	        x2 = (-b - Math.sqrt(delta)) / (2 * a);
	        System.out.println("X1 = " + String.format("%.4f", x1));
	        System.out.print("X2 = " + String.format("%.4f", x2));
	    }
	    sc.close();
	}
}