import java.util.Scanner;

public class multiplos
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int x, y, troca;
	    
	    System.out.println("Digite dois números inteiros: ");
	    x = sc.nextInt();
	    y = sc.nextInt();
	    
	    if (x < y) {
	        troca = x;
	        x = y;
	        y = troca;
	    }
	    
	    if (x % y == 0) {
	        System.out.print("São multiplos.");
	    }
	    else {
	        System.out.print("Não são multiplos.");
	    }
	    sc.close();
	}   
}