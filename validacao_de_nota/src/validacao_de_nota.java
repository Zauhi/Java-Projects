import java.util.Scanner;
import java.util.Locale;

public class validacao_de_nota
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
		double nota1, nota2, media;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		
		while (nota1 < 0 || nota1 > 10) {
		    System.out.print("Valor inválido! Tente novamente: ");
		    nota1 = sc.nextDouble();
		}
		
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		
		while (nota2 < 0 || nota2 > 10) {
		    System.out.print("Valor inválido! Tente novamente: ");
		    nota2 = sc.nextDouble();
		}
		
		media = (nota1 + nota2) / 2.0;
		System.out.print("Média = " + String.format("%.2f", media));
		
		sc.close();
	}
}