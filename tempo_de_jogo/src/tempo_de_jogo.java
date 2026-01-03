import java.util.Scanner;

public class tempo_de_jogo
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int hora0, hora1, duracao;
	    
	    System.out.print("Hora inicial: ");
	    hora0 = sc.nextInt();
	    System.out.print("Hora inicial: ");
	    hora1 = sc.nextInt();
	    
	    if (hora0 >= hora1) {
	        duracao = hora1 - hora0 + 24;
	    }
	    else {
	        duracao = hora1 - hora0;
	    }
	    
	    System.out.print("O jogo durou " + duracao + " hora(s)");
	    
	    sc.close();
	}   
}