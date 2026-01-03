import java.util.Scanner;
import java.util.Locale;

public class dardo
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Locale.setDefault(Locale.US);
	    
	    double distancia1, distancia2, distancia3, maior;
	    
	    System.out.println("Digite as três distâncias: ");
	    distancia1 = sc.nextDouble();
	    distancia2 = sc.nextDouble();
	    distancia3 = sc.nextDouble();
	    
	    if (distancia1 > distancia2 && distancia1 > distancia3) {
	        maior = distancia1;
	    }
	    else if (distancia2 > distancia3) {
	        maior = distancia2;
	    }
	    else {
	        maior = distancia3;
	    }
	    
	    System.out.print("Maior distância = " + String.format("%.2f", maior));
	    
	    sc.close();
	}
}