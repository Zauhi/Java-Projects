import java.util.Scanner;
import java.util.Locale;


public class consumo
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Locale.setDefault(Locale.US);
	    
	    int distancia;
	    double combustivel, consumo;
	    
		System.out.print("Distância percorrida: ");
		distancia = sc.nextInt();
		
		System.out.print("Combustível gasto: ");
		combustivel = sc.nextDouble();
		
		consumo = distancia / combustivel;
		
		System.out.print("Consumo médio: " + String.format("%.3f", consumo));
		
		sc.close();
	}
}