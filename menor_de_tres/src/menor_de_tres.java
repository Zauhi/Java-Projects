import java.util.Scanner;

public class menor_de_tres
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int primeiro, segundo, terceiro, menor;
	    
	    System.out.print("Primeiro valor: ");
	    primeiro = sc.nextInt();
	    
	    System.out.print("Segundo valor: ");
	    segundo = sc.nextInt();
	    
	    System.out.print("Terceiro valor: ");
	    terceiro = sc.nextInt();
	    
	    menor = 0;
	    
	    if (primeiro < segundo && primeiro < terceiro) {
	        menor = primeiro;
	    }
	    else if (segundo < terceiro) {
	        menor = segundo;
	    }
	    else {
	        menor = terceiro;
	    }
	    
	    System.out.print("Menor = " + menor);
	    
	    sc.close();
	}
}