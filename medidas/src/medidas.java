import java.util.Scanner;
import java.util.Locale;

public class medidas
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Locale.setDefault(Locale.US);
	    
	    double A, B, C, areaQ, areaTri, areaTrap;
	    
	    System.out.print("Digite a medida A: ");
	    A = sc.nextDouble();
	    
	    System.out.print("Digite a medida B: ");
	    B = sc.nextDouble();
	    
	    System.out.print("Digite a medida C: ");
	    C = sc.nextDouble();
	    
	    areaQ = Math.pow(A, 2);
	    areaTri = A * B / 2;
	    areaTrap = (A + B) / 2 * C;
	    
	    System.out.println("Área do quadrado = " + String.format("%.4f", areaQ));
	    System.out.println("Área do triângulo = " + String.format("%.4f", areaTri));
	    System.out.print("Área do trapézio = " + String.format("%.4f", areaTrap));
	    
	    sc.close();
	}
}