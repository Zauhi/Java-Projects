import java.util.Scanner;
import java.util.Locale; 

public class terreno
{
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	    Locale.setDefault(Locale.US); 
	    
		double largura, comprimento, valorM, area, valorArea;
		
		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextDouble();
		
		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		
		System.out.print("Digite o valor do metro quadrado: ");
		valorM = sc.nextDouble();
		
		area = largura * comprimento;
		valorArea = area * valorM;
		
		System.out.println("Área do terreno = " + String.format("%.2f", area));
		System.out.print("Preço do terreno = " + String.format("%.2f", valorArea));
		
		sc.close();
	}
}