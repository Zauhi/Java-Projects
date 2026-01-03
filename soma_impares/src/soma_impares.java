import java.util.Scanner;

public class soma_impares
{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y, troca, i, soma;
		
		System.out.println("Digite dois números: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x > y) {
		    troca = x;
		    x = y;
		    y = troca;
		}
		
		soma = 0;
		
		for (i = x+1; i < y; i++) {
		    if (i % 2 != 0) {
		        soma = soma + i;
		    }
		}
		
		System.out.print("Soma dos impares = " + soma);
		
		sc.close();
	}
}