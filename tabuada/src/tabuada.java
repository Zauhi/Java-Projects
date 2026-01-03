import java.util.Scanner;

public class tabuada
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, produto;
		
		System.out.print("Deseja a tabuada para qual valor? ");
		x = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
		    produto = x * i;
		    System.out.println(x + " x " + i + " = " + produto);
		}
		sc.close();
	}
}