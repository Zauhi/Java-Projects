import java.util.Scanner;
import java.util.Locale;

public class duracao
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Locale.setDefault(Locale.US);
	    
	    int hora, minuto, segundo, duracao, resto;
	    
	    System.out.print("Digite a duração em segundos: ");
	    duracao = sc.nextInt();
	    
	    hora = duracao / 3600;
	    resto = duracao % 3600;
	    minuto = resto / 60;
	    segundo = resto % 60;
	    
	    System.out.print(hora + ":" + minuto + ":" + segundo);
	    
	    sc.close();
	}
}